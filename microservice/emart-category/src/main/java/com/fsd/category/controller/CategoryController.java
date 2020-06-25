package com.fsd.category.controller;

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

import com.fsd.category.entity.CategoryEntity;
import com.fsd.category.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	@Autowired
	private CategoryService CategoryService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<CategoryEntity> findAllCategorys(){
		
		return CategoryService.findAllCategorys();
	}
	
	@PostMapping
	public ResponseEntity<CategoryEntity> regist(CategoryEntity Category){
		CategoryEntity CategoryEntity = CategoryService.registCategory(Category);
		return ResponseEntity.status(HttpStatus.CREATED).body(CategoryEntity); 
	}
	
	@PutMapping
	public ResponseEntity<CategoryEntity> update(CategoryEntity Category){
		CategoryEntity CategoryEntity = CategoryService.updateCategory(Category);
		return ResponseEntity.ok(CategoryEntity); 
	}
	
	@GetMapping("/active/{id}")
	public ResponseEntity<CategoryEntity> active(@PathVariable Integer id){
		CategoryEntity Category = CategoryService.activeCategory(id);
		return ResponseEntity.ok(Category); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		CategoryService.delete(id);
		return ResponseEntity.ok("Delete Category successfully.");
	}
}
