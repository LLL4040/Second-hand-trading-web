package Comments.DaoImpl;


import Comments.Dao.CommentsDao;
import Comments.Entity.Comments;
import Comments.Repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public  class CommentsDaoImpl implements CommentsDao {
	 @Autowired
     private CommentsRepository commentsRepository;
	 @Override
     public Comments findOne(Integer id) {
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
		 commentsRepository.deleteById(id);
	 }
	 @Override
	 public void Update() {
		 commentsRepository.flush();
	 }
	@Override
	public List<Comments> findAllByseller(String seller){
		return commentsRepository.findAllByseller(seller);
	}
}

