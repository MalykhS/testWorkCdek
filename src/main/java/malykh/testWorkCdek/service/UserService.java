package malykh.testWorkCdek.service;

import malykh.testWorkCdek.model.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();

    void addUser(User user);

    User getById(int id);

    void delete(int id);

    void update(User user);
}
