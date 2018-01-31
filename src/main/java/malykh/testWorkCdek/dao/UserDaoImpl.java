package malykh.testWorkCdek.dao;


import malykh.testWorkCdek.mapper.UserMapper;
import malykh.testWorkCdek.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    public JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> showAllUsers() {
        String sql = "SELECT * FROM users";

        return jdbcTemplate.query(sql, new UserMapper());
    }

    public void addUser(User user) {
        String sql = "INSERT INTO users (name) VALUES (?)";

        jdbcTemplate.update(sql, user.getName());
    }

    public User getById(int id) {
        String sql = "SELECT * FROM users WHERE id=?";

        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    public void delete(int id) {
        String sql = "DELETE FROM users WHERE id=?";

        jdbcTemplate.update(sql, id);
    }

    public void update(User user) {
        String sql = "UPDATE users SET name=? WHERE id=?";

        jdbcTemplate.update(sql, user.getName(), user.getId());
    }
}