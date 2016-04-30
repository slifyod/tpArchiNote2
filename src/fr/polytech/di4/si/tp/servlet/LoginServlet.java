package fr.polytech.di4.si.tp.servlet;


import fr.polytech.di4.si.tp.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        //TODO test if combination of login and pass is right
        if (login.equals("login") && password.equals("password")) {
            User user = new User();
            //TODO store the user in the var user
            session.setAttribute("authenticated", user);
            response.sendRedirect(getServletContext().getContextPath() + "/restrict/");
        } else {
            session.setAttribute("authenticated", null);
            response.sendRedirect(getServletContext().getContextPath() + "/login");
        }
    }

}
