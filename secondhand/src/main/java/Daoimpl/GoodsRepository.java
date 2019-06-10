package Repository;

import java.util.List;


import Entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GoodsRepository extends JpaRepository<Goods, Integer>{

}
