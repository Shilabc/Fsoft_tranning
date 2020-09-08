package com.vn.entities;

import java.io.Serializable;

public class Category implements Serializable {
	
	private static final long serialVersionUID = 6472763466458469736L;
	private int id;
	private String name;
	private String imgPath;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
		
	}
	public Category(int id, String name, String imgPath) {
		super();
		this.id = id;
		this.name = name;
		this.imgPath = imgPath;
	}
	public Category() {
		super();
	}


}