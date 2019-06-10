package secondhandtrandingbackstage.secondhandtrandingbackstage.Daoimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Dao.FollowDao;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Follow;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Repository.FollowRepository;






@Repository
public class FollowDaoimpl implements FollowDao {
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

}

