package Follow.Controller;

import Follow.Entity.Follow;
import Follow.Service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="/my")
@RestController
public class FollowController {
    @Autowired
    private FollowService followService;

    @PostMapping(path="/saveFollow")
    @ResponseBody
    public boolean saveFollow (@RequestParam String username, @RequestParam String seller) {
        Follow f1=new Follow(username,seller);
        return followService.saveFollow(f1);
    }

    @PostMapping(path="/deleteFollow")
    @ResponseBody
    public boolean deleteFollow (@RequestParam String username, @RequestParam String seller) {
        return followService.deleteOne(username, seller);
    }

    @GetMapping(path = "/follow")
    @ResponseBody
    public List<Follow> myFollow(String username) {
        return followService.myFollow(username);
    }
}
