package com.fsd.buyer.controller;

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

import com.fsd.buyer.entity.BuyerEntity;
import com.fsd.buyer.service.BuyerService;

@RestController
@RequestMapping("/api/buyer")
//@CrossOrigin(origins="http://localhost:4200")
public class BuyerController {
	@Autowired
	private BuyerService BuyerService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<BuyerEntity> findAllBuyers(){
		
		return BuyerService.findAllBuyers();
	}
	
	@PostMapping
	public ResponseEntity<BuyerEntity> regist(BuyerEntity Buyer){
		BuyerEntity BuyerEntity = BuyerService.registBuyer(Buyer);
		return ResponseEntity.status(HttpStatus.CREATED).body(BuyerEntity); 
	}
	
	@PutMapping
	public ResponseEntity<BuyerEntity> update(BuyerEntity Buyer){
		BuyerEntity BuyerEntity = BuyerService.updateBuyer(Buyer);
		return ResponseEntity.ok(BuyerEntity); 
	}
	
	@GetMapping("/active/{id}")
	public ResponseEntity<BuyerEntity> active(@PathVariable Integer id){
		BuyerEntity Buyer = BuyerService.activeBuyer(id);
		return ResponseEntity.ok(Buyer); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		BuyerService.delete(id);
		return ResponseEntity.ok("Delete Buyer successfully.");
	}
}
