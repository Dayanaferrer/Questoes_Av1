package questoes;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProgramaQuis {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        int acertos =0;
	        int erros = 0;
	        
	        String usuario;
	        usuario = JOptionPane.showInputDialog("Digite seu nome: "); 
	        JOptionPane.showConfirmDialog(null, "Seja bem Vindo(a), " + usuario + "!!!");
	        
			String pergunta1, pergunta2, pergunta3;
	        
	      pergunta1 = JOptionPane.showInputDialog("\n"+ usuario + "," + "\n"
	        		+ "O que significa if? \n"
	        		+ "A) Talvez  \n"
	        		+ "B) Então  \n"
	        		+ "C) Se  \n"
	        		+ "D) Sei lá  \n"
	   );
	        
	        if (("c".equals(pergunta1))) {
	        	JOptionPane.showMessageDialog(null, "Resposta Certa! ");
	        	int acerto = acertos ++;
	        	
	        }
	        else {
	        	JOptionPane.showMessageDialog(null, "Resposta Errada!!!");
	        	int erro = erros ++;
	        }
	        
	        pergunta2 = JOptionPane.showInputDialog("\n"+ usuario + "," + "\n"
	        		+ "O que significa Else? \n"
	        		+ "A) Se  \n"
	        		+ "B) Se não  \n"
	        		+ "C) Ok  \n"
	        		+ "D) Então"
	        		);
	        if (("b".equals(pergunta2))) {
	        	JOptionPane.showMessageDialog(null, "Resposta Certa! ");
	        	int acerto = acertos ++;
	        }
	        else {
	        	JOptionPane.showMessageDialog(null, "Resposta Errada!!!");
	        	int erro = erros ++;
	        }
	       pergunta3 =  JOptionPane.showInputDialog("\n"+ usuario + "," + "\n"
	        		+ "O que é Java? \n"
	        		+ "A) É um método para criptrografar objetos  \n"
	        		+ "B) É uma caixa de diálogo  \n"
	        		+ "C) É uma linguagem da programação orientada a objetos  \n"
	        		+ "D) É um método para pesquisas"
	        		);
	       
	       if (("c".equals(pergunta3))) {
	        	JOptionPane.showMessageDialog(null, "Resposta Certa! ");
	        	int acerto = acertos ++;
	        }
	        else {
	        	JOptionPane.showMessageDialog(null, "Resposta Errada!!!");
	        	int erro = erros ++;
	        }
	       
	       JOptionPane.showMessageDialog(null, usuario + "\nTotal de Acerto: " + acertos +"\nTotal de Erros: " + erros);
}
	       
	        
	        

}
