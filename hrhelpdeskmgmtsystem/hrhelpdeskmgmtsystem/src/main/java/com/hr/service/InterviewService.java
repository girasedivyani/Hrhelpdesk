package com.hr.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.hr.entity.Interview;



@Component
public interface InterviewService {
	
	String welcome();
	
	ResponseEntity<Interview> createInterview(Interview interview); 
	
	ResponseEntity<Interview> updateInterview(int id, Interview interview) ;
	
	ResponseEntity<List<Interview>> getAllInterviewsByDate(String Date);
	
	ResponseEntity<Interview> deleteInterview(int id);
	
    List<Interview> getAllInterview();

}
