package com.fsd.items.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fsd.items.entity.ItemsEntity;

public interface ItemsService {

	/**
	 * ��ҳ��ѯ�û��б�
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<ItemsEntity> findAll(int page, int pageSize);
	
	/**
	 * ��ѯ�����û��б�
	 * 
	 * @return
	 */
	public List<ItemsEntity> findAllItemss();
	
	/**
	 * ����ID��ѯһ���û�
	 * 
	 * @param 
	 * @return
	 */
	public ItemsEntity findItemsById(Integer id);
	
	/**
	 * ע��һ���û�
	 * 
	 * @param Items
	 * @return
	 */
	public ItemsEntity registItems(ItemsEntity Items);
	
	/**
	 * �����û���Ϣ
	 * 
	 * @param Items
	 * @return
	 */
	public ItemsEntity updateItems(ItemsEntity Items);
	
	/**
	 * �����û�
	 * 
	 * @param id
	 * @return
	 */
	public ItemsEntity activeItems(Integer id);
	
	/**
	 * ɾ��һ���û�
	 * 
	 * @param id
	 */
	public void delete(Integer id);
}
