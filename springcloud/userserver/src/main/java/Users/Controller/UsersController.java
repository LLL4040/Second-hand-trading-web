package Users.Controller;

import Users.Service.UsersService;
import net.minidev.json.JSONObject;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path="/user")
@RestController
public class UsersController {
    @Autowired
    UsersService usersservice;
    @RequestMapping(value = "/login")
    @ResponseBody
    public JSONObject login(String username, String password) throws JSONException {
        return usersservice.login(username, password);
    }

    @RequestMapping(value = "/register")
    @ResponseBody
    public JSONObject register(String username,String password,String email,String phone) throws JSONException {
        return usersservice.register(username, password, email, phone);
    }
}
