package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GUI07_Exercise {

	private JFrame frame;
	private JTextField tfid;
	private JLabel lblNewLabel;
	private JLabel lblPw;
	private JPasswordField pwpw;
	private JButton btnok;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI07_Exercise window = new GUI07_Exercise();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI07_Exercise() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfid());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblPw());
		frame.getContentPane().add(getPwpw());
		frame.getContentPane().add(getBtnok());
	}

	private JTextField getTfid() {
		if (tfid == null) {
			tfid = new JTextField();
			tfid.setHorizontalAlignment(SwingConstants.TRAILING);
			tfid.setBounds(112, 92, 116, 21);
			tfid.setColumns(10);
		}
		return tfid;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("User");
			lblNewLabel.setBounds(30, 95, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblPw() {
		if (lblPw == null) {
			lblPw = new JLabel("PW");
			lblPw.setBounds(30, 151, 57, 15);
		}
		return lblPw;
	}
	private JPasswordField getPwpw() {
		if (pwpw == null) {
			pwpw = new JPasswordField();
			pwpw.setHorizontalAlignment(SwingConstants.TRAILING);
			pwpw.setBounds(112, 151, 116, 21);
		}
		return pwpw;
	}
	private JButton getBtnok() {
		if (btnok == null) {
			btnok = new JButton("OK");
			btnok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Welcome welcome = new Welcome();		//J dialog 불러오기 ; 로그인성공
					Retry retry = new Retry();				//J dialog 불러오기 ; 실패
					
					char[] password = pwpw.getPassword();	// PW 받아오기 
					String PW = new String(password);		// password String으로 형변환
					String ID = tfid.getText();
					
					if ( ID.equals("abc") && PW.equals("1234")) { // 아이디랑 패스워드 확인
						welcome.setVisible(true);
					}else {
						retry.setVisible(true);
					}
				}
			});
			btnok.setBounds(286, 121, 97, 23);
		}
		return btnok;
	}
}
