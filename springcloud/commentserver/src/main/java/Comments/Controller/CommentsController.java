package Comments.Controller;


import Comments.Entity.Comments;
import Comments.Service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="/comment")
@RestController
public class CommentsController {
    @Autowired
    private CommentsService commentsService;

    @PostMapping(path="/saveComment")
    @ResponseBody
    public boolean saveComments (@RequestParam String username,@RequestParam String seller,@RequestParam String comment) {
        Comments comments = new Comments();
        comments.setUsername(username);
        comments.setSeller(seller);
        comments.setComment(comment);
        return commentsService.saveComments(comments);
    }

    @GetMapping(path="/findAllBySeller")
    public @ResponseBody
    List<Comments> findComment(@RequestParam String seller){
        return commentsService.findAllByseller(seller);
    }
}
