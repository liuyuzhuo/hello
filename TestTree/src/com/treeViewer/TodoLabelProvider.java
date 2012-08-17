package com.treeViewer;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class TodoLabelProvider extends LabelProvider {
	
	public String getText(Object element) {
		if (element instanceof Category) {
			Category category = (Category) element;
			return category.getName();
		}else if(element instanceof Todo){
			Todo todo=(Todo)element;
			return todo.getSummary();
		}
		return ((Todo) element).getSummary();
	}

	public Image getImage(Object element) {
		return null;
	}
}
