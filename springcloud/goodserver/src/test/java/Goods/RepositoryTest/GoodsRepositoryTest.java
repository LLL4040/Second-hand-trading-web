package Goods.RepositoryTest;

import Goods.Entity.Goods;
import Goods.Repository.GoodsRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsRepositoryTest {
    @Autowired
    private GoodsRepository goodsRepository;

    private Goods goods = new Goods(new byte[1024],"衣服","好看","test123456","18208902878",1);


    @Test
    public void repoTest(){
        Goods goodResult = goodsRepository.save(goods);
        Assert.assertEquals("find goods fails","衣服",goodResult.getTitle());
        Assert.assertEquals("find goods fails","好看",goodResult.getDetail());
        Assert.assertEquals("find goods fails","test123456",goodResult.getUsername());
        Assert.assertEquals("find goods fails","18208902878",goodResult.getContact());
        Assert.assertEquals("find goods fails",1,goodResult.getStatus());
    }

}
