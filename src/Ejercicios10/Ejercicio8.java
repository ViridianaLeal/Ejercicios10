package Ejercicios10;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SwingConstants;

public class Ejercicio8 {

	private JFrame frame;
	private JLabel etiValor;
	private JSlider slDeslizador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio8 window = new Ejercicio8();
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
	public Ejercicio8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 329, 367);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.png")));
		frame.setTitle("EJERCICIO 8");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		etiValor = new JLabel("");
		etiValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiValor.setBounds(94, 30, 203, 58);
		frame.getContentPane().add(etiValor);
		
		slDeslizador = new JSlider();
		slDeslizador.setPaintTrack(false);
		slDeslizador.setSnapToTicks(true);
		slDeslizador.setOrientation(SwingConstants.VERTICAL);
		slDeslizador.setMinorTickSpacing(10);
		slDeslizador.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				etiValor.setText("El valor es: "+slDeslizador.getValue());
			}
		});
		slDeslizador.setPaintLabels(true);
		slDeslizador.setPaintTicks(true);
		slDeslizador.setMajorTickSpacing(50);
		slDeslizador.setValue(400);
		slDeslizador.setMinimum(100);
		slDeslizador.setMaximum(500);
		slDeslizador.setBounds(21, 30, 49, 275);
		frame.getContentPane().add(slDeslizador);
	}
}
