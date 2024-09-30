package com.example.demo.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
	
	@Autowired
	private ToDoService toDoService;
	
	@GetMapping("/todo-list")
	public List<ToDo> getToDoList(){
		return toDoService.getAllToDoList();
	}
	
	@PostMapping("/todo-list")
	public ToDo save(@RequestBody ToDo obj) {
		return toDoService.save(obj);
	}
	
//	@GetMapping("/todo-list/{id}")
//	public Res getToDoListById(PathVariable Long id) {
//		
//	}
	

}
