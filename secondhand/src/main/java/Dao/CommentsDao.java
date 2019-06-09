package Dao;
import java.util.List;

import Entity.Comments;


public interface CommentsDao {
 
	boolean Exists(Integer id);
	void Save(Comments comment);
	Comments findone(Integer id);
	void Delete(Integer id);
	void Update();

	
}
