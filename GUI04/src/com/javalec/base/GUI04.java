package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUI04 {

	private JFrame frmCheckboxRadiobutton;
	private JCheckBox chApple;
	private JCheckBox chBanana;
	private JButton btnFruit;
	private JTextField tfFruit;
	private JRadioButton rbKBS;
	private JRadioButton rbMBC;
	private JTextField tfbroad;
	private JButton btnbroad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04 window = new GUI04();
					window.frmCheckboxRadiobutton.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckboxRadiobutton = new JFrame();
		frmCheckboxRadiobutton.setTitle("CheckBox / RadioButton");
		frmCheckboxRadiobutton.setBounds(100, 100, 479, 300);
		frmCheckboxRadiobutton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxRadiobutton.getContentPane().setLayout(null);
		frmCheckboxRadiobutton.getContentPane().add(getChApple());
		frmCheckboxRadiobutton.getContentPane().add(getChBanana());
		frmCheckboxRadiobutton.getContentPane().add(getBtnFruit());
		frmCheckboxRadiobutton.getContentPane().add(getTfFruit());
		frmCheckboxRadiobutton.getContentPane().add(getRbKBS());
		frmCheckboxRadiobutton.getContentPane().add(getRbMBC());
		frmCheckboxRadiobutton.getContentPane().add(getTfbroad());
		frmCheckboxRadiobutton.getContentPane().add(getBtnbroad());
	}
	private JCheckBox getChApple() {
		if (chApple == null) {
			chApple = new JCheckBox("Apple");
			chApple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			chApple.setBounds(28, 46, 75, 23);
		}
		return chApple;
	}
	private JCheckBox getChBanana() {
		if (chBanana == null) {
			chBanana = new JCheckBox("Banana");
			chBanana.setBounds(28, 81, 94, 23);
		}
		return chBanana;
	}
	private JButton getBtnFruit() {
		if (btnFruit == null) {
			btnFruit = new JButton("OK");
			btnFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			btnFruit.setBounds(28, 123, 117, 29);
		}
		return btnFruit;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setBounds(28, 164, 175, 26);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}
	

	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			rbKBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbKBS);
			rbKBS.setBounds(237, 46, 141, 23);
		}
		return rbKBS;
	}
	private JRadioButton getRbMBC() {
		if (rbMBC == null) {
			rbMBC = new JRadioButton("MBC");
			rbMBC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbMBC);
			rbMBC.setBounds(237, 81, 141, 23);
		}
		return rbMBC;
	}
	private JTextField getTfbroad() {
		if (tfbroad == null) {
			tfbroad = new JTextField();
			tfbroad.setColumns(10);
			tfbroad.setBounds(237, 164, 194, 26);
		}
		return tfbroad;
	}
	private JButton getBtnbroad() {
		if (btnbroad == null) {
			btnbroad = new JButton("OK");
			btnbroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			btnbroad.setBounds(237, 123, 117, 29);
		}
		return btnbroad;
	}
	
	private void broadCheck() {
		tfbroad.setText("");
		if(rbKBS.isSelected()== true){
			tfbroad.setText("KBS가 선택 되었습니다");
		}
		if(rbMBC.isSelected()== true){
			tfbroad.setText("MBC가 선택 되었습니다");
		}

	}	
		
		
		private void fruitCheck() {	
			tfFruit.setText("");					// 기본값 지정으로 아무것도 선택안하면 칸 비우기.
			if(chApple.isSelected() == true) {		// 체크박스가 선택됐는지 물어보는 메소드. 불린 값이기때문에 true
				tfFruit.setText("Apple이 선택 되었습니다.");
			}
			
			if(chBanana.isSelected()== true ) {
				tfFruit.setText("Banana가 선택 되었습니다.");
			}
			if (chApple.isSelected()== true && chBanana.isSelected() == true) {
				tfFruit.setText("Apple 과 Banana가 선택 되었습니다.");
			}
	}
}
