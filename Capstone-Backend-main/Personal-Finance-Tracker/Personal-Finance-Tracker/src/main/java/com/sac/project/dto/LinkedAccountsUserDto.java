package com.sac.project.dto;



import com.sac.project.domain.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LinkedAccountsUserDto {
    private Long id;
    
    private String accountNumber;
    private String accountHolderName;
    private String bankName;

    UserDTO dto;

    private Long userId;
    
}
