package Follow.ServiceImpl;

import Follow.Dao.FollowDao;
import Follow.Entity.Follow;
import Follow.Service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowServiceImpl implements FollowService {
    @Autowired
    private FollowDao followDao;

    @Override
    public Follow findFollowById(String id){
        return followDao.findone(id);
    }
    @Override
    public boolean saveFollow(Follow users) {
        try{
            followDao.Save(users);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    @Override
    public void deleteFollowById(String id) {
        followDao.Delete(id);
    }
    @Override
    public List<Follow> myFollow(String username) {
        return followDao.findByUsername(username);
    }
    @Override
    public boolean deleteOne(String username, String seller) {
        followDao.deleteByUsernameAndSeller(username, seller);
        return true;
    }
}
