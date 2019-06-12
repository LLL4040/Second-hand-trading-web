package secondhandtrandingbackstage.secondhandtrandingbackstage.Daoimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Dao.GoodsDao;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Repository.GoodsRepository;

@Repository
public  class GoodsDaoimpl implements GoodsDao {
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
    public void Save(Goods car) {
        goodsRepository.save(car);
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
    public String deleteGoodsById(int Good_id){
        Goods good =goodsRepository.getOne(Good_id);
        goodsRepository.delete(good);
        return "delete goods success";
    }

}

