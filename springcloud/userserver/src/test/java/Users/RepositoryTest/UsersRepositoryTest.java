package Users.RepositoryTest;

import Users.Entity.Users;
import Users.Repository.UsersRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersRepositoryTest {

    @Autowired
    private UsersRepository usersRepository;
    @Test
    @Transactional
    public void savetest(){
        Users users = new Users("test123456", "password", "123456", "email");
        usersRepository.save(users);
        Users usersResult=this.usersRepository.getOne("test123456");
        Assert.assertEquals("users save fails", "test123456",usersResult.getUsername());
        Assert.assertEquals("users save fails", "password",usersResult.getPassword());
        Assert.assertEquals("users save fails", "123456",usersResult.getPhone_number());
        Assert.assertEquals("users save fails", "email",usersResult.getEmail());


    }
}
