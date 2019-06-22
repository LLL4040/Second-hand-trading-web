package secondhandtrandingbackstage.secondhandtrandingbackstage.RepositoryTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Repository.GoodsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest

public class GoodsRepositoryTest {
    @Autowired
    private GoodsRepository goodsRepository;
    @Test
    public void savetest(){
        Goods goods= new Goods(2,new byte[1024],"衣服","好看","1","18208902878",1);
        goodsRepository.save(goods);
        Goods goodResult=goodsRepository.findGoodsById(2);
        Assert.assertEquals("find goods fails","衣服",goodResult.getTitle());
        Assert.assertEquals("find goods fails","好看",goodResult.getDetail());
        Assert.assertEquals("find goods fails","1",goodResult.getUsername());
        Assert.assertEquals("find goods fails","18208902878",goodResult.getContact());
        Assert.assertEquals("find goods fails",1,goodResult.getStatus());

    }
}
