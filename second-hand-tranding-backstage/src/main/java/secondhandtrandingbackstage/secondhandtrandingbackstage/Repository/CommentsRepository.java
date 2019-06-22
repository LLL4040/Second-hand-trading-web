package secondhandtrandingbackstage.secondhandtrandingbackstage.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;

import java.util.List;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {
    @Query(value = "select comment_id,username,seller,comment from Comments where seller=?1", nativeQuery = true)
    List<Comments> findAllByseller(String seller);
}
