package Ejercicios10;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio7 {

	private JFrame frame;
	private JTextField txtPrecioBase;
	private JButton btnCalular;
	private JLabel etiTotal;
	private JToggleButton tbtnInstalacion;
	private JToggleButton tbtnFormacion;
	private JLabel etiPrecioAlimentacionBD;
	private JLabel etiPrecioFormacion;
	private JLabel etiPrecioInstalacion;
	private JToggleButton tbtnAlimentacionBD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7 window = new Ejercicio7();
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
	public Ejercicio7() {
		initialize();
		tbtnInstalacion.setSelected(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 427, 368);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.png")));
		frame.setTitle("EJERCICIO 7");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Precio base");
		lblNewLabel.setBounds(10, 23, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtPrecioBase = new JTextField();
		txtPrecioBase.setBounds(10, 48, 125, 20);
		frame.getContentPane().add(txtPrecioBase);
		txtPrecioBase.setColumns(10);
		
		btnCalular = new JButton("Calcular");
		btnCalular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double precio_base;
				double precio_instal; 
				double precio_for; 
				double precio_ali; 
				
				precio_base = Double.parseDouble(txtPrecioBase.getText());
				precio_instal = Double.parseDouble(etiPrecioInstalacion.getText());
				precio_for = Double.parseDouble(etiPrecioFormacion.getText());
				precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());
				
				double precio_total;
				precio_total = precio_base;
				if (tbtnInstalacion.isSelected()) { 
				precio_total = precio_total+precio_instal;
				}
				if (tbtnFormacion.isSelected()) { 
				precio_total = precio_total+precio_for;
				}
				if (tbtnAlimentacionBD.isSelected()) { 
				precio_total = precio_total+precio_ali;
				}
				
				etiTotal.setText(precio_total+" €");
			}
		});
		btnCalular.setBounds(23, 248, 89, 23);
		frame.getContentPane().add(btnCalular);
		
		etiTotal = new JLabel("");
		etiTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		etiTotal.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiTotal.setBounds(10, 282, 125, 36);
		frame.getContentPane().add(etiTotal);
		
		tbtnInstalacion = new JToggleButton("Instalación");
		tbtnInstalacion.setBounds(10, 79, 121, 23);
		frame.getContentPane().add(tbtnInstalacion);
		
		tbtnFormacion = new JToggleButton("Formación");
		tbtnFormacion.setBounds(10, 113, 121, 23);
		frame.getContentPane().add(tbtnFormacion);
		
		tbtnAlimentacionBD = new JToggleButton("Alimentacion BD");
		tbtnAlimentacionBD.setBounds(10, 156, 121, 23);
		frame.getContentPane().add(tbtnAlimentacionBD);
		
		etiPrecioInstalacion = new JLabel("40");
		etiPrecioInstalacion.setBounds(141, 83, 46, 14);
		frame.getContentPane().add(etiPrecioInstalacion);
		
		etiPrecioFormacion = new JLabel("200");
		etiPrecioFormacion.setBounds(141, 117, 46, 14);
		frame.getContentPane().add(etiPrecioFormacion);
		
		etiPrecioAlimentacionBD = new JLabel("200");
		etiPrecioAlimentacionBD.setBounds(141, 156, 46, 14);
		frame.getContentPane().add(etiPrecioAlimentacionBD);
	}
}
