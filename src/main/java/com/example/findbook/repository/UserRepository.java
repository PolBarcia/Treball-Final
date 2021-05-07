package com.example.findbook.repository;


import com.example.findbook.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findUserByEmail(String email);

}
