package secondhandtrandingbackstage.secondhandtrandingbackstage.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Goods;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.GoodsService;

@RequestMapping(path="/goods")
@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @GetMapping(path="/saveGoods") // Map ONLY GET Requests
    public @ResponseBody
    String saveGoods (@RequestParam int goods_id,@RequestParam int cover,@RequestParam String title,
                    @RequestParam String detail,@RequestParam String contact
            ,@RequestParam String username,@RequestParam int status) {

        Goods g1=new Goods(goods_id,cover,title,detail,username,contact,status);
        goodsService.saveGoods(g1);
        return "ok";
    }
    @GetMapping(path="/findGoodsById")//根据物品的id来找物品
    public @ResponseBody Goods findGoodsById(@RequestParam int Good_id) {
        // This returns a JSON or XML with the books
        return goodsService.findGoodsById(Good_id);
    }
    @GetMapping(path="/delectGoodsById")//根据物品的id来删除物品
    public @ResponseBody String delectGoodsById(@RequestParam int Good_id) {
        // This returns a JSON or XML with the books
        return goodsService.delectGoodsById(Good_id);
    }

}
