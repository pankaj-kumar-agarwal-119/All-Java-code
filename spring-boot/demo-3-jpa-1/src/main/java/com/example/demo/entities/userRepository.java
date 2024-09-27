package com.example.demo.entities;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<User, Integer>{

}
