package com.sac.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sac.project.domain.Budget;

@Repository
public interface BudgetRepository extends JpaRepository<Budget , Long>{
    
}
