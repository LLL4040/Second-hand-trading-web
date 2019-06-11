package secondhandtrandingbackstage.secondhandtrandingbackstage.Dao;



import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;

import java.util.List;




public interface CommentsDao {

	boolean Exists(Integer id);
	void Save(Comments comment);
	Comments findone(Integer id);
	void Delete(Integer id);
	void Update();
	Iterable<Comments> findAllByseller(String seller);

}
