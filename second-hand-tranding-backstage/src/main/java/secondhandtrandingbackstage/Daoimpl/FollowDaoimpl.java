


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import Repository.FollowRepository;
import Entity.Follow;
import Util.HibernateUtil;
import Dao.FollowDao;

 @Repository
public  class FollowDaoimpl implements FollowDao {
	 @Autowired
     private FollowRepository followRepository;
	// ÃÌº””√ªß
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
