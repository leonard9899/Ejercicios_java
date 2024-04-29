import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Contador extends JFrame implements Runnable, ActionListener{
    JLabel num; 
    int i=0;
    boolean contar;
    JButton btnIniciar, btnDetener;
    Thread hilo;    
    
    public Contador(){
        setTitle("Contador");
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));
        num=new JLabel(i+"");
        add(num);
        hilo = new Thread(this);
        btnIniciar = new JButton("Iniciar");
        btnDetener = new JButton("Detener");
        btnIniciar.addActionListener(this);
        btnDetener.addActionListener(this);
        add(btnIniciar);
        add(btnDetener);
    }
    public static void main(String[]args){
        Contador c = new Contador();
        c.setVisible(true);
        //Thread hilo=new Thread(c);
        //hilo.start();
        }
    
    public void run(){
        /*while(true)*/
        while(contar){
            try{
                i=i+1;
                num.setText(i+"");
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("no funciono");
            }
            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnIniciar)){
            contar=true;
            System.out.println("funcionando");
            hilo.start();
        } 
        if(e.getSource().equals(btnDetener)){
            contar=false;
            System.out.println("detenido");
        } 
    }
    
}


