package secondhandtrandingbackstage.secondhandtrandingbackstage.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {
    @Query(value = "select * from Comments where seller=?1", nativeQuery = true)
    Iterable<Comments> findAllByseller(String seller);
}
