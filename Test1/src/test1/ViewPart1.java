package test1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

public class ViewPart1 extends ViewPart {
	boolean pressed = false;
	public static final String ID="Test1.ViewPart";

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new RowLayout(SWT.VERTICAL));
		parent.setBackgroundImage(new Image(Display.getCurrent(), "C:/Documents and Settings/Administrator/git/demo/Test1/icons/image1.jpg"));
		Button setStatusLine = new Button(parent, SWT.PUSH);
		setStatusLine.setText("Set Statusline ");
		setStatusLine.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String message = "I would like to say hello to you.";
				if (pressed) {
					message = "Thank you for using me";
				}
				setStatusLine(message);
				pressed = !pressed;
			}
		});
		Composite co = new Composite(parent, 0);
		co.setBackgroundImage(new Image(Display.getCurrent(), "C:/Documents and Settings/Administrator/git/demo/Test1/icons/image1.jpg"));
		co.setLayout(new GridLayout(2, true));
		Label l1 = new Label(co, SWT.CENTER|SWT.BORDER);
		l1.setText("�û���:");
		Text t1 = new Text(co,SWT.LEFT);
		
		Label l2 = new Label(co, SWT.CENTER|SWT.BORDER);
		l2.setText("��  ��:");
		Text t2 = new Text(co,SWT.LEFT);
		Button b1 = new Button(co,SWT.CHECK);
		b1.setText("����");
		b1.setSelection(true);
		
		Button b2 = new Button(co,SWT.CHECK);
		b2.setText("����");
		
		Button b3 = new Button(co,SWT.CHECK);
		b3.setText("ˮ��");
		
		final List list = new List(co,SWT.MULTI|SWT.V_SCROLL|SWT.BORDER);
		list.select(0);
		list.setSize(80, 50);
		for(int i=1;i<6;i++){
			list.add("��"+i+"��");
		}
		
		final Text label = new Text(co, SWT.MULTI|SWT.WRAP|SWT.V_SCROLL);
		label.setSize(80, 100);
		label.setText("��û��ѡ���κ���");
		list.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String[] selectArr = list.getSelection();
				String info = "��ѡ����ǵڣ�";
				for(int i=0;i<selectArr.length;i++){
					info+=selectArr[i];
				}
				label.setText(info);
			}
		});
		
		Group gro = new Group(co, SWT.BORDER);
		gro.setText("�Ա�");
		gro.setLayout(new RowLayout());
		Button radioButton1 = new Button(gro, SWT.RADIO);
		radioButton1.setText("��");
		radioButton1.setSelection(true);
		Button radioButton2 = new Button(gro, SWT.RADIO);
		radioButton2.setText("Ů");
		if(radioButton1.getSelection()){
			System.out.println(radioButton1.getText());
		}else{
			System.out.println(radioButton2.getText());
		}
	}

	private void setStatusLine(String message) {
		// Get the status line and set the text
		IActionBars bars = getViewSite().getActionBars();
		bars.getStatusLineManager().setMessage(message);
	}

	@Override
	public void setFocus() {
	}
}
