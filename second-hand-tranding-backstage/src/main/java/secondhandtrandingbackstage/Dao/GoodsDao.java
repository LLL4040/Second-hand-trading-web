

import java.util.List;

importEntity.Goods;

public interface GoodsDao {
 
	boolean Exists(Integer id);
	void Save(Goods goods);
	Goods findone(Integer id);
	void Delete(Integer id);
	void Update();

	
}
