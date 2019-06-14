package Users.Service;

import Users.Entity.Users;
import net.minidev.json.JSONObject;
import org.json.JSONException;

public interface UsersService {
    Users findUsersById(String id);
    void saveUsers(Users users);
    void deleteUsersById(String id) ;
    JSONObject login(String username, String password) throws JSONException;
    JSONObject register(String username, String password, String email, String phone) throws JSONException;
}
