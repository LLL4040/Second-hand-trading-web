package secondhandtrandingbackstage.secondhandtrandingbackstage.Dao;


import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Users;

public interface UsersDao {

	boolean Exists(String id);
	void Save(Users user);
	Users findone(String id);
	void DeleteByUsername(String username);
	void Delete(String id);
	void Update();


}
