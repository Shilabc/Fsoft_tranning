package com.vn.controller;

import com.vn.dao.CategoryDao;
import com.vn.dao.CatelogryDaoImp;
import com.vn.entities.Category;

public class CategoryController {
	
	CatelogryDaoImp categoryDao1 = new CatelogryDaoImp();
	
	public void createCategory(Category category) {
		categoryDao1.create(category);
	}
	
}