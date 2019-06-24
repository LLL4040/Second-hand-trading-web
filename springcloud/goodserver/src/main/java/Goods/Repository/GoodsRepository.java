package Goods.Repository;

import Goods.Entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {
    @Query(value = "select * from goods where goods_id=?1", nativeQuery = true)
    Goods findGoodsById(int good_id);

    List<Goods> findAllByStatus(Integer status);
}
