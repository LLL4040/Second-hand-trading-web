package Goods.Controller;

import Goods.Entity.Goods;
import Goods.Service.GoodsService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;

@RequestMapping(path="/goods")
@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @PostMapping(path="/saveGoods")
    @ResponseBody
    public Integer saveGoods (@RequestParam MultipartFile cover, @RequestParam String title,
                             @RequestParam String detail, @RequestParam String contact,
                             @RequestParam String username, @RequestParam int status) throws IOException {
        Goods g1=new Goods(cover.getBytes(),title,detail,username,contact,status);
        return goodsService.saveGoods(g1);
    }
    @GetMapping(path="/findGoodsById")//根据物品的id来找物品
    @ResponseBody
    public JSONObject findGoodsById(@RequestParam Integer goods_id){
        // This returns a JSON or XML with the books
        return goodsService.findGoodsById(goods_id);
    }
    @GetMapping(path="/deleteGoodsById")//根据物品的id来删除物品
    @ResponseBody
    public String deleteGoodsById(@RequestParam Integer goods_id) {
        // This returns a JSON or XML with the books
        return goodsService.deleteGoodsById(goods_id);
    }
    @GetMapping(path="/getAllGoods")
    public Iterable<Goods> getAllGoods(){
        return goodsService.getAllGoods();
    }

}
