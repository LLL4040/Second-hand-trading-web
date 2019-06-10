package secondhandtrandingbackstage.secondhandtrandingbackstage.Daoimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Dao.CollectDao;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Repository.CollectRepository;

@Repository
public  class CollectDaoimpl implements CollectDao {
	 @Autowired
     private CollectRepository collectRepository;

	 @Override
     public Collect findone(String id) {
         return  collectRepository.getOne(id);
     }
	 @Override
	 public boolean Exists(String id) {
		 return  collectRepository.existsById(id);
	 }
	 @Override
	 public void Save(Collect user) {
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
