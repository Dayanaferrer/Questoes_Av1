package questao8;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Page {

	JFrame frame = new JFrame ();
	
	JLabel bemvindoLabel = new JLabel (", você se logou ao nosso sistema.");
	
	
	
	Page (String IdUsuario, String horaAtual){
		
		bemvindoLabel.setBounds(0,0,200,35);
		bemvindoLabel.setFont(new Font (null, Font.ROMAN_BASELINE, 12));
		bemvindoLabel.setText(" Hello," + IdUsuario + horaAtual );
		
		frame.add(bemvindoLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
		
		
	}
}

