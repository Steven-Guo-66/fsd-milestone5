package com.fsd.discounts.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fsd.discounts.entity.DiscountsEntity;

public interface DiscountsService {

	/**
	 * ��ҳ��ѯ�û��б�
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<DiscountsEntity> findAll(int page, int pageSize);
	
	/**
	 * ��ѯ�����û��б�
	 * 
	 * @return
	 */
	public List<DiscountsEntity> findAllDiscountss();
	
	/**
	 * ����ID��ѯһ���û�
	 * 
	 * @param 
	 * @return
	 */
	public DiscountsEntity findDiscountsById(Integer id);
	
	/**
	 * ע��һ���û�
	 * 
	 * @param Discounts
	 * @return
	 */
	public DiscountsEntity registDiscounts(DiscountsEntity Discounts);
	
	/**
	 * �����û���Ϣ
	 * 
	 * @param Discounts
	 * @return
	 */
	public DiscountsEntity updateDiscounts(DiscountsEntity Discounts);
	
	/**
	 * �����û�
	 * 
	 * @param id
	 * @return
	 */
	public DiscountsEntity activeDiscounts(Integer id);
	
	/**
	 * ɾ��һ���û�
	 * 
	 * @param id
	 */
	public void delete(Integer id);
}
