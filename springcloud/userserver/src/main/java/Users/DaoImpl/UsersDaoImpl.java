package Users.DaoImpl;

import Users.Dao.UsersDao;
import Users.Entity.Users;
import Users.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public  class UsersDaoImpl implements UsersDao {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users findone(String id) {
        return usersRepository.getOne(id);
    }
    @Override
    public boolean Exists(String id) {
        return usersRepository.existsById(id);
    }
    @Override
    public void Save(Users user) {
        usersRepository.save(user);
    }
    @Override
    public void Delete(String id) {
        usersRepository.deleteById(id);
    }
    @Override
    public void Update() {
        usersRepository.flush();
    }

}
