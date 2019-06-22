package secondhandtrandingbackstage.secondhandtrandingbackstage.RepositoryTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Repository.CommentsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CommentsRepositoryTest {
    @Autowired
    private CommentsRepository commentsRepository;
    @Test
    public void savetest(){
        Comments comments = new Comments(1,"1","2","卖家人很好");
        commentsRepository.save(comments);


        Comments commentsResult=this.commentsRepository.findAllByseller("2").get(0);

        Assert.assertEquals("find comment fails",comments.getComment_id(),commentsResult.getComment_id());
        Assert.assertEquals("find comment fails",comments.getSeller(),commentsResult.getSeller());
        Assert.assertEquals("find comment fails",comments.getUsername(),commentsResult.getUsername());
        Assert.assertEquals("find comment fails",comments.getComment(),commentsResult.getComment());

    }
}
