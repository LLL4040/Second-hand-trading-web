package secondhandtrandingbackstage.secondhandtrandingbackstage.Dao;


import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;

public interface GoodsDao {
	Iterable<Goods> getAllGoods();
	boolean Exists(Integer id);
	void Save(Goods goods);
	Goods findone(Integer id);
	void Delete(Integer id);
	void Update();
	String delectGoodsById(int Good_id);

}
