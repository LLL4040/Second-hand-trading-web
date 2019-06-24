package Follow.RepositoryrTest;

import Follow.Entity.Follow;
import Follow.Repository.FollowRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FollowRepositoryTest {
    @Autowired
    private FollowRepository followRepository;

    @Test
    public void followRepoTest(){
        Follow follow = new Follow("test123456", "test123456");
        followRepository.save(follow);
        Follow followResult = followRepository.findByUsername("test123456").get(0);
        Assert.assertEquals("save follow fails",follow.getUsername(),followResult.getUsername());
        Assert.assertEquals("save follow fails",follow.getSeller(),followResult.getSeller());
        followRepository.deleteByUsernameAndSeller("test123456","test123456");
    }
}
