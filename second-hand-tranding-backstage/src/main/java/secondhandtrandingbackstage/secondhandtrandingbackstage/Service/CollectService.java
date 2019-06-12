package secondhandtrandingbackstage.secondhandtrandingbackstage.Service;


import net.minidev.json.JSONArray;
import org.json.JSONException;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;


public interface CollectService {
    Collect findCollectById(int id);
    void saveCollect(Collect collect);
    void deleteCollectById(int id) ;
    JSONArray mycollect(String username);
}
