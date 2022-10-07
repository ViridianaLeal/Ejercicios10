package Ejercicios10;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio5 {

	private JFrame frame;
	private JList lstNombres;
	private JLabel etiResultado;
	private JButton btnCurso1;
	private JButton btnCurso2;
	DefaultListModel modelo = new DefaultListModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 window = new Ejercicio5();
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
	public Ejercicio5() {
		initialize();
		modelo.addElement("Ana");
		modelo.addElement("Marta");
		modelo.addElement("Jose");
		lstNombres.setModel(modelo);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 424, 295);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/gato.png")));
		frame.setTitle("EJERCICIO 5");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lstNombres = new JList();
		lstNombres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				etiResultado.setText(lstNombres.getSelectedValue().toString());
			}
		});
		lstNombres.setBorder(new LineBorder(new Color(0, 0, 0)));
		lstNombres.setBounds(10, 11, 104, 124);
		frame.getContentPane().add(lstNombres);
		
		etiResultado = new JLabel("");
		etiResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		etiResultado.setBounds(124, 13, 262, 51);
		frame.getContentPane().add(etiResultado);
		
		btnCurso1 = new JButton("Curso 1");
		btnCurso1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Juan");
				modelo.addElement("María");
				modelo.addElement("Luis");
				lstNombres.setModel(modelo);
			}
		});
		btnCurso1.setBounds(10, 155, 89, 23);
		frame.getContentPane().add(btnCurso1);
		
		btnCurso2 = new JButton("Curso 2");
		btnCurso2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Ana");
				modelo.addElement("Marta");
				modelo.addElement("Jose");
				lstNombres.setModel(modelo);
			}
		});
		btnCurso2.setBounds(10, 189, 89, 23);
		frame.getContentPane().add(btnCurso2);
	}
}
