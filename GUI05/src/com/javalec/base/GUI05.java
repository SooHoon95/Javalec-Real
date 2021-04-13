package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI05 {

	private JFrame frmPasswordField;
	private JPasswordField pfinput;
	private JLabel lblpass;
	private JButton btnok;
	private JTextField tfmessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI05 window = new GUI05();
					window.frmPasswordField.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasswordField = new JFrame();
		frmPasswordField.setTitle("Password Field");
		frmPasswordField.setBounds(100, 100, 450, 300);
		frmPasswordField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordField.getContentPane().setLayout(null);
		frmPasswordField.getContentPane().add(getPfinput());
		frmPasswordField.getContentPane().add(getLblpass());
		frmPasswordField.getContentPane().add(getBtnok());
		frmPasswordField.getContentPane().add(getTfmessage());
	}
	private JPasswordField getPfinput() {
		if (pfinput == null) {
			pfinput = new JPasswordField();
			pfinput.setBounds(102, 33, 89, 21);
		}
		return pfinput;
	}
	private JLabel getLblpass() {
		if (lblpass == null) {
			lblpass = new JLabel("Password");
			lblpass.setBounds(19, 36, 70, 15);
		}
		return lblpass;
	}
	private JButton getBtnok() {
		if (btnok == null) {
			btnok = new JButton("OK");
			btnok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
				}
			});
			btnok.setBounds(220, 32, 97, 23);
		}
		return btnok;
	}
	private JTextField getTfmessage() {
		if (tfmessage == null) {
			tfmessage = new JTextField();
			tfmessage.setBounds(102, 120, 215, 21);
			tfmessage.setColumns(10);
		}
		return tfmessage;
	}
	
	private void checkPassword() {
		char[] str = pfinput.getPassword();
		String passString = new String(str);
		tfmessage.setText(passString);
	}
	
	
	
	
	
	
}//============
