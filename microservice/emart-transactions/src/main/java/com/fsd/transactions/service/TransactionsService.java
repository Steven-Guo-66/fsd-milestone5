package com.fsd.transactions.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fsd.transactions.entity.TransactionsEntity;

public interface TransactionsService {

	/**
	 * ��ҳ��ѯ�û��б�
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<TransactionsEntity> findAll(int page, int pageSize);
	
	/**
	 * ��ѯ�����û��б�
	 * 
	 * @return
	 */
	public List<TransactionsEntity> findAllTransactionss();
	
	/**
	 * ����ID��ѯһ���û�
	 * 
	 * @param 
	 * @return
	 */
	public TransactionsEntity findTransactionsById(Integer id);
	
	/**
	 * ע��һ���û�
	 * 
	 * @param Transactions
	 * @return
	 */
	public TransactionsEntity registTransactions(TransactionsEntity Transactions);
	
	/**
	 * �����û���Ϣ
	 * 
	 * @param Transactions
	 * @return
	 */
	public TransactionsEntity updateTransactions(TransactionsEntity Transactions);
	
	/**
	 * �����û�
	 * 
	 * @param id
	 * @return
	 */
	public TransactionsEntity activeTransactions(Integer id);
	
	/**
	 * ɾ��һ���û�
	 * 
	 * @param id
	 */
	public void delete(Integer id);
}
