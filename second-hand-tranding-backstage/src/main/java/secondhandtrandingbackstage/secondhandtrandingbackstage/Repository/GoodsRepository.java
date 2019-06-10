package secondhandtrandingbackstage.secondhandtrandingbackstage.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {
    @Query(value = "select * from goods where goods_id=?1", nativeQuery = true)
    Goods findGoodsById(int good_id);
}
