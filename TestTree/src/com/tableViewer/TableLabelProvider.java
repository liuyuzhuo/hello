package com.tableViewer;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

public class TableLabelProvider implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof TableData) {
			TableData m = (TableData) element;
			if (columnIndex == 0) {
				return m.getStatus();
			} else if (columnIndex == 1) {
				return m.getMonitorname();
			} else if (columnIndex == 2) {
				return m.getDesc();
			} else if (columnIndex == 3) {
				return m.getLastupdateDate();
			}
		}
		return null;
	}

	public void addListener(ILabelProviderListener arg0) {
	}

	public void dispose() {
	}

	public boolean isLabelProperty(Object arg0, String arg1) {
		return false;
	}

	public void removeListener(ILabelProviderListener arg0) {
	}
}
