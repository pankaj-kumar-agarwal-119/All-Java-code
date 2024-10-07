package com.example.demo.exam.oneToOne;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/questions")
	public List<Question> getAllrecord(){
		return questionService.getAllRecord();
	}
	
	@PostMapping("/questions")
	public Question saveRecord(@RequestBody Question rawObj) {
		return questionService.saveRecord(rawObj);
	}
	
	@PostMapping("/questions/{id}/answer")
	public Question saveAnsRecord(@PathVariable int id,@RequestBody Answer rawObj) {
		Optional<Question> queObj = questionService.getRecordById(id);
		Question que = queObj.get();
		que.setAnswer(rawObj);
		return questionService.saveRecord(que);
	}

}
