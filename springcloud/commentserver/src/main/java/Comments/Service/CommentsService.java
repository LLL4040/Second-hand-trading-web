package Comments.Service;


import Comments.Entity.Comments;

import java.util.List;

public interface CommentsService {
	Comments findCommentsById(Integer id);
    boolean saveComments(Comments comments);
    List<Comments> findAllByseller(String seller);
}
