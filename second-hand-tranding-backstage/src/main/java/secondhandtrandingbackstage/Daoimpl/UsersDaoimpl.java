


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import Repository.UsersRepository;
import Entity.Users;
import Util.HibernateUtil;
import Dao.UsersDao;

 @Repository
public  class UsersDaoimpl implements UsersDao {
	 @Autowired
     private UsersRepository usersRepository;
	// ÃÌº””√ªß
	 @Override
     public users findone(String id) {
         return usersRepository.getOne(id);
     }
	 @Override
	 public boolean Exists(String id) {
		 return usersRepository.existsById(id);
	 }
	 @Override
	 public void Save(users user) {
		 usersRepository.save(user);
	 }
	 @Override
	 public void Delete(String id) {
		 usersRepository.deleteById(id);
	 }
	 @Override
	 public void Update() {
		 usersRepository.flush();
	 }

}
