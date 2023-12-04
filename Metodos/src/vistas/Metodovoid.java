package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Metodovoid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnumero1;
	private JTextField txtnumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metodovoid frame = new Metodovoid();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//Metodo constructor
	public Metodovoid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnumero1 = new JLabel("Numero 1");
		lblnumero1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblnumero1.setHorizontalAlignment(SwingConstants.CENTER);
		lblnumero1.setBounds(27, 36, 170, 59);
		contentPane.add(lblnumero1);
		
		JLabel lblnumero2 = new JLabel("Numero 2");
		lblnumero2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblnumero2.setHorizontalAlignment(SwingConstants.CENTER);
		lblnumero2.setBounds(27, 116, 170, 59);
		contentPane.add(lblnumero2);
		
		txtnumero1 = new JTextField();
		txtnumero1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtnumero1.setBounds(204, 36, 147, 59);
		contentPane.add(txtnumero1);
		txtnumero1.setColumns(10);
		
		txtnumero2 = new JTextField();
		txtnumero2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtnumero2.setColumns(10);
		txtnumero2.setBounds(204, 116, 147, 59);
		contentPane.add(txtnumero2);
		
		JScrollPane spcresultado = new JScrollPane();
		spcresultado.setBounds(54, 197, 564, 233);
		contentPane.add(spcresultado);
		
		JTextArea txtresultado = new JTextArea();
		spcresultado.setViewportView(txtresultado);
		
		JButton btnprocesar = new JButton("Procesar");
		btnprocesar.addActionListener(new ActionListener() {
			//Metodo
			public void actionPerformed(ActionEvent e) {
				//Variables locales
				//-----------------------
				//Declaracion de variables
				int num1, num2, suma;
				//Entrada de datos
				num1 = Integer.parseInt(txtnumero1.getText());
				num2 = Integer.parseInt(txtnumero2.getText());
				//Proceso
				suma = num1 + num2;
				//Salida
				txtresultado.setText("Suma   :  "+suma);
			}
		});
		btnprocesar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnprocesar.setBounds(382, 39, 130, 56);
		contentPane.add(btnprocesar);
	}
}
