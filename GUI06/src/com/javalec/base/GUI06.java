package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI06 {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu menucalc;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JSeparator separator;
	private JMenuItem calcadd;
	private JTextField tfnum1;
	private JTextField tfnum2;
	private JTextField tfresult;
	private JButton btnadd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI06 window = new GUI06();
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
	public GUI06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(getMenuBar());
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfnum1());
		frame.getContentPane().add(getTfnum2());
		frame.getContentPane().add(getTfresult());
		frame.getContentPane().add(getBtnadd());
	}

	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMenucalc());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmNewMenuItem());
			mnFile.add(getSeparator());
			mnFile.add(getMntmNewMenuItem_1());
		}
		return mnFile;
	}
	private JMenu getMenucalc() {
		if (menucalc == null) {
			menucalc = new JMenu("Calc");
			menucalc.setHorizontalAlignment(SwingConstants.CENTER);
			menucalc.add(getCalcadd());
		}
		return menucalc;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Open");
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Exit");
		}
		return mntmNewMenuItem_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}
	private JMenuItem getCalcadd() {
		if (calcadd == null) {
			calcadd = new JMenuItem("Add");
			calcadd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
				}
			});
		}
		return calcadd;
	}
	private JTextField getTfnum1() {
		if (tfnum1 == null) {
			tfnum1 = new JTextField();
			tfnum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfnum1.setBounds(12, 39, 97, 21);
			tfnum1.setColumns(10);
		}
		return tfnum1;
	}
	private JTextField getTfnum2() {
		if (tfnum2 == null) {
			tfnum2 = new JTextField();
			tfnum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfnum2.setColumns(10);
			tfnum2.setBounds(12, 80, 97, 21);
		}
		return tfnum2;
	}
	private JTextField getTfresult() {
		if (tfresult == null) {
			tfresult = new JTextField();
			tfresult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfresult.setEditable(false);
			tfresult.setColumns(10);
			tfresult.setBounds(12, 147, 110, 21);
		}
		return tfresult;
	}
	private JButton getBtnadd() {
		if (btnadd == null) {
			btnadd = new JButton("Add");
			btnadd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
				}
			});
			btnadd.setBounds(144, 146, 97, 23);
		}
		return btnadd;
	}
	
	private void addAction() {
		int num1 = Integer.parseInt(tfnum1.getText().toString());
		int num2 = Integer.parseInt(tfnum2.getText().toString());
		tfresult.setText(Integer.toString(num1+num2));
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
}//============
