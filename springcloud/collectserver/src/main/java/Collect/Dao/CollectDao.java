package Collect.Dao;

import Collect.Entity.Collect;

import java.util.List;

public interface CollectDao {
    boolean Exists(int id);
    void Save(Collect collect);
    Collect findOne(int id);
    void Delete(int id);
    void Update();
    void DeleteByUsernameAndGoodsid(String username, Integer goods_id);
    List<Collect> findmycollect(String id);
    Collect findByUsernameAndGoods_id(String username, Integer goods_id);
}
