package com.ning.web; /**
 * ClassName: ${NAME}
 * Package: ${PACKAGE_NAME}
 * Description:
 *
 * @Author: Ning
 * @Create: 2022/12/6 - 22:40
 */

import com.ning.beans.User;
import com.ning.service.impl.UserService;
import com.ning.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {

    private UserServlet userServlet =  new UserServlet();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = new User(name, password, email);
        UserServiceImpl userServiceImpl = userServlet.getUserServiceImpl();
        boolean b = userServiceImpl.existEmail(user.getEmail());
        if(b){
            PrintWriter writer = response.getWriter();
            writer.write("The email address has already been registered!");
        }else{
            userServiceImpl.register(user);
            PrintWriter writer = response.getWriter();
            writer.write("Registration succeeded!");
        }
    }
}
