package Users.EntityTest;

import Users.Entity.Users;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersTest {
    private Users users=new Users("usertest","password","phone","Email");
    @Test
    public void UsernameTest(){
        Assert.assertEquals("UsernameTest fails", "usertest",users.getUsername());
        users.setUsername("username");
        Assert.assertEquals("UsernameTest fails", "username",users.getUsername());
        users.setUsername("usertest");
    }
    @Test
    public void passwordTest(){
        Assert.assertEquals("passwordTest fails", "password",users.getPassword());
        users.setPassword("fdfdfdaa");
        Assert.assertEquals("passwordTest fails", "fdfdfdaa",users.getPassword());
        users.setPassword("password");
    }
    @Test
    public void Phone_numberTest(){
        Assert.assertEquals("Phone_numberTest fails", "phone",users.getPhone_number());
        users.setPhone("35324235");
        Assert.assertEquals("Phone_numberTest fails", "35324235",users.getPhone_number());
        users.setPhone("phone");
    }
    @Test
    public void EmailTest(){
        Assert.assertEquals("EmailTest fails", "Email",users.getEmail());
        users.setEmail("777@qq.com");
        Assert.assertEquals("EmailTest fails", "777@qq.com",users.getEmail());
        users.setEmail("Email");
    }


}