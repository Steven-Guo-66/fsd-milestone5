package com.fsd.purchase.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fsd.purchase.entity.PurchaseEntity;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseEntity, Integer> {
	public PurchaseEntity findPurchaseById(Integer id);

	@Modifying
	@Transactional
	@Query(value = "SELECT * FROM purchaseHistory;", nativeQuery = true)
	public int activePurchase(@Param("id") Integer id);
}
