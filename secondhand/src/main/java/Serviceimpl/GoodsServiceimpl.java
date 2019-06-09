package Serviceimpl;

import Dao.GoodsDao;
import Service.GoodsService;
import Entity.Goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
@Service
public class GoodsServiceimpl implements GoodsService {

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

}

