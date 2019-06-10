package secondhandtrandingbackstage.secondhandtrandingbackstage.Service;


import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface CollectService {
    Collect findCollectById(String id);
    void saveCollect(Collect collect);
    void deleteCollectById(String id) ;
}
