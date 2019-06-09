package Service;
import Entity.Follow;
/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface FollowService {
    Follow findFollowById(String id);
    void saveFollow(Follow follow);
    void deleteFollowById(String id) ;
}