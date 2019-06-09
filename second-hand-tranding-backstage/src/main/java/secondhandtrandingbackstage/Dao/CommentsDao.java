
import java.util.List;

import Entity.Comments;


public interface CommentsDao {
 
	boolean Exists(String id);
	void Save(Comments comment);
	Comments findone(String id);
	void Delete(Integer id);
	void Update();

	
}
