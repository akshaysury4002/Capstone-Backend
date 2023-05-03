package com.sac.project.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sac.project.util.FinanceType;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor()
@ToString
@Setter
@Getter
@Entity
@Table(name = "financeManagement")
public class Finance {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "Income/Expenses")
    @Enumerated(EnumType.STRING)
    private FinanceType financeType;
    @Column(name = "Tag")
    private String tag;
    @Column(name = "ProcessedDate")
    private LocalDate invDt; // inv_dt
    @Column(name = "Amount")
    private Double amt;   
    @ManyToOne
    @JoinColumn(name = "users", nullable = false)
    private User user;
    
}
