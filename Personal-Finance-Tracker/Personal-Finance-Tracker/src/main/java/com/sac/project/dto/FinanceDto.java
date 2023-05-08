package com.sac.project.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sac.project.domain.User;
import com.sac.project.util.FinanceType;

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
@Builder
@ToString
public class FinanceDto {
    private Long id;

    @NotNull(message = "financeType cannot be null")
    private FinanceType financeType;

    @NotNull(message = "tag cannot be null")
    private String tag;

    @PastOrPresent(message = "invDt must be a past or present date")
    @NotNull(message = "invDt cannot be null")
    private LocalDate invDt;

    @NotNull(message = "amt cannot be null")
    private Double amt;

    UserDTO userDto;

}
