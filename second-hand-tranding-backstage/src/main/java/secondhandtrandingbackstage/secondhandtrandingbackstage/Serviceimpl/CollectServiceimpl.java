package secondhandtrandingbackstage.secondhandtrandingbackstage.Serviceimpl;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Dao.CollectDao;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.CollectService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
@Service
public class CollectServiceimpl implements CollectService {

    @Autowired
    private CollectDao collectDao;

    @Override
    public Collect findCollectById(String id){
        return collectDao.findone(id);
    }

    @Override
    public void saveCollect(Collect users) {
    	collectDao.Save(users);
    }

    @Override
    public void deleteCollectById(String id) {
    	collectDao.Delete(id);
    }
    @Override
    public JSONArray mycollect(String username) throws JSONException {

        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobj = new JSONObject();
        List<Collect> allcollect=new ArrayList<Collect>();
        allcollect=collectDao.findmycollect(username);
        Iterator<Collect> iter = allcollect.iterator();
        Collect rs=new Collect();
        while(iter.hasNext()){  //执行过程中会执行数据锁定，性能稍差，若在循环过程中要去掉某个元素只能调用iter.remove()方法。
            rs = iter.next();
            jsonobj.put("username" , rs.getUserame());
            jsonobj.put("goods_id" , rs.getGoods_id());
            jsonarray.add(jsonobj);
        }
        return jsonarray;
    }
}
