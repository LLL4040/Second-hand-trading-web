package Comments.Repository;

import Comments.Entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {
    @Query(value = "select comment_id,username,seller,comment from Comments where seller=?1", nativeQuery = true)
    List<Comments> findAllByseller(String seller);

    @Transactional(rollbackOn = Exception.class)
    void deleteByUsernameAndSeller(String username, String seller);
}
