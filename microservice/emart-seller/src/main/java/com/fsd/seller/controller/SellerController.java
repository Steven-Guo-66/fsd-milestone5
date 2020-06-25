package com.fsd.seller.controller;

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

import com.fsd.seller.entity.SellerEntity;
import com.fsd.seller.service.SellerService;

@RestController
@RequestMapping("/api/seller")
public class SellerController {
	@Autowired
	private SellerService SellerService;

	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<SellerEntity> findAllSellers() {

		return SellerService.findAllSellers();
	}

	@PostMapping
	public ResponseEntity<SellerEntity> regist(SellerEntity Seller) {
		SellerEntity SellerEntity = SellerService.registSeller(Seller);
		return ResponseEntity.status(HttpStatus.CREATED).body(SellerEntity);
	}

	@PutMapping
	public ResponseEntity<SellerEntity> update(SellerEntity Seller) {
		SellerEntity SellerEntity = SellerService.updateSeller(Seller);
		return ResponseEntity.ok(SellerEntity);
	}

	@GetMapping("/active/{id}")
	public ResponseEntity<SellerEntity> active(@PathVariable Integer id) {
		SellerEntity Seller = SellerService.activeSeller(id);
		return ResponseEntity.ok(Seller);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		SellerService.delete(id);
		return ResponseEntity.ok("Delete Seller successfully.");
	}
}
