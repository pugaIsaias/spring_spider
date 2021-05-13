package com.example.demo.model;

import java.math.BigDecimal;

public class Course {
	private Integer id;
	private String banner;
	private String description;
	private String link;
	private String name;
	private BigDecimal price;
	
	public Course() {
		
	}
	
	public Course(Integer id, String banner, String description, String link, String name, BigDecimal price) {
		super();
		this.id = id;
		this.banner = banner;
		this.description = description;
		this.link = link;
		this.name = name;
		this.price = price;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", banner=" + banner + ", description=" + description + ", link=" + link + ", name="
				+ name + ", price=" + price + "]";
	}
}
