package com.javappa.postmodifying.dto;

public class ItemDTOResponse {
	
	private Long id;
	
	private String name;

	public ItemDTOResponse(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
