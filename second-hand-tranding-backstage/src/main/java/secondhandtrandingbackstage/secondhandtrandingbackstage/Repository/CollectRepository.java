package secondhandtrandingbackstage.secondhandtrandingbackstage.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;

import javax.transaction.Transactional;
import java.util.List;

public interface CollectRepository extends JpaRepository<Collect, Integer>{
    @Query(value = "select * from collect b where b.username=?1 ", nativeQuery = true)
    List<Collect> findmyCollect(String name);

    @Modifying
    @Transactional(rollbackOn = Exception.class)
    @Query(value = "delete from collect where username=?1 and goods_id=?2", nativeQuery = true)
    void deleteByUsernameAndGoods_id(String username, Integer goods_id);


    @Transactional(rollbackOn = Exception.class)
    void deleteByUsername(String username);
}
