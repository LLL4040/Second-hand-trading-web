package Goods.ControllerTest;


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
        mvc.perform(get("/goods/getAllGoods"))
                .andExpect(status().isOk()).andDo(print()).andReturn();
    }

    @Test
    public void myFindGoodsById() throws Exception {
        mvc.perform(get("/goods/findGoodsById").param("goods_id","1"))
                .andExpect(status().isOk()).andDo(print()).andReturn();
    }
    @Test
    public void myDeleteGoodsById() throws Exception {
        mvc.perform(get("/goods/deleteGoodsById").param("goods_id","-1"))
                .andExpect(status().isOk()).andDo(print()).andReturn();
    }
}
