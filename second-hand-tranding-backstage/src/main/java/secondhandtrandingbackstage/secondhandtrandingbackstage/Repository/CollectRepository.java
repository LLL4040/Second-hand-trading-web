package secondhandtrandingbackstage.secondhandtrandingbackstage.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;

import java.util.List;

public interface CollectRepository extends JpaRepository<Collect, Integer>{
    @Query(value = "select * from collect b where b.username=?1 ", nativeQuery = true)
    public List<Collect> findmyCollect(String name);
}
