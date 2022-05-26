package com.nicatguliyev.mysocialdemo2;

import com.nicatguliyev.mysocialdemo2.model.Role;
import com.nicatguliyev.mysocialdemo2.model.User;
import com.nicatguliyev.mysocialdemo2.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class Mysocialdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mysocialdemo2Application.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
		  userService.saveRole(new Role(null, "ROLE_USER"));
		  userService.saveRole(new Role(null, "ROLE_MANAGER"));
		  userService.saveRole(new Role(null, "ROLE_ADMIN"));
		  userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

		  userService.saveUser(new User(null, "Nicat Guliyev", "nicat123", "12345", new ArrayList<>()));
		  userService.saveUser(new User(null, "Natiq Guliyev", "natiq11", "23157", new ArrayList<>()));
		  userService.saveUser(new User(null, "Cingiz Sheydayev", "cina123", "44444", new ArrayList<>()));
		  userService.saveUser(new User(null, "Nadir Hasimov", "nado33", "55555", new ArrayList<>()));

		  userService.addRoleToUser("nicat123", "ROLE_ADMIN");
		  userService.addRoleToUser("natiq11", "ROLE_USER");
		  userService.addRoleToUser("natiq11", "ROLE_MANAGER");
		  userService.addRoleToUser("cina123", "ROLE_USER");
		  userService.addRoleToUser("nado33", "ROLE_SUPER_ADMIN");
		};
	}


}
