package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;

import com.devsuperior.dsdeliver.entities.Product;

public class ProductDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double price;
	private String description;
	private String imgUri;
	
	public ProductDTO() {
		
	}

	public ProductDTO(Long id, String name, Double price, String description, String imgUri) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imgUri = imgUri;
	}
	
	public ProductDTO(Product entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.price = entity.getPrice();
		this.description = entity.getDescription();
		this.imgUri = entity.getImgUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUri() {
		return imgUri;
	}

	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}
	
	
	
}
