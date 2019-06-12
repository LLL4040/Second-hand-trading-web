package secondhandtrandingbackstage.secondhandtrandingbackstage.Dao;


import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;

import java.util.List;

public interface CollectDao {

	boolean Exists(int id);
	void Save(Collect collect);
	Collect findOne(int id);
	void Delete(int id);
	void Update();
	List<Collect>findmycollect(String id);


}
