package secondhandtrandingbackstage.secondhandtrandingbackstage.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
