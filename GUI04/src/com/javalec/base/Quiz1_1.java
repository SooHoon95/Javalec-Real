package com.javalec.base;

import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Quiz1_1 {

	private JFrame frmCheckboxCalculator;
	private JTextField tfinput1;
	private JTextField tfinput2;
	private JLabel lblResult1;
	private JCheckBox cbAdd;
	private JCheckBox cbMin;
	private JCheckBox cbMul;
	private JCheckBox cbDiv;
	private JLabel lblResult2;
	private JLabel lblResult3;
	private JLabel lblResult4;

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
		frmCheckboxCalculator.getContentPane().add(getLblResult1());
		frmCheckboxCalculator.getContentPane().add(getCbAdd());
		frmCheckboxCalculator.getContentPane().add(getCbMin());
		frmCheckboxCalculator.getContentPane().add(getCbMul());
		frmCheckboxCalculator.getContentPane().add(getCbDiv());
		frmCheckboxCalculator.getContentPane().add(getLblResult2());
		frmCheckboxCalculator.getContentPane().add(getLblResult3());
		frmCheckboxCalculator.getContentPane().add(getLblResult4());
		frmCheckboxCalculator.setLocationRelativeTo(null);
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
	private JLabel getLblResult1() {
		if (lblResult1 == null) {
			lblResult1 = new JLabel("");
			lblResult1.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult1.setBounds(123, 137, 173, 26);
		}
		return lblResult1;
	}
	private JCheckBox getCbAdd() {
		if (cbAdd == null) {
			cbAdd = new JCheckBox("Add");
			cbAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CheckCalc();
				}
			});
			cbAdd.setBounds(172, 20, 109, 23);
		}
		return cbAdd;
	}
	private JCheckBox getCbMin() {
		if (cbMin == null) {
			cbMin = new JCheckBox("MInus");
			cbMin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CheckCalc();
				}
			});
			cbMin.setBounds(283, 20, 128, 23);
		}
		return cbMin;
	}
	private JCheckBox getCbMul() {
		if (cbMul == null) {
			cbMul = new JCheckBox("Multiple");
			cbMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CheckCalc();
				}
			});
			cbMul.setBounds(172, 67, 109, 23);
		}
		return cbMul;
	}
	private JCheckBox getCbDiv() {
		if (cbDiv == null) {
			cbDiv = new JCheckBox("Devide");
			cbDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CheckCalc();
				}
			});
			cbDiv.setBounds(283, 67, 128, 23);
		}
		return cbDiv;
	}
		
		
	
	private JLabel getLblResult2() {
		if (lblResult2 == null) {
			lblResult2 = new JLabel("");
			lblResult2.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult2.setBounds(123, 165, 173, 26);
		}
		return lblResult2;
	}
	private JLabel getLblResult3() {
		if (lblResult3 == null) {
			lblResult3 = new JLabel("");
			lblResult3.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult3.setBounds(123, 192, 173, 26);
		}
		return lblResult3;
	}
	private JLabel getLblResult4() {
		if (lblResult4 == null) {
			lblResult4 = new JLabel("");
			lblResult4.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult4.setBounds(123, 228, 173, 26);
		}
		return lblResult4;
	}
	
//	======================================
	
	public void CheckCalc() {
		ArrayList<String> Calculator = new ArrayList<String>();
		int num1 = Integer.parseInt(tfinput1.getText().toString());
		int num2 = Integer.parseInt(tfinput2.getText().toString());
		Calculate Calc = new Calculate(num1,num2);
		
		lblResult1.setText("");
		lblResult2.setText("");
		lblResult3.setText("");
		lblResult4.setText("");
		
		if(cbAdd.isSelected()==true)Calculator.add(Calc.Plus());
		if(cbMin.isSelected()==true)Calculator.add(Calc.Min());
		if(cbMul.isSelected()==true)Calculator.add(Calc.Mul());
		if(cbDiv.isSelected()==true)Calculator.add(Calc.Div());
		
		for(int i=0; i<Calculator.size(); i++) {
			switch(i){
			case 0:
				lblResult1.setText(Calculator.get(i));
				break;
			case 1:
				lblResult2.setText(Calculator.get(i));
				break;
			case 2:
				lblResult3.setText(Calculator.get(i));
				break;
			case 3:
				lblResult4.setText(Calculator.get(i));
				break;
			}
		}
			Calculator.clear();
	}
	
	
}//=======
