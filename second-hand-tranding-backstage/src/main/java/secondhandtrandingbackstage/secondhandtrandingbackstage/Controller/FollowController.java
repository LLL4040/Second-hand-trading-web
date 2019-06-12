package secondhandtrandingbackstage.secondhandtrandingbackstage.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Follow;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.CommentsService;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.FollowService;

@RequestMapping(path="/follow")
@RestController
public class FollowController {
    @Autowired
    private FollowService followService;

    @GetMapping(path="/saveFollow") // Map ONLY GET Requests
    public @ResponseBody
    String saveFollow (@RequestParam String username, @RequestParam String seller) {

        Follow f1=new Follow(username,seller);
        followService.saveFollow(f1);
        return "save follow";
    }
}
