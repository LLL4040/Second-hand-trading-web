package Repository;
import Entity.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, String>{
	 
}