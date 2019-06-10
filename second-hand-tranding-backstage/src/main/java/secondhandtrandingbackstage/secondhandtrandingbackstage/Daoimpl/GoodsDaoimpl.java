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
     public Goods findone(Integer id) {
         return goodsRepository.getOne(id);
     }
	 @Override
	 public boolean Exists(Integer id) {
		 return goodsRepository.existsById(id);
	 }
	 @Override
	 public void Save(Goods car) {
		 goodsRepository.save(car);
	 }
	 @Override
	 public void Delete(Integer id) {
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
	public String delectGoodsById(int Good_id){
	 	Goods g1 =goodsRepository.getOne(Good_id);
		goodsRepository.delete(g1);
		return "删除物品成功";
	}

}

