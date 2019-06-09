


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import Repository.GoodsRepository;
import Entity.Comments;
import Util.HibernateUtil;
import Dao.CommentsDao;


 @Repository
public  class CommentsDaoimpl implements CommentsDao {
	 @Autowired
     private CommentsRepository commentsRepository;
	// ÃÌº””√ªß
	 @Override
     public Comments findone(Integer id) {
         return  commentsRepository.getOne(id);
     }
	 @Override
	 public boolean Exists(Integer id) {
		 return  commentsRepository.existsById(id);
	 }
	 @Override
	 public void Save(Comments car) {
		 commentsRepository.save(car);
	 }
	 @Override
	 public void Delete(Integer id) {
		 commentsRepository.delete(id);
	 }
	 @Override
	 public void Update() {
		 commentsRepository.flush();
	 }

}

