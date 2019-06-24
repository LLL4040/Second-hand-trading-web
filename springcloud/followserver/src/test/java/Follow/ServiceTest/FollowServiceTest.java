package Follow.ServiceTest;

import Follow.Entity.Follow;
import Follow.Repository.FollowRepository;
import Follow.Service.FollowService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FollowServiceTest {
    @Autowired
    private FollowService followService;
    @Autowired
    private FollowRepository followRepository;

    @Test
    public void followSerTest(){
        Follow follow = new Follow("test123456", "test123456");
        followService.saveFollow(follow);
        Follow follow1 = followService.myFollow("test123456").get(followService.myFollow("test123456").size() - 1);
        Assert.assertEquals("save follow fails", follow.getUsername(),follow1.getUsername());
        Assert.assertEquals("save follow fails", follow.getSeller(),follow1.getSeller());
        followService.deleteOne("test123456", "test123456");
    }
}
