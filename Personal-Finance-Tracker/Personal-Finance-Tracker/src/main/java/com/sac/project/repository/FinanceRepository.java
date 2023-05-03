package com.sac.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sac.project.domain.Finance;

public interface FinanceRepository extends JpaRepository<Finance, Long> {
    
}
