package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class guess extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/orderform/guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        int userGuess = Integer.parseInt(req.getParameter("guess"));
        String destination;
        if (userGuess > 3 || userGuess < 1) {
            destination = "/guess";
        } else if (userGuess == randomNumber) {
            destination = "/correct";
        } else {
            destination = "/incorrect";
        }
        resp.sendRedirect(destination);
    }
}
