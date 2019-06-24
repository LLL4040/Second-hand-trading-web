package Goods.ServiceImpl;

import Goods.Dao.GoodsDao;
import Goods.Entity.Goods;
import Goods.Service.GoodsService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public JSONObject findGoodsById(Integer id) {
        Goods goods = goodsDao.findone(id);
        JSONObject jsonObject = new JSONObject();
        /*if(goods.getStatus() == 0) {
            return jsonObject;
        }*/
        jsonObject.put("goods_id", goods.getGoods_id());
        jsonObject.put("cover", goods.getCover());
        jsonObject.put("title", goods.getTitle());
        jsonObject.put("detail", goods.getDetail());
        jsonObject.put("username", goods.getUsername());
        jsonObject.put("contact", goods.getContact());
        return jsonObject;
    }
    @Override
    public Integer saveGoods(Goods goods) {
        return goodsDao.Save(goods);
    }

    @Override
    public Iterable<Goods> getAllGoods() {
        try{
            return goodsDao.getStatusGoods(1);
        }catch (Exception e){
            return new ArrayList<>();
        }
    }
    @Override
    public String deleteGoodsById(int Good_id){
        if(Good_id == -1){
            return "不存在该商品！";
        }
        return goodsDao.deleteGoodsById(Good_id);
    }
}
