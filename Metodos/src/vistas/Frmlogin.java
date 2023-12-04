package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Frmlogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtusu;
	private JPasswordField pswcontra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frmlogin frame = new Frmlogin();
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
	public Frmlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblusu = new JLabel("Usuario");
		lblusu.setHorizontalAlignment(SwingConstants.CENTER);
		lblusu.setBounds(36, 29, 94, 34);
		contentPane.add(lblusu);
		
		JLabel lblcontra = new JLabel("Contraseña");
		lblcontra.setHorizontalAlignment(SwingConstants.CENTER);
		lblcontra.setBounds(36, 74, 94, 34);
		contentPane.add(lblcontra);
		
		txtusu = new JTextField();
		txtusu.setBounds(140, 29, 143, 34);
		contentPane.add(txtusu);
		txtusu.setColumns(10);
		
		pswcontra = new JPasswordField();
		pswcontra.setBounds(140, 74, 143, 34);
		contentPane.add(pswcontra);
		
		JButton btningresar = new JButton("Ingresar");
		btningresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[]clave=pswcontra.getPassword();
				String claveFinal=new String(clave);
				
				if (txtusu.getText().equals("diego") && claveFinal.equals("123"))	{
					dispose();
					JOptionPane.showMessageDialog(null,"Bienvenido al sistema","INGRESASTE",JOptionPane.INFORMATION_MESSAGE);
					Frmprincipal p=new Frmprincipal();
					p.setVisible(true);
					
				}else	{
					JOptionPane.showMessageDialog(null,"Usuario o contrasena incorrecta","ERROR",JOptionPane.ERROR_MESSAGE);
					txtusu.setText("");
					pswcontra.setText("");
					txtusu.requestFocus();				
				}
			}
		});
		btningresar.setBounds(140, 122, 143, 42);
		contentPane.add(btningresar);
	}
}
