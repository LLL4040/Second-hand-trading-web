package secondhandtrandingbackstage.secondhandtrandingbackstage.Service;


import net.sf.json.JSONObject;
import org.json.JSONException;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Users;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface UsersService {
    Users findUsersById(String id);
    void saveUsers(Users users);
    void deleteUsersById(String id) ;
    net.sf.json.JSONObject login(String username, String password) throws JSONException;
    JSONObject register(String username, String password, String email, int phone) throws JSONException;
}
