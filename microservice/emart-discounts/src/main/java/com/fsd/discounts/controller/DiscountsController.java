package com.fsd.discounts.controller;

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

import com.fsd.discounts.entity.DiscountsEntity;
import com.fsd.discounts.service.DiscountsService;

@RestController
@RequestMapping("/api/discounts")
public class DiscountsController {
	@Autowired
	private DiscountsService DiscountsService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<DiscountsEntity> findAllDiscountss(){
		
		return DiscountsService.findAllDiscountss();
	}
	
	@PostMapping
	public ResponseEntity<DiscountsEntity> regist(DiscountsEntity Discounts){
		DiscountsEntity DiscountsEntity = DiscountsService.registDiscounts(Discounts);
		return ResponseEntity.status(HttpStatus.CREATED).body(DiscountsEntity); 
	}
	
	@PutMapping
	public ResponseEntity<DiscountsEntity> update(DiscountsEntity Discounts){
		DiscountsEntity DiscountsEntity = DiscountsService.updateDiscounts(Discounts);
		return ResponseEntity.ok(DiscountsEntity); 
	}
	
	@GetMapping("/active/{id}")
	public ResponseEntity<DiscountsEntity> active(@PathVariable Integer id){
		DiscountsEntity Discounts = DiscountsService.activeDiscounts(id);
		return ResponseEntity.ok(Discounts); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		DiscountsService.delete(id);
		return ResponseEntity.ok("Delete Discounts successfully.");
	}
}
