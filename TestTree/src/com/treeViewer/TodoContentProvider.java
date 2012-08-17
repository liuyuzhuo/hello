package com.treeViewer;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class TodoContentProvider implements ITreeContentProvider {

	private TodoMockModel model;

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.model = (TodoMockModel) newInput;
	}

	public Object[] getElements(Object inputElement) {
		return model.getCategories().toArray();
	}

	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Category) {
			Category category = (Category) parentElement;
			return category.getTodos().toArray();
		}else if(parentElement instanceof Todo){
			Todo todo=(Todo)parentElement;
			return todo.getLi().toArray();
		}
		return null;
	}

	public Object getParent(Object element) {
		return null;
	}

	public boolean hasChildren(Object element) {
		if (element instanceof Category) {
			return true;
		}else if(element instanceof Todo){
			if(((Todo)element).getLi().size()>0){
				return true;
			}
		}
		return false;
	}

}
