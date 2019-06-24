package Follow.Dao;

import Follow.Entity.Follow;

import java.util.List;

public interface FollowDao {
    boolean Exists(String id);
    void Save(Follow follow);
    Follow findone(String id);
    void Delete(String id);
    void Update();
    List<Follow> findByUsername(String username);
    void deleteByUsernameAndSeller(String username, String seller);
}
