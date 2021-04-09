package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI01 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfnum1;
	private JTextField tfnum2;
	private JTextField tfresult;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01 window = new GUI01();
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
	public GUI01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 171);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfnum1());
		frame.getContentPane().add(getTfnum2());
		frame.getContentPane().add(getTfresult());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_1_1());
		frame.getContentPane().add(getBtnAdd());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("더하기");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfnum1() {
		if (tfnum1 == null) {
			tfnum1 = new JTextField();
			tfnum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfnum1.setBounds(22, 42, 85, 21);
			tfnum1.setColumns(10);
		}
		return tfnum1;
	}
	private JTextField getTfnum2() {
		if (tfnum2 == null) {
			tfnum2 = new JTextField();
			tfnum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfnum2.setColumns(10);
			tfnum2.setBounds(163, 42, 85, 21);
		}
		return tfnum2;
	}
	private JTextField getTfresult() {
		if (tfresult == null) {
			tfresult = new JTextField();
			tfresult.setEnabled(false);
			tfresult.setText("     ");
			tfresult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfresult.setColumns(10);
			tfresult.setBounds(297, 42, 85, 21);
		}
		return tfresult;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("+");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(106, 45, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("=");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setBounds(244, 45, 57, 15);
		}
		return lblNewLabel_1_1;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("더하기");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 1st
//					String stNum1 = tfnum1.getText(); // 디자인에서 표현되는 건 문자니까 String으로 변수타입 잡고 입력형식은 텍스트였으니까 텍스트형식을 불러온다는 뜻
//					String stNum2 = tfnum2.getText();
//					
//					int wkNum1 = Integer.parseInt(stNum1);
//					int wkNum2 = Integer.parseInt(stNum2);
//					int wkResult = wkNum1 + wkNum2;
//					
//					String stResult = Integer.toString(wkResult);
//					tfresult.setText(stResult);
					
					
					//2nd
//					int wkNum1 = Integer.parseInt(tfnum1.getText());
//					int wkNum2 = Integer.parseInt(tfnum2.getText());
//					int wkResult = wkNum1 + wkNum2;
//					
//					tfresult.setText(Integer.toString(wkResult));
					addSum();
					
					//3rd
					
					
					
					
					
				}
			});
			btnAdd.setBounds(157, 97, 97, 23);
		}
		return btnAdd;
	}
	
	private void addSum() {
		int wkNum1 = Integer.parseInt(tfnum1.getText());
		int wkNum2 = Integer.parseInt(tfnum2.getText());
		int wkResult = wkNum1 + wkNum2;
		
		tfresult.setText(Integer.toString(wkResult));
		JOptionPane.showMessageDialog(frame, Integer.toString(wkResult));
		
		
	}
	
	
} //---
