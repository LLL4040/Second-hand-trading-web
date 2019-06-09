package Service;
import Entity.Collect;
import Entity.Users;
/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface CollectService {
    Collect findCollectById(String id);
    void saveCollect(Collect collect);
    void deleteCollectById(String id) ;
}