package com.example.demo.exam.oneToOne;

import java.util.Optional;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AnswerController {
	
	@Autowired
	private AnswerService answerService;
	
	@GetMapping("/answers/{id}")
	public Optional<Answer> getRecordById(@PathVariable int id) {
		return answerService.getRecordById(id);
	}
	
	@GetMapping("/answers")
	public List<Answer> getAllRecord() {
		return answerService.getAllRecord();
	}
	
	@PostMapping("/answers")
	public Answer saveRecord(@RequestBody Answer answer) {
		return answerService.saveRecord(answer);
	}
	
}
