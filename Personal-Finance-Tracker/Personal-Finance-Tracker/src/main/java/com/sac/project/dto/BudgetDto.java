package com.sac.project.dto;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class BudgetDto {

    private Long id;



    private String category;
    private Double amount;
    private Boolean recurring;
    private LocalDate startDate;
    private LocalDate endDate;
    
    private UserDTO userDto;  

    
}
