package Service;


import Dao.CollectDao;
import Entity.Collect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
