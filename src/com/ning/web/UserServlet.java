package com.ning.web;

import com.ning.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Servlet
 * Package: com.ning.web
 * Description:
 *
 * @Author: Ning
 * @Create: 2022/12/6 - 23:20
 */
public class UserServlet {

    private ApplicationContext context = null;
    private UserServiceImpl userServiceImpl = null;
    public UserServlet(){
        context = new ClassPathXmlApplicationContext("bean.xml");
        userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
    }

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    public UserServiceImpl getUserServiceImpl() {
        return userServiceImpl;
    }

    public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }
}
