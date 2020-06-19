package ca.concordia.service;

import ca.concordia.mapper.UserMapper;
import ca.concordia.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DataSource dataSource;


    public User queryById(Long uid){
        return userMapper.selectByPrimaryKey(uid);
    }

    public void insertUser(User user){
        userMapper.insert(user);
    }

    public User queryByUsernameAndPassword(User user){
        JdbcTemplate template = new JdbcTemplate(dataSource);
        User findUser = null;

        try {
            String sql = "select * from tab_user where username = ? and password = ?";
            findUser = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), user.getUsername(), user.getPassword());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return findUser;
    }

}
