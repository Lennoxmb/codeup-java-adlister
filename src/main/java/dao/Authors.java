package dao;

import java.util.List;
import models.Author;

public interface Authors {
    List<Author> all();

    Author getOneAuthor(int id);
    Author getOneAuthorByName(String author_name);
    void insert(Author author);


}