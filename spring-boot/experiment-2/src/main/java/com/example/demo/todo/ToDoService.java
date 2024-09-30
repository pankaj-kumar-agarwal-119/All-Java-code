package com.example.demo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ToDoService {
	
	@Autowired
ToDoRepository  todoRepository;
	
	
	public List<ToDo> getAllToDoList(){
		return  todoRepository.findAll();
	}
	
	public Optional<ToDo> findById(long id){
		return todoRepository.findById(id);
	}
	
	public ToDo save(ToDo obj) {
		return todoRepository.save(obj);
	}
	
	
	public void deleteById(long id) {
		todoRepository.deleteById(id);
	}
	
	public ToDo updateById(long id,ToDo details) {
		Optional<ToDo> rawObj = todoRepository.findById(id);
		ToDo todo = rawObj.get();
		todo.setTitle(details.getTitle());
		todo.setDescription(details.getDescription());
		todo.setStatus(details.isStatus());
		ToDo savedObj = todoRepository.save(todo);
		return savedObj;
	}
	
}
