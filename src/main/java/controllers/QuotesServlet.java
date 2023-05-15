package controllers;

import dao.Authors;
import dao.DaoFactory;
import dao.Quotes;
import dao.QuotesDao;
import models.Author;
import models.Quote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "QuotesServlet", urlPatterns = "/quotes")
public class QuotesServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String author_name = req.getParameter("author_name");
        String content = req.getParameter("content");
        long author_id;
        Authors authorsDao = DaoFactory.getAuthorsDao();
        Author quote_author = authorsDao.getOneAuthorByName(author_name);
        if (quote_author == null) {
            authorsDao.insert(new Author(0, author_name));
            quote_author = authorsDao.getOneAuthor((int) author_id);
        }
        Quote quote = new Quote(0, content, quote_author);
        Quotes quotesDao = DaoFactory.getQuotesDao();
        quotesDao.insert(quote);
        resp.sendRedirect("/quotes");
    }
}
