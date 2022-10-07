package Ejercicios10;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio4 {

	private JFrame frame;
	private JLabel etiResultado;
	private JComboBox cboColores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 window = new Ejercicio4();
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
	public Ejercicio4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 424, 171);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.png")));
		frame.setTitle("EJERCICIO 4");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(10, 51, 377, 47);
		frame.getContentPane().add(etiResultado);
		
		cboColores = new JComboBox();
		cboColores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="El color elegido es ";
				mensaje=mensaje+cboColores.getSelectedItem().toString();
				etiResultado.setText(mensaje);
			}
		});
		cboColores.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "Verde", "Azul"}));
		cboColores.setBounds(10, 11, 138, 29);
		frame.getContentPane().add(cboColores);
	}
}
