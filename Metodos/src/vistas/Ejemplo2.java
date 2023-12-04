package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class Ejemplo2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSpinner spncantidad;
	private JComboBox cbocodigo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo2 frame = new Ejemplo2();
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
	public Ejemplo2() {
		setTitle("TIENDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblproducto = new JLabel("Producto");
		lblproducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblproducto.setBounds(10, 11, 118, 42);
		contentPane.add(lblproducto);
		
		JLabel lblcantidad = new JLabel("Cantidad");
		lblcantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblcantidad.setBounds(10, 60, 118, 42);
		contentPane.add(lblcantidad);
		
		cbocodigo = new JComboBox();
		cbocodigo.setBounds(135, 11, 118, 42);
		contentPane.add(cbocodigo);
		
		spncantidad = new JSpinner();
		spncantidad.setBounds(135, 60, 118, 42);
		contentPane.add(spncantidad);
		
		JScrollPane spcresultado = new JScrollPane();
		spcresultado.setBounds(33, 113, 439, 187);
		contentPane.add(spcresultado);
		
		JTextArea txtresultado = new JTextArea();
		spcresultado.setViewportView(txtresultado);
		
		JButton btnprocesar = new JButton("Procesar");
		btnprocesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Declaracion de Variables
				String cod;
				double pre=0, imppag;
				int can, gom;
				//Entrada datos
				cod = cbocodigo.getSelectedItem().toString();

				//Importe de pago
				switch (cod)	{
				case "PO":
					pre=15;
					break;
				case "P1":
					pre=17.5;
					break;
				case "P2":
					pre=20;
					break;
				}
				can=(Integer)(spncantidad.getValue());
				imppag=pre*can;
				
				if(can>12)	{
					gom=can*2;
				}else	{
					gom=can*1;
				}
				
				txtresultado.setText("Precio:  "+pre+"\n");
				txtresultado.append("Cantidad:  "+can+"\n");
				txtresultado.append("Importe a pagar:  "+imppag+"\n");
				txtresultado.append("Cantidad de gomitas:  "+gom+"\n");
			}
		});
		btnprocesar.setBounds(288, 11, 111, 42);
		contentPane.add(btnprocesar);
		
		JButton btnborrar = new JButton("Borrar");
		btnborrar.setBounds(288, 60, 111, 42);
		contentPane.add(btnborrar);
	}
}
