package com.sac.project.util;

import org.springframework.stereotype.Component;

import com.sac.project.domain.Budget;
import com.sac.project.dto.BudgetDto;

@Component
public class BudgetMapper {
    
    private final UserMapper userMapper;

    public BudgetMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Budget toDomain(BudgetDto dto) {
        return Budget.builder()
                .category(dto.getCategory())
                .amount(dto.getAmount())
                .recurring(dto.getRecurring())
                .startDate(dto.getStartDate())
                .endDate(dto.getEndDate())
                .user(userMapper.toDomain(dto.getUserDto()))
                .build();
    }

    public BudgetDto toDto(Budget domain) {
        return new BudgetDto(
                domain.getId(),
                domain.getCategory(),
                domain.getAmount(),
                domain.getRecurring(),
                domain.getStartDate(),
                domain.getEndDate(),
                userMapper.toDto(domain.getUser()));
    }
}
