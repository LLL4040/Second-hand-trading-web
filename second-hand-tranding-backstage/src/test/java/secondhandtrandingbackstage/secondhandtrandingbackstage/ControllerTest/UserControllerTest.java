package secondhandtrandingbackstage.secondhandtrandingbackstage.ControllerTest;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class UserControllerTest {
	 private MockMvc mvc;

	    @Autowired
	    private WebApplicationContext wac;

	    @Before
	    public void setUp(){
	        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
	    }
	    @Test
	    public void myregisterTest() throws Exception {
	        MvcResult result = mvc.perform(get("/my/register").param("username", "Darling1983").param("password","123456").param("email","222@.com").param("phone","321"))
	                .andExpect(status().isOk()).andDo(print()).andReturn();
	    }
	    @Test
	    public void myloginTest() throws Exception {
	        MvcResult result = mvc.perform(get("/my/login").param("username", "Darling1983"))
	                .andExpect(status().isOk()).andDo(print()).andReturn();
	        MvcResult result1 = mvc.perform(get("/my/login").param("username", "Darling1983").param("password","123456"))
	                .andExpect(status().isOk()).andDo(print()).andReturn();
	    }

}
