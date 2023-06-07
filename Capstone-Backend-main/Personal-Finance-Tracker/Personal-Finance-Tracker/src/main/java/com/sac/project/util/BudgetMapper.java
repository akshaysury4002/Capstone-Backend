package com.sac.project.util;

import org.springframework.stereotype.Component;

import com.sac.project.domain.Budget;
import com.sac.project.domain.User;
import com.sac.project.dto.BudgetDto;

@Component
public class BudgetMapper {
    // public BudgetDto toDTO(Budget budget) {
    //     BudgetDto budgetDTO = new BudgetDto();
    //     budgetDTO.setId(budget.getId());
    //     budgetDTO.setCategory(budget.getCategory());
    //     budgetDTO.setAmount(budget.getAmount());
    //     budgetDTO.setRecurring(budget.getRecurring());
    //     budgetDTO.setStartDate(budget.getStartDate());
    //     budgetDTO.setEndDate(budget.getEndDate());
    //     budgetDTO.setUserId(budget.getUser().getId());
    //     return budgetDTO;
    // }

    // public Budget toEntity(BudgetDto budgetDTO) {
    //     Budget budget = new Budget();
    //     budget.setId(budgetDTO.getId());
    //     budget.setCategory(budgetDTO.getCategory());
    //     budget.setAmount(budgetDTO.getAmount());
    //     budget.setRecurring(budgetDTO.getRecurring());
    //     budget.setStartDate(budgetDTO.getStartDate());
    //     budget.setEndDate(budgetDTO.getEndDate());
    //     // Set the User entity based on the userId
    //     User user = new User();
    //     user.setId(budgetDTO.getUserId());
    //     budget.setUser(user);
    //     return budget;
    // }
}
