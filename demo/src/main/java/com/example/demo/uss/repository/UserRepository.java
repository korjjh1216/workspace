package com.example.demo.uss.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.uss.domain.User;

interface UserCustomRepository{
	public User findByUsername(String username);
}
public interface UserRepository extends JpaRepository<User, Long>,UserCustomRepository  {

}
