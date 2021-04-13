package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GUI_Exercise {

	private JFrame frame;
	private JTextField tfmessage;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JButton btnadd;
	private JButton btnequal;
	private JButton btn0;
	int num1, num2;
	private JButton btncancle;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Exercise window = new GUI_Exercise();
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
	public GUI_Exercise() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 341, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfmessage());
		frame.getContentPane().add(getBtn1());
		frame.getContentPane().add(getBtn2());
		frame.getContentPane().add(getBtn3());
		frame.getContentPane().add(getBtn6());
		frame.getContentPane().add(getBtn5());
		frame.getContentPane().add(getBtn4());
		frame.getContentPane().add(getBtn9());
		frame.getContentPane().add(getBtn8());
		frame.getContentPane().add(getBtn7());
		frame.getContentPane().add(getBtnadd());
		frame.getContentPane().add(getBtnequal());
		frame.getContentPane().add(getBtn0());
		frame.getContentPane().add(getBtncancle());
	}
	private JTextField getTfmessage() {
		if (tfmessage == null) {
			tfmessage = new JTextField();
			tfmessage.setHorizontalAlignment(SwingConstants.TRAILING);
			tfmessage.setText("0");
			tfmessage.setEditable(false);
			tfmessage.setBounds(12, 25, 300, 39);
			tfmessage.setColumns(10);
		}
		return tfmessage;
	}
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfmessage.setText(Integer.toString(Integer.parseInt(tfmessage.getText().toString() + btn1.getText().toString())));
				}
			});
			btn1.setBounds(22, 145, 85, 45);
		}
		return btn1;
	}
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfmessage.setText(Integer.toString(Integer.parseInt(tfmessage.getText().toString() + btn2.getText().toString())));
				}
			});
			btn2.setBounds(119, 145, 85, 45);
		}
		return btn2;
	}
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfmessage.setText(Integer.toString(Integer.parseInt(tfmessage.getText().toString() + btn3.getText().toString())));
				}
			});
			btn3.setBounds(216, 145, 85, 45);
		}
		return btn3;
	}
	private JButton getBtn6() {
		if (btn6 == null) {
			btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfmessage.setText(Integer.toString(Integer.parseInt(tfmessage.getText().toString() + btn6.getText().toString())));
				}
			});
			btn6.setBounds(216, 200, 85, 45);
		}
		return btn6;
	}
	private JButton getBtn5() {
		if (btn5 == null) {
			btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfmessage.setText(Integer.toString(Integer.parseInt(tfmessage.getText().toString() + btn5.getText().toString())));
				}
			});
			btn5.setBounds(119, 200, 85, 45);
		}
		return btn5;
	}
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfmessage.setText(Integer.toString(Integer.parseInt(tfmessage.getText().toString() + btn4.getText().toString())));
				}
			});
			btn4.setBounds(22, 200, 85, 45);
		}
		return btn4;
	}
	private JButton getBtn9() {
		if (btn9 == null) {
			btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfmessage.setText(Integer.toString(Integer.parseInt(tfmessage.getText().toString() + btn9.getText().toString())));
				}
			});
			btn9.setBounds(216, 255, 85, 45);
		}
		return btn9;
	}
	private JButton getBtn8() {
		if (btn8 == null) {
			btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfmessage.setText(Integer.toString(Integer.parseInt(tfmessage.getText().toString() + btn8.getText().toString())));
				}
			});
			btn8.setBounds(119, 255, 85, 45);
		}
		return btn8;
	}
	private JButton getBtn7() {
		if (btn7 == null) {
			btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfmessage.setText(Integer.toString(Integer.parseInt(tfmessage.getText().toString() + btn7.getText().toString())));
				}
			});
			btn7.setBounds(22, 255, 85, 45);
		}
		return btn7;
	}
	private JButton getBtnadd() {
		if (btnadd == null) {
			btnadd = new JButton("+");
			btnadd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Num1();
					
				}
			});
			btnadd.setBounds(216, 310, 85, 45);
		}
		return btnadd;
	}
	private JButton getBtnequal() {
		if (btnequal == null) {
			btnequal = new JButton("=");
			btnequal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Num2();
				}
			});
			btnequal.setBounds(119, 310, 85, 45);
		}
		return btnequal;
	}
	private JButton getBtn0() {
		if (btn0 == null) {
			btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfmessage.setText(Integer.toString(Integer.parseInt(tfmessage.getText().toString() + btn0.getText().toString())));
				}
			});
			btn0.setBounds(22, 310, 85, 45);
		}
		return btn0;
	}
	private JButton getBtncancle() {
		if (btncancle == null) {
			btncancle = new JButton("C");
			btncancle.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfmessage.setText("0");
				}
			});
			btncancle.setBounds(204, 87, 97, 48);
		}
		return btncancle;
	}
	
	private void Num1() {
		int num1 = Integer.parseInt(tfmessage.getText()); 	// 1차 값 	
		this.num1=num1;										//1차 값 저장 위해서 클래스 변수로 선언
		tfmessage.setText(null);							// 입력 창 초기화
	}
	private void Num2() {
		int num2 = Integer.parseInt(tfmessage.getText());	// 2차 값
		this.num2=num2;										
		tfmessage.setText(Integer.toString(num1+num2));		// 2차 값 저장
	}
	
	
}//============
