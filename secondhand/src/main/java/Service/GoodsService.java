package Service;



import Entity.Goods;

import java.util.List;


/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface GoodsService {
	Goods findGoodsById(Integer id);
    void saveGoods(Goods goods);

}
