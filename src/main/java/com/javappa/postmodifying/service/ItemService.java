package com.javappa.postmodifying.service;

import java.util.List;

import com.javappa.postmodifying.dto.ItemDTOResponse;

public interface ItemService {

	List<ItemDTOResponse> getItemsWithoutPrefix();
}