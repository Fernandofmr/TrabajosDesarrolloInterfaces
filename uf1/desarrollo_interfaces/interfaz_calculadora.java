package desarrollo_interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interfaz_calculadora {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz_calculadora window = new interfaz_calculadora();
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
	public interfaz_calculadora() {
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
		
		JLabel lblNewLabel = new JLabel("N\u00BA 1");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel.setBounds(52, 29, 80, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00BA 2");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(52, 80, 80, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 181, 93, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField.setBounds(133, 34, 102, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField_1.setBounds(133, 85, 102, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setHorizontalAlignment(JTextField.RIGHT);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField_2.setBounds(133, 181, 102, 31);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setHorizontalAlignment(JTextField.RIGHT);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				
					float num1 = Integer.parseInt(textField.getText());
					float num2 = Integer.parseInt(textField_1.getText());
					
					String total = "" + (num1 + num2);
					
					textField_2.setText(total);
				
				}catch(NumberFormatException e) {
					
					System.out.println("Debes introducir números en los campos");
					
				}
				
			}
		});
		btnNewButton.setBounds(276, 34, 55, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					float num1 = Integer.parseInt(textField.getText());
					float num2 = Integer.parseInt(textField_1.getText());
					
					String total = "" + (num1 - num2);
					
					textField_2.setText(total);
				
				}catch(NumberFormatException e) {
					
					System.out.println("Debes introducir números en los campos");
					
				}
				
			}
		});
		btnNewButton_1.setBounds(355, 34, 55, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					float num1 = Integer.parseInt(textField.getText());
					float num2 = Integer.parseInt(textField_1.getText());
					
					String total = "" + (num1 * num2);
					
					textField_2.setText(total);
				
				}catch(NumberFormatException e) {
					
					System.out.println("Debes introducir números en los campos");
					
				}
				
			}
		});
		btnNewButton_2.setBounds(276, 85, 55, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					float num1 = Integer.parseInt(textField.getText());
					float num2 = Integer.parseInt(textField_1.getText());
					
					String total = "" + (num1 / num2);
					
					textField_2.setText(total);
				
				}catch(NumberFormatException e) {
					
					System.out.println("Debes introducir números en los campos");
					
				}
				
			}
		});
		btnNewButton_3.setBounds(355, 85, 55, 30);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Borrar");
		btnNewButton_4.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
				textField_1.setText(null);				
				textField_2.setText(null);
				
			}
		});
		btnNewButton_4.setBounds(276, 181, 134, 33);
		frame.getContentPane().add(btnNewButton_4);
		
		
	}

}


