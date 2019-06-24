package Collect.ServiceImpl;

import Collect.Dao.CollectDao;
import Collect.Entity.Collect;
import Collect.Service.CollectService;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;
import java.util.List;

@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    private CollectDao collectDao;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Collect findCollectById(int id) {
        return collectDao.findOne(id);
    }

    @Override
    public boolean saveCollect(String username, Integer goods_id) {
        try {
            try{
                Collect collect = collectDao.findByUsernameAndGoods_id(username, goods_id);
                if(collect.getUsername().equals(username)){
                    return false;
                }
            }catch (Exception e) {
            }
            Collect collect = new Collect(username, goods_id);
            collectDao.Save(collect);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void deleteCollectById(int id) {
        collectDao.Delete(id);
    }

    @HystrixCommand(fallbackMethod = "hiError")
    @Override
    public JSONArray mycollect(String username) {

        JSONArray jsonArray = new JSONArray();
        List<Collect> allcollect=collectDao.findmycollect(username);
        Iterator<Collect> iter = allcollect.iterator();
        Collect rs;
        while(iter.hasNext()){
            rs = iter.next();
            JSONObject jsonobj = new JSONObject();
            jsonobj.put("collect_id", rs.getGoods_id());
            jsonobj.put("username" , rs.getUsername());
            jsonobj.put("goods_id" , rs.getGoods_id());
            JSONObject goods = restTemplate.getForObject("http://GOODS-SERVER/goods/findGoodsById?goods_id="+rs.getGoods_id(), JSONObject.class);
            jsonobj.put("goods", goods);
            jsonArray.add(jsonobj);
        }
        return jsonArray;
    }

    @Override
    public JSONArray hiError(String username) {
        return new JSONArray();
    }

    @Override
    public boolean deleteCollectByUsernameAndGoodsid(String username, Integer Goods_id){
        try{
            collectDao.DeleteByUsernameAndGoodsid(username, Goods_id);
            return true;
        }catch (Exception e) {
            return false;
        }

    }
}
