package Daoimpl;


import java.util.List;


import Entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentsRepository extends JpaRepository<Comments, Integer>{

}
