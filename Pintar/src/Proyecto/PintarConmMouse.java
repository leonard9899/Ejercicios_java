package Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PintarConmMouse extends JFrame{
	JComboBox<String> colorComboBox;
	DrawingPanel drawingPanel;
	Container contentPane;
	
	public PintarConmMouse() {
		setTitle("Paint:");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setResizable(false);
		
		colorComboBox = new JComboBox<>(new String[]{"Rojo","Verde","Azul"});
		drawingPanel = new DrawingPanel(colorComboBox);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(colorComboBox);
		contentPane.add(colorComboBox,BorderLayout.NORTH);
		contentPane.add(drawingPanel,BorderLayout.CENTER);
	}

public static void main(String[] args) {
	PintarConmMouse  mouse = new PintarConmMouse();
	mouse.setVisible(true);
}
}

class DrawingPanel extends JPanel{
	JComboBox<String> colorComboBox;
	int lastX,lastY;
	Color currentColor = Color.BLACK;
	
	public DrawingPanel() {
		
	}
	public DrawingPanel(JComboBox colorComboBox) {
		this.colorComboBox = colorComboBox;
		
		colorComboBox.addActionListener(e->cambiarColor());
		
		addMouseMotionListener(new MouseAdapter(){
			public void mousePressed(MouseEvent E) {
				lastX=E.getX();
			    lastY=E.getY();
			}	
			});
			
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				Graphics g = getGraphics();
				g.setColor(currentColor);
				int x = e.getX();
				int y = e.getY();
				g.drawLine(lastX, lastY, x, y);
				lastX = x;
				lastY = y;
			}
		});
	}
	public void cambiarColor(){
		String selectColor = (String) colorComboBox.getSelectedItem();
		switch(selectColor) {
		case "Rojo": currentColor=Color.RED;break;
		case "Verde": currentColor=Color.GREEN;break;
		case "Azul": currentColor=Color.BLUE;break;
		}
	}
}