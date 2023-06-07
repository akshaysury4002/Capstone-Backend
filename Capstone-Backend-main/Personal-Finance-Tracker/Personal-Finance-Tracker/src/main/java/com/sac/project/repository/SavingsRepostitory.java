package com.sac.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sac.project.domain.Savings;

public interface SavingsRepostitory extends JpaRepository<Savings ,Long> {
    
}
