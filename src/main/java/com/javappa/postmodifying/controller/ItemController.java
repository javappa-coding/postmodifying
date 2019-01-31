package com.javappa.postmodifying.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javappa.postmodifying.dto.ItemDTOResponse;
import com.javappa.postmodifying.service.ItemService;

@RestController
@RequestMapping("/api/items")
public class ItemController {
	
	@Autowired
	private ItemService itemService;	

	@GetMapping
	public ResponseEntity<List<ItemDTOResponse>> getItems(HttpServletResponse response) throws Exception {

		List<ItemDTOResponse> items = itemService.getItemsWithoutPrefix();	
		return new ResponseEntity<List<ItemDTOResponse>>(items, HttpStatus.OK);
	}
}
