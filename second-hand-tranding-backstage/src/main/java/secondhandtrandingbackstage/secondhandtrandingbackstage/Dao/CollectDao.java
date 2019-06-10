package secondhandtrandingbackstage.secondhandtrandingbackstage.Dao;


import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Collect;

public interface CollectDao {

	boolean Exists(String id);
	void Save(Collect collect);
	Collect findone(String id);
	void Delete(String id);
	void Update();


}
