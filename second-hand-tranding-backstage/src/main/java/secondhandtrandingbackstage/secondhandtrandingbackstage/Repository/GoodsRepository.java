package secondhandtrandingbackstage.secondhandtrandingbackstage.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {

}
