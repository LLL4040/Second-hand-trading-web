import Entity.Comments;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BooklistRepository extends JpaRepository<Comments, Integer>{
	 
}