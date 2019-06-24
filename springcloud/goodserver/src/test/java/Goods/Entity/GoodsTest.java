package Goods.Entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsTest {
    private byte[] a1 = new byte[1024];

    public void setA1(byte[] a1){
        for(int i = 0; i < 1024; i++){
            a1[i] = 0;
        }
    }
    private Goods goods= new Goods(a1,"衣服","好看","1","18208902878",1);

    @Test
    public void titleTest(){
        Assert.assertEquals("get title fail","衣服",goods.getTitle());
        goods.setTitle("衣服2");
        Assert.assertEquals("get title fail","衣服2",goods.getTitle());
        goods.setTitle("衣服");
    }

    @Test
    public void detailTest(){
        Assert.assertEquals("get detail fail","好看",goods.getDetail());
        goods.setDetail("好看好看");
        Assert.assertEquals("get detail fail","好看好看",goods.getDetail());
        goods.setDetail("好看");
    }

    @Test
    public void contactTest(){
        Assert.assertEquals("get contact fail","18208902878",goods.getContact());
        goods.setContact("18348902878");
        Assert.assertEquals("get detail fail","18348902878",goods.getContact());
        goods.setContact("18208902878");
    }

    @Test
    public void statusTest(){
        Assert.assertEquals("get status fail",1,goods.getStatus());
        goods.setStatus(2);
        Assert.assertEquals("get detail fail",2,goods.getStatus());
        goods.setStatus(1);
    }



}
