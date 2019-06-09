

import java.util.List;

import Entity.Comments;
/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface CommentsService {
	Goods findCommentsById(Integer id);
    void saveComments(Comments comments);
    
}