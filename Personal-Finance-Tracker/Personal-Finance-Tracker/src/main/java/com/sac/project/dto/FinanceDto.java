package com.sac.project.dto;

import java.time.LocalDate;

import com.sac.project.util.FinanceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FinanceDto {
    private Long id;
    private FinanceType financeType;
    private String tag;
    private LocalDate invDt;
    private Double amt;
    private UserDTO userDto;
}

