package com.fsd.subcategory.controller;

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

import com.fsd.subcategory.entity.SubcategoryEntity;
import com.fsd.subcategory.service.SubcategoryService;

@RestController
@RequestMapping("/api/subcategory")
public class SubcategoryController {
	@Autowired
	private SubcategoryService SubcategoryService;

	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<SubcategoryEntity> findAllSubcategorys() {

		return SubcategoryService.findAllSubcategorys();
	}

	@PostMapping
	public ResponseEntity<SubcategoryEntity> regist(SubcategoryEntity Subcategory) {
		SubcategoryEntity SubcategoryEntity = SubcategoryService.registSubcategory(Subcategory);
		return ResponseEntity.status(HttpStatus.CREATED).body(SubcategoryEntity);
	}

	@PutMapping
	public ResponseEntity<SubcategoryEntity> update(SubcategoryEntity Subcategory) {
		SubcategoryEntity SubcategoryEntity = SubcategoryService.updateSubcategory(Subcategory);
		return ResponseEntity.ok(SubcategoryEntity);
	}

	@GetMapping("/active/{subcategory_id}")
	public ResponseEntity<SubcategoryEntity> active(@PathVariable Integer id) {
		SubcategoryEntity Subcategory = SubcategoryService.activeSubcategory(id);
		return ResponseEntity.ok(Subcategory);
	}

	@DeleteMapping("/{subcategory_id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		SubcategoryService.delete(id);
		return ResponseEntity.ok("Delete Subcategory successfully.");
	}
}
