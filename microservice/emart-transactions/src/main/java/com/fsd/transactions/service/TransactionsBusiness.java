package com.fsd.transactions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fsd.transactions.entity.TransactionsEntity;
import com.fsd.transactions.repository.TransactionsRepository;

@Service
public class TransactionsBusiness implements TransactionsService {
	@Autowired
	private TransactionsRepository TransactionsRepository;

	public Page<TransactionsEntity> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public TransactionsEntity findTransactionsById(Integer id) {
		return TransactionsRepository.findTransactionsById(id);
	}

	public List<TransactionsEntity> findAllTransactionss() {
		return TransactionsRepository.findAll();
	}

	/**
	 * ����һ��Transactions��
	 */
	public TransactionsEntity registTransactions(TransactionsEntity Transactions) {
		return TransactionsRepository.saveAndFlush(Transactions);
	}

	/**
	 * ����Transactions��Ϣ��JPA����ID�������޸ģ�
	 */
	public TransactionsEntity update(TransactionsEntity Transactions) {
		return TransactionsRepository.save(Transactions);
	}

	public TransactionsEntity updateTransactions(TransactionsEntity Transactions) {
		return TransactionsRepository.save(Transactions);
	}

	public TransactionsEntity activeTransactions(Integer id) {
		int flag = TransactionsRepository.activeTransactions(id);
		return TransactionsRepository.findTransactionsById(id);
	}

	public void delete(Integer id) {
		TransactionsRepository.delete(id);
	}
}
