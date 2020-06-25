package com.fsd.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fsd.category.entity.CategoryEntity;
import com.fsd.category.repository.CategoryRepository;

@Service
public class CategoryBusiness implements CategoryService {
	@Autowired
	private CategoryRepository CategoryRepository;

	public Page<CategoryEntity> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public CategoryEntity findByCategoryId(Integer categoryId) {
		return CategoryRepository.findByCategoryId(categoryId);
	}

	public List<CategoryEntity> findAllCategorys() {
		return CategoryRepository.findAll();
	}

	/**
	 * ����һ��Category��
	 */
	public CategoryEntity registCategory(CategoryEntity Category) {
		return CategoryRepository.saveAndFlush(Category);
	}

	/**
	 * ����Category��Ϣ��JPA����ID�������޸ģ�
	 */
	public CategoryEntity update(CategoryEntity Category) {
		return CategoryRepository.save(Category);
	}

	public CategoryEntity updateCategory(CategoryEntity Category) {
		return CategoryRepository.save(Category);
	}

	public CategoryEntity activeCategory(Integer categoryId) {
		int flag = CategoryRepository.activeCategory(categoryId);
		return CategoryRepository.findByCategoryId(categoryId);
	}

	public void delete(Integer id) {
		CategoryRepository.delete(id);
	}

	@Override
	public CategoryEntity findCategoryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
