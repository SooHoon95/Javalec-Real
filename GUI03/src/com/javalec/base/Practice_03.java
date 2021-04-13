package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;


import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Practice_03 {

	private JFrame frame;
	private JComboBox cbinput1;
	private JComboBox cbClac;
	private JComboBox cbinput2;
	private JTextField tfResult;

	
	
//	Clac calc = new Clac();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practice_03 window = new Practice_03();
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
	public Practice_03() {
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
		frame.getContentPane().add(getCbinput1());
		frame.getContentPane().add(getCbClac());
		frame.getContentPane().add(getCbinput2());
		frame.getContentPane().add(getTfResult());
		frame.setLocationRelativeTo(null);
	}

	private JComboBox getCbinput1() {
		if (cbinput1 == null) {
			cbinput1 = new JComboBox();
			cbinput1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cbCalc();
				}
			});
			cbinput1.setModel(new DefaultComboBoxModel(new String[] {"2", "4", "6", "8"}));
			cbinput1.setBounds(33, 24, 69, 25);
		}
		return cbinput1;
	}
	private JComboBox getCbClac() {
		if (cbClac == null) {
			cbClac = new JComboBox();
			cbClac.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cbCalc();
				}
			});
			cbClac.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
			cbClac.setBounds(114, 24, 69, 25);
		}
		return cbClac;
	}
	private JComboBox getCbinput2() {
		if (cbinput2 == null) {
			cbinput2 = new JComboBox();
			cbinput2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cbCalc();
				}
			});
			cbinput2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cbinput2.setBounds(195, 24, 69, 25);
		}
		return cbinput2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setBounds(289, 26, 116, 21);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	
	private void cbCalc() {
		int Num1 = Integer.parseInt(cbinput1.getSelectedItem().toString());
		int Num2 = Integer.parseInt(cbinput2.getSelectedItem().toString());
		String Calc = cbClac.getSelectedItem().toString();
		
		if (Calc=="+") {
			tfResult.setText(Integer.toString(Num1+Num2));
		}else if (Calc == "-") {
			tfResult.setText(Integer.toString(Num1-Num2));
		}else if ( Calc == "*") {
			tfResult.setText(Integer.toString(Num1*Num2));
		}else if(Calc == "/" && Num2 == 0) {
					JOptionPane.showMessageDialog(null, "0으로는 나눌 수 없습니다.\n숫자를 다시 입력하세요");
		}else if(Calc == "/" && Num2!=0) {
					tfResult.setText(String.format("%.3f%", (double)Num1/(double)Num2));
				}
			}
		
	
	
	
	
	
	
	}
//==============
