package vistas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Frmproductos extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frmproductos frame = new Frmproductos();
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
	public Frmproductos() {
		setBounds(100, 100, 450, 300);

	}

}
