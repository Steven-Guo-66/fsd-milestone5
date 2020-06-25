package com.fsd.buyer.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fsd.buyer.entity.BuyerEntity;

public interface BuyerService {

	/**
	 * ��ҳ��ѯ�û��б�
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<BuyerEntity> findAll(int page, int pageSize);
	
	/**
	 * ��ѯ�����û��б�
	 * 
	 * @return
	 */
	public List<BuyerEntity> findAllBuyers();
	
	/**
	 * ����ID��ѯһ���û�
	 * 
	 * @param 
	 * @return
	 */
	public BuyerEntity findBuyerById(Integer id);
	
	/**
	 * ע��һ���û�
	 * 
	 * @param Buyer
	 * @return
	 */
	public BuyerEntity registBuyer(BuyerEntity Buyer);
	
	/**
	 * �����û���Ϣ
	 * 
	 * @param Buyer
	 * @return
	 */
	public BuyerEntity updateBuyer(BuyerEntity Buyer);
	
	/**
	 * �����û�
	 * 
	 * @param id
	 * @return
	 */
	public BuyerEntity activeBuyer(Integer id);
	
	/**
	 * ɾ��һ���û�
	 * 
	 * @param id
	 */
	public void delete(Integer id);
}
