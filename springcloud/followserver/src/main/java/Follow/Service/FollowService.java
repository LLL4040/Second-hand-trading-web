package Follow.Service;

import Follow.Entity.Follow;

import java.util.List;

public interface FollowService {
    Follow findFollowById(String id);
    boolean saveFollow(Follow follow);
    void deleteFollowById(String id);
    List<Follow> myFollow(String username);
    boolean deleteOne(String username, String seller);
}
