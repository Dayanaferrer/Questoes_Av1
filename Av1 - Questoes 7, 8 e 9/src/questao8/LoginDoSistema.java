package questao8;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDoSistema implements ActionListener{
	
	JFrame janelaDoPrograma = new JFrame();
	JButton botaoDeLogin = new JButton("Login");
	JButton botaoDeReiniciar = new JButton("Recarregar");
	JTextField nomeUsuario = new JTextField ();
	JPasswordField senhaUsuario = new JPasswordField();
	JLabel digiteUsuario = new JLabel ("Usuário: ");
	JLabel digiteSenha = new JLabel ("Senha: ");
	JLabel mensagemParaUsuario = new JLabel ("TESTANDO");
	HashMap <String,String> informacaologin = new HashMap <String, String>();
	
	LoginDoSistema(HashMap <String, String> loginOriginal){
		
		informacaologin = loginOriginal;
		
		digiteUsuario.setBounds (50, 100, 75, 25);
		digiteSenha.setBounds (50, 150, 75, 25);
		
		mensagemParaUsuario.setBounds(125, 250, 250, 35);
		mensagemParaUsuario.setFont(new Font (null, Font.ITALIC, 25));
		
		janelaDoPrograma.add(digiteUsuario);
		janelaDoPrograma.add(digiteSenha);
		janelaDoPrograma.add(mensagemParaUsuario);	
		janelaDoPrograma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaDoPrograma.setSize (420,420);
		janelaDoPrograma.setLayout(null);
		janelaDoPrograma.setVisible(true);
		
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
