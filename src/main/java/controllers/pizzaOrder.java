package controllers;

import models.order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/pizza-order")
public class pizzaOrder extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("orderform/pizzaOrder.jsp").forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String size = req.getParameter("size");
            String crust = req.getParameter("crust");
            String sauce = req.getParameter("sauce");
            String[] toppings = req.getParameterValues("toppings");
            String address = req.getParameter("address");
            System.out.println(size);
            System.out.println(crust);
            System.out.println(sauce);
            System.out.println("toppings:");
            for(String topping : toppings) {
                System.out.println(topping);
            }
            System.out.println(address);

            order submittedOrder = new order(size, crust, sauce, toppings, address);
            req.setAttribute("order", submittedOrder);
            req.getRequestDispatcher("orderform/pizzaOrder.jsp").forward(req, resp);
        }

}
