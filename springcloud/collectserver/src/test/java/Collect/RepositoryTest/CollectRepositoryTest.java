package Collect.RepositoryTest;

import Collect.Entity.Collect;
import Collect.Repository.CollectRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CollectRepositoryTest {

    @Autowired
    private CollectRepository collectRepository;

    @Test
    public void findMyCollectTest(){

        Collect collect1 = new Collect("test123456", 2);
        collectRepository.save(collect1);
        Collect collectResult = this.collectRepository.findmyCollect("test123456").get(0);
        Assert.assertEquals("find my collect fails", "test123456",collectResult.getUsername());
        Integer num = 2;
        Assert.assertEquals("find my collect fails", num, collectResult.getGoods_id());
        collectRepository.delete(collect1);
        Assert.assertEquals("find my collect fails",0,this.collectRepository.findmyCollect("test123456").size());

    }


}
