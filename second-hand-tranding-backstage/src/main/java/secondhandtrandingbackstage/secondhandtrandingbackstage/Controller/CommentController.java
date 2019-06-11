package secondhandtrandingbackstage.secondhandtrandingbackstage.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Repository.CommentsRepository;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.CommentsService;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.GoodsService;

import javax.xml.stream.events.Comment;

@RequestMapping(path="/comment")
@RestController
public class CommentController {
    @Autowired
    private CommentsRepository commentsRepository;
    @Autowired
    private CommentsService commentsService;
    @GetMapping(path="/saveComments") // Map ONLY GET Requests
    public @ResponseBody
    String saveComments (@RequestParam String username,@RequestParam String seller,@RequestParam String comment) {

        Comments c1=new Comments();
        c1.setUsername(username);
        c1.setSeller(seller);
        c1.setComment(comment);
        commentsService.saveComments(c1);
        return "save comments";
    }
    @GetMapping(path="/findAllByseller") // Map ONLY GET Requests
    public @ResponseBody
    Iterable<Comments> findcomment(@RequestParam String seller){

        return commentsRepository.findAllByseller(seller);
        //return commentsService.findAllByseller(seller);
    }
}
