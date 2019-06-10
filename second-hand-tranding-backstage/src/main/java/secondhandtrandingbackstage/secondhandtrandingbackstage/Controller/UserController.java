package secondhandtrandingbackstage.secondhandtrandingbackstage.Controller;



import net.sf.json.JSONObject;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.UsersService;

@RequestMapping(path="/my")
@RestController
public class UserController {
    @Autowired
    UsersService usersservice;
    @RequestMapping(value = "/login")
    @ResponseBody
    public JSONObject login(String username, String password) throws JSONException {
        JSONObject jsonarray = new JSONObject();
        jsonarray=usersservice.login(username, password);
        return jsonarray;
    }

    @RequestMapping(value = "/register")
    @ResponseBody
    public  JSONObject  register(String username,String password,String email,int phone) throws JSONException {
        JSONObject jsonarray = new JSONObject();
        jsonarray=usersservice.register(username, password, email, phone);
        System.out.println(jsonarray);
        return jsonarray;
    }
}
