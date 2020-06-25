package com.fsd.seller.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fsd.seller.entity.SellerEntity;

public interface SellerService {

	/**
	 * ��ҳ��ѯ�û��б�
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<SellerEntity> findAll(int page, int pageSize);
	
	/**
	 * ��ѯ�����û��б�
	 * 
	 * @return
	 */
	public List<SellerEntity> findAllSellers();
	
	/**
	 * ����ID��ѯһ���û�
	 * 
	 * @param 
	 * @return
	 */
	public SellerEntity findSellerById(Integer id);
	
	/**
	 * ע��һ���û�
	 * 
	 * @param Seller
	 * @return
	 */
	public SellerEntity registSeller(SellerEntity Seller);
	
	/**
	 * �����û���Ϣ
	 * 
	 * @param Seller
	 * @return
	 */
	public SellerEntity updateSeller(SellerEntity Seller);
	
	/**
	 * �����û�
	 * 
	 * @param id
	 * @return
	 */
	public SellerEntity activeSeller(Integer id);
	
	/**
	 * ɾ��һ���û�
	 * 
	 * @param id
	 */
	public void delete(Integer id);
}
