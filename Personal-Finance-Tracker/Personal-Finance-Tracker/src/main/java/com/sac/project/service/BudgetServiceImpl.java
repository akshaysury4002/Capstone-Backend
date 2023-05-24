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
import com.sac.project.util.BudgetMapper;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class BudgetServiceImpl implements BudgetService {
    BudgetRepository repository;
    UserRepository userRepository;
    BudgetMapper mapper;

    @Override
    public Integer createNewBudget(BudgetDto dto) {
        repository.save(mapper.toDomain(dto));
        return 1;
    }

    @Override
    public List<BudgetDto> all() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Integer deleteBudget(Long id){
        repository.deleteById(id);
        return 1;
    }

    @Override
    public BudgetDto fetchBudgetDetails(Long id) {
        Optional<Budget> op = repository.findById(id);
        return mapper.toDto(op.orElseThrow());
    }

    @Override
    public Integer updateBudget(BudgetDto finance) {
        repository.save(mapper.toDomain(finance));
        return 1;
    }

    @Override
    public Integer createNewBudget(BudgetUserDto dto) {

        User user = userRepository.findById(dto.getUserId())
                                        .orElseThrow(() -> new UserNotFoundException("User Not Found"));

        Budget budget = new Budget();
        budget.setCategory(dto.getCategory());
        budget.setAmount(dto.getAmt());
        budget.setEndDate(dto.getEndDate());
        budget.setUser(user);

        repository.save(budget);

        return 1;
    }

    @Override
    public List<BudgetDto> allUserBudget(Long id) throws UserNotFoundException {
        return repository.findById(id)
                        .stream()
                        .map(mapper::toDto)
                        .collect(Collectors.toList());
    }


    
}
