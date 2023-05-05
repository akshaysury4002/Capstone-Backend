package com.sac.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sac.project.domain.Finance;
import com.sac.project.util.FinanceType;

public interface FinanceRepository extends JpaRepository<Finance, Long> {


    @Query("SELECT SUM(f.amount) FROM Finance f WHERE f.financeType = :type")
    Double getTotalAmountByType(@Param("type") FinanceType type);

}
