package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI01_01 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfnum1;
	private JTextField tfnum2;
	private JTextField tfResult1;
	private JLabel lblsign;
	private JTextField tfResult2;
	private JLabel lblequal;
	private JTextField tfResult3;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMul;
	private JButton btnDiv;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01_01 window = new GUI01_01();
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
	public GUI01_01() {
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
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfnum1());
		frame.getContentPane().add(getTfnum2());
		frame.getContentPane().add(getTfResult1());
		frame.getContentPane().add(getLblsign());
		frame.getContentPane().add(getTfResult2());
		frame.getContentPane().add(getLblequal());
		frame.getContentPane().add(getTfResult3());
		frame.getContentPane().add(getBtnPlus());
		frame.getContentPane().add(getBtnMinus());
		frame.getContentPane().add(getBtnMul());
		frame.getContentPane().add(getBtnDiv());
		frame.getContentPane().add(getBtnReset());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("1 : ");
			lblNewLabel.setBounds(12, 41, 18, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("2 : ");
			lblNewLabel_1.setBounds(12, 90, 18, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfnum1() {
		if (tfnum1 == null) {
			tfnum1 = new JTextField();
			tfnum1.setToolTipText("숫자만");
			tfnum1.setHorizontalAlignment(SwingConstants.RIGHT);
			tfnum1.setColumns(10);
			tfnum1.setBounds(42, 38, 92, 21);
		}
		return tfnum1;
	}
	private JTextField getTfnum2() {
		if (tfnum2 == null) {
			tfnum2 = new JTextField();
			tfnum2.setHorizontalAlignment(SwingConstants.RIGHT);
			tfnum2.setColumns(10);
			tfnum2.setBounds(42, 87, 92, 21);
		}
		return tfnum2;
	}
	private JTextField getTfResult1() {
		if (tfResult1 == null) {
			tfResult1 = new JTextField();
			tfResult1.setHorizontalAlignment(SwingConstants.RIGHT);
			tfResult1.setEditable(false);
			tfResult1.setColumns(10);
			tfResult1.setBounds(42, 185, 92, 21);
		}
		return tfResult1;
	}
	private JLabel getLblsign() {
		if (lblsign == null) {
			lblsign = new JLabel("");
			lblsign.setHorizontalAlignment(SwingConstants.CENTER);
			lblsign.setBounds(146, 188, 18, 15);
		}
		return lblsign;
	}
	private JTextField getTfResult2() {
		if (tfResult2 == null) {
			tfResult2 = new JTextField();
			tfResult2.setHorizontalAlignment(SwingConstants.RIGHT);
			tfResult2.setEditable(false);
			tfResult2.setColumns(10);
			tfResult2.setBounds(176, 185, 92, 21);
		}
		return tfResult2;
	}
	private JLabel getLblequal() {
		if (lblequal == null) {
			lblequal = new JLabel("=");
			lblequal.setHorizontalAlignment(SwingConstants.CENTER);
			lblequal.setBounds(280, 188, 18, 15);
		}
		return lblequal;
	}
	private JTextField getTfResult3() {
		if (tfResult3 == null) {
			tfResult3 = new JTextField();
			tfResult3.setHorizontalAlignment(SwingConstants.RIGHT);
			tfResult3.setEditable(false);
			tfResult3.setColumns(10);
			tfResult3.setBounds(310, 185, 92, 21);
		}
		return tfResult3;
	}
	private JButton getBtnPlus() {
		if (btnPlus == null) {
			btnPlus = new JButton("+");
			btnPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnPlus.setBounds(176, 37, 53, 23);
		}
		return btnPlus;
	}
	private JButton getBtnMinus() {
		if (btnMinus == null) {
			btnMinus = new JButton("-");
			btnMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnMinus.setBounds(241, 37, 53, 23);
		}
		return btnMinus;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("X");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnMul.setBounds(306, 37, 53, 23);
		}
		return btnMul;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("/");
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnDiv.setBounds(371, 37, 53, 23);
		}
		return btnDiv;
	}
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton("Reset");
			btnReset.setBounds(176, 86, 97, 23);
		}
		return btnReset;
	}
}
