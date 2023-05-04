package com.sac.project.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Table(name = "savings")
public class Savings {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "saving_types")
    private String category;
    @Column(name = "goal_amount")
    private Double goal;
    @Column(name = "curr_amount")
    private Double currAmt;
    @Column(name = "target_date")
    private LocalDate target;
    @Column(name = "processed_date")
    private LocalDate processedDate;
    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private User user;   
}