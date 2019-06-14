package Goods.ServiceImpl;

import Goods.Dao.GoodsDao;
import Goods.Entity.Goods;
import Goods.Service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods findGoodsById(Integer id){
        return  goodsDao.findone(id);
    }
    @Override
    public void saveGoods(Goods goods) {
        goodsDao.Save(goods);
    }

    @Override
    public Iterable<Goods> getAllGoods() {
        return goodsDao.getAllGoods();
    }
    @Override
    public String deleteGoodsById(int Good_id){
        return goodsDao.deleteGoodsById(Good_id);
    }
}
