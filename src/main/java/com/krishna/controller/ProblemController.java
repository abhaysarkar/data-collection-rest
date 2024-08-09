package com.krishna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.entity.Problem;
import com.krishna.service.ProblemService;

@RestController
public class ProblemController {
	
	
	@Autowired
	private ProblemService problemService;
	
	@PostMapping("/add-new-problem")
	public String addNewProblem(@RequestBody Problem problem) {
		return problemService.addProblem(problem);
	}
	
	@GetMapping("/show-all")
	public List<Problem> showAllProblem(){
		return problemService.showAllProblem();
	}
	
	@GetMapping("/get-random-one")
	public Problem getRandom() {
		return problemService.getOneRandomProblem();
	}

}
