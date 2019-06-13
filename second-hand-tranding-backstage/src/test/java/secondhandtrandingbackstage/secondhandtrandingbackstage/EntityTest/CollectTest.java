package secondhandtrandingbackstage.secondhandtrandingbackstage.EntityTest;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CollectTest {
    private Collect collect = new Collect(1, "test", 2);

    @Test
    public void collectIdTest(){
        Assert.assertEquals("get collect_id fails", 1, collect.getCollect_id());
        collect.setCollect_id(0);
        Assert.assertEquals("set collect_id fails", 0, collect.getCollect_id());
        collect.setCollect_id(1);
    }

    @Test
    public void goodsIdTest(){
        Assert.assertEquals("get goods_id fails", 2, collect.getGoods_id());
        collect.setGoods_id(3);
        Assert.assertEquals("set goods_id fails", 3, collect.getGoods_id());
        collect.setGoods_id(2);
    }

    @Test
    public void usernameTest(){
        Assert.assertEquals("get username fails", "test", collect.getUsername());
        collect.setUsername("test0");
        Assert.assertEquals("set username fails", "test0", collect.getUsername());
        collect.setUsername("test");
    }
}
