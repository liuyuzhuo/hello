package com.treeViewer;

import java.util.ArrayList;
import java.util.List;

public class TodoMockModel {
	public List<Category> getCategories() {
		List<Category> categories = new ArrayList<Category>();
		Category category = new Category();
		category.setName("Programming");
		categories.add(category);
		
		Todo todo1 = new Todo("Android", "Write a widget.");
		List<Todo> list=new ArrayList<Todo>();
		list.add(todo1);
		list.add(new Todo("Iphone"));
		Todo todo = new Todo("Write more about e4","dd",list);
		category.getTodos().add(todo);

		List<Todo> li = new ArrayList<Todo>();
		li.add(new Todo("��"));
		li.add(new Todo("��"));
		li.add(new Todo("��"));
		li.add(new Todo("һ"));
		li.add(new Todo("��"));
		li.add(new Todo("��"));
		category.getTodos().addAll(li);
		category = new Category();
		category.setName("Leasure");
		categories.add(category);
		todo = new Todo("Skiing");
		category.getTodos().add(todo);
		return categories;
	}
}
