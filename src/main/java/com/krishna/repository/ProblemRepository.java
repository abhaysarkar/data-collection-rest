package com.krishna.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishna.entity.Problem;

@Repository
public interface ProblemRepository extends JpaRepository<Problem, Long>{

}
