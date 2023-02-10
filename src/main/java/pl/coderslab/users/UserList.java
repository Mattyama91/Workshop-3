package pl.coderslab.users;

import pl.coderslab.entity.UserDao;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserList", value = "/user/list")
public class UserList extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        request.setAttribute("users", userDao.findAllUsers());

        getServletContext().getRequestDispatcher("/users/list.jsp")
                .forward(request, response);
    }
}

