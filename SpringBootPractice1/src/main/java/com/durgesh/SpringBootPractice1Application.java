package com.durgesh;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.durgesh.dao.UserRepository;
import com.durgesh.entity.User;

@SpringBootApplication
public class SpringBootPractice1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootPractice1Application.class, args);
		User u = new User();
		u.setName("jk");
		u.setVillage("kj");
		UserRepository userRepository = applicationContext.getBean(UserRepository.class);
		
		//To delete user
		userRepository.deleteById(8);
		
		
		//To find all users
		Iterable<User> all = userRepository.findAll();
		all.forEach(user->{System.out.println(user);});
		
		//To update User
//		Optional<User> opt = userRepository.findById(5);
//		User user = opt.get();
//		System.out.println(user);
		
		//To save multiple users
//		User u1 = new User();
//		u1.setName("chikky");
//		u1.setVillage("Rangapur");
//		
//		User u2 = new User();
//		u2.setName("chintu");
//		u2.setVillage("Rangapoor");
//		
//		List<User> users = List.of(u1,u2);
//		Iterable<User> list = userRepository.saveAll(users);
//		list.forEach(user->{System.out.println(user);});
		
		
		//To save one user
//		User user = userRepository.save(u);
//		System.out.println(user);
		
	}

}
