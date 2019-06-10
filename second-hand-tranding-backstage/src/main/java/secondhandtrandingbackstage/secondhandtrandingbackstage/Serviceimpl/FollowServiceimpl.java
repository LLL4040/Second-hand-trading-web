package secondhandtrandingbackstage.secondhandtrandingbackstage.Serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Dao.FollowDao;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Follow;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.FollowService;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
@Service
public class FollowServiceimpl implements FollowService {

    @Autowired
    private FollowDao followDao;

    @Override
    public Follow findFollowById(String id){
        return followDao.findone(id);
    }
    public void saveFollow(Follow users) {
    	followDao.Save(users);
    }
    @Override
    public void deleteFollowById(String id) {
    	followDao.Delete(id);
    }
}
