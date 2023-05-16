package com.sac.project.service;

import java.util.List;

import com.sac.project.domain.User;
import com.sac.project.dto.FinanceDto;
import com.sac.project.exception.FinanceNotFoundException;
import com.sac.project.dto.FinanceUserDto;

public interface FinanceService {
    Integer createNewFinance(FinanceDto finance);

    Integer createNewFinance(FinanceUserDto dto);

    List<FinanceDto> all();

    FinanceDto fetchFinanceDetails(Long id) throws FinanceNotFoundException;

    List<User> allUserFinances(Long id);
    
    Integer deleteFinance(Long id) throws FinanceNotFoundException;
 
    Integer updateFinance(FinanceDto finance);

    Double getTotalIncome();

    Double getTotalExpenses();
  
}
