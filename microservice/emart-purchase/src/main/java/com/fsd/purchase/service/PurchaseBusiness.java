package com.fsd.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fsd.purchase.entity.PurchaseEntity;
import com.fsd.purchase.repository.PurchaseRepository;

@Service
public class PurchaseBusiness implements PurchaseService {
	@Autowired
	private PurchaseRepository PurchaseRepository;

	public Page<PurchaseEntity> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public PurchaseEntity findPurchaseById(Integer id) {
		return PurchaseRepository.findPurchaseById(id);
	}

	public List<PurchaseEntity> findAllPurchases() {
		return PurchaseRepository.findAll();
	}

	/**
	 * ����һ��Purchase��
	 */
	public PurchaseEntity registPurchase(PurchaseEntity Purchase) {
		return PurchaseRepository.saveAndFlush(Purchase);
	}

	/**
	 * ����Purchase��Ϣ��JPA����ID�������޸ģ�
	 */
	public PurchaseEntity update(PurchaseEntity Purchase) {
		return PurchaseRepository.save(Purchase);
	}

	public PurchaseEntity updatePurchase(PurchaseEntity Purchase) {
		return PurchaseRepository.save(Purchase);
	}

	public PurchaseEntity activePurchase(Integer id) {
		int flag = PurchaseRepository.activePurchase(id);
		return PurchaseRepository.findPurchaseById(id);
	}

	public void delete(Integer id) {
		PurchaseRepository.delete(id);
	}
}
