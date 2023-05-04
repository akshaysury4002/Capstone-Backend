package com.sac.project.service;

import java.util.List;

import com.sac.project.dto.SavingsDto;
import com.sac.project.dto.SavingsUserDto;
import com.sac.project.exception.FinanceNotFoundException;
import com.sac.project.exception.SavingsNotFoundException;
import com.sac.project.exception.UserNotFoundException;

public interface SavingsService {
    Integer createNewSavings(SavingsDto savingsDto);

    Integer createNewSavings(SavingsUserDto dto);

    List<SavingsDto> all();

    Integer deleteSavings(Long id) throws FinanceNotFoundException;

    SavingsDto fetchSavingsDetails(Long id) throws SavingsNotFoundException;

    Integer updateSavings(SavingsDto finance);

    List<SavingsDto> allUserSavings(Long id) throws UserNotFoundException;
    
}
