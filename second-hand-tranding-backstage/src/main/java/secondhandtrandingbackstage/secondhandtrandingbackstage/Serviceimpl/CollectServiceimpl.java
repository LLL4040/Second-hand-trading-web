package secondhandtrandingbackstage.secondhandtrandingbackstage.Serviceimpl;


import net.minidev.json.*;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Dao.CollectDao;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.CollectService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class CollectServiceimpl implements CollectService {

    @Autowired
    private CollectDao collectDao;

    @Override
    public Collect findCollectById(int id) {
        return collectDao.findOne(id);
    }
    @Override
    public void saveCollect(Collect users) {
        collectDao.Save(users);
    }
    @Override
    public void deleteCollectById(int id) {
        collectDao.Delete(id);
    }
    @Override
    public JSONArray mycollect(String username) {

        JSONArray jsonarray = new JSONArray();
        List<Collect> allcollect=new ArrayList<Collect>();
        allcollect=collectDao.findmycollect(username);
        Iterator<Collect> iter = allcollect.iterator();
        Collect rs;
        while(iter.hasNext()){
            rs = iter.next();
            JSONObject jsonobj = new JSONObject();
            jsonobj.put("username" , rs.getUserame());
            jsonobj.put("goods_id" , rs.getGoods_id());
            jsonarray.add(jsonobj);
        }
        return jsonarray;
    }
}
