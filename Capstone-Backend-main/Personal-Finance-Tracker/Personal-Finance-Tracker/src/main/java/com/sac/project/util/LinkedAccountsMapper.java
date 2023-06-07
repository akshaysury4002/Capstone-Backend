// package com.sac.project.util;

// import org.apache.commons.beanutils.BeanUtils;
// import org.springframework.stereotype.Component;

// import com.sac.project.domain.LinkedAccounts;
// import com.sac.project.dto.LinkedAccountsUserDto;

// @Component
// public class LinkedAccountsMapper {

//     private final UserMapper userMapper;

//     public LinkedAccountsMapper(UserMapper userMapper) {
//         this.userMapper = userMapper;
//     }

//     public LinkedAccounts toDomain(LinkedAccountsUserDto dto) {
//         LinkedAccounts domain = new LinkedAccounts();
//         try {
//             BeanUtils.copyProperties(domain, dto);
//             domain.setUser(userMapper.toDomain(dto.getDto()));
//         } catch (Exception e) {
//             // Handle any exceptions
//         }
//         return domain;
//     }

//     public LinkedAccountsUserDto toDto(LinkedAccounts domain) {
//         LinkedAccountsUserDto dto = new LinkedAccountsUserDto();
//         try {
//             BeanUtils.copyProperties(dto, domain);
//             dto.setDto(userMapper.toDto(domain.getUser()));
//         } catch (Exception e) {
//             // Handle any exceptions
//         }
//         return dto;
//     }
// }
