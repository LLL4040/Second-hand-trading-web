package comments.RepositoryTest;

import Comments.Entity.Comments;
import Comments.Repository.CommentsRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentsRepositoryTest {
    @Autowired
    private CommentsRepository commentsRepository;

    @Test
    public void savetest(){
        Comments comments = new Comments("test123456","test123456","卖家人很好");
        commentsRepository.save(comments);


        Comments commentsResult=this.commentsRepository.findAllByseller("test123456").get(0);

        Assert.assertEquals("find comment fails",comments.getSeller(),commentsResult.getSeller());
        Assert.assertEquals("find comment fails",comments.getUsername(),commentsResult.getUsername());
        Assert.assertEquals("find comment fails",comments.getComment(),commentsResult.getComment());

        this.commentsRepository.deleteByUsernameAndSeller("test123456","test123456");
    }
}
