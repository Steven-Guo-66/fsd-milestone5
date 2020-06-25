package com.fsd.items.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fsd.items.entity.ItemsEntity;
import com.fsd.items.repository.ItemsRepository;

@Service
public class ItemsBusiness implements ItemsService {
	@Autowired
	private ItemsRepository ItemsRepository;

	public Page<ItemsEntity> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public ItemsEntity findItemsById(Integer id) {
		return ItemsRepository.findItemsById(id);
	}

	public List<ItemsEntity> findAllItemss() {
		return ItemsRepository.findAll();
	}

	/**
	 * ����һ��Items��
	 */
	public ItemsEntity registItems(ItemsEntity Items) {
		return ItemsRepository.saveAndFlush(Items);
	}

	/**
	 * ����Items��Ϣ��JPA����ID�������޸ģ�
	 */
	public ItemsEntity update(ItemsEntity Items) {
		return ItemsRepository.save(Items);
	}

	public ItemsEntity updateItems(ItemsEntity Items) {
		return ItemsRepository.save(Items);
	}

	public ItemsEntity activeItems(Integer id) {
		int flag = ItemsRepository.activeItems(id);
		return ItemsRepository.findItemsById(id);
	}

	public void delete(Integer id) {
		ItemsRepository.delete(id);
	}
}
