package Collect;

import net.minidev.json.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("goods-server")
public interface Client {
    @GetMapping("/goods/findGoodsById")
    JSONObject consumer(@RequestParam Integer goods_id);
}
