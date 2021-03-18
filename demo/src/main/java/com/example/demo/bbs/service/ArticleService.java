package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.bbs.domain.Article;

public interface ArticleService {
    public Optional<Article> findOne();
    public List<Article> findAll();
    public Optional<Article> findById(long id);
    public List<Article> findAllById(Iterable<Article> ids);


    public long count();
    
    public void deleteById(long id);

    public Article getOne(long id);

    public boolean existsById(long id);

    public void flush();

    public List<Article> saveAll(Iterable<Article> entities);
    public Article saveAndFlush(Article entity);
    public Article save(Article entity);
}
