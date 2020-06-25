package com.fsd.purchase.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fsd.purchase.entity.PurchaseEntity;

public interface PurchaseService {

	/**
	 * ��ҳ��ѯ�û��б�
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<PurchaseEntity> findAll(int page, int pageSize);
	
	/**
	 * ��ѯ�����û��б�
	 * 
	 * @return
	 */
	public List<PurchaseEntity> findAllPurchases();
	
	/**
	 * ����ID��ѯһ���û�
	 * 
	 * @param 
	 * @return
	 */
	public PurchaseEntity findPurchaseById(Integer id);
	
	/**
	 * ע��һ���û�
	 * 
	 * @param Purchase
	 * @return
	 */
	public PurchaseEntity registPurchase(PurchaseEntity Purchase);
	
	/**
	 * �����û���Ϣ
	 * 
	 * @param Purchase
	 * @return
	 */
	public PurchaseEntity updatePurchase(PurchaseEntity Purchase);
	
	/**
	 * �����û�
	 * 
	 * @param id
	 * @return
	 */
	public PurchaseEntity activePurchase(Integer id);
	
	/**
	 * ɾ��һ���û�
	 * 
	 * @param id
	 */
	public void delete(Integer id);
}
