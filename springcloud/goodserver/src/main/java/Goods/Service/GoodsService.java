package Goods.Service;

import Goods.Entity.Goods;
import net.minidev.json.JSONObject;


public interface GoodsService {
    Integer saveGoods(Goods goods);
    JSONObject findGoodsById(Integer id);
    Iterable<Goods> getAllGoods();
    String deleteGoodsById(int Good_id);
}
