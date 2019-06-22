package secondhandtrandingbackstage.secondhandtrandingbackstage.ControllerTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class GoodsControllerTest {
    private MockMvc mvc;

    @Autowired
    private WebApplicationContext wac;
    @Before
    public void setUp(){
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void myGetAllGoodsTest() throws Exception {
        MvcResult result = mvc.perform(get("/goods/getAllGoods"))
                .andExpect(status().isOk()).andDo(print()).andReturn();
    }
    @Test
    public void mySaveGoodsTest() throws Exception {
        MvcResult result = mvc.perform(get("/goods/saveGoods").param("goods_id","1").param("cover","andd").param("title","衣服2223").param("detail","好看魅力无限").param("username","1").param("contact","2222").param("status","1"))
                .andExpect(status().isOk()).andDo(print()).andReturn();
    }
    @Test
    public void myFindGoodsById() throws Exception {
        MvcResult result = mvc.perform(get("/goods/findGoodsById").param("goods_id","1"))
                .andExpect(status().isOk()).andDo(print()).andReturn();
    }
    @Test
    public void myDelectGoodsById() throws Exception {
        MvcResult result = mvc.perform(get("/goods/saveGoods").param("goods_id","1").param("cover","andd").param("title","衣服2223").param("detail","好看魅力无限").param("username","1").param("contact","2222").param("status","1"))
                .andExpect(status().isOk()).andDo(print()).andReturn();
        MvcResult result1 = mvc.perform(get("/goods/delectGoodsById").param("goods_id","1"))
                .andExpect(status().isOk()).andDo(print()).andReturn();
    }

}
