package com.rushabh.DistributorManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.rushabh.DistributorManagementSystem.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> ,JpaSpecificationExecutor<Transaction> {

}
