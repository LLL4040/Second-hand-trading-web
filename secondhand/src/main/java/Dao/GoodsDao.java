package Dao;



import Entity.Goods;

import java.util.List;



public interface GoodsDao {

	boolean Exists(Integer id);
	void Save(Goods goods);
	Goods findone(Integer id);
	void Delete(Integer id);
	void Update();


}
