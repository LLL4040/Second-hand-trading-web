


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import Repository.GoodsRepository;
import Entity.Goods;
import Util.HibernateUtil;
import Dao.GoodsDao;


 @Repository
public  class GoodsDaoimpl implements GoodsDao {
	 @Autowired
     private GoodsRepository goodsRepository;
	// ÃÌº””√ªß
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
		 goodsRepository.delete(id);
	 }
	 @Override
	 public void Update() {
		 goodsRepository.flush();
	 }

}

