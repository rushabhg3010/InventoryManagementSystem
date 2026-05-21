package com.rushabh.DistributorManagementSystem.services;

import com.rushabh.DistributorManagementSystem.dtos.Response;
import com.rushabh.DistributorManagementSystem.dtos.TransactionRequest;
import com.rushabh.DistributorManagementSystem.enums.TransactionStatus;

public interface TransactionService {
	
	Response purchase(TransactionRequest transactionRequest);

    Response sell(TransactionRequest transactionRequest);

    Response returnToSupplier(TransactionRequest transactionRequest);

    Response getAllTransactions(int page, int size, String filter);

    Response getAllTransactionById(Long id);

    Response getAllTransactionByMonthAndYear(int month, int year);

    Response updateTransactionStatus(Long transactionId, TransactionStatus status);

}
