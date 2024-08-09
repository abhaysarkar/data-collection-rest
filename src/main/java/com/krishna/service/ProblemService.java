package com.krishna.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.entity.Problem;
import com.krishna.repository.ProblemRepository;

@Service
public class ProblemService {
	
	@Autowired 
	private ProblemRepository problemRepository;
	
	public String addProblem(Problem problem) {
		problemRepository.save(problem);
		return "Added";
	}
	
	public List<Problem> showAllProblem(){
		List<Problem> problems = problemRepository.findAll();
		return problems;
	}
	
	public long getCount() {
		return problemRepository.count();
	}
	
	public Problem getOneRandomProblem() {
		long maxCount = getCount();
		Optional<Problem> findById = problemRepository.findById(getRandomNumber(maxCount));
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	
	}
	
	public long getRandomNumber(long max) {
		
		Random random = new Random();
        int min = 1;
        long randomNumber = random.nextLong(max - min + 1) + min;
        return randomNumber;
	}

}
