package secondhandtrandingbackstage.secondhandtrandingbackstage.Serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Dao.CommentsDao;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.CommentsService;

import java.util.List;


@Service
public class CommentsServiceimpl implements CommentsService {

    @Autowired
    private CommentsDao commentsDao;

    @Override
    public Comments findCommentsById(Integer id){
        return  commentsDao.findOne(id);
    }
    @Override
    public void saveComments(Comments comments) {
    	commentsDao.Save(comments);
    }
    @Override
    public List<Comments> findAllByseller(String seller){
        return commentsDao.findAllByseller(seller);
    }
}
