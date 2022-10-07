package Ejercicios10;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio6 {

	private JFrame frame;
	private JComboBox cboNumeros;
	private JButton btnPares;
	private JButton btnImpares;
	private JLabel etiResultado;
	DefaultComboBoxModel modelo = new DefaultComboBoxModel();
	private JButton btnVaciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 window = new Ejercicio6();
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
	public Ejercicio6() {
		initialize();
		cboNumeros.setModel(modelo);		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiResultado.setText("");
			}
		});
		btnVaciar.setBounds(144, 154, 89, 23);
		frame.getContentPane().add(btnVaciar);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 376, 239);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.png")));
		frame.setTitle("EJERCICIO 6");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		cboNumeros = new JComboBox();
		cboNumeros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiResultado.setText(cboNumeros.getSelectedItem().toString());
			}
		});
		cboNumeros.setBounds(10, 11, 115, 22);
		frame.getContentPane().add(cboNumeros);
		
		btnPares = new JButton("Pares");
		btnPares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo = new DefaultComboBoxModel();
				for (i=0;i<10;i+=2) {
				modelo.addElement("No "+i);
				}
				cboNumeros.setModel(modelo);
			}
		});
		btnPares.setBounds(144, 11, 89, 23);
		frame.getContentPane().add(btnPares);
		
		btnImpares = new JButton("Impares");
		btnImpares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo = new DefaultComboBoxModel();
				for (i=1;i<10;i+=2) {
				modelo.addElement("No "+i);
				}
				cboNumeros.setModel(modelo);
			}
		});
		btnImpares.setBounds(242, 11, 89, 23);
		frame.getContentPane().add(btnImpares);
		
		etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(10, 87, 309, 41);
		frame.getContentPane().add(etiResultado);
	}
}
