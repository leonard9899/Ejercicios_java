
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Edad extends JFrame implements ActionListener{
    JPanel panel01;
    JTextField txtEdad;
    JButton b1;
    
    public Edad(){
        this.setSize(30,90);
        this.setTitle("Programa edad");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtEdad = new JTextField(20);
        panel01 = new JPanel(new GridLayout(2,1));
        b1= new JButton("Dame tu edad");
        b1.addActionListener(this);
        panel01.add(txtEdad);
        panel01.add(b1);
        add(panel01);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int edad= Integer.parseInt(txtEdad.getText());
        String res = null;
        if(edad>=18){
            res="eres mayor de edad";
        }else{
            res="eres menor de edad";
        }
        JOptionPane.showMessageDialog(null,res);
    }
    
}
