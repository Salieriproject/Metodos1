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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Metodoglobal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnumero1;
	private JTextField txtnumero2;
	
	JTextArea txtresultado;
	
	//Variables Globales
	int num1, num2, suma, resta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metodoglobal frame = new Metodoglobal();
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
	public Metodoglobal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnumero1 = new JLabel("Numero 1");
		lblnumero1.setHorizontalAlignment(SwingConstants.CENTER);
		lblnumero1.setBounds(0, 11, 124, 32);
		contentPane.add(lblnumero1);
		
		JLabel lblnumero2 = new JLabel("Numero 2");
		lblnumero2.setHorizontalAlignment(SwingConstants.CENTER);
		lblnumero2.setBounds(0, 54, 124, 32);
		contentPane.add(lblnumero2);
		
		txtnumero1 = new JTextField();
		txtnumero1.setBounds(148, 11, 116, 32);
		contentPane.add(txtnumero1);
		txtnumero1.setColumns(10);
		
		txtnumero2 = new JTextField();
		txtnumero2.setColumns(10);
		txtnumero2.setBounds(148, 54, 116, 32);
		contentPane.add(txtnumero2);
		
		JScrollPane spcresultado = new JScrollPane();
		spcresultado.setBounds(20, 96, 387, 132);
		contentPane.add(spcresultado);
		
		txtresultado = new JTextArea();
		spcresultado.setViewportView(txtresultado);
		
		JButton btnprocesar = new JButton("Procesar");
		btnprocesar.addActionListener(new ActionListener() {			
			//Metodo publico sin retorno y los parametros en parentesis
			public void actionPerformed(ActionEvent e) {
				
				entradadatos();								
				proceso();					
				resta();			
				salida();
				producto(3,8);
			}
		});
		btnprocesar.setBounds(279, 11, 108, 32);
		contentPane.add(btnprocesar);
	}
	
	//Creamos un metodo que utilizaremos las mismas variables num1 y num2
	private void resta()	{
		resta = num1 - num2;
		System.out.println("Resta :  "+resta);
	}
	
	private void entradadatos()	{
		//entrada de datos
		num1 = Integer.parseInt(txtnumero1.getText());
		num2 = Integer.parseInt(txtnumero2.getText());
	}
	private void proceso()	{
		suma = num1 + num2;
	}
	private void salida()	{
		txtresultado.setText("Suma   :  "+suma+"\n");
		
	}
	//metodo no tiene retorno pero tiene dos parametros de tipo entero
		private void producto(int a, int b)	{
			int producto;
			producto = a * b;
			txtresultado.append("Producto   :  "+producto);		
		}

	
}
