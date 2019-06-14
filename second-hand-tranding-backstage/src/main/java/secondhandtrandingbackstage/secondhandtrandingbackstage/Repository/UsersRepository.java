package secondhandtrandingbackstage.secondhandtrandingbackstage.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Users;

import javax.transaction.Transactional;

public interface UsersRepository extends JpaRepository<Users, String> {

    @Transactional(rollbackOn = Exception.class)
    void deleteByUsername(String username);
}
