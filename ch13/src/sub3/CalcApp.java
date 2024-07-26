package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCalcResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
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
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 269, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCalcResult = new JTextField();
		txtCalcResult.setEditable(false);
		txtCalcResult.setFont(new Font("맑은 고딕", Font.PLAIN, 32));
		txtCalcResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCalcResult.setText("0");
		txtCalcResult.setBounds(12, 10, 232, 56);
		contentPane.add(txtCalcResult);
		txtCalcResult.setColumns(10);
		

		
		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(195, 93, 49, 46);
		contentPane.add(btnDivide);
		
		JButton btnMulti = new JButton("x");
		btnMulti.setBounds(195, 149, 49, 46);
		contentPane.add(btnMulti);
		
		
		
		
		
		
		
		
		
		JButton btnNum1 = new JButton("1");
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String currentText = txtCalcResult.getText();
				String strNum1 = btnNum1.getText();
				
				
				if(currentText.equals("0")) {
					txtCalcResult.setText(strNum1);
				}else {
					txtCalcResult.setText(currentText+strNum1);
				}
				
			}
		});
		btnNum1.setBounds(12, 205, 49, 46);
		contentPane.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String currentText = txtCalcResult.getText();
				String strNum2 = btnNum2.getText();
				
				if(currentText.equals("0")) {
					txtCalcResult.setText(strNum2);
				}else {
					txtCalcResult.setText(currentText+strNum2);
				}
			}
		});
		btnNum2.setBounds(73, 205, 49, 46);
		contentPane.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strNum3 = btnNum3.getText();
				int num3 = Integer.parseInt(strNum3);
				
				txtCalcResult.setText(num+strNum3);
			}
		});
		btnNum3.setBounds(134, 205, 49, 46);
		contentPane.add(btnNum3);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum4 = btnNum4.getText();
				int num4 = Integer.parseInt(strNum4);
				
				txtCalcResult.setText(num+strNum4);
				
			}
		});
		btnNum4.setBounds(12, 149, 49, 46);
		contentPane.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum5 = btnNum5.getText();
				int num5 = Integer.parseInt(strNum5);
				
				txtCalcResult.setText(num+strNum5);
				
			}
		});
		btnNum5.setBounds(73, 149, 49, 46);
		contentPane.add(btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum6 = btnNum6.getText();
				int num6 = Integer.parseInt(strNum6);
				
				txtCalcResult.setText(num+strNum6);
			}
		});
		btnNum6.setBounds(134, 149, 49, 46);
		contentPane.add(btnNum6);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum7 = btnNum7.getText();
				int num7 = Integer.parseInt(strNum7);
				
				txtCalcResult.setText(num+strNum7);
			}
		});
		btnNum7.setBounds(12, 93, 49, 46);
		contentPane.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum8 = btnNum8.getText();
				//int num8 = Integer.parseInt(strNum8);
				
				txtCalcResult.setText(num+strNum8);
			}
		});
		btnNum8.setBounds(73, 93, 49, 46);
		contentPane.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum9 = btnNum9.getText();
				//int num9 = Integer.parseInt(strNum9);
				
				txtCalcResult.setText(num+strNum9);
			}
		});
		btnNum9.setBounds(134, 93, 49, 46);
		contentPane.add(btnNum9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(195, 205, 49, 46);
		contentPane.add(btnMinus);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(12, 261, 49, 46);
		contentPane.add(btnC);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String strNum0 = btnNum0.getText();
				int num0 = Integer.parseInt(strNum0);
				
				txtCalcResult.setText(strNum0);
				
			}
		});
		btnNum0.setBounds(73, 261, 49, 46);
		contentPane.add(btnNum0);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(134, 261, 49, 46);
		contentPane.add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(195, 261, 49, 46);
		contentPane.add(btnPlus);
	}

}
