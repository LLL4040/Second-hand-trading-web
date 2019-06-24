package Follow.EntityTest;

import Follow.Entity.Follow;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FollowTest {
    private Follow follow = new Follow("test123456","test");

    @Test
    public void usernameTest(){
        Assert.assertEquals("get username fails", "test123456", follow.getUsername());
        follow.setUsername("test12345");
        Assert.assertEquals("set username fails", "test12345", follow.getUsername());
        follow.setUsername("test123456");
    }


    @Test
    public void sellerTest(){
        Assert.assertEquals("get seller fails", "test", follow.getSeller());
        follow.setSeller("test1");
        Assert.assertEquals("set seller fails", "test1", follow.getSeller());
        follow.setSeller("test");
    }
}