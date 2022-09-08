package com.pillReminder.pillReminder.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pillReminder.pillReminder.service.UserService;
import com.pillReminder.pillReminder.web.dto.UserRegistrationdto;
//@Component
@Controller("/registration")


public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
    public UserRegistrationdto userRegistrationDto() {
        return new UserRegistrationdto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount( UserRegistrationdto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
}



