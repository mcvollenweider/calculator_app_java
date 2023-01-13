package calculator_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 383, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 50));
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(10, 10, 349, 156);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setForeground(new Color(255, 255, 255));
		btnBackspace.setBackground(new Color(0, 0, 128));
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackspace.setBounds(1, 176, 93, 61);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setBackground(new Color(0, 0, 128));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(0, 236, 93, 61);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBackground(new Color(0, 0, 128));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(0, 297, 93, 61);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(new Color(0, 0, 128));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(0, 357, 93, 61);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setBackground(new Color(0, 0, 128));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(0, 417, 93, 61);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setBackground(new Color(0, 0, 128));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(92, 176, 93, 61);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setBackground(new Color(0, 0, 128));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(92, 236, 93, 61);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBackground(new Color(0, 0, 128));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(92, 297, 93, 61);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setBackground(new Color(0, 0, 128));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(92, 357, 93, 61);
		frame.getContentPane().add(btn2);
		
		JButton btn00 = new JButton("00");
		btn00.setForeground(new Color(255, 255, 255));
		btn00.setBackground(new Color(0, 0, 128));
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(184, 176, 93, 61);
		frame.getContentPane().add(btn00);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBackground(new Color(0, 0, 128));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(184, 297, 93, 61);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(0, 0, 128));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(184, 357, 93, 61);
		frame.getContentPane().add(btn3);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBackground(new Color(0, 0, 128));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(184, 236, 93, 61);
		frame.getContentPane().add(btn9);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setForeground(new Color(255, 255, 255));
		btnDot.setBackground(new Color(0, 0, 128));
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(92, 417, 93, 61);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first+second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if(operation == "-") {
					result = first-second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if(operation == "*") {
					result = first*second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if(operation == "/") {
					result = first/second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation == "%") {
					result = first%second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setForeground(new Color(255, 255, 255));
		btnEqual.setBackground(new Color(0, 0, 128));
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(184, 417, 93, 61);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
				
			}
		});
		btnPercent.setForeground(new Color(255, 255, 255));
		btnPercent.setBackground(new Color(0, 0, 128));
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(276, 417, 93, 61);
		frame.getContentPane().add(btnPercent);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
				
			}
		});
		btnDivide.setForeground(new Color(255, 255, 255));
		btnDivide.setBackground(new Color(0, 0, 128));
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(276, 357, 93, 61);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				
			}
		});
		btnMulti.setForeground(new Color(255, 255, 255));
		btnMulti.setBackground(new Color(0, 0, 128));
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMulti.setBounds(276, 297, 93, 61);
		frame.getContentPane().add(btnMulti);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
				
			}
		});
		btnSub.setForeground(new Color(255, 255, 255));
		btnSub.setBackground(new Color(0, 0, 128));
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(276, 236, 93, 61);
		frame.getContentPane().add(btnSub);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnPlus.setForeground(new Color(255, 255, 255));
		btnPlus.setBackground(new Color(0, 0, 128));
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(276, 176, 93, 61);
		frame.getContentPane().add(btnPlus);
	}
}
