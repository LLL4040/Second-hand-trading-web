package secondhandtrandingbackstage.secondhandtrandingbackstage.Dao;


import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;

public interface GoodsDao {
	Iterable<Goods> getAllGoods();
	boolean Exists(int id);
	void Save(Goods goods);
	Goods findone(int id);
	void Delete(int id);
	void Update();
	String delectGoodsById(int Good_id);

}
