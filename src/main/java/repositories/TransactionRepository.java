package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> ,JpaSpecificationExecutor<Transaction> {

}
