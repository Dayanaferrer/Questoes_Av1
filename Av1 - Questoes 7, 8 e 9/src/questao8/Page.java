package questao8;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Page {

	JFrame frame = new JFrame ();
	
	JLabel bemvindoLabel = new JLabel (", voc� se logou ao nosso sistema.");
	
	
	
	Page (String IdUsuario ){
		
		bemvindoLabel.setBounds(0,0,200,35);
		bemvindoLabel.setFont(new Font (null, Font.ROMAN_BASELINE, 10));
		bemvindoLabel.setText( IdUsuario +  ",Voc� se logou ao nosso sistema." );
		
		frame.add(bemvindoLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
		
		
	}
}

