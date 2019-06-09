package Dao;

import java.util.List;

import Entity.Follow;

public interface FollowDao {
 
	boolean Exists(String id);
	void Save(Follow follow);
	Follow findone(String id);
	void Delete(String id);
	void Update();

	
}
