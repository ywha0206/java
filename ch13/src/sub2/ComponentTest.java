package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtPlus1;
	private JTextField txtPlus2;
	private JTextField txtPlusResult;
	private JTextField txtMinus1;
	private JTextField txtMinus2;
	private JTextField txtMinusResult;
	private JTextField txtMulti1;
	private JTextField txtMulti2;
	private JTextField txtMultiResult;
	private JTextField txtDivide1;
	private JTextField txtDivide2;
	private JTextField txtDivideResult;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 787);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 76, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 32, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인1 버튼 클릭...");
			}
		});
		btn1.setBounds(12, 53, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼 2 클릭...");
			}
		});
		btn2.setBounds(121, 53, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("Yes click!");
				}else {
					System.out.println("No click!");
				}
				
			}
		});
		btn3.setBounds(230, 53, 97, 23);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_1_1 = new JLabel("텍스트필드 실습");
		lblNewLabel_1_1.setBounds(12, 86, 97, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 111, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(54, 108, 116, 21);
		contentPane.add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lbResultUid = new JLabel("결과 : ");
		lbResultUid.setBounds(261, 111, 161, 15);
		contentPane.add(lbResultUid);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbResultUid.setText("결과 : " + uid);
				
				
				
			}
		});
		btnUid.setBounds(176, 107, 73, 23);
		contentPane.add(btnUid);
		
		
		
		JLabel lblNewLabel_2_2 = new JLabel("이름");
		lblNewLabel_2_2.setBounds(12, 140, 57, 15);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lbResultName = new JLabel("결과 : ");
		lbResultName.setBounds(261, 140, 161, 15);
		contentPane.add(lbResultName);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String name = txtName.getText();
				lbResultName.setText("결과 : " + name);
				
				
				
				
			}
		});
		btnName.setBounds(176, 136, 73, 23);
		contentPane.add(btnName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(54, 137, 116, 21);
		contentPane.add(txtName);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("휴대폰");
		lblNewLabel_2_2_1.setBounds(12, 169, 57, 15);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lbResultHp = new JLabel("결과 : ");
		lbResultHp.setBounds(261, 169, 161, 15);
		contentPane.add(lbResultHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txtHp.getText();
				lbResultHp.setText("결과 : " + hp);
				
			}
		});
		btnHp.setBounds(176, 165, 73, 23);
		contentPane.add(btnHp);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(54, 166, 116, 21);
		contentPane.add(txtHp);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("덧셈");
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1.setBounds(16, 214, 42, 15);
		contentPane.add(lblNewLabel_2_2_1_1);
		
		txtPlus1 = new JTextField();
		txtPlus1.setColumns(10);
		txtPlus1.setBounds(74, 211, 55, 21);
		contentPane.add(txtPlus1);
		
		txtPlus2 = new JTextField();
		txtPlus2.setColumns(10);
		txtPlus2.setBounds(181, 211, 55, 21);
		contentPane.add(txtPlus2);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("+");
		lblNewLabel_2_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1.setBounds(145, 214, 20, 15);
		contentPane.add(lblNewLabel_2_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1_1.setBounds(252, 214, 20, 15);
		contentPane.add(lblNewLabel_2_2_1_1_1_1);
		
		txtPlusResult = new JTextField();
		txtPlusResult.setColumns(10);
		txtPlusResult.setBounds(288, 211, 55, 21);
		contentPane.add(txtPlusResult);
		
		JButton btnPlus = new JButton("확인");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String strNum1 = txtPlus1.getText();
				String strNum2 = txtPlus2.getText();
				
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				int num3 = num1 + num2;
				
				txtPlusResult.setText(""+num3);
				
			
			}
		});
		btnPlus.setBounds(355, 210, 67, 23);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("확인");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String strMinNum1 = txtMinus1.getText();
				String strMinNum2 = txtMinus2.getText();
				
				int minnum1 = Integer.parseInt(strMinNum1);
				int minnum2 = Integer.parseInt(strMinNum2);
				int minnum3 = minnum1 - minnum2;
				
				txtMinusResult.setText(""+minnum3);
			
			
			}
		});
		btnMinus.setBounds(355, 239, 67, 23);
		contentPane.add(btnMinus);
		
		JLabel lblNewLabel_2_2_1_1_2 = new JLabel("뺄셈");
		lblNewLabel_2_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_2.setBounds(16, 243, 42, 15);
		contentPane.add(lblNewLabel_2_2_1_1_2);
		
		txtMinus1 = new JTextField();
		txtMinus1.setColumns(10);
		txtMinus1.setBounds(74, 240, 55, 21);
		contentPane.add(txtMinus1);
		
		JLabel lblNewLabel_2_2_1_1_1_2 = new JLabel("-");
		lblNewLabel_2_2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1_2.setBounds(145, 243, 20, 15);
		contentPane.add(lblNewLabel_2_2_1_1_1_2);
		
		txtMinus2 = new JTextField();
		txtMinus2.setColumns(10);
		txtMinus2.setBounds(181, 240, 55, 21);
		contentPane.add(txtMinus2);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1_1_1.setBounds(252, 243, 20, 15);
		contentPane.add(lblNewLabel_2_2_1_1_1_1_1);
		
		txtMinusResult = new JTextField();
		txtMinusResult.setColumns(10);
		txtMinusResult.setBounds(288, 240, 55, 21);
		contentPane.add(txtMinusResult);
		
		JButton btnMulti = new JButton("확인");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String strMulNum1 = txtMulti1.getText();
				String strMulNum2 = txtMulti2.getText();
				
				int mulNum1 = Integer.parseInt(strMulNum1);
				int mulNum2 = Integer.parseInt(strMulNum2);
				int mulNum3 = mulNum1 * mulNum2;
				
				txtMultiResult.setText(""+mulNum3);
			
			
			}
		});
		btnMulti.setBounds(355, 272, 67, 23);
		contentPane.add(btnMulti);
		
		JLabel lblNewLabel_2_2_1_1_2_1 = new JLabel("곱셈");
		lblNewLabel_2_2_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_2_1.setBounds(16, 276, 42, 15);
		contentPane.add(lblNewLabel_2_2_1_1_2_1);
		
		txtMulti1 = new JTextField();
		txtMulti1.setColumns(10);
		txtMulti1.setBounds(74, 273, 55, 21);
		contentPane.add(txtMulti1);
		
		JLabel lblNewLabel_2_2_1_1_1_2_1 = new JLabel("x");
		lblNewLabel_2_2_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1_2_1.setBounds(145, 276, 20, 15);
		contentPane.add(lblNewLabel_2_2_1_1_1_2_1);
		
		txtMulti2 = new JTextField();
		txtMulti2.setColumns(10);
		txtMulti2.setBounds(181, 273, 55, 21);
		contentPane.add(txtMulti2);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_2_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1_1_1_1.setBounds(252, 276, 20, 15);
		contentPane.add(lblNewLabel_2_2_1_1_1_1_1_1);
		
		txtMultiResult = new JTextField();
		txtMultiResult.setColumns(10);
		txtMultiResult.setBounds(288, 273, 55, 21);
		contentPane.add(txtMultiResult);
		
		JButton btnDivide = new JButton("확인");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strDivNum1 = txtDivide1.getText();
				String strDivNum2 = txtDivide2.getText();
				
				int DivNum1 = Integer.parseInt(strDivNum1);
				int DivNum2 = Integer.parseInt(strDivNum2);
				int DivNum3 = DivNum1 / DivNum2;
				
				txtDivideResult.setText(""+DivNum3);
				
			}
		});
		btnDivide.setBounds(355, 305, 67, 23);
		contentPane.add(btnDivide);
		
		JLabel lblNewLabel_2_2_1_1_2_1_1 = new JLabel("나눗셈");
		lblNewLabel_2_2_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_2_1_1.setBounds(16, 309, 42, 15);
		contentPane.add(lblNewLabel_2_2_1_1_2_1_1);
		
		txtDivide1 = new JTextField();
		txtDivide1.setColumns(10);
		txtDivide1.setBounds(74, 306, 55, 21);
		contentPane.add(txtDivide1);
		
		JLabel lblNewLabel_2_2_1_1_1_2_1_1 = new JLabel("/");
		lblNewLabel_2_2_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1_2_1_1.setBounds(145, 309, 20, 15);
		contentPane.add(lblNewLabel_2_2_1_1_1_2_1_1);
		
		txtDivide2 = new JTextField();
		txtDivide2.setColumns(10);
		txtDivide2.setBounds(181, 306, 55, 21);
		contentPane.add(txtDivide2);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_2_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1_1_1_1_1.setBounds(252, 309, 20, 15);
		contentPane.add(lblNewLabel_2_2_1_1_1_1_1_1_1);
		
		txtDivideResult = new JTextField();
		txtDivideResult.setColumns(10);
		txtDivideResult.setBounds(288, 306, 55, 21);
		contentPane.add(txtDivideResult);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("체크박스 실습");
		lblNewLabel_1_1_1.setBounds(16, 354, 97, 15);
		contentPane.add(lblNewLabel_1_1_1);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(13, 377, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대구");
		chk2.setBounds(83, 377, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대전");
		chk3.setBounds(153, 377, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(223, 377, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(293, 377, 57, 23);
		contentPane.add(chk5);
		
		JLabel lbResultCheck = new JLabel("결과 : ");
		lbResultCheck.setBounds(16, 411, 406, 15);
		contentPane.add(lbResultCheck);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbResultCheck.setText("결과 : " + cities);
				
			}
		});
		btnCheck.setBounds(359, 377, 63, 23);
		contentPane.add(btnCheck);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("테이블 실습");
		lblNewLabel_1_1_1_1.setBounds(12, 436, 97, 15);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		table = new JTable();
		table.setBounds(22, 462, 387, 125);
		contentPane.add(table);
		
		//테이블 설정 코딩으로 설정해주어야함
				String[] columnNames = {"아이디","이름","나이","휴대폰"};

				DefaultTableModel model = new DefaultTableModel(columnNames,0);
				model.setRowCount(0);
				table.setModel(model);
				
		
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101", "김유신",23 , "010-1234-1001"));
				persons.add(new Person("a102", "김춘추",32 , "010-1234-1002"));
				persons.add(new Person("a103", "장보고",48 , "010-1234-1003"));
				persons.add(new Person("a104", "강감찬",56 , "010-1234-1004"));
				persons.add(new Person("a105", "이순신",24 , "010-1234-1005"));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(), person.getName(), person.getAge(), person.getHp()};
					model.addRow(rowData);
					
				}
			}
		});
		btnTable.setBounds(16, 597, 97, 23);
		contentPane.add(btnTable);
		
		
		
	}
}
