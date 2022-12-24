package com.ning.test;

import com.ning.beans.User;
import com.ning.dao.impl.UserDaoImpl;
import com.ning.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: UserDaoImplTest
 * Package: com.ning.test
 * Description:
 *
 * @Author: Ning
 * @Create: 2022/12/6 - 21:38
 */
public class UserDaoImplTest {
    @Test
    public void register(){
        User san = new User("1", "ning", "2043393364", "2043393364@qq.com");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.register(san);
    }

    @Test
    public void login(){
        User san = new User("1", "ning", "2043393364", "2043393364@qq.com");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.login(san);
    }

    @Test
    public void existEmail(){
        User san = new User("1", "ning", "2043393364", "2043393364@qq.com");
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        boolean b = userServiceImpl.existEmail(san.getEmail());
        System.out.println(b);
    }
}
