package Service;


import java.util.List;


import Dao.CommentsDao;
import Entity.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
@Service
public class CommentsServiceimpl implements CommentsService {

    @Autowired
    private CommentsDao commentsDao;

    @Override
    public Comments findCommentsById(Integer id){
        return  commentsDao.findone(id);
    }
    @Override
    public void saveComments(Comments comments) {
    	commentsDao.Save(comments);
    }

}
