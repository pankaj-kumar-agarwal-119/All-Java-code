package com.example.demo.exam.oneToOne;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	public Question saveRecord(Question rawObj) {
		return questionRepository.save(rawObj);
	}
	
	public List<Question> getAllRecord(){
		return questionRepository.findAll();
	}
	
	public Optional<Question> getRecordById(int id){
		return questionRepository.findById(id);
	}
}
