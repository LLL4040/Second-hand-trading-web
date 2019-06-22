package secondhandtrandingbackstage.secondhandtrandingbackstage.EntityTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;

import javax.xml.stream.events.Comment;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CommentsTest {
    private Comments comments = new Comments(1,"1","2","卖家人很好");
    @Test
    public void comment_idTest(){
        Assert.assertEquals("get comment_id fail",1,comments.getComment_id());
        comments.setComment_id(2);
        Assert.assertEquals("get comment_id fail",2,comments.getComment_id());
        comments.setComment_id(1);
    }
    @Test
    public void usernameTest(){
        Assert.assertEquals("get username fail","1",comments.getUsername());
        comments.setUsername("3");
        Assert.assertEquals("get username fail","3",comments.getUsername());
        comments.setUsername("1");
    }
    @Test
    public void sellerTest(){
        Assert.assertEquals("get seller fail","2",comments.getSeller());
        comments.setSeller("3");
        Assert.assertEquals("get seller fail","3",comments.getSeller());
        comments.setSeller("2");
    }
}
