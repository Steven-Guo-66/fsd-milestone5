package com.fsd.seller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fsd.seller.entity.SellerEntity;
import com.fsd.seller.repository.SellerRepository;

@Service
public class SellerBusiness implements SellerService {
	@Autowired
	private SellerRepository SellerRepository;

	public Page<SellerEntity> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public SellerEntity findSellerById(Integer id) {
		return SellerRepository.findSellerById(id);
	}

	public List<SellerEntity> findAllSellers() {
		return SellerRepository.findAll();
	}

	/**
	 * ����һ��Seller��
	 */
	public SellerEntity registSeller(SellerEntity Seller) {
		return SellerRepository.saveAndFlush(Seller);
	}

	/**
	 * ����Seller��Ϣ��JPA����ID�������޸ģ�
	 */
	public SellerEntity update(SellerEntity Seller) {
		return SellerRepository.save(Seller);
	}

	public SellerEntity updateSeller(SellerEntity Seller) {
		return SellerRepository.save(Seller);
	}

	public SellerEntity activeSeller(Integer id) {
		int flag = SellerRepository.activeSeller(id);
		return SellerRepository.findSellerById(id);
	}

	public void delete(Integer id) {
		SellerRepository.delete(id);
	}
}
