package secondhandtrandingbackstage.secondhandtrandingbackstage.ServiceTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Users;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.CommentsService;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.UsersService;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CommentsServiceTest {

    @Autowired
    private CommentsService commentsService;
    @Autowired
    private UsersService usersService;

    @Test
    public void CommentsTest() throws Exception{
        Users users = new Users("test123456", "password", "123456", "email");
        usersService.saveUsers(users);
        Users seller = new Users("test654321", "password", "123456", "email");
        usersService.saveUsers(seller);
        Comments comments = new Comments(21,"test123456","test654321","seller is so nice");
        commentsService.saveComments(comments);
        Comments comments1 = new Comments(22,"test123456","test654321","seller is so nice");
        commentsService.saveComments(comments1);

        //找多个评论的测试
        Comments commentsResult= this.commentsService.findAllByseller("test654321").get(0);
        Assert.assertNotNull(commentsResult);
        Assert.assertEquals("get comment_id fail", comments.getComment_id(),commentsResult.getComment_id());
        Assert.assertEquals("get comment_username fail",comments.getUsername(),commentsResult.getUsername() );
        Assert.assertEquals("get comment_seller fail",comments.getSeller(),commentsResult.getSeller() );
        Assert.assertEquals("get comment fail",comments.getComment(),commentsResult.getComment() );
        Comments commentsResult1= this.commentsService.findAllByseller("test654321").get(1);

        Assert.assertEquals("get comment_id fail", comments1.getComment_id(),commentsResult1.getComment_id());
        Assert.assertEquals("get comment_username fail",comments1.getUsername(),commentsResult1.getUsername() );
        Assert.assertEquals("get comment_seller fail",comments1.getSeller(),commentsResult1.getSeller() );
        Assert.assertEquals("get comment fail",comments1.getComment(),commentsResult1.getComment() );


    }
}
