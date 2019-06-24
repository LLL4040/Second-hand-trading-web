package comments.ControllerTest;

import Comments.Repository.CommentsRepository;
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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)

public class CommentsControllerTest {
    private MockMvc mvc;
    @Autowired
    private WebApplicationContext wac;
    @Autowired
    private CommentsRepository commentsRepository;
    @Before
    public void setUp(){
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    @Test
    public void saveCommentsTest() throws Exception {
        MvcResult result = mvc.perform(post("/comment/saveComment").param("username","test123456").param("seller","test123456").param("comment","卖家人很好"))
                .andExpect(status().isOk()).andDo(print()).andReturn();
        this.commentsRepository.deleteByUsernameAndSeller("test123456","test123456");
    }

    @Test
    public void findCommentsTest() throws Exception {
        MvcResult result = mvc.perform(get("/comment/findAllBySeller").param("seller","test123456"))
                .andExpect(status().isOk()).andDo(print()).andReturn();
    }
}
