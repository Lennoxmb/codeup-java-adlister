package controllers;

import models.order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class pizzaOrder extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("/orderform/pizzaOrder.jsp").forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String crust = req.getParameter("crust");
            String sauce = req.getParameter("sauce");
            String[] toppings = req.getParameterValues("toppings");
            order submittedOrder = new order();
            String fontSizeRequested = req.getParameter("font-size");
            System.out.println(fontSizeRequested);
            req.setAttribute("post", submittedOrder);
            req.setAttribute("font", fontSizeRequested);
            req.getRequestDispatcher("/blog/createPost.jsp").forward(req, resp);
        }

}
