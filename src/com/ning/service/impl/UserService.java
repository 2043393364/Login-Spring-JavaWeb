package com.ning.service.impl;

import com.ning.beans.User;

/**
 * ClassName: UserService
 * Package: com.ning.service.impl
 * Description:
 *
 * @Author: Ning
 * @Create: 2022/12/6 - 21:48
 */
public interface UserService {
    /**
     * 实现用户登录
     * @param user
     * @return 返回非零正数，表示登录成功，反之，登录失败
     */
    User login(User user);

    /**
     * 实现用户注册
     * @param user
     * @return 返回非零正数，表示注册成功，反之，注册失败
     */
    int register(User user);


    /**
     * 判断用户邮箱是否可用
     * @param email
     * @return true为可用，false不可用
     */
    boolean existEmail(String email);
}
