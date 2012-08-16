package test1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
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
		text1.setText("admin");
		Label lb2 = new Label(group1, SWT.NONE);
		lb2.setText("��ַ��");
		lb2.setBounds(10, 50, 70, 20);
		final Text text2 = new Text(group1, SWT.BORDER);
		text2.setBounds(90, 50, 70, 20);
		text2.setText("hunan");
		text2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Text t = (Text)e.getSource();
//				int a = Integer.parseInt(t.getText());
				int b = e.keyCode;
				char d = e.character;
//				System.out.println(b);
//				System.out.println(d);
//				System.out.println(d=='\r');
				if(d=='\r'){
					System.out.println(t.getText());
				}
			}
		});
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
					Shell shell = new Shell(Display.getCurrent(),SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
					Composite co = new Composite(shell, SWT.NONE);
					co.setLayout(new RowLayout(SWT.VERTICAL));
					shell.setSize(150, 80);
					shell.setLocation(400, 600);
					shell.setText("��ʾ����");
					shell.setVisible(false);
					if("admin".equals(name)&&"hunan".equals(address)){
//						Label la1 = new Label(co, SWT.NONE|SWT.CENTER);
//						la1.setText("Your input is right!");
//						shell.setVisible(true);
						final Shell shell2 = new Shell(Display.getCurrent(),SWT.MAX|SWT.MIN);
						Menu menu = new Menu(shell2,SWT.BAR);
						shell2.setMenuBar(menu);
						MenuItem fileItem = new MenuItem(menu, SWT.CASCADE);
						fileItem.setText("�ļ�");
						Menu fileMenu = new Menu(shell2, SWT.DROP_DOWN);
						fileItem.setMenu(fileMenu);
						{
							//�½���
							MenuItem newItem = new MenuItem(fileMenu, SWT.CASCADE);
							newItem.setText("�½�");
							//�½��˵�
							Menu newMenu = new Menu(shell2, SWT.DROP_DOWN);
							newItem.setMenu(newMenu);
							{
								//�½���Ŀ
								MenuItem newProjectItem = new MenuItem(newMenu, SWT.PUSH);
								newProjectItem.setText("��Ŀ\tCtrl+Shift+N");
								//���ÿ�ݼ�
								newProjectItem.setAccelerator(SWT.CTRL+SWT.SHIFT+'N'); 
								//����¼�����
								newProjectItem.addSelectionListener(new SelectionAdapter(){ 
								public void widgetSelected(SelectionEvent e){ 
								Text text=new Text(shell2,SWT.MULTI|SWT.BORDER|SWT.WRAP); 
								text.setBounds(10,10,100,30); 
								text.setText("��ѡ���ˡ��½���Ŀ��"); 
								} 
								}); 
								new MenuItem(newMenu,SWT.SEPARATOR); 
								new MenuItem(newMenu,SWT.PUSH).setText("��"); 
								new MenuItem(newMenu,SWT.SEPARATOR);
								new MenuItem(newMenu,SWT.PUSH).setText("��"); 
							}
							MenuItem openItem = new MenuItem(fileMenu, SWT.CASCADE);
							openItem.setText("��");
							new MenuItem(fileMenu, SWT.CASCADE).setText("����");
						}
						new MenuItem(menu, SWT.CASCADE).setText("Help");
						TabFolder tf = new TabFolder(shell2, SWT.NONE);
						tf.setBounds(5, 5, 300, 300);
						TabItem ti1 = new TabItem(tf, SWT.NONE);
						ti1.setText("��һҳ");
						{
							//������1������򣬽�����tabFolder��
							Group group1=new Group(tf,SWT.NONE);
							group1.setText("¼����Ϣ");  //���÷����˵����Ϣ
							ti1.setControl(group1); //��tabItem1����group1 
							Label lb1=new Label(group1,SWT.NONE);  //ע��Label������group1��
							lb1.setText("������"); 
							lb1.setBounds(10,20,70,20); 
							Text text1=new Text(group1,SWT.BORDER); 
							text1.setBounds(90,20,70,20); 
							Label lb2=new Label(group1,SWT.NONE); 
							lb2.setText("��ַ��"); 
							lb2.setBounds(10,50,70,20); 
							Text text2=new Text(group1,SWT.BORDER); 
							text2.setBounds(90,50,70,20); 
						}
						
						TabItem ti2 = new TabItem(tf, SWT.NONE);
						ti2.setText("��һҳ");
						{
							//������2������򣬽�����tabFolder��
							Group group2=new Group(tf,SWT.NONE);
							ti2.setControl(group2); //��tabItem2����group2 
							group2.setText("��Ȥ����"); 
							Button bt1=new Button(group2,SWT.CHECK); 
							bt1.setBounds(20,20,70,20); 
							bt1.setText("����"); 
							Button bt2=new Button(group2,SWT.CHECK); 
							bt2.setBounds(20,50,70,20); 
							bt2.setText("����"); 
							Button bt3=new Button(group2,SWT.CHECK); 
							bt3.setBounds(20,80,70,20); 
							bt3.setText("����"); 
						}
						
						shell2.setVisible(true);
					}else{
						Label la1 = new Label(co, SWT.NONE|SWT.CENTER);
						la1.setText("Your input is error!");
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
