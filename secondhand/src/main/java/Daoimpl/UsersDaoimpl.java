package Daoimpl;



import Dao.UsersDao;
import Entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

 @Repository
public  class UsersDaoimpl implements UsersDao {
	 @Autowired
     private UsersRepository usersRepository;
	// ����û�
	 @Override
     public Users findone(String id) {
         return usersRepository.getOne(id);
     }
	 @Override
	 public boolean Exists(String id) {
		 return usersRepository.existsById(id);
	 }
	 @Override
	 public void Save(Users user) {
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
