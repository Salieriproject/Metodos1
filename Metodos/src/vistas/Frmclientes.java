package vistas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Frmclientes extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frmclientes frame = new Frmclientes();
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
	public Frmclientes() {
		setBounds(100, 100, 450, 300);

	}

}
