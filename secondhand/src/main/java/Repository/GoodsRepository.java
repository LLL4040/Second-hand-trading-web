package Repository;
import Entity.Goods;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface GoodsRepository extends JpaRepository<Goods, Integer>{
	 
}