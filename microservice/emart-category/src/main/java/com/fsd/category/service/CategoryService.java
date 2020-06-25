package com.fsd.category.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fsd.category.entity.CategoryEntity;

public interface CategoryService {

	/**
	 * ��ҳ��ѯ�û��б�
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<CategoryEntity> findAll(int page, int pageSize);
	
	/**
	 * ��ѯ�����û��б�
	 * 
	 * @return
	 */
	public List<CategoryEntity> findAllCategorys();
	
	/**
	 * ����ID��ѯһ���û�
	 * 
	 * @param 
	 * @return
	 */
	public CategoryEntity findCategoryById(Integer id);
	
	/**
	 * ע��һ���û�
	 * 
	 * @param Category
	 * @return
	 */
	public CategoryEntity registCategory(CategoryEntity Category);
	
	/**
	 * �����û���Ϣ
	 * 
	 * @param Category
	 * @return
	 */
	public CategoryEntity updateCategory(CategoryEntity Category);
	
	/**
	 * �����û�
	 * 
	 * @param id
	 * @return
	 */
	public CategoryEntity activeCategory(Integer id);
	
	/**
	 * ɾ��һ���û�
	 * 
	 * @param id
	 */
	public void delete(Integer id);
}
