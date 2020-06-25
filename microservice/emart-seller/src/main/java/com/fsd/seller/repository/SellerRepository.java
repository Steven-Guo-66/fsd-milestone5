package com.fsd.seller.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fsd.seller.entity.SellerEntity;

@Repository
public interface SellerRepository extends JpaRepository<SellerEntity, Integer> {
	public SellerEntity findSellerById(Integer id);

	@Modifying
	@Transactional
	@Query(value = "SELECT * FROM emart.seller;", nativeQuery = true)
	public int activeSeller(@Param("id") Integer id);
}
