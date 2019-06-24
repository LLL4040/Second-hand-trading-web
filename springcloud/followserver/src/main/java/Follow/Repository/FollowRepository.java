package Follow.Repository;

import Follow.Entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface FollowRepository extends JpaRepository<Follow, String> {
    List<Follow> findByUsername(String username);
    @Transactional(rollbackOn = Exception.class)
    void deleteByUsernameAndSeller(String username, String seller);
}
