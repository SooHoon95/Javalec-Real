package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI00 {

	private JFrame frmGui;
	private JButton btnNewButton;
	private JLabel lblTest;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI00 window = new GUI00();
					window.frmGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGui = new JFrame();
		frmGui.setTitle("Button Test");
		frmGui.setBounds(100, 100, 450, 300);
		frmGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGui.getContentPane().setLayout(null);
		frmGui.getContentPane().add(getBtnNewButton());
		frmGui.getContentPane().add(getLblTest());
		frmGui.getContentPane().add(getBtnNewButton_1());
		frmGui.getContentPane().add(getBtnNewButton_1_1());
		frmGui.getContentPane().add(getBtnNewButton_1_1_1());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "OK 버튼을 누르셨습니다.");
					lblTest.setText("Button을 click 했습니다");
//					System.out.println("테스트입니다.");
				}
			});
			btnNewButton.setBounds(178, 109, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblTest() {
		if (lblTest == null) {
			lblTest = new JLabel("Java Swing Button Test");
			lblTest.setBounds(12, 10, 145, 15);
		}
		return lblTest;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Button 1");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblTest.setText("You had pressed Button1");
				}
			});
			btnNewButton_1.setBounds(42, 188, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Button 2");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblTest.setText("You had pressed Button2");
				}
			});
			btnNewButton_1_1.setBounds(178, 188, 97, 23);
		}
		return btnNewButton_1_1;
	}
	private JButton getBtnNewButton_1_1_1() {
		if (btnNewButton_1_1_1 == null) {
			btnNewButton_1_1_1 = new JButton("Button 3");
			btnNewButton_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblTest.setText("You had pressed Button3");
				}
			});
			btnNewButton_1_1_1.setBounds(307, 188, 97, 23);
		}
		return btnNewButton_1_1_1;
	}
}
