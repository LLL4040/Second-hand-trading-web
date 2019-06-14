package Goods.Controller;

import Goods.Entity.Goods;
import Goods.Service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequestMapping(path="/goods")
@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @PostMapping(path="/saveGoods")
    @ResponseBody
    public String saveGoods (@RequestParam MultipartFile cover, @RequestParam String title,
                             @RequestParam String detail, @RequestParam String contact,
                             @RequestParam String username, @RequestParam int status) throws IOException {

        Goods g1=new Goods(cover.getBytes(),title,detail,username,contact,status);
        goodsService.saveGoods(g1);
        return "ok";
    }
    @GetMapping(path="/findGoodsById")//根据物品的id来找物品
    public @ResponseBody Goods findGoodsById(@RequestParam int goods_id) {
        // This returns a JSON or XML with the books
        System.out.println(goodsService.findGoodsById(goods_id).toString());
        return goodsService.findGoodsById(goods_id);
    }
    @GetMapping(path="/deleteGoodsById")//根据物品的id来删除物品
    public @ResponseBody String deleteGoodsById(@RequestParam int goods_id) {
        // This returns a JSON or XML with the books
        return goodsService.deleteGoodsById(goods_id);
    }
    @GetMapping(path="/getAllGoods")
    public Iterable<Goods> getAllGoods(){
        return goodsService.getAllGoods();
    }

}
