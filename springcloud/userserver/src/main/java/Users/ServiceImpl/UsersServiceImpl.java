package Users.ServiceImpl;

import Users.Dao.UsersDao;
import Users.Entity.Users;
import Users.Service.UsersService;
import net.minidev.json.JSONObject;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public Users findUsersById(String id){
        return usersDao.findone(id);
    }
    @Override
    public void saveUsers(Users users) {
        usersDao.Save(users);
    }
    @Override
    public void deleteUsersById(String id) {
        usersDao.Delete(id);
    }

    @Override
    public JSONObject login(String username, String password) throws JSONException {
        int loginsuccess=0;
        JSONObject jsonobj = new JSONObject();
        Users useritem=new Users();
        useritem=usersDao.findone(username);
        if(useritem.getPassword().equals(password)) {
            loginsuccess = 1 ;

        }
        else{
            loginsuccess=0;
        };
        jsonobj.put("name" , useritem.getUsername());
        jsonobj.put("phone", useritem.getPhone_number());
        jsonobj.put("email", useritem.getEmail());

        jsonobj.put("loginsuccess" , loginsuccess);
        return jsonobj;
    }

    @Override
    public JSONObject register(String username, String password, String email, String phone) throws JSONException {
        int regsuccess=0;
        JSONObject jsonobj = new JSONObject();
        Users useritem=new Users();

        if(usersDao.Exists(username)) {
            regsuccess=0;
        }

        else{
            regsuccess=1;
            useritem.setUsername(username);
            useritem.setPassword(password);
            useritem.setEmail(email);
            useritem.setPhone(phone);
            usersDao.Save(useritem);
        };

        jsonobj.put("name" , username);
        jsonobj.put("regsuccess" ,regsuccess);
        System.out.println(jsonobj);
        return jsonobj;

    }
}

