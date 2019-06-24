package Goods.DaoImpl;

import Goods.Dao.GoodsDao;
import Goods.Entity.Goods;
import Goods.Repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public  class GoodsDaoImpl implements GoodsDao {
    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public Goods findone(int id) {
        return goodsRepository.findGoodsById(id);
    }
    @Override
    public boolean Exists(int id) {
        return goodsRepository.existsById(id);
    }
    @Override
    public Integer Save(Goods goods) {
        return goodsRepository.save(goods).getGoods_id();
    }
    @Override
    public void Delete(int id) {
        goodsRepository.deleteById(id);
    }
    @Override
    public void Update() {
        goodsRepository.flush();
    }
    @Override
    public Iterable<Goods> getAllGoods(){
        return goodsRepository.findAll();
    }
    @Override
    public String deleteGoodsById(int good_id){
        Goods good =goodsRepository.getOne(good_id);
        good.setStatus(0);
        goodsRepository.save(good);
        return "delete goods success";
    }

}
