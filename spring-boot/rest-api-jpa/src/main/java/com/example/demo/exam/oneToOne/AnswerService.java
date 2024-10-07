package com.example.demo.exam.oneToOne;

import java.util.Optional;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepository answerRepository;
	
	public Answer saveRecord(Answer rawObj) {
		return answerRepository.save(rawObj);
	}
	
	public Optional<Answer> getRecordById(int id){
		return answerRepository.findById(id);
	}
	
	public List<Answer> getAllRecord(){
		return answerRepository.findAll();
	}
	
	
}
