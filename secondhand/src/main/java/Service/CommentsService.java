package Service;

import java.util.List;

import Entity.Comments;
import Entity.Goods;
/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface CommentsService {
	Comments findCommentsById(Integer id);
    void saveComments(Comments comments);
    
}