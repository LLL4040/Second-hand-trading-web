package secondhandtrandingbackstage.secondhandtrandingbackstage.Service;


import net.minidev.json.JSONObject;
import org.json.JSONException;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Users;


public interface UsersService {
    Users findUsersByUsername(String username);
    Users findUsersById(String id);
    void saveUsers(Users users);
    void deleteUsersById(String id) ;
    void deleteUserByUsername(String username);
    JSONObject login(String username, String password) throws JSONException;
    JSONObject register(String username, String password, String email, String phone) throws JSONException;
}
