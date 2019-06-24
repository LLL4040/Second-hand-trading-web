package Collect.Controller;

import Collect.Service.CollectService;

import net.minidev.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/my")
public class CollectController {
    @Autowired
    private CollectService collectservice;

    @RequestMapping(value = "/collect")
    @ResponseBody
    public JSONArray mycollect(String username) {
        return collectservice.mycollect(username);
    }

}
