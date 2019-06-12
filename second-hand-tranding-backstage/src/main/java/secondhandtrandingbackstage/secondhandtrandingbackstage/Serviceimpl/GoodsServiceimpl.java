package secondhandtrandingbackstage.secondhandtrandingbackstage.Serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Dao.GoodsDao;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.GoodsService;

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

    @Override
    public Iterable<Goods> getAllGoods() {
        return goodsDao.getAllGoods();
    }
    @Override
    public String delectGoodsById(int Good_id){
        return goodsDao.deleteGoodsById(Good_id);
    }
}

