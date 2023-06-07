package com.sac.project.service;


import java.util.List;

import com.sac.project.domain.Budget;
import com.sac.project.dto.BudgetDto;
import com.sac.project.dto.BudgetUserDto;

public interface BudgetService {
    BudgetDto createBudget(BudgetDto budgetDTO);
    
}
