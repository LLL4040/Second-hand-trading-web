package Dao;

import Entity.Comments;

import java.util.List;




public interface CommentsDao {

	boolean Exists(Integer id);
	void Save(Comments comment);
	Comments findone(Integer id);
	void Delete(Integer id);
	void Update();


}
