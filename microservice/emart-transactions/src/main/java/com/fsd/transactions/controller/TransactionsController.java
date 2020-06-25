package com.fsd.transactions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.transactions.entity.TransactionsEntity;
import com.fsd.transactions.service.TransactionsService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionsController {
	@Autowired
	private TransactionsService TransactionsService;

	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<TransactionsEntity> findAllTransactionss() {

		return TransactionsService.findAllTransactionss();
	}

	@PostMapping
	public ResponseEntity<TransactionsEntity> regist(TransactionsEntity Transactions) {
		TransactionsEntity TransactionsEntity = TransactionsService.registTransactions(Transactions);
		return ResponseEntity.status(HttpStatus.CREATED).body(TransactionsEntity);
	}

	@PutMapping
	public ResponseEntity<TransactionsEntity> update(TransactionsEntity Transactions) {
		TransactionsEntity TransactionsEntity = TransactionsService.updateTransactions(Transactions);
		return ResponseEntity.ok(TransactionsEntity);
	}

	@GetMapping("/active/{id}")
	public ResponseEntity<TransactionsEntity> active(@PathVariable Integer id) {
		TransactionsEntity Transactions = TransactionsService.activeTransactions(id);
		return ResponseEntity.ok(Transactions);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		TransactionsService.delete(id);
		return ResponseEntity.ok("Delete Transactions successfully.");
	}
}
