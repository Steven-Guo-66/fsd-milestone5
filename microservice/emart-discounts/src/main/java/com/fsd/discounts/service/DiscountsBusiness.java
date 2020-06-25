package com.fsd.discounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fsd.discounts.entity.DiscountsEntity;
import com.fsd.discounts.repository.DiscountsRepository;

@Service
public class DiscountsBusiness implements DiscountsService {
	@Autowired
	private DiscountsRepository DiscountsRepository;

	public Page<DiscountsEntity> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public DiscountsEntity findDiscountsById(Integer id) {
		return DiscountsRepository.findDiscountsById(id);
	}

	public List<DiscountsEntity> findAllDiscountss() {
		return DiscountsRepository.findAll();
	}

	/**
	 * ����һ��Discounts��
	 */
	public DiscountsEntity registDiscounts(DiscountsEntity Discounts) {
		return DiscountsRepository.saveAndFlush(Discounts);
	}

	/**
	 * ����Discounts��Ϣ��JPA����ID�������޸ģ�
	 */
	public DiscountsEntity update(DiscountsEntity Discounts) {
		return DiscountsRepository.save(Discounts);
	}

	public DiscountsEntity updateDiscounts(DiscountsEntity Discounts) {
		return DiscountsRepository.save(Discounts);
	}

	public DiscountsEntity activeDiscounts(Integer id) {
		int flag = DiscountsRepository.activeDiscounts(id);
		return DiscountsRepository.findDiscountsById(id);
	}

	public void delete(Integer id) {
		DiscountsRepository.delete(id);
	}
}
