package com.fsd.buyer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fsd.buyer.entity.BuyerEntity;
import com.fsd.buyer.repository.BuyerRepository;

@Service
public class BuyerBusiness implements BuyerService {
	@Autowired
	private BuyerRepository BuyerRepository;

	public Page<BuyerEntity> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public BuyerEntity findBuyerById(Integer id) {
		return BuyerRepository.findById(id);
	}

	public List<BuyerEntity> findAllBuyers() {
		return BuyerRepository.findAll();
	}

	/**
	 * ����һ��Buyer��
	 */
	public BuyerEntity registBuyer(BuyerEntity Buyer) {
		return BuyerRepository.saveAndFlush(Buyer);
	}

	/**
	 * ����Buyer��Ϣ��JPA����ID�������޸ģ�
	 */
	public BuyerEntity update(BuyerEntity Buyer) {
		return BuyerRepository.save(Buyer);
	}

	public BuyerEntity updateBuyer(BuyerEntity Buyer) {
		return BuyerRepository.save(Buyer);
	}

	public BuyerEntity activeBuyer(Integer id) {
		int flag = BuyerRepository.activeBuyer(id);
		return BuyerRepository.findById(id);
	}

	public void delete(Integer id) {
		BuyerRepository.delete(id);
	}
}