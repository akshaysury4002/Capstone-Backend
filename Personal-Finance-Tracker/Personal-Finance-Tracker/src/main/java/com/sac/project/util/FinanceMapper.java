package com.sac.project.util;

import org.springframework.stereotype.Component;

import com.sac.project.domain.Finance;
import com.sac.project.dto.FinanceDto;

@Component
public class FinanceMapper {

    private final UserMapper userMapper;

    public FinanceMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Finance toDomain(FinanceDto dto) {
        return Finance.builder()
                .amt(dto.getAmt())
                .tag(dto.getTag())
                .id(dto.getId())
                .financeType(dto.getFinanceType())
                .invDt(dto.getInvDt())
                .user(userMapper.toDomain(dto.getUserDto()))
                .build();
    }

    public FinanceDto toDto(Finance domain) {
        return new FinanceDto(
                domain.getId(),
                domain.getFinanceType(),
                domain.getTag(),
                domain.getInvDt(),
                domain.getAmt(),
                userMapper.toDto(domain.getUser()));
    }
}

