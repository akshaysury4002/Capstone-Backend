package com.sac.project.service;


import java.util.List;

import com.sac.project.dto.BudgetDto;
import com.sac.project.dto.BudgetUserDto;

public interface BudgetService {
    Integer createNewBudget(BudgetDto dto);

    Integer createNewBudget(BudgetUserDto dto);

    List<BudgetDto> all();

    Integer deleteBudget(Long id);

    BudgetDto fetchBudgetDetails(Long id);

    Integer updateBudget(BudgetDto budget);

    List<BudgetDto> allUserBudget(Long id);
    
}
