package com.yl;

import org.eclipse.jface.window.*;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class HelloSWT_JFace extends ApplicationWindow {
	public HelloSWT_JFace() {
		super(null);
	}

	protected Control createContents(Composite parent) {
		parent.setLayout(null);
		Text helloText = new Text(parent, SWT.CENTER);
		helloText.setText("Hello SWT and JFace!");
		helloText.setBounds(55, 55, 180, 50);
		Button b = new Button(parent, SWT.DEFAULT);
		b.setText("ÎÒ°®Äã");
		b.setBounds(55, 155, 180, 50);
		parent.pack();
		return parent;
	}

	public static void main(String[] args) {
		HelloSWT_JFace awin = new HelloSWT_JFace();
		awin.setBlockOnOpen(true);
		awin.open();
		Display.getCurrent().dispose();
	}
}
