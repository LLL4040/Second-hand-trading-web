package secondhandtrandingbackstage.secondhandtrandingbackstage.Controller;



import net.minidev.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.CollectService;

@RequestMapping(path="/my")
@RestController
public class CollectController {
    @Autowired
    CollectService collectservice;
    @RequestMapping(value = "/collect")
    @ResponseBody
    public JSONArray mycollect(String username) throws JSONException {
        JSONArray jsonarray = new JSONArray();
        jsonarray=collectservice.mycollect(username);
        return jsonarray;
    }
}
