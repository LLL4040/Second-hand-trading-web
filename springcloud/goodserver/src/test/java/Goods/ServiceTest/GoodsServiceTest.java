package Goods.ServiceTest;

import Goods.Entity.Goods;
import Goods.Service.GoodsService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsServiceTest {
    @Autowired
    private GoodsService goodsService;
    private Goods goods= new Goods(new byte[1024],"衣服","好看","test123456","18208902878",1);
    @Test
    public void GoodsTest() throws Exception{
        Integer id = goodsService.saveGoods(goods);
        Goods goodsResult = goodsService.findGoodsById(id);
        Assert.assertNotNull(goodsResult);
        Assert.assertEquals("get goods fail", goods.getTitle(), goodsResult.getTitle());
        Assert.assertEquals("get goods fail", goods.getDetail(), goodsResult.getDetail());
        Assert.assertEquals("get goods fail", goods.getContact(), goodsResult.getContact());
        Assert.assertEquals("get goods fail", goods.getStatus(), goodsResult.getStatus());
        Assert.assertNotNull(goodsService.findGoodsById(2));
    }
}
