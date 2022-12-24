package com.ning.dao.impl;

import com.ning.beans.User;
import com.ning.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * ClassName: UserDaoImpl
 * Package: com.ning.dao.impl
 * Description:
 *
 * @Author: Ning
 * @Create: 2022/12/6 - 21:32
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User queryUserByEmail(String email) {
        String sql = "select * from t_user where email = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), email);
        if(user!=null){
            return user;
        }else{
            return null;
        }
    }

    @Override
    public User queryUserByEmailAndPassword(String email, String password) {
        String sql = "select * from t_user where email = ? and password = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), email, password);
        if(user!=null){
            return user;
        }else{
            return null;
        }
    }

    @Override
    public int saveUser(User user) {
        // 创建SQL语句
        String sql = "insert into t_user values(?,?,?,?)";
        Object[] args = {user.getId(),user.getEmail(),user.getPassword(),user.getName()};
        int update = jdbcTemplate.update(sql, args);
        return update;
    }
}
