package com.ning.web; /**
 * ClassName: ${NAME}
 * Package: ${PACKAGE_NAME}
 * Description:
 *
 * @Author: Ning
 * @Create: 2022/12/6 - 23:29
 */

import com.ning.beans.User;
import com.ning.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    private UserServlet userServlet = new UserServlet();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = new User(password, email);
        UserServiceImpl userServiceImpl = userServlet.getUserServiceImpl();
        User login = userServiceImpl.login(user);
        if(login!=null){
            PrintWriter writer = response.getWriter();
            writer.write("Welcome to " + login.getName() + "!");
        }else{
            PrintWriter writer = response.getWriter();
            writer.write("Email or password error!");
        }

    }
}
