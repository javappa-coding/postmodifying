package com.javappa.postmodifying.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javappa.postmodifying.dto.ItemDTOResponse;
import com.javappa.postmodifying.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	private ItemRepository itemRepository;

	@Autowired
	public ItemServiceImpl(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	public List<ItemDTOResponse> getItemsWithoutPrefix() {

		itemRepository.deleteByPrefix("AppaItem");
		
		List<ItemDTOResponse> items = itemRepository.findAll().stream()
				.map(item -> new ItemDTOResponse(item.getId(), item.getName())).collect(Collectors.toList());
		
		return items;
	}
	
}
