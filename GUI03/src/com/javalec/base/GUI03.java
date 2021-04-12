package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI03 {

	private JFrame frame;
	private JComboBox cbinput1;
	private JComboBox cbCalc;
	private JComboBox cbinput2;
	private JTextField tfResult;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
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
	public GUI03() {
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
		frame.getContentPane().add(getCbCalc());
		frame.getContentPane().add(getCbinput2());
		frame.getContentPane().add(getTfResult());
	}

	private JComboBox getCbinput1() {
		if (cbinput1 == null) {
			cbinput1 = new JComboBox();
			cbinput1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CalcResult();
				}
			});
			cbinput1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cbinput1.setBounds(17, 34, 89, 27);
		}
		return cbinput1;
	}
	private JComboBox getCbCalc() {
		if (cbCalc == null) {
			cbCalc = new JComboBox();
			cbCalc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CalcResult();
				}
			});
			cbCalc.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "X", "/"}));
			cbCalc.setBounds(118, 34, 94, 27);
		}
		return cbCalc;
	}
	private JComboBox getCbinput2() {
		if (cbinput2 == null) {
			cbinput2 = new JComboBox();
			cbinput2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CalcResult();
				}
			});
			cbinput2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cbinput2.setBounds(224, 34, 84, 27);
		}
		return cbinput2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setBounds(320, 33, 102, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}

private void CalcResult() {
	int num1 = Integer.parseInt(cbinput1.getSelectedItem().toString());
	int num2 = Integer.parseInt(cbinput2.getSelectedItem().toString());
	String calc = cbCalc.getSelectedItem().toString();

	
	if (calc=="+") {
		tfResult.setText(Integer.toString(num1+num2));
	}else if (calc == "-") {
		tfResult.setText(Integer.toString(num1-num2));
	}else if (calc == "X") {
		tfResult.setText(Integer.toString(num1*num2));
	}else if (calc=="/") {
		tfResult.setText(String.format("%.3f", ((double)num1/(double)num2)));
	}
	else if (num2 == 0) {
			JOptionPane.showMessageDialog(null , "Can't share by 0");;
		}
		
	}
	
	
}







//==== end Line


