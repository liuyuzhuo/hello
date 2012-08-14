package com.yl.test;

import java.awt.Cursor;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

	/**
	 * author cami
	 */
	private static final long serialVersionUID = 1L;
	private JLabel userLabel = new JLabel("用户名：");
	private JLabel pwdLabel = new JLabel("密  码：");
	private JTextField userText;
	private JPasswordField pwdText;
	private LoginFrameAction action = new LoginFrameAction(this);

	public static void main(String[] args) {
		new LoginFrame().setVisible(true);
	}

	public LoginFrame() {
		initComponents();
		init();
	}

	private void init() {
		this.setTitle("Login Frame");
		this.setLayout(new GridLayout(2, 1));
		this.add(createNorthPanel());
		this.add(createSouthPanel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200, 200);
		this.setLocationRelativeTo(null);
	}

	private JPanel createNorthPanel() {
		JPanel p1 = new JPanel();
		p1.add(userLabel);
		p1.add(userText);
		p1.add(pwdLabel);
		p1.add(pwdText);
		return p1;
	}

	private JPanel createSouthPanel() {
		JPanel p2 = new JPanel();
		p2.add(createButton("登录"));
		p2.add(createButton("取消"));
		return p2;
	}

	private JButton createButton(String butName) {
		JButton but = new JButton(butName);
		but.setCursor(new Cursor(Cursor.HAND_CURSOR));
		but.addActionListener(action);
		return but;
	}

	private void initComponents() {
		userText = new JTextField(10);
		pwdText = new JPasswordField(10);
	}

	public String getUserName() {
		return userText.getText().trim();
	}

	public String getPassword() {
		return new String(pwdText.getPassword()).trim();
	}

}