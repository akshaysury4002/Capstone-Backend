package com.sac.project.util;

import org.springframework.beans.BeanUtils;
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
        Savings domain = new Savings();
        BeanUtils.copyProperties(dto, domain);
        domain.setUser(userMapper.toDomain(dto.getUserDto()));
        return domain;
    }

    public SavingsDto toDto(Savings domain) {
        SavingsDto dto = new SavingsDto();
        BeanUtils.copyProperties(domain, dto);
        dto.setUserDto(userMapper.toDto(domain.getUser()));
        return dto;
    }
}
