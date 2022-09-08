package com.pillReminder.pillReminder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
//@ComponentScan ({"com.server", "com.server.config"} )
//@ComponentScan(basePackages = "com.pillreminder.pillreminder.Controller" + "com.pillReminder.pillReminder.service")

@ComponentScan("springboot")
public class PillReminderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PillReminderApplication.class, args);
	}

}
