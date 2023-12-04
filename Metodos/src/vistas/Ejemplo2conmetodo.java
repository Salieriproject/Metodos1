package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo2conmetodo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int can, gom;
	double imppag, pre=0;
	String cod;
	JComboBox cbocodigo;
	JSpinner spncantidad;
	JTextArea txtresultado;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo2conmetodo frame = new Ejemplo2conmetodo();
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
	public Ejemplo2conmetodo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblproducto = new JLabel("Producto");
		lblproducto.setBounds(20, 27, 87, 31);
		contentPane.add(lblproducto);
		
		JLabel lblcantidad = new JLabel("Cantidad");
		lblcantidad.setBounds(20, 62, 87, 44);
		contentPane.add(lblcantidad);
		
		cbocodigo = new JComboBox();
		cbocodigo.setBounds(132, 31, 109, 27);
		cbocodigo.addItem("Selecciona codigo");//0
		cbocodigo.addItem("P0");//1
		cbocodigo.addItem("P1");//2
		cbocodigo.addItem("P2");//3
		contentPane.add(cbocodigo);
		
		spncantidad = new JSpinner();
		spncantidad.setBounds(132, 69, 87, 31);
		contentPane.add(spncantidad);
		
		JScrollPane spcresultado = new JScrollPane();
		spcresultado.setBounds(8, 112, 367, 118);
		contentPane.add(spcresultado);
		
		txtresultado = new JTextArea();
		spcresultado.setViewportView(txtresultado);
		
		JButton btnprocesar = new JButton("Procesar");
		btnprocesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//conseguirPrecio();
				//conseguirCantidad();
				calcularImportePagar();
				cantidadCaramelos();
				imprimirDatos();
				
			}
		});
		btnprocesar.setBounds(251, 27, 96, 31);
		contentPane.add(btnprocesar);
		
		
		
		
		JButton btnborrar = new JButton("Borrar");
		btnborrar.setBounds(251, 69, 86, 31);
		contentPane.add(btnborrar);
	}
	
		public double conseguirPrecio()	{
			cod=cbocodigo.getSelectedItem().toString();
			switch(cod) {
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
			return pre;
		}
		//***
		public int conseguirCantidad()	{
			can=(Integer)(spncantidad.getValue());
			return can;
		}
		//***
		public double calcularImportePagar()	{
			imppag=conseguirPrecio()*conseguirCantidad();
			return imppag;
		}	
		//*****
		public int cantidadCaramelos()	{
			if (can>12)	{
				gom=can*2;
			}else	{
				gom=can*1;
			}
			return gom;	
		}
		//***
		public void imprimirDatos()	{
			txtresultado.setText("Precio:  "+pre+"\n");
			txtresultado.append("Cantidad:  "+can+"\n");
			txtresultado.append("Importe a pagar:  "+imppag+"\n");
			txtresultado.append("Cantidad de gomitas:  "+gom);
		}

}
