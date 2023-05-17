package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import config.Config;
import com.codeup.adlister.models.User;



@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet<User> extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {

            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        User user = DaoFactory.getUsersDao().findByUsername(username);

        if (!inputHasErrors(username, email, password, confirmPassword, user)) {
            user = new User(username, email, password);
            DaoFactory.getUsersDao().insert(user);
            response.sendRedirect("/login");
        } else {
            response.sendRedirect("/register");
        }
    }


    public static boolean inputHasErrors(String username, String email, String password, String confirmPassword, User user) {
        if (user != null) {
            return true;
        }
        if (!password.equals(confirmPassword)) {
            return true;
        }
        return false;
    }
}
