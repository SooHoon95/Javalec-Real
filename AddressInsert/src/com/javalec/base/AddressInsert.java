package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddressInsert {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfName;
	private JButton btnNewButton;

	//Database 환경정의 
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField tftel;
	private JTextField tfaddress;
	private JTextField tfemail;
	private JTextField tfrelation;
	String str ="";
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressInsert window = new AddressInsert();
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
	public AddressInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("주소록등록");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getBtnNewButton());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getTftel());
		frame.getContentPane().add(getTfaddress());
		frame.getContentPane().add(getTfemail());
		frame.getContentPane().add(getTfrelation());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("성명 :");
			lblNewLabel.setBounds(19, 32, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(92, 27, 130, 26);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("입력");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					check();
					int j = insertFieldCheck();
					if (j==0) {
						insertAction();
					}
			
				}
			});
			btnNewButton.setBounds(327, 237, 117, 29);
		}
		return btnNewButton;
	}
	
	
	
	
	
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("전화번호 :");
			lblNewLabel_1.setBounds(19, 69, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("주소 :");
			lblNewLabel_2.setBounds(19, 108, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("전자우편 :");
			lblNewLabel_3.setBounds(19, 145, 61, 16);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("관계 :");
			lblNewLabel_4.setBounds(19, 185, 61, 16);
		}
		return lblNewLabel_4;
	}
	private JTextField getTftel() {
		if (tftel == null) {
			tftel = new JTextField();
			tftel.setColumns(10);
			tftel.setBounds(92, 64, 130, 26);
		}
		return tftel;
	}
	private JTextField getTfaddress() {
		if (tfaddress == null) {
			tfaddress = new JTextField();
			tfaddress.setColumns(10);
			tfaddress.setBounds(92, 103, 130, 26);
		}
		return tfaddress;
	}
	private JTextField getTfemail() {
		if (tfemail == null) {
			tfemail = new JTextField();
			tfemail.setColumns(10);
			tfemail.setBounds(92, 140, 130, 26);
		}
		return tfemail;
	}
	private JTextField getTfrelation() {
		if (tfrelation == null) {
			tfrelation = new JTextField();
			tfrelation.setColumns(10);
			tfrelation.setBounds(92, 180, 130, 26);
		}
		return tfrelation;
	}
	
	
	
	
	private void insertAction() { //사용자 정보입력
		
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			
			String query = "insert into userinfo (name,telno,address,email,relation) values (?,?,?,?,?)"; // insert 에 컬럼 이름들을 넣는다. 그리고 ?로 컬럼갯수만큼 데이터 넣기 
			
			ps = conn_mysql.prepareStatement(query);
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tftel.getText().trim());
			ps.setString(3, tfaddress.getText().trim());
			ps.setString(4, tfemail.getText().trim());
			ps.setString(5, tfrelation.getText().trim());
			
			
			ps.executeUpdate();
			
			conn_mysql.close();
			
			
			JOptionPane.showMessageDialog(null, "님의 정보가 입력되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	private void check() {
		 
		if ( tfName.getText().trim().equals("")) {
			str = "이름";
			tfName.requestFocus();
		}else if ( tftel.getText().trim().equals("")) {
			str = "전화번호";
			tftel.requestFocus();
		}else if ( tfaddress.getText().trim().equals("")) {
			str = "주소 란";
			tfaddress.requestFocus();
		}else if ( tfemail.getText().trim().equals("")){
			str = "전자우편";
			tfemail.requestFocus();
		}else if ( tfrelation.getText().trim().equals("")) {
			str = "관계 빈칸";
			tfrelation.requestFocus();
		}else insertAction();
		
		JOptionPane.showMessageDialog(null, str + "을 입력하세요 !");
	
	}
	
	
	// 강사님 방법>> 이렇게 하면 전체 체크값이 필
	
	private int insertFieldCheck() {
		String message = "";
		
		int i = 0; // 정상 값을 환경에 깔아주고 변수생길때만 i가 변하도록 해서 설정해주는 아이디어 
		if (tfName.getText().trim().length() == 0) {
			i++;
			message = "Name ";
			message = "please check the blank of " + message;
		}
		if(tftel.getText().trim().length() == 0) {
			i++;
			
			message = message + "PhoneNumber ";
		}
		if (tfaddress.getText().trim().length() == 0) {
			i++;
			message = message + "address";
		}
		if(tfemail.getText().trim().length() == 0) {
			i++;
			message = message + "Email ";
		}
		if (tfrelation.getText().trim().length() == 0) {
			i++;
			message = message + "relation ";
		}
		//		}else if 
		JOptionPane.showMessageDialog(null, message + ".");
//		if (i==0) {
//			insertAction();
//		}
		
		return i;
			
		
	}
	
	
	
	
	
}//-----

