package com.sac.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sac.project.domain.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long>{    
}
