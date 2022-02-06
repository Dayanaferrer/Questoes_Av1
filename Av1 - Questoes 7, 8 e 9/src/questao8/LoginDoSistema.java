package questao8;
import java.awt.Color;
import java.awt.FlowLayout;
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
	JLabel mensagemParaUsuario = new JLabel ();
	HashMap <String,String> informacaologin = new HashMap <String, String>();
	
	LoginDoSistema(HashMap <String, String> loginOriginal){
		
		informacaologin = loginOriginal;
		
		digiteUsuario.setBounds (50, 100, 75, 25);
		digiteSenha.setBounds (50, 150, 75, 25);
		
		mensagemParaUsuario.setBounds(125, 250, 250, 35);
		mensagemParaUsuario.setFont(new Font (null, Font.ROMAN_BASELINE, 14));
		
		nomeUsuario.setBounds(125,100, 200, 25);
		senhaUsuario.setBounds(125,150, 200, 25);
		
		botaoDeLogin.setBounds(125, 200, 100, 25);
		botaoDeLogin.setFocusable(false);
		botaoDeLogin.addActionListener(this);
		
		botaoDeReiniciar.setBounds(225, 200, 100, 25);
		botaoDeReiniciar.setFocusable(false);
		botaoDeReiniciar.addActionListener(this);
		
		
		janelaDoPrograma.add(digiteUsuario);
		janelaDoPrograma.add(digiteSenha);
		janelaDoPrograma.add(mensagemParaUsuario);
		janelaDoPrograma.add(nomeUsuario);
		janelaDoPrograma.add(senhaUsuario);
		janelaDoPrograma.add(botaoDeLogin);
		janelaDoPrograma.add(botaoDeReiniciar);
		janelaDoPrograma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaDoPrograma.setSize (420,420);
		janelaDoPrograma.setLayout(null);
		janelaDoPrograma.setVisible(true);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == botaoDeReiniciar) {
			nomeUsuario.setText("");
			senhaUsuario.setText("");
		}
		
		
		/* Pegar o Login e senha com a palavra associada se ok, verifica.  Talvezs aqui tbm - implementar horario */
		
		if (e.getSource()==botaoDeLogin) {
			
			String IdUsuario =  nomeUsuario.getText();
			String Idsenha = String.valueOf(senhaUsuario.getPassword());
			
		if(informacaologin.containsKey(IdUsuario)) {
			if(informacaologin.get(IdUsuario).equals(Idsenha)) {				
				mensagemParaUsuario.setForeground(Color.darkGray);
				mensagemParaUsuario.setText("Você se logou ao nosso sistema!");
				janelaDoPrograma.dispose();
				Page BemvindoPage = new Page (IdUsuario);				
				
			}
			else {
				mensagemParaUsuario.setForeground(Color.red);
				mensagemParaUsuario.setText("Senha incorreta.");
			}
		}
		else {
			mensagemParaUsuario.setForeground(Color.red);
			mensagemParaUsuario.setText("Usuário não encontrado.");
		}
	}
}
}