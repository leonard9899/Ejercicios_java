package dia03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {
    String temp;
    int op1, op2;
    boolean opSuma, opResta, opMult, opDiv;
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
        b[i].addActionListener(this);
        pb.add(b[i]);
    }
    pb.setLayout(new GridLayout(4,4));
    this.add(p);
    this.add(pp);
    this.add(pb);
}

    @Override
    public void actionPerformed(ActionEvent x) {
        for(int i=0;i<16;i++){
            if(x.getSource().equals(b[i])){
            //p.setText("7");
            if(x.getSource().equals(b[3])){
                opSuma=true;
                opResta=false;
                opMult=false;
                opDiv=false;
                
                op1 =Integer.parseInt(p.getText());
                p.setText("");
            }
            if(x.getSource().equals(b[14])){     
                op2=Integer.parseInt(p.getText());
                int res = op1+op2;
                opSuma=false;
                opResta=false;
                opMult=false;
                opDiv=false;
                p.setText(res+"");
            }
            temp = p.getText();
            temp = temp+b[i].getText();
            p.setText(temp);
            }
        }
        
}
    
}

