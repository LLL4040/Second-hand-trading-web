package Daoimpl;


import java.util.List;
;
import Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, String>{

}
