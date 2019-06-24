package Goods.Dao;

import Goods.Entity.Goods;

public interface GoodsDao {
    Iterable<Goods> getAllGoods();
    boolean Exists(int id);
    Integer Save(Goods goods);
    Goods findone(int id);
    void Delete(int id);
    void Update();
    String deleteGoodsById(int good_id);

}
