package com.ning.dao;

import com.ning.beans.User;

/**
 * ClassName: UserDao
 * Package: com.ning.dao.impl
 * Description:
 *
 * @Author: Ning
 * @Create: 2022/12/6 - 21:27
 */
public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param email
     * @return 如果返回null，则说明没有该用户，反之，有
     */
    User queryUserByEmail(String email);

    /**
     * 根据用户邮箱和密码查询
     * @param email
     * @param password
     * @return 如果返回null，则说明邮箱或密码错误
     */
    User queryUserByEmailAndPassword(String email,String password);

    /**
     * 保存一条用户信息
     * @param user
     * @return
     */
    int saveUser(User user);


}
