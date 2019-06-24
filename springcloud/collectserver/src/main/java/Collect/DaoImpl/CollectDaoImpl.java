package Collect.DaoImpl;

import Collect.Dao.CollectDao;
import Collect.Entity.Collect;
import Collect.Repository.CollectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CollectDaoImpl implements CollectDao {
    @Autowired
    private CollectRepository collectRepository;

    @Override
    public Collect findOne(int id) {
        return  collectRepository.getOne(id);
    }

    @Override
    public void DeleteByUsernameAndGoodsid(String username, Integer goods_id){
        try{
            collectRepository.deleteByUsernameAndGoods_id(username,goods_id);
        }catch (Exception e){
            System.out.println("delete collect fail");
        }

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
    public List<Collect> findmycollect(String username){
        return collectRepository.findmyCollect(username);
    }

}
