package Pincipal;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculadora extends JFrame{
    String bt[] = new String[] 
                { "7", "8", "9", "+",
                  "4", "5", "6", "-",
                  "1", "2", "3", "*",
                  "0", ".", "=", "/" };
    JTextField p;
    JPanel pp, pb;
    JButton b[];
    
    public Calculadora(){
    this.setTitle("Calculadora");
    this.setSize(400,600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new GridLayout(2,1));
        
    p=new JTextField(20);
    pp=new JPanel();
    pb=new JPanel();
    pp.add(p);
    b = new JButton[bt.length];
    for(int i=0; i < bt.length; i++){
        b[i]=new JButton(bt[i]);
        pb.add(b[i]);
    }
    pb.setLayout(new GridLayout(4,4));
    add(pp);
    add(pb);
}
    
}