package com.tableViewer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class View extends ApplicationWindow {

	public View() {
		super(null);
	}
	
	@Override
	protected Control createContents(Composite parent) {
		TableViewer table=new TableViewer(parent);
		Table toptable = table.getTable();
		toptable.setLinesVisible(true);
		toptable.setHeaderVisible(true);

		TableColumn tableColunm_1 = new TableColumn(toptable,SWT.NONE);
		tableColunm_1.setWidth(100);
		tableColunm_1.setText("״̬");

		TableColumn tableColunm_2 = new TableColumn(toptable,SWT.NONE);
		tableColunm_2.setWidth(100);
		tableColunm_2.setText("����");
		TableColumn tableColunm_3 = new TableColumn(toptable,SWT.NONE);
		tableColunm_3.setWidth(100);
		tableColunm_3.setText("����");

		TableColumn tableColunm_4 = new TableColumn(toptable,SWT.NONE);
		tableColunm_4.setWidth(100);
		tableColunm_4.setText("ʱ��");
		List<TableData> list=new ArrayList<TableData>();
		for(int i=0;i<5;i++){
		TableData tableData=new TableData(i+"a",i+"b",i+"c",i+"d");
		list.add(tableData);
		}
		// ����������
		table.setContentProvider(new ContentProvider());
		// ���ñ�ǩ��
		table.setLabelProvider(new TableLabelProvider());
		// �����ݼ��ϸ�toptableViewer
		table.setInput(list);

		return parent;
	}
	
	public static void main(String[] args) {
		View v = new View();
		v.setBlockOnOpen(true);
		v.open();
		Display.getCurrent().dispose();
	}
	

}
