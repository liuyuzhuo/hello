package test1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class MyView1 extends ViewPart {
	public static final String ID = "Test1.MyView1";

	public void createPartControl(Composite parent) {
		// Text text = new Text(parent, SWT.BORDER);
		// text.setText("Imagine a fantastic user interface here");
		parent.setLayout(null);
		Button but = new Button(parent, SWT.ABORT);
		but.setText("LOVE");
		but.setBounds(0, 0, 70, 60);
		but.setFont(new Font(Display.getCurrent(), "st", 20, 1));
		but.setCursor(new Cursor(Display.getCurrent(), SWT.CURSOR_HAND));
		but.setForeground(new Color(Display.getCurrent(), 255, 100, 20));
		but.setToolTipText("���ǰ��İ�ť");
		Group group1 = new Group(parent, SWT.NONE); // ���������
		group1.setText("¼����Ϣ");
		group1.setBounds(10, 200, 200, 200);
		Label lb1 = new Label(group1, SWT.NONE);
		// ���÷����˵����Ϣ

		// �ڷ�����м������

		lb1.setText("������");
		lb1.setBounds(10, 20, 70, 20);
		final Text text1 = new Text(group1, SWT.BORDER);
		text1.setBounds(90, 20, 70, 20);
		Label lb2 = new Label(group1, SWT.NONE);
		lb2.setText("��ַ��");
		lb2.setBounds(10, 50, 70, 20);
		final Text text2 = new Text(group1, SWT.BORDER);
		text2.setBounds(90, 50, 70, 20);
		Button b1 = new Button(group1, SWT.NULL);
		b1.setText("ȷ��");
		b1.setImage(new Image(Display.getCurrent(), "C:/Documents and Settings/Administrator/git/demo/Test1/icons/alt_window_32.gif"));
		b1.addMouseListener(new org.eclipse.swt.events.MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
//				Shell shell = new Shell(Display.getCurrent(),SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
//				shell.setSize(150, 80);
//				shell.setText("first dialog");
//				shell.setVisible(true);
				String command = ((Button)e.getSource()).getText();
				String name = text1.getText();
				String address = text2.getText();
				if("ȷ��".equals(command)){
					if("admin".equals(name)&&"hunan".equals(address)){
						Shell shell = new Shell(Display.getCurrent(),SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
						shell.setSize(150, 80);
						shell.setText("input sucess !");
						shell.setVisible(true);
					}
				}
			}
		});
		Button b2 = new Button(group1, SWT.NULL);
		b2.setText("����");
		b1.setBounds(30, 80, 60, 50);
		b2.setBounds(100, 80, 60, 50);
		parent.pack();

		// but.getDisplay().asyncExec(new Runnable() {
		// public void run() {
		// setType(but);
		// }
		// });
	}

	public void setType(Button but) {

	}

	@Override
	public void setFocus() {
	}
}
