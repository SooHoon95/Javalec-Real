package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Practice {

	private JFrame ComboBox;
	private JComboBox cbFruits;
	private JTextField tfFruits;
	private JComboBox cbAdd;
	private JTextField tfAdd;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practice window = new Practice();
					window.ComboBox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Practice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ComboBox = new JFrame();
		ComboBox.setBounds(100, 100, 450, 300);
		ComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ComboBox.getContentPane().setLayout(null);
		ComboBox.getContentPane().add(getCbFruits());
		ComboBox.getContentPane().add(getTfFruits());
		ComboBox.getContentPane().add(getCbAdd());
		ComboBox.getContentPane().add(getTfAdd());
		ComboBox.getContentPane().add(getBtnAdd());
	}
	private JComboBox getCbFruits() {
		if (cbFruits == null) {
			cbFruits = new JComboBox();
			cbFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String stFruit = cbFruits.getSelectedItem().toString();
					tfFruits.setText(stFruit);
				}
			});
			cbFruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Mango", "Melon"}));
			cbFruits.setBounds(36, 24, 97, 25);
		}
		return cbFruits;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setBounds(236, 26, 116, 21);
			tfFruits.setColumns(10);
		}
		return tfFruits;
	}
	private JComboBox getCbAdd() {
		if (cbAdd == null) {
			cbAdd = new JComboBox();
			cbAdd.setBounds(236, 127, 116, 25);
		}
		return cbAdd;
	}
	private JTextField getTfAdd() {
		if (tfAdd == null) {
			tfAdd = new JTextField();
			tfAdd.setColumns(10);
			tfAdd.setBounds(36, 129, 116, 21);
		}
		return tfAdd;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addString();
				}
			});
			btnAdd.setBounds(36, 173, 97, 23);
		}
		return btnAdd;
	}
	
	public void addString() {
		String str1 = tfAdd.getText();
		cbAdd.addItem(str1);
	}
	
	
	
	
	
	
}//===================
