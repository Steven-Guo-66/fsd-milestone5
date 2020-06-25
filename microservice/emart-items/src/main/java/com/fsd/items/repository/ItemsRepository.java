package com.fsd.items.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fsd.items.entity.ItemsEntity;

@Repository
public interface ItemsRepository extends JpaRepository<ItemsEntity, Integer> {
	public ItemsEntity findItemsById(Integer id);

	@Modifying
	@Transactional
	@Query(value = "SELECT * FROM emart.items;", nativeQuery = true)
	public int activeItems(@Param("id") Integer id);
}
