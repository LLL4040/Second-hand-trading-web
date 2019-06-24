package Collect.Service;

import Collect.Entity.Collect;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import net.minidev.json.JSONArray;

public interface CollectService {
    Collect findCollectById(int id);

    boolean saveCollect(String username, Integer goods_id);

    boolean deleteCollectByUsernameAndGoodsid(String username, Integer Goods_id);
    void deleteCollectById(int id) ;

    @HystrixCommand(fallbackMethod = "hiError")
    JSONArray mycollect(String username);
    JSONArray hiError(String username);
}
