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
@Table(name = "finance")
public class Finance {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "income_expenses")
    @Enumerated(EnumType.STRING)
    private FinanceType financeType;
    @Column(name = "tag")
    private String tag;
    @Column(name = "processed_date")
    private LocalDate processedDate;
    @Column(name = "amount")
    private Double amount;
    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private User user;   
}
