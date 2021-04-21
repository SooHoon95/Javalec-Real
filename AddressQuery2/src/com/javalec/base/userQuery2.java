package com.javalec.base;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class userQuery2 {

	private JFrame frame;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnSearch;
	private JScrollPane scrollPane;
	private JTable inner_table;
	private JLabel lblNewLabel;
	private JLabel lblDlfma;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tfseqno;
	private JTextField tfName;
	private JTextField tftelno;
	private JTextField tfaddress;
	private JTextField tfemail;
	private JTextField tfrelation;
	private JButton btnok;
	private JRadioButton rdbinsert;
	private JRadioButton rdbrevise;
	private JRadioButton rdbdelete;
	private JRadioButton rdbsearch;

	//데이터 환경정의  
	
		private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
		private final String id_mysql = "root";
		private final String pw_mysql = "qwer1234";
	
	//Table 환경 정의 
		private final DefaultTableModel Outer_Table = new DefaultTableModel();
		private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userQuery2 window = new userQuery2();
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
	public userQuery2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				tableInit();
				searchAction();
			}
		});
		frame.setTitle("주소록관리");
		frame.setBounds(100, 100, 447, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getBtnSearch());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblDlfma());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getTfseqno());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getTftelno());
		frame.getContentPane().add(getTfaddress());
		frame.getContentPane().add(getTfemail());
		frame.getContentPane().add(getTfrelation());
		frame.getContentPane().add(getBtnok());
		frame.getContentPane().add(getRdbinsert());
		frame.getContentPane().add(getRdbrevise());
		frame.getContentPane().add(getRdbdelete());
		frame.getContentPane().add(getRdbsearch());
	}

	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "번호", "관계"}));
			cbSelection.setBounds(12, 65, 51, 25);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(75, 67, 271, 21);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("검색");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQuery();
				}
			});
			btnSearch.setBounds(358, 66, 64, 23);
		}
		return btnSearch;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 107, 409, 129);
			scrollPane.setViewportView(getInner_table());
		}
		return scrollPane;
	}
	private JTable getInner_table() {
		if (inner_table == null) {
			inner_table = new JTable();
			inner_table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tableClick();
				}
			});
			inner_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			inner_table.setModel(Outer_Table); //**********		// outer_table 있어야 바깥쪽 테이블과 안쪽테이블이 같이 움직인다.(동일화?)
		}
		return inner_table;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sequence No :");
			lblNewLabel.setBounds(12, 263, 95, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblDlfma() {
		if (lblDlfma == null) {
			lblDlfma = new JLabel("이름");
			lblDlfma.setBounds(12, 298, 57, 15);
		}
		return lblDlfma;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("번호");
			lblNewLabel_2.setBounds(12, 339, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소");
			lblNewLabel_3.setBounds(12, 377, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편주소");
			lblNewLabel_4.setBounds(12, 421, 77, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계");
			lblNewLabel_5.setBounds(12, 465, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfseqno() {
		if (tfseqno == null) {
			tfseqno = new JTextField();
			tfseqno.setBounds(119, 260, 40, 21);
			tfseqno.setColumns(10);
		}
		return tfseqno;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(119, 295, 89, 21);
		}
		return tfName;
	}
	private JTextField getTftelno() {
		if (tftelno == null) {
			tftelno = new JTextField();
			tftelno.setColumns(10);
			tftelno.setBounds(119, 336, 132, 21);
		}
		return tftelno;
	}
	private JTextField getTfaddress() {
		if (tfaddress == null) {
			tfaddress = new JTextField();
			tfaddress.setColumns(10);
			tfaddress.setBounds(119, 374, 265, 21);
		}
		return tfaddress;
	}
	private JTextField getTfemail() {
		if (tfemail == null) {
			tfemail = new JTextField();
			tfemail.setColumns(10);
			tfemail.setBounds(119, 418, 227, 21);
		}
		return tfemail;
	}
	private JTextField getTfrelation() {
		if (tfrelation == null) {
			tfrelation = new JTextField();
			tfrelation.setColumns(10);
			tfrelation.setBounds(119, 462, 116, 21);
		}
		return tfrelation;
	}
	private JButton getBtnok() {
		if (btnok == null) {
			btnok = new JButton("OK");
			btnok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnokActtion();
				}
			});
			btnok.setBounds(325, 486, 97, 23);
		}
		return btnok;
	}
	private JRadioButton getRdbinsert() {
		if (rdbinsert == null) {
			rdbinsert = new JRadioButton("입력");
			rdbinsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tableInit();
					searchAction();
					clearColumn();
					 editablefalse();
				}
			});
			buttonGroup.add(rdbinsert);
			rdbinsert.setBounds(8, 18, 64, 23);
		}
		return rdbinsert;
	}
	private JRadioButton getRdbrevise() {
		if (rdbrevise == null) {
			rdbrevise = new JRadioButton("수정");
			rdbrevise.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tableInit();
					searchAction();
					clearColumn();
					 editablefalse();
				}
			});
			buttonGroup.add(rdbrevise);
			rdbrevise.setBounds(75, 18, 64, 23);
		}
		return rdbrevise;
	}
	private JRadioButton getRdbdelete() {
		if (rdbdelete == null) {
			rdbdelete = new JRadioButton("삭제");
			rdbdelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tableInit();
					searchAction();
					clearColumn();
					editabletf();
				}
			});
			buttonGroup.add(rdbdelete);
			rdbdelete.setBounds(144, 18, 64, 23);
		}
		return rdbdelete;
	}
	private JRadioButton getRdbsearch() {
		if (rdbsearch == null) {
			rdbsearch = new JRadioButton("검색");
			rdbsearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tableInit();
					searchAction();
					clearColumn();
					editabletf();
				}
			});
			buttonGroup.add(rdbsearch);
			rdbsearch.setBounds(212, 18, 64, 23);
		}
		return rdbsearch;
	}
	
	
	//화면 초기화 ======================
	
	//========== 라디오 버튼 액션 
	
	private void btnokActtion() {
		
		if (rdbinsert.isSelected() == true) {
			 int j = insertFieldCheck();
			if(j==0) {
				insertAction();
			}
			tableInit();
			searchAction();
			clearColumn();
		}
		if (rdbrevise.isSelected() == true) {
			reviseAction();
			tableInit();
			searchAction();
			clearColumn();
		}
		if (rdbdelete.isSelected() == true) {
			editabletf();
			DelAction();
			tableInit();
			searchAction();
			clearColumn();
			editabletf();
			JOptionPane.showMessageDialog(null, "삭제되었습니다.");
		}if (rdbsearch.isSelected()== true) {
			conditionQuery();
			tableInit();
			searchAction();
			clearColumn();
			editabletf();
		}
		
	}
//	===========================================메소드
	private void tableInit() {
		Outer_Table.addColumn("Index");						// 아웃터 테이블에 항목 넣기
		Outer_Table.addColumn("Name");
		Outer_Table.addColumn("PhoneNumber");
		Outer_Table.addColumn("relation");
		Outer_Table.setColumnCount(4); //테이블에 보여줄 게 4개다 
		
		// 데이터가 혹시 화면에 있으면 지워준다. 프로그램 시작 
		
		int i = Outer_Table.getRowCount();
		for(int  j= 0; j<i; j++) {
			Outer_Table.removeRow(0);
		}
		
		inner_table.setAutoResizeMode(inner_table.AUTO_RESIZE_OFF);
		
		int vColIndex =0;
		TableColumn col = inner_table.getColumnModel().getColumn(vColIndex);
		int width = 30;
		col.setPreferredWidth(width);
		
		vColIndex =1;
		col = inner_table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex =2;
		col = inner_table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex =3;
		col = inner_table.getColumnModel().getColumn(vColIndex);
		width = 200;
		col.setPreferredWidth(width);
		
	}
	private void editabletf() {
		tfseqno.setEditable(false);
		tfName.setEditable(false);
		tftelno.setEditable(false);
		tfaddress.setEditable(false);
		tfemail.setEditable(false);
		tfrelation.setEditable(false);
	}
	
	private void editablefalse() {
		tfseqno.setEditable(true);
		tfName.setEditable(true);
		tftelno.setEditable(true);
		tfaddress.setEditable(true);
		tfemail.setEditable(true);
		tfrelation.setEditable(true);
	}

	//===============데이터불러와서 입력하기

	private void searchAction() {
		
		String query = "select seqno, name, telno, relation from userinfo ";
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query);
			
			while(rs.next()) {
				
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)};
				Outer_Table.addRow(qTxt);
			}
			
			conn_mysql.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	//============수정 메소드

	private void reviseAction() {
		int i = inner_table.getSelectedRow();
		String wkseq = (String) inner_table.getValueAt(i, 0);
		String query = "update userinfo set name=? , telno=? , address=? , email=? , relation = ? where seqno= " + wkseq; 
		
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
//				Statement stmt_mysql = conn_mysql.createStatement();
			
			ps = conn_mysql.prepareStatement(query);
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tftelno.getText().trim());
			ps.setString(3, tfaddress.getText().trim());
			ps.setString(4, tfemail.getText().trim());
			ps.setString(5, tfrelation.getText().trim());
			ps.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "수정되었습니다.");
			
			conn_mysql.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	//===========테이블 클릭
	private void tableClick() {
		int i = inner_table.getSelectedRow(); 
		String wkseq = (String) inner_table.getValueAt(i, 0);
		
		String query = "select seqno, name, telno,address, email, relation "
				+ "from userinfo where seqno =" +wkseq;	// mysql에서의 조건문
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query);
			
			while (rs.next()) {
				tfseqno.setText(rs.getString(1));
				tfName.setText(rs.getString(2));
				tftelno.setText(rs.getString(3));
				tfaddress.setText(rs.getString(4));
				tfemail.setText(rs.getString(5));
				tfrelation.setText(rs.getString(6));
				
			}
			
			
			
			conn_mysql.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//=============삭제 메소드
	private void DelAction() {
		int i = inner_table.getSelectedRow();
		String query1 = "DELETE FROM userinfo where seqno=?";
		String query2 = "alter table userinfo auto_increment =1;set @count =0;update userinfo set seqno = @count:=@count+1";
		
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
//				Statement stmt_mysql = conn_mysql.createStatement();
			
			ps = conn_mysql.prepareStatement(query1);
//			ps = conn_mysql.prepareStatement(query2);
			ps.setString(1,tfseqno.getText());
			ps.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "삭제되었습니다.");
			
			conn_mysql.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		tableInit();
		searchAction();
	}

	//=========== 조건검색

	private void conditionQuery() {
		int i = cbSelection.getSelectedIndex();
		String conditionQueryColumn = "";
		
		switch(i) {
		case 0 : 
			conditionQueryColumn = "name";
			break;
		case 1 :
			conditionQueryColumn = "telno";
			break;
		case 2 :
			conditionQueryColumn = "relation";
			break;
		default :
			break;
		}
		tableInit();
		clearColumn();
		conditionQueryAction(conditionQueryColumn);
	}

	private void clearColumn() {
		tfseqno.setText("");
		tfName.setText("");
		tftelno.setText("");
		tfaddress.setText("");
		tfemail.setText("");
		tfrelation.setText("");
		
	}


	private void conditionQueryAction (String columnName) {
		String query1 = "select seqno, name, telno, relation from userinfo where " + columnName;
		String query2 = " like '%" + tfSelection.getText() + "%'";
		System.out.println(query1 + query2);
		
		try {
			PreparedStatement ps = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query1 + query2);	
			
			while (rs.next()) {
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				Outer_Table.addRow(qTxt);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
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
			ps.setString(2, tftelno.getText().trim());
			ps.setString(3, tfaddress.getText().trim());
			ps.setString(4, tfemail.getText().trim());
			ps.setString(5, tfrelation.getText().trim());
			
			
			ps.executeUpdate();
			
			conn_mysql.close();
			
			
			JOptionPane.showMessageDialog(null, tfName.getText().trim() +"님의 정보가 입력되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	
private int insertFieldCheck() {
	String message = "";
	
	int i = 0; // 정상 값을 환경에 깔아주고 변수생길때만 i가 변하도록 해서 설정해주는 아이디어 
	if (tfName.getText().trim().length() == 0) {
		i++;
		message = "Name ";
	}
	if(tftelno.getText().trim().length() == 0) {
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
	if (i == 1) {
		JOptionPane.showMessageDialog(null, "check the" + message);
	}
	
	return i;
		

}
	
	
	
	
	
	
	
	
	
}//=========================
