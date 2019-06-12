package secondhandtrandingbackstage.secondhandtrandingbackstage.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.CommentsService;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.GoodsService;

import javax.xml.stream.events.Comment;

@RequestMapping(path="/comment")
@RestController
public class CommentController {
    @Autowired
    private CommentsService commentsService;

    @GetMapping(path="/saveComments")
    public @ResponseBody
    String saveComments (@RequestParam String username,@RequestParam String seller,@RequestParam String comment) {
        Comments comments = new Comments();
        comments.setUsername(username);
        comments.setSeller(seller);
        comments.setComment(comment);
        commentsService.saveComments(comments);
        return "save comments";
    }

    @GetMapping(path="/findAllByseller")
    public @ResponseBody
    Iterable<Comments> findComment(@RequestParam String seller){
        return commentsService.findAllByseller(seller);
    }
}
