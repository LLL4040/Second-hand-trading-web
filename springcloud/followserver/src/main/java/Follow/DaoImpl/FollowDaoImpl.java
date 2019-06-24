package Follow.DaoImpl;

import Follow.Dao.FollowDao;
import Follow.Entity.Follow;
import Follow.Repository.FollowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FollowDaoImpl implements FollowDao {
    @Autowired
    private FollowRepository followRepository;
    @Override
    public Follow findone(String id) {
        return followRepository.getOne(id);
    }
    @Override
    public boolean Exists(String id) {
        return followRepository.existsById(id);
    }
    @Override
    public void Save(Follow user) {
        followRepository.save(user);
    }
    @Override
    public void Delete(String id) {
        followRepository.deleteById(id);
    }
    @Override
    public void Update() {
        followRepository.flush();
    }
    @Override
    public List<Follow> findByUsername(String username) {
        return followRepository.findByUsername(username);
    }
    @Override
    public void deleteByUsernameAndSeller(String username, String seller) {
        followRepository.deleteByUsernameAndSeller(username, seller);
    }

}
