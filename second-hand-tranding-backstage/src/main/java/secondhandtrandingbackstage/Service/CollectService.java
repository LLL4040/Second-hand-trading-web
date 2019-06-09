
import Entity.Collect;
/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interfaceCollectService {
    users findCollectById(String id);
    void saveCollect(Collect collect);
    void deleteCollectById(String id) ;
}