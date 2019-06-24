package Collect.Controller;

import Collect.Service.CollectService;

import net.minidev.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/my")
public class CollectController {
    @Autowired
    private CollectService collectservice;

    @RequestMapping("/collect")
    @ResponseBody
    public JSONArray myCollect(String username) {
        return collectservice.mycollect(username);
    }

    @PostMapping("/addCollect")
    @ResponseBody
    public boolean addOne(@RequestParam String username, @RequestParam Integer goods_id) {
        return collectservice.saveCollect(username, goods_id);
    }

    @PostMapping("/deleteCollect")
    @ResponseBody
    public boolean deleteOne(@RequestParam String username, @RequestParam Integer goods_id) {
        return collectservice.deleteCollectByUsernameAndGoodsid(username, goods_id);
    }

}
