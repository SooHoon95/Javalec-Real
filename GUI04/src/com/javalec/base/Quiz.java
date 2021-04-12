package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Quiz {

	private JFrame frmQuiz;
	private JRadioButton rdbAdd;
	private JRadioButton rdbMin;
	private JRadioButton rdbMulti;
	private JRadioButton rdbShare;
	private JTextField tfresult;
	private JTextField tfinput1;
	private JTextField tfinput2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz window = new Quiz();
					window.frmQuiz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public Quiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuiz = new JFrame();
		frmQuiz.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
			rdbAdd.setSelected(true);					// 처음 창 켜질 때 하나는 무조건 체크되어있게 만들기. is 가 아니라 setSelctedd를 사용한다.
			
			}
		});
		frmQuiz.setTitle("Quiz");
		frmQuiz.setBounds(100, 100, 450, 300);
		frmQuiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuiz.getContentPane().setLayout(null);
		frmQuiz.getContentPane().add(getRdbAdd());
		frmQuiz.getContentPane().add(getRdbMin());
		frmQuiz.getContentPane().add(getRdbMulti());
		frmQuiz.getContentPane().add(getRdbShare());
		frmQuiz.getContentPane().add(getTfresult());
		frmQuiz.getContentPane().add(getTfinput1());
		frmQuiz.getContentPane().add(getTfinput2());

		frmQuiz.setLocationRelativeTo(null);
	}

	private JRadioButton getRdbAdd() {
		if (rdbAdd == null) {
			rdbAdd = new JRadioButton("Add");
			buttonGroup.add(rdbAdd);
			rdbAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			rdbAdd.setBounds(292, 16, 141, 23);
		}
		return rdbAdd;
	}
	private JRadioButton getRdbMin() {
		if (rdbMin == null) {
			rdbMin = new JRadioButton("Minus");
			buttonGroup.add(rdbMin);
			rdbMin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calc();
				}
			});
			rdbMin.setBounds(292, 47, 141, 23);
		}
		return rdbMin;
	}
	private JRadioButton getRdbMulti() {
		if (rdbMulti == null) {
			rdbMulti = new JRadioButton("Multi");
			buttonGroup.add(rdbMulti);
			rdbMulti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calc();
				}
			});
			rdbMulti.setBounds(292, 82, 141, 23);
		}
		return rdbMulti;
	}
	private JRadioButton getRdbShare() {
		if (rdbShare == null) {
			rdbShare = new JRadioButton("divide");
			buttonGroup.add(rdbShare);
			rdbShare.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calc();
				}
			});
			rdbShare.setBounds(292, 117, 141, 23);
		}
		return rdbShare;
	}
	private JTextField getTfresult() {
		if (tfresult == null) {
			tfresult = new JTextField();
			tfresult.setHorizontalAlignment(SwingConstants.CENTER);
			tfresult.setBounds(52, 166, 341, 26);
			tfresult.setColumns(10);
		}
		return tfresult;
	}
	private JTextField getTfinput1() {
		if (tfinput1 == null) {
			tfinput1 = new JTextField();
			tfinput1.setBounds(48, 46, 130, 26);
			tfinput1.setColumns(10);
		}
		return tfinput1;
	}
	private JTextField getTfinput2() {
		if (tfinput2 == null) {
			tfinput2 = new JTextField();
			tfinput2.setColumns(10);
			tfinput2.setBounds(48, 104, 130, 26);
		}
		return tfinput2;
	}
	
	private void Calc() {
		ArrayList<String> arraylist = new ArrayList();
		int num1 = Integer.parseInt(tfinput1.getText());
		int num2 = Integer.parseInt(tfinput2.getText());
		
		
		
		if (rdbAdd.isSelected() == true) {
			tfresult.setText(Integer.toString(num1) + "+" + Integer.toString(num2) + "=" + Integer.toString(num1+num2));
		}else if (rdbMin.isSelected()== true) {
			tfresult.setText(Integer.toString(num1) + "-" + Integer.toString(num2) + "=" + Integer.toString(num1-num2));
		}else if (rdbMulti.isSelected()== true) {
			tfresult.setText(Integer.toString(num1) + "X" + Integer.toString(num2) + "=" + Integer.toString(num1*num2));
		}else if (rdbShare.isSelected()== true) {
			if(num2 == 0) {
				JOptionPane.showMessageDialog(null, "Can't share by 0");
			}else {
				tfresult.setText(Integer.toString(num1) + "/" + Integer.toString(num2) + "=" + String.format("%.3f",(double)num1/(double)num2));
			}

		}
		
		
	}
	
	
	
	
	
	
	
}//======
