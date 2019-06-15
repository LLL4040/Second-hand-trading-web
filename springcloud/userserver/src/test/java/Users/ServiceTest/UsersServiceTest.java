package Users.ServiceTest;

import Users.Entity.Users;
import Users.Service.UsersService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersServiceTest {
    @Autowired
    private UsersService usersService;

    @Test
    @Transactional
    public void userTest(){
        Users users = new Users("test123456", "password", "123456", "email");
        usersService.saveUsers(users);
        Users usersResult = usersService.findUsersById("test123456");
        Assert.assertNotNull(usersResult);
        Assert.assertEquals("get users fail", users.getPassword(), usersResult.getPassword());
        Assert.assertEquals("get users fail", users.getEmail(), usersResult.getEmail());
        Assert.assertEquals("get users fail", users.getPhone_number(), usersResult.getPhone_number());

        Assert.assertNotNull(usersService.findUsersById("test123456"));

    }
}
