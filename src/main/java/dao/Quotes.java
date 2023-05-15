package dao;

import models.Quote;

import java.util.List;

import java.util.List;

public interface Quotes {
    List<Quote> all();
    Long insert(Quote quote);
}