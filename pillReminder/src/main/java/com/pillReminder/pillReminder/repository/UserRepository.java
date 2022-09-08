package com.pillReminder.pillReminder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pillReminder.pillReminder.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
		
	
	
	
}
