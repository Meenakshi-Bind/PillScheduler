package com.pillReminder.pillReminder.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.pillReminder.pillReminder.model.Role;
import com.pillReminder.pillReminder.model.User;
import com.pillReminder.pillReminder.repository.UserRepository;
import com.pillReminder.pillReminder.web.dto.UserRegistrationdto;

@Service
public abstract class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepository userRepository;
//	public UserServiceImpl(UserRepository userRepository) {
//		super();
//		this.userRepository = userRepository;
//	}
//	
 private PasswordEncoder passwordEncoder;
 
//	private BCryptPasswordEncoder passwordEncoder;
//	
//	public UserServiceImpl(UserServiceImpl userRepository) {
//		super();
//		this.userRepository =  (UserRepository) userRepository;
//	}
	
	@Override
	public User save(UserRegistrationdto registrationDto)
	{
		User user = new User(registrationDto.getFirstname(),registrationDto.getLastName(),registrationDto.getEmail(),passwordEncoder.encode(registrationDto.getPassword()),
				registrationDto.getConfirm_Password(),registrationDto.getContactNumber(),
				registrationDto.getCountry(),registrationDto.getDate_of_birth(),Arrays.asList(new Role("ROLE_USER")));
		return userRepository.save(user);
	}

    public UserDetails loadUserByUsernameDetails (String username) throws UsernameNotFoundException {
		
	
		User user = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));		
	}
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}

	

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	
}