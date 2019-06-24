package com.example.servicehi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @Autowired
    DemoClient demoClient;

    @GetMapping("/consumer")
    public String dc() {
        return demoClient.consumer("sss");
    }

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return hiService.hiService(name);
    }
}
