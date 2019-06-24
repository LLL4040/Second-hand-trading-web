package Goods.Service;

import Goods.Entity.Goods;

public interface GoodsService {
    Goods findGoodsById(Integer id);
    Integer saveGoods(Goods goods);
    Iterable<Goods> getAllGoods();
    String deleteGoodsById(int Good_id);
}
