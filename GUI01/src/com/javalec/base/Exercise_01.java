package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Exercise_01 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfinputNum1;
	private JTextField tfinputNum2;
	private JTextField tffactor1;
	private JLabel lblsign;
	private JTextField tffactor2;
	private JLabel lblequal;
	private JTextField tfResult;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMul;
	private JButton btnDiv;
	/*
	 * 
	 * Claculator 클래스 이용해서 사칙연산 수행하기 위해서 클래스 변수 선언
	 * 
	 */
		Calculator calc = new Calculator();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise_01 window = new Exercise_01();
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
	public Exercise_01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfinputNum1());
		frame.getContentPane().add(getTfinputNum2());
		frame.getContentPane().add(getTffactor1());
		frame.getContentPane().add(getLblsign());
		frame.getContentPane().add(getTffactor2());
		frame.getContentPane().add(getLblequal());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getBtnPlus());
		frame.getContentPane().add(getBtnMinus());
		frame.getContentPane().add(getBtnMul());
		frame.getContentPane().add(getBtnDiv());
		frame.setLocationRelativeTo(null);		/// 화면 중앙에 위치하기
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Reset();
			}
		});
		btnReset.setBounds(176, 81, 97, 23);
		frame.getContentPane().add(btnReset);
		
		JOptionPane.showMessageDialog(null, "숫자만 입력해주세요!!");	///숫자만 입력하라는 메시지 띠우기
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("1 : ");
			lblNewLabel.setBounds(12, 36, 18, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("2 : ");
			lblNewLabel_1.setBounds(12, 85, 18, 15);
			
		}
		return lblNewLabel_1;
	}
	private JTextField getTfinputNum1() {
		if (tfinputNum1 == null) {
			tfinputNum1 = new JTextField();
			tfinputNum1.setHorizontalAlignment(SwingConstants.RIGHT);
			tfinputNum1.addKeyListener(new KeyAdapter() {
				
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
					
				}else {
					JOptionPane.showMessageDialog(null, "숫자만 입력하세요 !", "경고", JOptionPane.ERROR_MESSAGE);
					tfinputNum1.setText("");
				}
					}
			});
			tfinputNum1.setToolTipText("숫자만");
			tfinputNum1.setBounds(42, 33, 92, 21);
			tfinputNum1.setColumns(10);
			
		}
		return tfinputNum1;
	}
	private JTextField getTfinputNum2() {
		if (tfinputNum2 == null) {
			tfinputNum2 = new JTextField();
			tfinputNum2.setHorizontalAlignment(SwingConstants.RIGHT);
			tfinputNum2.setColumns(10);
			tfinputNum2.setBounds(42, 82, 92, 21);
		}
		return tfinputNum2;
	}
	private JTextField getTffactor1() {
		if (tffactor1 == null) {
			tffactor1 = new JTextField();
			tffactor1.setHorizontalAlignment(SwingConstants.RIGHT);
			tffactor1.setEditable(false);
			tffactor1.setColumns(10);
			tffactor1.setBounds(42, 180, 92, 21);
		}
		return tffactor1;
	}
	private JLabel getLblsign() {
		if (lblsign == null) {
			lblsign = new JLabel("");
			lblsign.setHorizontalAlignment(SwingConstants.CENTER);
			lblsign.setBounds(146, 183, 18, 15);
		}
		return lblsign;
	}
	private JTextField getTffactor2() {
		if (tffactor2 == null) {
			tffactor2 = new JTextField();
			tffactor2.setHorizontalAlignment(SwingConstants.RIGHT);
			tffactor2.setEditable(false);
			tffactor2.setColumns(10);
			tffactor2.setBounds(176, 180, 92, 21);
		}
		return tffactor2;
	}
	private JLabel getLblequal() {
		if (lblequal == null) {
			lblequal = new JLabel("=");
			lblequal.setHorizontalAlignment(SwingConstants.CENTER);
			lblequal.setBounds(280, 183, 18, 15);
		}
		return lblequal;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				Reset();
				}
			});
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.RIGHT);
			tfResult.setColumns(10);
			tfResult.setBounds(310, 180, 92, 21);
		}
		return tfResult;
	}
	private JButton getBtnPlus() {
		if (btnPlus == null) {
			btnPlus = new JButton("+");
			btnPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					addSum();
					tffactor1.setText(tfinputNum1.getText());
					tffactor2.setText(tfinputNum2.getText());
					tfResult.setText(calc.Plus(tfinputNum1.getText(), tfinputNum2.getText()));
				}
			});
			btnPlus.setBounds(176, 32, 53, 23);
		}
		return btnPlus;
	}
	private JButton getBtnMinus() {
		if (btnMinus == null) {
			btnMinus = new JButton("-");
			btnMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					Minus();
					tffactor1.setText(tfinputNum1.getText());
					tffactor2.setText(tfinputNum2.getText());
					tfResult.setText(calc.Minus(tfinputNum1.getText(), tfinputNum2.getText()));
				}
			});
			btnMinus.setBounds(241, 32, 53, 23);
		}
		return btnMinus;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("X");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					Multi();
					tffactor1.setText(tfinputNum1.getText());
					tffactor2.setText(tfinputNum2.getText());
					tfResult.setText(calc.Multi(tfinputNum1.getText(), tfinputNum2.getText()));
				}
			});
			btnMul.setBounds(306, 32, 53, 23);
		}
		return btnMul;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("/");
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tffactor1.setText(tfinputNum1.getText());
					tffactor2.setText(tfinputNum2.getText());
					lblsign.setText("+");
//					Share();
					tffactor1.setText(tfinputNum1.getText());
					tffactor2.setText(tfinputNum2.getText());
					tfResult.setText(calc.Share(tfinputNum1.getText(), tfinputNum2.getText()));
				}
			});
			btnDiv.setBounds(371, 32, 53, 23);
		}
		return btnDiv;
	}
	
	
	//=======  불러올 메소드 작성
//	public void addSum() {
//		int tot =0;
//		tffactor1.setText(tfinputNum1.getText());
//		tffactor2.setText(tfinputNum2.getText());
//		lblsign.setText("+");
//		int wkNum1 = Integer.parseInt(tfinputNum1.getText());
//		int wkNum2 = Integer.parseInt(tfinputNum2.getText());
//		int wkResult = wkNum1 + wkNum2;
//		
//		String addResult = Integer.toString(wkResult);
//		tfResult.setText(addResult);
//	}
	
	
//	public void Minus() {
//		tffactor1.setText(tfinputNum1.getText());
//		tffactor2.setText(tfinputNum2.getText());
//		lblsign.setText("-");
//		int wkNum1 = Integer.parseInt(tfinputNum1.getText());
//		int wkNum2 = Integer.parseInt(tfinputNum2.getText());
//		int wkResult = wkNum1 - wkNum2;
//		
//		String minResult = Integer.toString(wkResult);
//		tfResult.setText(minResult);
//		
//	}
//	
//	public void Multi() {
//		tffactor1.setText(tfinputNum1.getText());
//		tffactor2.setText(tfinputNum2.getText());
//		lblsign.setText("X");
//		int wkNum1 = Integer.parseInt(tfinputNum1.getText());
//		int wkNum2 = Integer.parseInt(tfinputNum2.getText());
//		int wkResult = wkNum1 * wkNum2;
//		
//		String MulResult = Integer.toString(wkResult);
//		tfResult.setText(MulResult);
//	}
//	
//	public void Share() {
//		tffactor1.setText(tfinputNum1.getText());
//		tffactor2.setText(tfinputNum2.getText());
//		lblsign.setText("/");
//		int wkNum1 = Integer.parseInt(tfinputNum1.getText());
//		int wkNum2 = Integer.parseInt(tfinputNum2.getText());
//		double wkResult = (double)wkNum1 / (double)wkNum2;
//		
//		String divResult = Double.toString(wkResult);
//		if(wkNum2 == 0) {
//			JOptionPane.showMessageDialog(null, "0으로는 나눌 수 없습니다.");
//		}else tfResult.setText(String.format("%.3f", wkResult));
//	}
	
	public void Reset() {
		
		tfinputNum1.setText("");		
		tfinputNum2.setText("");		
		tffactor1.setText("");		
		tffactor2.setText("");		
		tfResult.setText("");		
		
	}
	
	
}//----==========

