import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Capitales extends JFrame implements ActionListener{
	HashMap<String, String> edoCap;
	JComboBox<String> estadog;
	JLabel cap;
	JPanel panel;
	
	public Capitales(){
		setTitle("Estados y Capitales: ");
		setSize(400,400);
		setDefaultCloseOperation(3);
		
		edoCap = new HashMap<>();
		edoCap.put("Sonora","Hermosillo");
		edoCap.put("Ciudad de Mexico","CDMX");
		edoCap.put("Edo de Mex","Toluca");
		edoCap.put("Guadalajara","Jalisco");
		edoCap.put("Monterrey","Nuevo Leon");
		
		estadog = new JComboBox<>();
		for(String e : edoCap.keySet()) {
			estadog.addItem(e);
		}
		panel = new JPanel();
		panel.add(estadog);
		estadog.addActionListener(this);
		cap = new JLabel();
		add(panel);
		panel.add(cap);
	}
	public static void main(String[] args) {
		Capitales p = new Capitales();
		p.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String estadoSelec = (String)estadog.getSelectedItem();
		System.out.println(estadoSelec);
		String capselec = edoCap.get(estadoSelec);
		System.out.println(capselec);
		cap.setText(capselec);
	}
}
