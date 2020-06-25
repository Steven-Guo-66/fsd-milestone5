package com.fsd.subcategory.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fsd.subcategory.entity.SubcategoryEntity;

public interface SubcategoryService {

	/**
	 * ��ҳ��ѯ�û��б�
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Page<SubcategoryEntity> findAll(int page, int pageSize);

	/**
	 * ��ѯ�����û��б�
	 * 
	 * @return
	 */
	public List<SubcategoryEntity> findAllSubcategorys();

	/**
	 * ����subcategoryId��ѯһ���û�
	 * 
	 * @param
	 * @return
	 */
	public SubcategoryEntity findSubcategoryBysubcategoryId(Integer subcategoryId);

	/**
	 * ע��һ���û�
	 * 
	 * @param Subcategory
	 * @return
	 */
	public SubcategoryEntity registSubcategory(SubcategoryEntity Subcategory);

	/**
	 * �����û���Ϣ
	 * 
	 * @param Subcategory
	 * @return
	 */
	public SubcategoryEntity updateSubcategory(SubcategoryEntity Subcategory);

	/**
	 * �����û�
	 * 
	 * @param subcategoryId
	 * @return
	 */
	public SubcategoryEntity activeSubcategory(Integer subcategoryId);

	/**
	 * ɾ��һ���û�
	 * 
	 * @param subcategoryId
	 */
	public void delete(Integer subcategoryId);
}
