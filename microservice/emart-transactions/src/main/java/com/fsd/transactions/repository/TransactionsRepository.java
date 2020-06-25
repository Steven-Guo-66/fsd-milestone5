package com.fsd.transactions.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fsd.transactions.entity.TransactionsEntity;

@Repository
public interface TransactionsRepository extends JpaRepository<TransactionsEntity, Integer> {
	public TransactionsEntity findTransactionsById(Integer id);

	@Modifying
	@Transactional
	@Query(value = "SELECT * FROM emart.transactions;", nativeQuery = true)
	public int activeTransactions(@Param("id") Integer id);
}
