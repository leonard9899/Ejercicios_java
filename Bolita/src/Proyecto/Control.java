package Proyecto;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Control extends JPanel implements ActionListener{

	JButton btnIzquierda,btnDerecha,btnArriba,btnAbajo;
	
	Bolita bolita;
	
	public Control() {}
		public Control(Bolita b) {
			setLayout(new BorderLayout());
			btnIzquierda = new JButton("Izquierda");
			btnDerecha = new JButton("Derecha");
			btnArriba = new JButton("Arriba");
			btnAbajo = new JButton("Abajo");
			
			btnIzquierda.addActionListener(this);
			btnDerecha.addActionListener(this);
			btnArriba.addActionListener(this);
			btnAbajo.addActionListener(this);
		//	bolita = new bolita();
			bolita = b;
			add(btnIzquierda,BorderLayout.WEST);
			add(btnDerecha,BorderLayout.EAST);
			add(btnArriba,BorderLayout.NORTH);
			add(btnAbajo,BorderLayout.SOUTH);
		}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(btnIzquierda)) {
				bolita.setMoverX(bolita.getMoverX()-5);
			}
			if(e.getSource().equals(btnArriba)) {
				bolita.setMoverY(bolita.getMoverY()-5);
			}
			if(e.getSource().equals(btnAbajo)) {
				bolita.setMoverY(bolita.getMoverY()+5);
			}
			if(e.getSource().equals(btnDerecha)) {
				bolita.setMoverX(bolita.getMoverX()+5);
			}
			bolita.repaint();
		}
}