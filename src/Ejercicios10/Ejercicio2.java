package Ejercicios10;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 {

	private JFrame frame;	
	ButtonGroup grupocolores = new  ButtonGroup();
	private JLabel etiResultado;
	private JButton btnAceptar;
	private JRadioButton optRojo;
	private JRadioButton optVerde;
	private JRadioButton optAzul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 window = new Ejercicio2();
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
	public Ejercicio2() {
		initialize();
		grupocolores.add(optRojo);
		grupocolores.add(optVerde);
		grupocolores.add(optAzul);
		optRojo.setSelected(true);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 433, 299);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.png")));
		frame.setTitle("EJERCICIO 2");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Color elegido: ";
				if (optRojo.isSelected()) {
				mensaje=mensaje+"Rojo";
				} else if (optVerde.isSelected()) {
				mensaje=mensaje+"Verde";
				} else if (optAzul.isSelected()) {
				mensaje=mensaje+"Azul";
				}
				etiResultado.setText(mensaje);
			}
		});
		btnAceptar.setBounds(20, 156, 103, 23);
		frame.getContentPane().add(btnAceptar);
		
		etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(20, 190, 377, 46);
		frame.getContentPane().add(etiResultado);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Colores", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 175, 175)));
		panel.setBounds(10, 11, 278, 134);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		optRojo = new JRadioButton("Rojo");
		optRojo.setBounds(6, 22, 109, 23);
		panel.add(optRojo);
		
		optVerde = new JRadioButton("Verde");
		optVerde.setBounds(6, 56, 109, 23);
		panel.add(optVerde);
		
		optAzul = new JRadioButton("Azul");
		optAzul.setBounds(6, 93, 109, 23);
		panel.add(optAzul);
	}
}
