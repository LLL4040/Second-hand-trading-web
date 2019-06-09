


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import Repository.CollectRepository;
import Entity.Collect;
import Util.HibernateUtil;
import Dao.CollectDao;

 @Repository
public  class CollectDaoimpl implements CollectDao {
	 @Autowired
     private CollectRepository collectRepository;
	// ÃÌº””√ªß
	 @Override
     public  Collect findone(String id) {
         return  collectRepository.getOne(id);
     }
	 @Override
	 public boolean Exists(String id) {
		 return  collectRepository.existsById(id);
	 }
	 @Override
	 public void Save( Collect user) {
		 collectRepository.save(user);
	 }
	 @Override
	 public void Delete(String id) {
		 collectRepository.deleteById(id);
	 }
	 @Override
	 public void Update() {
		 collectRepository.flush();
	 }

}
