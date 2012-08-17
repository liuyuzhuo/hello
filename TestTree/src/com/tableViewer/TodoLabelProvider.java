package com.tableViewer;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.treeViewer.Category;
import com.treeViewer.Todo;

public class TodoLabelProvider extends LabelProvider {
	public String getText(Object element) {
		if (element instanceof Category) {
			Category category = (Category) element;
			return category.getName();
		}
		return ((Todo) element).getSummary();
	}

	public Image getImage(Object element) {
		return null;
	}

}
