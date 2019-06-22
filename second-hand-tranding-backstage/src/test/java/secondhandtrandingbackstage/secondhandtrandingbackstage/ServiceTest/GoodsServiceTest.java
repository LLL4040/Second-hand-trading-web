package secondhandtrandingbackstage.secondhandtrandingbackstage.ServiceTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.GoodsService;

@RunWith(SpringRunner.class)
@SpringBootTest

public class GoodsServiceTest {
    @Autowired
    private GoodsService goodsService;
    @Test
    public void GoodsTest() throws Exception{
        Goods goods= new Goods(2,new byte[1024],"衣服","好看","1","18208902878",1);
        goodsService.saveGoods(goods);
        Goods goodsResult = goodsService.findGoodsById(2);
        Assert.assertNotNull(goodsResult);
        Assert.assertEquals("get goods fail", goods.getGoods_id(), goodsResult.getGoods_id());
        Assert.assertEquals("get goods fail", goods.getTitle(), goodsResult.getTitle());
        Assert.assertEquals("get goods fail", goods.getDetail(), goodsResult.getDetail());
        Assert.assertEquals("get goods fail", goods.getContact(), goodsResult.getContact());
        Assert.assertEquals("get goods fail", goods.getStatus(), goodsResult.getStatus());

        Assert.assertNotNull(goodsService.findGoodsById(2));
    }
}
