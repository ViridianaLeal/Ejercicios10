package Ejercicios10;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class Ejercicio10 {

	private JFrame frame;
	private JLabel etiValor;
	private JScrollBar desValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio10 window = new Ejercicio10();
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
	public Ejercicio10() {
		initialize();
		desValor.setValue(70);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 329, 367);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.png")));
		frame.setTitle("EJERCICIO 10");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		desValor = new JScrollBar();
		desValor.setVisibleAmount(5);
		desValor.setBlockIncrement(20);
		desValor.setUnitIncrement(2);
		desValor.setMinimum(50);
		desValor.setMaximum(150);
		desValor.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				etiValor.setText("El valor es: "+desValor.getValue());
			}
		});
		desValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		desValor.setOrientation(JScrollBar.HORIZONTAL);
		desValor.setBounds(10, 11, 168, 17);
		frame.getContentPane().add(desValor);
		
		etiValor = new JLabel("");
		etiValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiValor.setBounds(10, 39, 168, 27);
		frame.getContentPane().add(etiValor);
	}
}
