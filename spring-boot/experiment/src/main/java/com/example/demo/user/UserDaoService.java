package com.example.demo.user;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
private static List<User> users = new ArrayList<>();
static {
	users.add(new User(131,"Mukesh Bansal","17-06-1989"));
	users.add(new User(132,"Sunil Bansal","17-06-1989"));
	users.add(new User(133,"Aditya Bansal","17-06-1989"));
}

public List<User> findAll(){
	System.out.println("Inside UserDaoService findAll method");
	return users;
}

public User findUser(int id) {
	return users.get(id);
}

public User createUser(User user) {
	users.add(user);
	return user;
}

public void deleteUser(int id) {
	Predicate<? super User> predicate = users.get
	users.removeIf(null)
}
}
