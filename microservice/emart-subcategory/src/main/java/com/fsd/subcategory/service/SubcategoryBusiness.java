package com.fsd.subcategory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fsd.subcategory.entity.SubcategoryEntity;
import com.fsd.subcategory.repository.SubcategoryRepository;

@Service
public class SubcategoryBusiness implements SubcategoryService {
	@Autowired
	private SubcategoryRepository SubcategoryRepository;

	public Page<SubcategoryEntity> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public SubcategoryEntity findSubcategoryBysubcategoryId(Integer subcategoryId) {
		return SubcategoryRepository.findSubcategoryBysubcategoryId(subcategoryId);
	}

	public List<SubcategoryEntity> findAllSubcategorys() {
		return SubcategoryRepository.findAll();
	}

	/**
	 * ����һ��Subcategory��
	 */
	public SubcategoryEntity registSubcategory(SubcategoryEntity Subcategory) {
		return SubcategoryRepository.saveAndFlush(Subcategory);
	}

	/**
	 * ����Subcategory��Ϣ��JPA����ID�������޸ģ�
	 */
	public SubcategoryEntity update(SubcategoryEntity Subcategory) {
		return SubcategoryRepository.save(Subcategory);
	}

	public SubcategoryEntity updateSubcategory(SubcategoryEntity Subcategory) {
		return SubcategoryRepository.save(Subcategory);
	}

	public SubcategoryEntity activeSubcategory(Integer id) {
		int flag = SubcategoryRepository.activeSubcategory(id);
		return SubcategoryRepository.findSubcategoryBysubcategoryId(id);
	}

	public void delete(Integer id) {
		SubcategoryRepository.delete(id);
	}
}
