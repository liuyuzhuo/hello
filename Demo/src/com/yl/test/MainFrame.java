package com.yl.test;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame(){
		init();
	}
	
	private void init(){
		this.setTitle("Ö÷½çÃæ");
		this.setSize(700,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {

	}

}
