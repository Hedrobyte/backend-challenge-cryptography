package com.hedrobyte.cryptography.repository;

import com.hedrobyte.cryptography.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
}