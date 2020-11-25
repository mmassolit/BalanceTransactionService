package com.videosharing.service;

import java.util.List;

import com.videosharing.api.dto.BalanceTransactionPayload;
import com.videosharing.model.BalanceTransaction;

import javassist.NotFoundException;


public interface IBalanceTransactionService {
	List<BalanceTransaction> findAll();
	
	BalanceTransaction save(BalanceTransaction balanceTransactionForSave);
    
	BalanceTransaction getById(String balanceTransactionId) throws NotFoundException;

    void deleteById(String balanceTransactionId) throws NotFoundException;
    
    BalanceTransaction addBalanceTransaction(BalanceTransactionPayload payload) throws NotFoundException, IllegalArgumentException;
}
