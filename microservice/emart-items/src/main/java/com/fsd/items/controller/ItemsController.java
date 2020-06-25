package com.fsd.items.controller;

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

import com.fsd.items.entity.ItemsEntity;
import com.fsd.items.service.ItemsService;

@RestController
@RequestMapping("/api/items")
public class ItemsController {
	@Autowired
	private ItemsService ItemsService;

	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<ItemsEntity> findAllItemss() {

		return ItemsService.findAllItemss();
	}

	@PostMapping
	public ResponseEntity<ItemsEntity> regist(ItemsEntity Items) {
		ItemsEntity ItemsEntity = ItemsService.registItems(Items);
		return ResponseEntity.status(HttpStatus.CREATED).body(ItemsEntity);
	}

	@PutMapping
	public ResponseEntity<ItemsEntity> update(ItemsEntity Items) {
		ItemsEntity ItemsEntity = ItemsService.updateItems(Items);
		return ResponseEntity.ok(ItemsEntity);
	}

	@GetMapping("/active/{id}")
	public ResponseEntity<ItemsEntity> active(@PathVariable Integer id) {
		ItemsEntity Items = ItemsService.activeItems(id);
		return ResponseEntity.ok(Items);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		ItemsService.delete(id);
		return ResponseEntity.ok("Delete Items successfully.");
	}
}
