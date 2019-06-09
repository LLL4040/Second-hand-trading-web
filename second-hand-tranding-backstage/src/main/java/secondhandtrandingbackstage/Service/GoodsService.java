

import java.util.List;

import Entity.Goods;
/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface GoodsService {
	Goods findGoodsById(Integer id);
    void saveGoods(Goods goods);

}
