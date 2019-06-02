package Users;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class UserServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServerApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/user")
    public String home(@RequestParam String name) {
        return "Hi " + name + ", I am from port: " + port;
    }

}
