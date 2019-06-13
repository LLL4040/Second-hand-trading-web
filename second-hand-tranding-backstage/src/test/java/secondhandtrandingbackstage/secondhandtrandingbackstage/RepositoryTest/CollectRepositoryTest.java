package secondhandtrandingbackstage.secondhandtrandingbackstage.RepositoryTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Users;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Repository.CollectRepository;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Repository.UsersRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CollectRepositoryTest {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private CollectRepository collectRepository;

    @Test
    public void findMyCollectTest(){
        Users users = new Users("test123456", "password", "123456", "email");
        usersRepository.save(users);
        Collect collect1 = new Collect(1, "test123456", 2);
        collectRepository.save(collect1);
        Collect collectResult = this.collectRepository.findmyCollect("test123456").get(0);
        Assert.assertEquals("find my collect fails", "test123456",collectResult.getUsername());
        Assert.assertEquals("find my collect fails", 2, collectResult.getGoods_id());
        collectRepository.delete(collect1);
        usersRepository.delete(users);
        Assert.assertEquals("find my collect fails",0,this.collectRepository.findmyCollect("test123456").size());

    }


}
