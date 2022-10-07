package Ejercicios10;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Ejercicio9 {

	private JFrame frame;
	private JSpinner spiValor;
	private JLabel etiValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio9 window = new Ejercicio9();
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
	public Ejercicio9() {
		initialize();
		spiValor.setValue(4);
		SpinnerNumberModel nm = new SpinnerNumberModel();
		nm.setMaximum(10);
		nm.setMinimum(0);
		nm.setStepSize(2);
		spiValor.setModel(nm);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 268, 160);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.png")));
		frame.setTitle("EJERCICIO 9");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		spiValor = new JSpinner();
		spiValor.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				etiValor.setText("El valor es: "+spiValor.getValue().toString());
			}
		});
		spiValor.setBounds(25, 29, 70, 20);
		frame.getContentPane().add(spiValor);
		
		etiValor = new JLabel("");
		etiValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiValor.setBounds(25, 60, 127, 32);
		frame.getContentPane().add(etiValor);
	}
}
