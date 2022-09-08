package com.pillReminder.pillReminder.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.pillReminder.pillReminder.model.User;
import com.pillReminder.pillReminder.web.dto.UserRegistrationdto;


public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationdto registrationDto);

//    	UserDetails loadUserByUsernameDetails(String username) throws UsernameNotFoundException;
	

}
