package Collect.EnitityTest;

import Collect.Entity.Collect;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CollectTest {
    private Collect collect = new Collect("test", 2);

    @Test
    public void goodsIdTest(){
        Integer num = 2;
        Assert.assertEquals("get goods_id fails", num, collect.getGoods_id());
        collect.setGoods_id(3);
        num = 3;
        Assert.assertEquals("set goods_id fails", num, collect.getGoods_id());
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
