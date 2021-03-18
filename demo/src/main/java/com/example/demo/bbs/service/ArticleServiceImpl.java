package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bbs.domain.Article;
import com.example.demo.bbs.repository.ArticleRepository;
import com.example.demo.cmm.service.AbstractService;

@Service
public class ArticleServiceImpl extends AbstractService<Article>  {
    @Autowired ArticleRepository repo;
	
	@Override
	public Optional<Article> findOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Article> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findAllById(Iterable<Article> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Article getOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Article> saveAll(Iterable<Article> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article save(Article entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
