package Collect.ServiceTest;

import Collect.Entity.Collect;
import Collect.Repository.CollectRepository;
import Collect.Service.CollectService;
import net.minidev.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CollectServiceTest {

    @Autowired
    private CollectRepository collectRepository;

    @Autowired
    private CollectService collectService;

    @Test
    public void collectTest() throws Exception{
        collectService.saveCollect("test123456",2);
        collectService.deleteCollectByUsernameAndGoodsid("test123456", 2);
    }
}