package Dao;

import java.util.List;

import Entity.Goods;

public interface GoodsDao {
 
	boolean Exists(Integer id);
	void Save(Goods goods);
	Goods findone(Integer id);
	void Delete(Integer id);
	void Update();

	
}
