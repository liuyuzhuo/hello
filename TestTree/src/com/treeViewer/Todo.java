package com.treeViewer;

import java.util.ArrayList;
import java.util.List;

public class Todo {
	private String summary = "";
	private String description = "";
	private List<Todo> li = new ArrayList<Todo>();

	public Todo(String summary, String description, List<Todo> li) {
		super();
		this.summary = summary;
		this.description = description;
		this.li = li;
	}

	public Todo(String summary) {
		this.summary = summary;
	}

	public List<Todo> getLi() {
		return li;
	}

	public void setLi(List<Todo> li) {
		this.li = li;
	}

	public Todo(String summary, String description) {
		this.summary = summary;
		this.description = description;
	}

	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
