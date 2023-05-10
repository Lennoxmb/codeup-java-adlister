package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet ("/pickcolor")
public class colorServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("/orderform/pickcolor.jsp").forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String submittedColor = req.getParameter("favcolor");
            System.out.println(submittedColor);
            resp.sendRedirect("/viewcolor?favcolor=" + submittedColor);
            req.setAttribute("favcolor", submittedColor);
    }
}
