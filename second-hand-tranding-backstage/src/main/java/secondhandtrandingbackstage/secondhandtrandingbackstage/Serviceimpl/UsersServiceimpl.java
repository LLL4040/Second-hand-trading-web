package secondhandtrandingbackstage.secondhandtrandingbackstage.Serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Dao.UsersDao;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Entity.Users;
import secondhandtrandingbackstage.secondhandtrandingbackstage.Service.UsersService;

/**
 * Created by chenhaopeng on 2019/5/2.
 */
@Service
public class UsersServiceimpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public Users findUsersById(String id){
        return usersDao.findone(id);
    }
    @Override
    public void saveUsers(Users users) {
    	usersDao.Save(users);
    }
    @Override
    public void deleteUsersById(String id) {
    	usersDao.Delete(id);
    }
}
