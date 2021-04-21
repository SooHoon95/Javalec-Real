package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserQuery {

	private JFrame frame;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnSelection;
	private JScrollPane scrollPane;
	private JTable inner_table;
	private JLabel lblNewLabel;
	private JTextField tfseqno;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tfName;
	private JTextField tftelno;
	private JTextField tfaddress;
	private JTextField tfemail;
	private JTextField tfrelation;

	
	//데이터 환경정의  
	
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	
	//Table 환경 정의 
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	private JTextField tfdataCount;
	private JLabel lblNewLabel_6;
	private JButton btnrevise;
	private JButton btnDeletd;
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserQuery window = new UserQuery();
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
	public UserQuery() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("주소록검색");
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {		// 어플 오픈되자마자 데이터 불러오는 액션 전체 프래임의 이벤트 >> 윈도우 오픈
				tableInit();
				searchAction();
				
			}
		});
		frame.setBounds(100, 100, 478, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getBtnSelection());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfseqno());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getTftelno());
		frame.getContentPane().add(getTfaddress());
		frame.getContentPane().add(getTfemail());
		frame.getContentPane().add(getTfrelation());
		frame.getContentPane().add(getTfdataCount());
		frame.getContentPane().add(getLblNewLabel_6());
		frame.getContentPane().add(getBtnrevise());
		frame.getContentPane().add(getBtnDeletd());
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "번호", "관계"}));
			cbSelection.setBounds(23, 32, 78, 27);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(113, 31, 236, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnSelection() {
		if (btnSelection == null) {
			btnSelection = new JButton("검색");
			btnSelection.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQuery();
					
				}
			});
			btnSelection.setBounds(356, 31, 78, 29);
		}
		return btnSelection;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(33, 71, 390, 118);
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
			inner_table.setModel(Outer_Table); 	//*************	// outer_table 있어야 바깥쪽 테이블과 안쪽테이블이 같이 움직인다.(동일화?)
			
			
		}
		return inner_table;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Seq No : ");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(23, 216, 78, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfseqno() {
		if (tfseqno == null) {
			tfseqno = new JTextField();
			tfseqno.setBounds(113, 211, 35, 26);
			tfseqno.setColumns(10);
		}
		return tfseqno;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(23, 254, 78, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(23, 294, 78, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(23, 335, 78, 16);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(23, 375, 78, 16);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계");
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(23, 412, 78, 16);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(113, 249, 85, 26);
		}
		return tfName;
	}
	private JTextField getTftelno() {
		if (tftelno == null) {
			tftelno = new JTextField();
			tftelno.setColumns(10);
			tftelno.setBounds(113, 289, 167, 26);
		}
		return tftelno;
	}
	private JTextField getTfaddress() {
		if (tfaddress == null) {
			tfaddress = new JTextField();
			tfaddress.setColumns(10);
			tfaddress.setBounds(113, 330, 321, 26);
		}
		return tfaddress;
	}
	private JTextField getTfemail() {
		if (tfemail == null) {
			tfemail = new JTextField();
			tfemail.setColumns(10);
			tfemail.setBounds(113, 370, 236, 26);
		}
		return tfemail;
	}
	private JTextField getTfrelation() {
		if (tfrelation == null) {
			tfrelation = new JTextField();
			tfrelation.setColumns(10);
			tfrelation.setBounds(113, 407, 321, 26);
		}
		return tfrelation;
	}
	
	private JTextField getTfdataCount() {
		if (tfdataCount == null) {
			tfdataCount = new JTextField();
			tfdataCount.setEditable(false);
			tfdataCount.setBounds(347, 211, 45, 26);
			tfdataCount.setColumns(10);
		}
		return tfdataCount;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("명");
			lblNewLabel_6.setBounds(404, 216, 17, 16);
		}
		return lblNewLabel_6;
	}
	

	
	
	// Table (화면 Table 초기화 ) 
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
	
	
	private void searchAction() {
		
		String query = "select seqno, name, telno, relation from userinfo ";
		int dataCount = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query);
			
			while(rs.next()) {
				
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)};
				Outer_Table.addRow(qTxt);
				dataCount++;
			}
			
			conn_mysql.close();
			tfdataCount.setText(Integer.toString(dataCount));
			
			} catch (Exception e) {
				e.printStackTrace();
		}
		
	}
	
	//Table Clicked 
	
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
	private JButton getBtnrevise() {
		if (btnrevise == null) {
			btnrevise = new JButton("수정");
			btnrevise.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reviseAction();
				}
			});
			btnrevise.setBounds(224, 447, 97, 23);
		}
		return btnrevise;
	}
	private JButton getBtnDeletd() {
		if (btnDeletd == null) {
			btnDeletd = new JButton("삭제");
			btnDeletd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DelAction();
				}
			});
			btnDeletd.setBounds(347, 447, 97, 23);
		}
		return btnDeletd;
	}
	
	
	
	
//	// 조건검색
	
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
				tfdataCount.setText("");
	
	}
	
			
			private void conditionQueryAction (String columnName) {
				String query1 = "select seqno, name, telno, relation from userinfo where " + columnName;
				String query2 = " like '%" + tfSelection.getText() + "%'";
				System.out.println(query1 + query2);
				
					int dataCount = 0;
					try {
						PreparedStatement ps = null;
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
						Statement stmt_mysql = conn_mysql.createStatement();
						
						ResultSet rs = stmt_mysql.executeQuery(query1 + query2);	
						
						while (rs.next()) {
							String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
							Outer_Table.addRow(qTxt);
							dataCount++;
							tfdataCount.setText(Integer.toString(dataCount));
						}
					} catch (Exception e) {
						e.printStackTrace();
						// TODO: handle exception
					}
			}
			
			
			private void DelAction() {
				int i = inner_table.getSelectedRow();
				String query1 = "DELETE FROM userinfo where seqno=?";
				String query2 = "alter table userinfo auto_increment =1;set @count =0;update userinfo set seqno = @count:=@count+1";
				
				PreparedStatement ps = null;
				
				int dataCount = 0;
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
//					Statement stmt_mysql = conn_mysql.createStatement();
					
					ps = conn_mysql.prepareStatement(query1);
					ps = conn_mysql.prepareStatement(query2);
//					ps.setString(1,tfseqno.getText());
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
}//-------------
