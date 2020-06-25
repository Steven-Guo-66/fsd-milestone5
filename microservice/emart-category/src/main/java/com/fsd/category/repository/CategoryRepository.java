package com.fsd.category.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fsd.category.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
	public CategoryEntity findByCategoryId(Integer categoryId);

	@Modifying
	@Transactional
	@Query(value = "SELECT * FROM emart.category;", nativeQuery = true)
	public int activeCategory(@Param("category_id") Integer categoryId);
}
