

import java.util.List;

import Entity.Users;


public interface UsersDao {
 
	boolean Exists(String id);
	void Save(Users user);
	Users findone(String id);
	void Delete(String id);
	void Update();

	
}
