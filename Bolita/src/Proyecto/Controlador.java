package Proyecto;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Controlador extends JFrame{
	JPanel pBolita,pControl;
	
	public Controlador() {
		setTitle("Mover");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		setResizable(false);
		
		Bolita b = new Bolita();
		pBolita = new JPanel();
		pControl = new JPanel();
		pBolita.add(b);
		Control control = new Control(b);
		pControl.add(control);
		add(pBolita);
		add(pControl);
	}
	public static void main(String[]args) {
		Controlador c = new Controlador();
		c.setVisible(true);
	}
}
