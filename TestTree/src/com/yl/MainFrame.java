package com.yl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;

public class MainFrame {
	private static Table table_1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell();
		shell.setSize(505, 458);
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite co1 = new Composite(shell, SWT.NONE);
		Composite co2 = new Composite(shell, SWT.NONE);
		co1.setLayout(new FillLayout(SWT.VERTICAL | SWT.HORIZONTAL));
		TabFolder tf = new TabFolder(co1, SWT.BORDER);
		TabItem ti1 = new TabItem(tf, SWT.NONE);
		ti1.setText("第一页");
		Group gro1 = new Group(tf, SWT.NONE);
		ti1.setControl(gro1);
		gro1.setLayout(new FillLayout());

		TabItem ti2 = new TabItem(tf, SWT.NONE);
		ti2.setText("第二页");
		Group gro2 = new Group(tf, SWT.NONE);
		ti2.setControl(gro2);

		TabItem ti3 = new TabItem(tf, SWT.NONE);
		ti3.setText("第三页");
		Group gro3 = new Group(tf, SWT.NONE);
		ti3.setControl(gro3);

		Tree tree = new Tree(gro1, SWT.NONE);
		TreeItem treei1 = new TreeItem(tree, SWT.NONE);
		treei1.setText("a");
		TreeItem treei2 = new TreeItem(tree, SWT.NONE);
		treei2.setText("b");
		TreeItem treei3 = new TreeItem(tree, SWT.NONE);
		treei3.setText("c");

		TreeItem tree1 = new TreeItem(tree, SWT.NONE);
		TreeItem treei4 = new TreeItem(tree1, SWT.NONE);
		treei4.setText("b");
		TreeItem treei5 = new TreeItem(tree1, SWT.NONE);
		treei5.setText("b");
		TreeItem treei6 = new TreeItem(tree1, SWT.NONE);
		treei6.setText("b");
		co2.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		final Scale scale = new Scale(co2, SWT.NONE);
		final Label label = new Label(co2, SWT.NONE);
		label.setText("100");
		scale.setLayoutData(new RowData(SWT.HORIZONTAL, 104));
		scale.setMaximum(100);
		scale.setMinimum(0);
		scale.setIncrement(1);
		scale.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int selectValue = scale.getMaximum()-scale.getSelection()+scale.getMinimum();
				label.setText(""+selectValue);
			}
		});
		
		
		Table table = new Table(co2,SWT.BORDER|SWT.FULL_SELECTION);
		TableColumn tc1 = new TableColumn(table, SWT.BORDER);
		tc1.setWidth(100);
		TableColumn tc2 = new TableColumn(table, SWT.BORDER);
		tc2.setWidth(100);
		TableColumn tc3 = new TableColumn(table, SWT.BORDER);
		tc3.setWidth(100);
		TableItem it1 = new TableItem(table, SWT.BORDER);
		it1.setText(new String[]{"a","b","c"});
		
		TableItem it2 = new TableItem(table, SWT.BORDER);
		it2.setText(new String[]{"a","b","c"});
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("New Item");
		
		table_1 = new Table(tabFolder, SWT.BORDER | SWT.FULL_SELECTION);
		tabItem.setControl(table_1);
		table_1.setHeaderVisible(true);
		table_1.setLinesVisible(true);
		
		TableColumn tableColumn_1 = new TableColumn(table_1, SWT.NONE);
		tableColumn_1.setWidth(100);
		tableColumn_1.setText("\u7B2C\u4E8C\u5217");
		
		TableColumn tableColumn = new TableColumn(table_1, SWT.NONE);
		tableColumn.setWidth(100);
		tableColumn.setText("\u7B2C\u4E00\u5217");
		
		TableItem tableItem = new TableItem(table_1, SWT.NONE);
		tableItem.setText(new String[]{"1","2"});
//		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}
