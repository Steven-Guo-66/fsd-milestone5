package com.fsd.purchase.controller;

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

import com.fsd.purchase.entity.PurchaseEntity;
import com.fsd.purchase.service.PurchaseService;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
	@Autowired
	private PurchaseService PurchaseService;

	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<PurchaseEntity> findAllPurchases() {

		return PurchaseService.findAllPurchases();
	}

	@PostMapping
	public ResponseEntity<PurchaseEntity> regist(PurchaseEntity Purchase) {
		PurchaseEntity PurchaseEntity = PurchaseService.registPurchase(Purchase);
		return ResponseEntity.status(HttpStatus.CREATED).body(PurchaseEntity);
	}

	@PutMapping
	public ResponseEntity<PurchaseEntity> update(PurchaseEntity Purchase) {
		PurchaseEntity PurchaseEntity = PurchaseService.updatePurchase(Purchase);
		return ResponseEntity.ok(PurchaseEntity);
	}

	@GetMapping("/active/{id}")
	public ResponseEntity<PurchaseEntity> active(@PathVariable Integer id) {
		PurchaseEntity Purchase = PurchaseService.activePurchase(id);
		return ResponseEntity.ok(Purchase);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		PurchaseService.delete(id);
		return ResponseEntity.ok("Delete Purchase successfully.");
	}
}
