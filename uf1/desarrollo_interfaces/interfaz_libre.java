package desarrollo_interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class interfaz_libre {

	private JFrame frame;
	private JTextField textField;
	private Timer temporizador;
	private JLabel lblNewLabel;
	private JSlider slider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz_libre window = new interfaz_libre();
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
	public interfaz_libre() {
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
		frame.setTitle("Reloj digital - Temperatura");
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(64, 11, 344, 48);
		frame.getContentPane().add(lblNewLabel);
		
		slider = new JSlider(0, 50);
		slider.setBounds(38, 80, 354, 48);
		frame.getContentPane().add(slider);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
				textField.setText(slider.getValue() + "º");
				
			}
			
		});
		
		JLabel lblNewLabel_1 = new JLabel("Temperatura: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(48, 151, 165, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new EventoBoton());
		btnNewButton.setBounds(67, 219, 106, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Parar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new EventoBoton());
		btnNewButton_1.setBounds(252, 219, 110, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setText("25\u00BA");
		textField.setBounds(223, 151, 75, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setBorder(null);
		
		temporizador = new Timer(1000, new EventoReloj());
		temporizador.start();
	}
	
	private class EventoReloj implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			Calendar fecha = Calendar.getInstance();
			
			Date fecha_actual = fecha.getTime();
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy    HH:mm:ss");
			
			String visualiza = formato.format(fecha_actual);
			
			lblNewLabel.setText(visualiza);
			
			temporizador.start();
			
		}
		
	}
	
	private class EventoBoton implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand()=="Iniciar") {
				
				temporizador.start();
				
				if(slider.isVisible()==false) {
					slider.setVisible(true);
				}
				
			}else {
				
				if(temporizador!=null) {
					
					temporizador.stop();
					slider.setVisible(false);
					
				}
				
			}
			
		}
		
	}

	
	
}