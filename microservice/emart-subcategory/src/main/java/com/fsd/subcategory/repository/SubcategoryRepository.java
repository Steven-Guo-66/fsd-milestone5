package com.fsd.subcategory.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fsd.subcategory.entity.SubcategoryEntity;

@Repository
public interface SubcategoryRepository extends JpaRepository<SubcategoryEntity, Integer> {
	public SubcategoryEntity findSubcategoryBysubcategoryId(Integer subcategoryId);

	@Modifying
	@Transactional
	@Query(value = "SELECT * FROM emart.subcategory;", nativeQuery = true)
	public int activeSubcategory(@Param("subcategory_id") Integer subcategoryId);
}
