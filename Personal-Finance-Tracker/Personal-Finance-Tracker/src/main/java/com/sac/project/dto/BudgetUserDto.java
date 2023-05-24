package com.sac.project.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BudgetUserDto {
    private String category;
    private Double amt;
    private Boolean recurring;
    private LocalDate starDate;
    private LocalDate endDate;

    private Long userId;
}
