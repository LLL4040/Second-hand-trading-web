package Comments.ServiceImpl;


import Comments.Dao.CommentsDao;
import Comments.Entity.Comments;
import Comments.Service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    private CommentsDao commentsDao;

    @Override
    public Comments findCommentsById(Integer id){
        return  commentsDao.findOne(id);
    }
    @Override
    public boolean saveComments(Comments comments) {
        try{
            commentsDao.Save(comments);
            return true;
        }catch (Exception e) {
            return false;
        }

    }
    @Override
    public List<Comments> findAllByseller(String seller){
        return commentsDao.findAllByseller(seller);
    }
}
