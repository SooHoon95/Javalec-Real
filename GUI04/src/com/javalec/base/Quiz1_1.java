package com.javalec.base;

import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz1_1 {

	private JFrame frmCheckboxCalculator;
	private JTextField tfinput1;
	private JTextField tfinput2;
	private JLabel lblResult;
	private JCheckBox cbAdd;
	private JCheckBox cbMin;
	private JCheckBox cbMul;
	private JCheckBox cbDiv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz1_1 window = new Quiz1_1();
					window.frmCheckboxCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quiz1_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckboxCalculator = new JFrame();
		frmCheckboxCalculator.setTitle("CheckBox Calculator");
		frmCheckboxCalculator.setBounds(100, 100, 450, 300);
		frmCheckboxCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxCalculator.getContentPane().setLayout(null);
		frmCheckboxCalculator.getContentPane().add(getTfinput1());
		frmCheckboxCalculator.getContentPane().add(getTfinput2());
		frmCheckboxCalculator.getContentPane().add(getLblResult());
		frmCheckboxCalculator.getContentPane().add(getCbAdd());
		frmCheckboxCalculator.getContentPane().add(getCbMin());
		frmCheckboxCalculator.getContentPane().add(getCbMul());
		frmCheckboxCalculator.getContentPane().add(getCbDiv());
	}

	private JTextField getTfinput1() {
		if (tfinput1 == null) {
			tfinput1 = new JTextField();
			tfinput1.setBounds(33, 43, 123, 26);
			tfinput1.setColumns(10);
		}
		return tfinput1;
	}
	private JTextField getTfinput2() {
		if (tfinput2 == null) {
			tfinput2 = new JTextField();
			tfinput2.setColumns(10);
			tfinput2.setBounds(33, 91, 123, 26);
		}
		return tfinput2;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult.setBounds(95, 147, 173, 119);
		}
		return lblResult;
	}
	private JCheckBox getCbAdd() {
		if (cbAdd == null) {
			cbAdd = new JCheckBox("Add");
			cbAdd.setSelected(true);
			cbAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkCalc();
				
				
				}
			});
			cbAdd.setBounds(283, 22, 128, 23);
		}
		return cbAdd;
	}
	private JCheckBox getCbMin() {
		if (cbMin == null) {
			cbMin = new JCheckBox("MInus");
			cbMin.setBounds(283, 57, 128, 23);
		}
		return cbMin;
	}
	private JCheckBox getCbMul() {
		if (cbMul == null) {
			cbMul = new JCheckBox("Multiple");
			cbMul.setBounds(283, 92, 128, 23);
		}
		return cbMul;
	}
	private JCheckBox getCbDiv() {
		if (cbDiv == null) {
			cbDiv = new JCheckBox("Devide");
			cbDiv.setBounds(283, 127, 128, 23);
		}
		return cbDiv;
	}
	
	private void checkCalc() {
		String str1 = tfinput1.getText();
		String str2 = tfinput2.getText();
		
		int num1 = Integer.parseInt(tfinput1.getText());
		int num2 = Integer.parseInt(tfinput2.getText());
		
		
		if(cbAdd.isSelected()== true) {
			lblResult.setText(str1 + "+" + str2 + "=" + Integer.toString(num1+num2));
		}else {
			
		}
		
		
		
	}
	
	
	
	
	
	
}//=======
