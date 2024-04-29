import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GaleAnonima extends JFrame {
	String[] arregloI = {"Imagen1.jpg","Imagen2.jpg","Imagen3.jpg","Imagen4.jpg"};
	int actualI;
	JButton btnAtras,btnAdelante;
	JPanel pi, pb;
	
	public GaleAnonima(){
		setTitle("Galeria Anonima");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		btnAtras = new JButton("Anterior");
		btnAdelante = new JButton("Siguiente");
		
		pi = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				try {
				BufferedImage i = ImageIO.read(new File(arregloI[actualI]));
				g.drawImage(i, 0, 0, getWidth(),getHeight(),null);}catch(Exception e) {}
			}
		};
		
		btnAtras.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualI = (actualI-1+arregloI.length)%arregloI.length;
				pi.repaint();
			}
		});
		
		btnAdelante.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualI = (actualI+1)%arregloI.length;
				pi.repaint();
			}
		});
		
		add(pi, BorderLayout.CENTER);
		pb=new JPanel();
		pb.add(btnAtras);
		pb.add(btnAdelante);
		add(pb,BorderLayout.SOUTH);
	}
	
	public static void main(String[]args) {
		GaleAnonima ga = new GaleAnonima();
		ga.setVisible(true);
	}
}
