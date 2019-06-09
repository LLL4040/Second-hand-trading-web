

import java.util.List;

import Entity.Follow;

public interface FollowDao {
 
	boolean Exists(Integer id);
	void Save(Follow follow);
	Follow findone(Integer id);
	void Delete(String id);
	void Update();

	
}
