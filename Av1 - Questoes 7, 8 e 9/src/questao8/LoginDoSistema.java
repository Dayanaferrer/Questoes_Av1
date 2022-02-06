package questao8;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDoSistema implements ActionListener{
	
	JFrame janelaDoPrograma = new JFrame();
	JButton botaoDeLogin = new JButton("Login");
	JButton botaoDeReiniciar = new JButton("Recarregar");
	JTextField nomeUsuario = new JTextField ();
	JPasswordField senhaUsuario = new JPasswordField();
	
	HashMap <String,String> informacaologin = new HashMap <String, String>();
	
	LoginDoSistema(HashMap <String, String> loginOriginal){
		
		informacaologin = loginOriginal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
