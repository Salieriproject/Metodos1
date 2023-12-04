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

public class Ejemplo1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//Variables globales
	double pre, impdes, imppag, impcom;
	int can;
	String cod;	
	private JSpinner spncantidad;
	private JComboBox cbocodigo;
	private JTextArea txtresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo1 frame = new Ejemplo1();
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
	public Ejemplo1() {
		setTitle("TIENDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblproducto = new JLabel("Producto");
		lblproducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblproducto.setBounds(10, 31, 153, 47);
		contentPane.add(lblproducto);
		
		JLabel lblcantidad = new JLabel("Cantidad");
		lblcantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblcantidad.setBounds(10, 97, 153, 47);
		contentPane.add(lblcantidad);
		
		cbocodigo = new JComboBox();
		cbocodigo.setBounds(174, 31, 133, 47);
		cbocodigo.addItem("Seleccione codigo");
		cbocodigo.addItem("P0");
		cbocodigo.addItem("P1");
		cbocodigo.addItem("P2");	
		contentPane.add(cbocodigo);
		
		spncantidad = new JSpinner();
		spncantidad.setBounds(173, 97, 134, 47);
		contentPane.add(spncantidad);
		
		JScrollPane spcresultado = new JScrollPane();
		spcresultado.setBounds(41, 172, 528, 287);
		contentPane.add(spcresultado);
		
		txtresultado = new JTextArea();
		spcresultado.setViewportView(txtresultado);
		
		JButton btnprocesar = new JButton("Procesar");
		btnprocesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresoDatos();
				calculoImporteCompra();
				calculoImportePagar();
				imprimirDatos();
			}
		});
		btnprocesar.setBounds(340, 31, 133, 47);
		contentPane.add(btnprocesar);
		
		JButton btnborrar = new JButton("Borrar");
		btnborrar.setBounds(340, 97, 133, 47);
		contentPane.add(btnborrar);
	}
	public void ingresoDatos()	{
		cod=cbocodigo.getSelectedItem().toString();
		
		switch (cod)	{
		case "P0":
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
	}
	public void calculoImporteCompra()	{
		impcom = pre * can;	
	}
	public void calculoImportePagar()	{
		if (can>10)	{
			impdes=0.15*impcom;
		}else	{
			impdes=0.07*impcom;			
		}
		imppag=impcom-impdes;
	}
	public void imprimirDatos()	{
		//Salida
		txtresultado.setText(pre+"\n");
		txtresultado.append(can+"\n");
		txtresultado.append(impcom+"\n");
		txtresultado.append(impdes+"\n");
		txtresultado.append(imppag+"\n");
	}
	
		
}
