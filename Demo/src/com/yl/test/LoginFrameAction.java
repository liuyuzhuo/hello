package com.yl.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LoginFrameAction implements ActionListener {
	private LoginFrame loginFrame;

	public LoginFrameAction(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
	}

	public void actionPerformed(ActionEvent command) {
		String info = command.getActionCommand();
		if("��¼".equals(info)){
			if("admin".equals(loginFrame.getUserName())&&"12345".equals(loginFrame.getPassword())){
//				JOptionPane.showMessageDialog(null,"��¼�ɹ�");
				loginFrame.dispose();
				new MainFrame();
			}else {
				JOptionPane.showMessageDialog(null,"��¼ʧ��");
			}
		}else if("ȡ��".equals(info)){
			System.out.println("aaaaaa");
			loginFrame.dispose();
		}
	}

}
