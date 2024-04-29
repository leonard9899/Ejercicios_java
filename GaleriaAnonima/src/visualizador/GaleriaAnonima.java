package visualizador;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GaleriaAnonima extends JFrame {
    String[] arregloI = {"imagen01.jpg", "imagen02.jpg", "imagen03.jpg"};
    int actualI;
    JButton btnatras, btnadelante;
    JPanel pi, pb;

    public GaleriaAnonima() {
        setTitle("Galeria Anonima");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        btnatras = new JButton("anterior");
        btnadelante = new JButton("siguiente");

        pi = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    BufferedImage i = ImageIO.read(new File(arregloI[actualI]));
                    g.drawImage(i, 0, 0, getWidth(), getHeight(), null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        btnadelante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualI = (actualI + 1) % arregloI.length;
                pi.repaint();
            }
        });

        btnatras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualI = (actualI - 1 + arregloI.length) % arregloI.length;
                pi.repaint();
            }
        });

        add(pi, BorderLayout.CENTER);
        pb = new JPanel();
        pb.add(btnatras);
        pb.add(btnadelante);
        add(pb, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        GaleriaAnonima galeria = new GaleriaAnonima();
        galeria.setVisible(true);
    }
}


