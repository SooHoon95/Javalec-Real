package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI04_01 {

	private JFrame frame;
	private JCheckBox cbapple;
	private JCheckBox cbbanana;
	private JRadioButton rdbKBS;
	private JRadioButton rdbMBC;
	private JButton btnFruit;
	private JButton btnbroad;
	private JTextField tfFruit;
	private JTextField tfbroad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04_01 window = new GUI04_01();
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
	public GUI04_01() {
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
		frame.getContentPane().add(getCbapple());
		frame.getContentPane().add(getCbbanana());
		frame.getContentPane().add(getRdbKBS());
		frame.getContentPane().add(getRdbMBC());
		frame.getContentPane().add(getBtnFruit());
		frame.getContentPane().add(getBtnbroad());
		frame.getContentPane().add(getTfFruit());
		frame.getContentPane().add(getTfbroad());
	}
	private JCheckBox getCbapple() {
		if (cbapple == null) {
			cbapple = new JCheckBox("Apple");
			cbapple.setBounds(23, 40, 115, 23);
		}
		return cbapple;
	}
	private JCheckBox getCbbanana() {
		if (cbbanana == null) {
			cbbanana = new JCheckBox("Banana");
			cbbanana.setBounds(23, 97, 115, 23);
		}
		return cbbanana;
	}
	private JRadioButton getRdbKBS() {
		if (rdbKBS == null) {
			rdbKBS = new JRadioButton("KBS");
			rdbKBS.setBounds(220, 40, 121, 23);
		}
		return rdbKBS;
	}
	private JRadioButton getRdbMBC() {
		if (rdbMBC == null) {
			rdbMBC = new JRadioButton("MBC");
			rdbMBC.setBounds(220, 97, 121, 23);
		}
		return rdbMBC;
	}
	private JButton getBtnFruit() {
		if (btnFruit == null) {
			btnFruit = new JButton("OK");
			btnFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Fruits();
				}
			});
			btnFruit.setBounds(23, 156, 97, 23);
		}
		return btnFruit;
	}
	private JButton getBtnbroad() {
		if (btnbroad == null) {
			btnbroad = new JButton("OK");
			btnbroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Broad();
				}
				
			});
			btnbroad.setBounds(220, 156, 97, 23);
		}
		return btnbroad;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setBounds(22, 205, 186, 21);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}
	private JTextField getTfbroad() {
		if (tfbroad == null) {
			tfbroad = new JTextField();
			tfbroad.setColumns(10);
			tfbroad.setBounds(220, 205, 186, 21);
		}
		return tfbroad;
	}
	
	
	private void Fruits() {
		if(cbapple.isSelected()==true) {
			tfFruit.setText("Apple을 선택");
		}
		if(cbbanana.isSelected()==true) {
			tfFruit.setText("Banana을 선택");
		}
		if(cbapple.isSelected()==true && cbbanana.isSelected()==true) {
			tfFruit.setText("Apple과 Banana를 선택");
		}
		
		
		
	}
	private void Broad() {
		if(rdbKBS.isSelected() == true) {
			tfbroad.setText("KBS선택");
		}
		if(rdbMBC.isSelected() == true) {
			tfbroad.setText("MBC선택");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}//=========

