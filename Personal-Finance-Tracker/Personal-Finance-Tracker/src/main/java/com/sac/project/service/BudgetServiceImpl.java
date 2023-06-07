package com.sac.project.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sac.project.domain.Budget;
import com.sac.project.domain.User;
import com.sac.project.dto.BudgetDto;
import com.sac.project.dto.BudgetUserDto;
import com.sac.project.exception.UserNotFoundException;
import com.sac.project.repository.BudgetRepository;
import com.sac.project.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class BudgetServiceImpl implements BudgetService {@Override
    public BudgetDto createBudget(BudgetDto budgetDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createBudget'");
    }
}
