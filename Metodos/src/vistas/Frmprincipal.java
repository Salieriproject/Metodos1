package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Frmprincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frmprincipal frame = new Frmprincipal();
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
	public Frmprincipal() {
		setTitle("SISTEMA SALIERI SOLUCIONES EIRL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 471);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Clientes");
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\01. Diego\\00. Cibertec\\Computacion e Informatica\\Ciclo 1\\Modulo 02\\Introduccion a la algoritmia\\ICONOS\\cliente.png"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Productos");
		mntmNewMenuItem_2.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\01. Diego\\00. Cibertec\\Computacion e Informatica\\Ciclo 1\\Modulo 02\\Introduccion a la algoritmia\\ICONOS\\regalo.png"));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Proveedores");
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\01. Diego\\00. Cibertec\\Computacion e Informatica\\Ciclo 1\\Modulo 02\\Introduccion a la algoritmia\\ICONOS\\tienda.png"));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Salir");
		mntmNewMenuItem_3.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\01. Diego\\00. Cibertec\\Computacion e Informatica\\Ciclo 1\\Modulo 02\\Introduccion a la algoritmia\\ICONOS\\salida.png"));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("Proceso");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Pedidos");
		mntmNewMenuItem_5.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\01. Diego\\00. Cibertec\\Computacion e Informatica\\Ciclo 1\\Modulo 02\\Introduccion a la algoritmia\\ICONOS\\formulario.png"));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Facturas");
		mntmNewMenuItem_4.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\01. Diego\\00. Cibertec\\Computacion e Informatica\\Ciclo 1\\Modulo 02\\Introduccion a la algoritmia\\ICONOS\\archivo-factura-dolar.png"));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Consultas");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Reportes");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		
		JDesktopPane desktopPane = new JDesktopPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(toolBar, GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
						.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 626, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
					.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnNewButton = new JButton("Clientes");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\01. Diego\\00. Cibertec\\Computacion e Informatica\\Ciclo 1\\Modulo 02\\Introduccion a la algoritmia\\ICONOS\\clasificacion.png"));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Productos");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\diego\\OneDrive\\01. Diego\\00. Cibertec\\Computacion e Informatica\\Ciclo 1\\Modulo 02\\Introduccion a la algoritmia\\ICONOS\\estar.png"));
		toolBar.add(btnNewButton_1);
		contentPane.setLayout(gl_contentPane);
	}
}
