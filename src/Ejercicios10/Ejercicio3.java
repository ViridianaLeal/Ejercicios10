package Ejercicios10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JList;
import java.awt.List;
import java.awt.Toolkit;

import javax.swing.border.BevelBorder;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import java.awt.Font;

public class Ejercicio3 {

	private JFrame frame;
	private JLabel etiResultado;
	private JButton btnAceptar;
	private JList ltsColores;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 window = new Ejercicio3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Ejercicio3() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 424, 295);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.png")));
		frame.setTitle("EJERCICIO 3");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		etiResultado = new JLabel("");
		etiResultado.setBounds(32, 148, 369, 54);
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(etiResultado);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(32, 114, 89, 23);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje;
				if (ltsColores.getSelectedIndex()==-1) {
				mensaje="No hay un color seleccionado.";
				} else {
				mensaje="El color seleccionado es: "+ltsColores.getSelectedValue().toString();
				}
				etiResultado.setText(mensaje);
			}
		});
		frame.getContentPane().add(btnAceptar);
		
		ltsColores = new JList();
		ltsColores.setFont(new Font("Agency FB", Font.PLAIN, 18));
		ltsColores.setModel(new AbstractListModel() {
			String[] values = new String[] {"Rojo", "Verde", "Azul"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		ltsColores.setBorder(new LineBorder(new Color(0, 0, 0)));
		ltsColores.setBounds(32, 11, 89, 92);
		frame.getContentPane().add(ltsColores);
	}
}
