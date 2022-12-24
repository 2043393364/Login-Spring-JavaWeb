package com.ning.service.impl;

import com.ning.beans.User;
import com.ning.dao.BaseDao;
import com.ning.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.ning.service.impl
 * Description:
 *
 * @Author: Ning
 * @Create: 2022/12/6 - 21:53
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Autowired
    private BaseDao baseDao;

    @Override
    public User login(User user) {
        User user1 = userDao.queryUserByEmailAndPassword(user.getEmail(), user.getPassword());
        System.out.println(user1.toString());
        if(user1!=null){
            System.out.println("login successful!");
            return user1;
        }else{
            System.out.println("login fail!");
            return null;
        }

    }
    @Override
    public int register(User user) {
        // 获取数据库中的条数
        int cnt = baseDao.selectCount() + 1;
        user.setId(""+cnt);
        int i = userDao.saveUser(user);
        return i;
    }

    @Override
    public boolean existEmail(String email) {
        User user = userDao.queryUserByEmail(email);
        if(user!=null){
            return false;
        }else{
            return true;
        }
    }
}
