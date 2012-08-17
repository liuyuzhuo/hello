package com.treeViewer;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class View extends ApplicationWindow {

	public View() {
		super(null);
	}

	@Override
	protected Control createContents(Composite parent) {
		TreeViewer treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new TodoContentProvider());
		treeViewer.setLabelProvider(new TodoLabelProvider());
//		treeViewer.setAutoExpandLevel(3);// Õ¹¿ªÊ÷
		treeViewer.setInput(new TodoMockModel());
		return parent;
	}

	public static void main(String[] args) {
		View v = new View();
		v.setBlockOnOpen(true);
		v.open();
		Display.getCurrent().dispose();
	}

}
