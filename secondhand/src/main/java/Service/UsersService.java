package Service;


import Entity.Users;
/**
 * Created by chenhaopeng on 2019/5/2.
 */
public interface UsersService {
    Users findUsersById(String id);
    void saveUsers(Users users);
    void deleteUsersById(String id) ;
}