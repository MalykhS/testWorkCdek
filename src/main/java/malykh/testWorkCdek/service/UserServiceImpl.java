package malykh.testWorkCdek.service;

import malykh.testWorkCdek.dao.UserDao;
import malykh.testWorkCdek.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    public List<User> showAllUsers() {
        return userDao.showAllUsers();
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public User getById(int id) {
        return userDao.getById(id);
    }

    public void delete(int id) {
        userDao.delete(id);
    }

    public void update(User user) {
        userDao.update(user);
    }
}
