package secondhandtrandingbackstage.secondhandtrandingbackstage.Daoimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Dao.CollectDao;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Repository.CollectRepository;

import java.util.List;

@Repository
public  class CollectDaoimpl implements CollectDao {
	@Autowired
	private CollectRepository collectRepository;

	@Override
	public  Collect findOne(int id) {
		return  collectRepository.getOne(id);
	}
	@Override
	public boolean Exists(int id) {
		return  collectRepository.existsById(id);
	}
	@Override
	public void Save(Collect user) {
		collectRepository.save(user);
	}
	@Override
	public void Delete(int id) {
		collectRepository.deleteById(id);
	}
	@Override
	public void Update() {
		collectRepository.flush();
	}
	@Override
	public List<Collect>findmycollect(String username){
		return collectRepository.findmyCollect(username);
	}

}
