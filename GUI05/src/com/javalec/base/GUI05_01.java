package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI05_01 {

	private JFrame frmIdpw;
	private JLabel lblid;
	private JLabel lblpw;
	private JPasswordField pwinput;
	private JButton btnok;
	private JTextField tfmessage;
	private JTextField idinput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI05_01 window = new GUI05_01();
					window.frmIdpw.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI05_01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIdpw = new JFrame();
		frmIdpw.setTitle("ID/PW");
		frmIdpw.setBounds(100, 100, 450, 300);
		frmIdpw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIdpw.getContentPane().setLayout(null);
		frmIdpw.getContentPane().add(getLblid());
		frmIdpw.getContentPane().add(getLblpw());
		frmIdpw.getContentPane().add(getPwinput());
		frmIdpw.getContentPane().add(getBtnok());
		frmIdpw.getContentPane().add(getTfmessage());
		frmIdpw.getContentPane().add(getIdinput());
	}

	private JLabel getLblid() {
		if (lblid == null) {
			lblid = new JLabel("User");
			lblid.setHorizontalAlignment(SwingConstants.CENTER);
			lblid.setBounds(34, 44, 73, 15);
		}
		return lblid;
	}
	private JLabel getLblpw() {
		if (lblpw == null) {
			lblpw = new JLabel("Password");
			lblpw.setHorizontalAlignment(SwingConstants.CENTER);
			lblpw.setBounds(34, 107, 73, 15);
		}
		return lblpw;
	}
	private JPasswordField getPwinput() {
		if (pwinput == null) {
			pwinput = new JPasswordField();
			pwinput.setBounds(157, 104, 123, 21);
		}
		return pwinput;
	}
	private JButton getBtnok() {
		if (btnok == null) {
			btnok = new JButton("OK");
			btnok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkIdpw();
				}
			});
			btnok.setBounds(312, 103, 97, 23);
		}
		return btnok;
	}
	private JTextField getTfmessage() {
		if (tfmessage == null) {
			tfmessage = new JTextField();
			tfmessage.setHorizontalAlignment(SwingConstants.CENTER);
			tfmessage.setBounds(64, 192, 309, 21);
			tfmessage.setColumns(10);
		}
		return tfmessage;
	}
	
	private JTextField getIdinput() {
		if (idinput == null) {
			idinput = new JTextField();
			idinput.setBounds(157, 41, 123, 21);
			idinput.setColumns(10);
		}
		return idinput;
	}
	
	private void checkIdpw() {
		String Id = idinput.getText();
		
		char[] userPw = pwinput.getPassword();
		String Pw = new String(userPw);
	
		tfmessage.setText(lblid.getText()+ "= " + Id + "\t" + lblpw.getText() + " = " + Pw);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//===========

