package com.sac.project.util;

import org.springframework.stereotype.Component;

import com.sac.project.domain.Savings;
import com.sac.project.dto.SavingsDto;

@Component
public class SavingsMapper {

    private final UserMapper userMapper;

    public SavingsMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Savings toDomain(SavingsDto dto) {
        return Savings.builder()
                .category(dto.getCategory())
                .goal(dto.getGoal())
                .currAmt(dto.getCurrAmt())
                .target(dto.getTarget())
                .processedDate(dto.getProcessedDate())
                .build();
    }

    public SavingsDto toDto(Savings domain) {
        return new SavingsDto(
                domain.getId(),
                domain.getCategory(),
                domain.getGoal(),
                domain.getCurrAmt(),
                domain.getTarget(),
                domain.getProcessedDate(),
                userMapper.toDto(domain.getUser()));
    }
}
