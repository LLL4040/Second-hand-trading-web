package secondhandtrandingbackstage.secondhandtrandingbackstage.ServiceTest;


import net.minidev.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Users;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Repository.UsersRepository;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.CollectService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CollectServiceTest {
    @Autowired
    private CollectService collectService;
    @Autowired
    private UsersRepository usersRepository;

    @Test
    public void collectTest() throws Exception{
        Users users = new Users("test123456", "password", "123456", "email");
        usersRepository.save(users);
        Collect collect = new Collect(1, "test123456", 1);
        collectService.saveCollect(collect);
        JSONObject result = (JSONObject) collectService.mycollect("test123456").get(0);
        Collect collectResult = new Collect();
        collectResult.setCollect_id((Integer) result.get("collect_id"));
        collectResult.setUsername((String) result.get("username"));
        collectResult.setGoods_id((Integer) result.get("goods_id"));
        Assert.assertNotNull(collectResult);
        Assert.assertEquals("get collect fail", collect.getGoods_id(), collectResult.getGoods_id());
        Assert.assertEquals("get collect fail", collect.getUsername(), collectResult.getUsername());

        collectService.deleteCollectByUsernameAndGoodsid(collectResult.getUsername(), collectResult.getGoods_id());

        Assert.assertEquals("delete collect fail", 0, collectService.mycollect("test123456").size());

        usersRepository.delete(users);

    }
}
