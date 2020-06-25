package com.fsd.discounts.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fsd.discounts.entity.DiscountsEntity;

@Repository
public interface DiscountsRepository extends JpaRepository<DiscountsEntity, Integer> {
	public DiscountsEntity findDiscountsById(Integer id);

	@Modifying
	@Transactional
	@Query(value = "SELECT * FROM emart.discounts;", nativeQuery = true)
	public int activeDiscounts(@Param("id") Integer id);
}
