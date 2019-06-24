package comments.ServiceTest;

import Comments.Entity.Comments;
import Comments.Repository.CommentsRepository;
import Comments.Service.CommentsService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CommentsServiceTest {

    @Autowired
    private CommentsService commentsService;

    @Autowired
    private CommentsRepository commentsRepository;

    @Test
    public void CommentsTest() throws Exception{
        Comments comments = new Comments("test123456","test123456","seller is so nice");
        commentsService.saveComments(comments);
        Comments comments1 = new Comments("test123456","test123456","seller is so nice");
        commentsService.saveComments(comments1);

        //找多个评论的测试
        Comments commentsResult= this.commentsService.findAllByseller("test123456").get(0);
        Assert.assertNotNull(commentsResult);
        Assert.assertEquals("get comment_username fail",comments.getUsername(),commentsResult.getUsername() );
        Assert.assertEquals("get comment_seller fail",comments.getSeller(),commentsResult.getSeller() );
        Assert.assertEquals("get comment fail",comments.getComment(),commentsResult.getComment() );

        Comments commentsResult1= this.commentsService.findAllByseller("test123456").get(1);
        Assert.assertNotNull(commentsResult1);
        Assert.assertEquals("get comment_username fail",comments1.getUsername(),commentsResult1.getUsername() );
        Assert.assertEquals("get comment_seller fail",comments1.getSeller(),commentsResult1.getSeller() );
        Assert.assertEquals("get comment fail",comments1.getComment(),commentsResult1.getComment() );

        this.commentsRepository.deleteByUsernameAndSeller("test123456","test123456");
    }
}
