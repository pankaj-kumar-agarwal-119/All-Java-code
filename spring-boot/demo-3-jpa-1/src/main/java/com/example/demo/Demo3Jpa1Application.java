package com.example.demo;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.User;
import com.example.demo.entities.userRepository;
@SpringBootApplication
public class Demo3Jpa1Application {
	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext = SpringApplication.run(Demo3Jpa1Application.class, args);
	 //start
	userRepository userRepo = applicationContext.getBean(userRepository.class);
	
	//create a User object and save it (Saving the entities one by one
//	User user = new User();
//	user.setName("Rajesh Khanna");
//	user.setCity("Mumbai");
//	user.setStatus("Work as a actor in hindi cinema.First superstar");
//	userRepo.save(user);
//	
//	User user2 = new User();
//	user2.setName("Amitabh Bacchan");
//	user2.setCity("Mumbai");
//	user2.setStatus("Work as an actor");
//	userRepo.save(user2);
//	System.out.println("All user saved!");
	
//	User user1 = new User();
//	user1.setName("Rajesh Khanna");
//	user1.setCity("Mumbai");
//	user1.setStatus("Work as a actor in hindi cinema.First superstar");
//	
//	User user2 = new User();
//	user2.setName("Amitabh Bacchan");
//	user2.setCity("Mumbai");
//	user2.setStatus("Work as an actor");
//	List<User> userList = List.of(user1,user2);
//	userRepo.saveAll(userList);
//	System.out.println("All user saved!");
	
//	Iterable<User> itr =  userRepo.findAll();
//	itr.forEach(user->{
//		System.out.println("User : "+user);
//	});
//	
//	Optional<User> op =  userRepo.findById(152);
//	System.out.println("Find user is : "+op.get());
	
	//Update record (Update id 152 with name Rajesh Khanna with city Bombay
//	Optional<User> optionObj = userRepo.findById(152);
//	User user = optionObj.get();
//	user.setCity("Bombay");
//	User result = userRepo.save(user);
//	System.out.println("Saved user is : "+result);
	
	
	
	Optional<User> optionObj = userRepo.findById(152);
	User user = optionObj.get();
	userRepo.delete(user);
	System.out.println("Record deleted!");
	//end
	}

}
