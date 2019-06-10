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
    @GetMapping(path="/addgoods") // Map ONLY GET Requests
    public @ResponseBody
    String addItem (@RequestParam int goods_id,@RequestParam int cover,@RequestParam String title,
                    @RequestParam String detail,@RequestParam String contact
            ,@RequestParam String username,@RequestParam int status) {

        Goods g1=new Goods(goods_id,cover,title,detail,username,contact,status);
        return "ok";
    }
}
