package secondhandtrandingbackstage.secondhandtrandingbackstage.Service;


import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface CommentsService {
	Comments findCommentsById(Integer id);
    void saveComments(Comments comments);

}