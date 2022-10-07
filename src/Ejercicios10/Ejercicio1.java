package Ejercicios10;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 {

	private JFrame frame;
	private JCheckBox chkPerro;
	private JCheckBox chkGato;
	private JCheckBox chkRaton;
	private JButton lblAceptar;
	private JLabel etiResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 window = new Ejercicio1();
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
	public Ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 424, 295);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.png")));
		frame.setTitle("EJERCICIO 1");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblAceptar = new JButton("Aceptar");
		lblAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Animales elegidos: ";
				if (chkPerro.isSelected()) {
				mensaje=mensaje+"Perro ";
				}
				if (chkGato.isSelected()) {
				mensaje=mensaje+"Gato ";
				}
				if (chkRaton.isSelected()) {
				mensaje=mensaje+"Raton ";
				}
				etiResultado.setText(mensaje);
			}
		});
		lblAceptar.setBounds(16, 128, 117, 29);
		frame.getContentPane().add(lblAceptar);
		
		etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(16, 180, 375, 47);
		frame.getContentPane().add(etiResultado);
		
		chkPerro = new JCheckBox("Perro");
		chkPerro.setBounds(16, 30, 97, 23);
		frame.getContentPane().add(chkPerro);
		
		chkGato = new JCheckBox("Gato");
		chkGato.setBounds(16, 56, 97, 23);
		frame.getContentPane().add(chkGato);
		
		chkRaton = new JCheckBox("Ratón");
		chkRaton.setBounds(16, 83, 97, 23);
		frame.getContentPane().add(chkRaton);
	}
}
