package desarrollo_interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class interfaz_funcional_ejer2{

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz_funcional_ejer2 window = new interfaz_funcional_ejer2();
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
	public interfaz_funcional_ejer2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel.setBounds(39, 36, 75, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Arosa", "Ibiza", "Leon"}));
		comboBox.setBounds(150, 31, 195, 35);
		frame.getContentPane().add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Como nuevo");
		rdbtnNewRadioButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(39, 142, 123, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nuevo");
		rdbtnNewRadioButton_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		rdbtnNewRadioButton_1.setBounds(39, 168, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Alg\u00FAn desperfecto");
		rdbtnNewRadioButton_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		rdbtnNewRadioButton_2.setBounds(39, 194, 157, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		ButtonGroup grupo_radio = new ButtonGroup();
		grupo_radio.add(rdbtnNewRadioButton);
		grupo_radio.add(rdbtnNewRadioButton_1);
		grupo_radio.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Kilometros:");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(55, 289, 91, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSlider slider = new JSlider(0, 50000);
		slider.setBounds(39, 343, 470, 44);
		slider.setValue(0);
		slider.setMajorTickSpacing(5000);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		frame.getContentPane().add(slider);
		slider.addChangeListener(new ChangeListener() {

			public void stateChanged(ChangeEvent arg0) {
				
				textField.setText("" + slider.getValue());
				
			}
								
		});
		
		JLabel lblNewLabel_2 = new JLabel("KM:");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(218, 417, 41, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton.setBounds(407, 474, 102, 44);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setBounds(257, 417, 75, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setBorder(null);
		
		btnNewButton.addActionListener(new EventoBtn());
		
	}
	
	class EventoBtn implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			frame.dispose();
			
		}
		
	}
	
}


