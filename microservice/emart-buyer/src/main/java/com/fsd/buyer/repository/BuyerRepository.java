package com.fsd.buyer.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fsd.buyer.entity.BuyerEntity;

@Repository
public interface BuyerRepository extends JpaRepository<BuyerEntity, Integer> {

	public BuyerEntity findById(Integer id);

	@Modifying
	@Transactional
//	@Query(value = "update s_user u set u.conformed='1' where u.id=?",nativeQuery = true)
	@Query(value = "SELECT * FROM emart.buyer;", nativeQuery = true)
	public int activeBuyer(@Param("id") Integer id);
}
