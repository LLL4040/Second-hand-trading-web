package Goods.ServiceImpl;

import Goods.Dao.GoodsDao;
import Goods.Entity.Goods;
import Goods.Service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods findGoodsById(Integer id){
        return  goodsDao.findone(id);
    }
    @Override
    public Integer saveGoods(Goods goods) {
        if(Objects.equals(goods.getTitle(),"") || Objects.equals(goods.getUsername(), "")){ return -1; }
        return goodsDao.Save(goods);
    }

    @Override
    public Iterable<Goods> getAllGoods() {
        return goodsDao.getAllGoods();
    }
    @Override
    public String deleteGoodsById(int Good_id){
        if(Good_id == -1){
            return "不存在该商品！";
        }
        return goodsDao.deleteGoodsById(Good_id);
    }
}
