package questao7;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProgramaQuiz {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        int acertos =0;
	        int erros = 0;
	        
	        String usuario=null;
	        usuario = JOptionPane.showInputDialog("Digite seu nome: "); 
	        JOptionPane.showConfirmDialog(null, "Seja bem Vindo(a), " + usuario + "!!!");
       	   	       
	String pergunta1, pergunta2, pergunta3;
	        
	      pergunta1 = JOptionPane.showInputDialog("\n"+ usuario + "," + "\n"
	        		+ "O que significa if? \n"
	        		+ "[1] Talvez  \n"
	        		+ "[2] Ent�o  \n"
	        		+ "[3] Se  \n"
	        		+ "[4] Sei l�  \n"
	   );
	        
	        if (("3".equals(pergunta1))) {
	        	JOptionPane.showMessageDialog(null, "Resposta Certa! ");
	        	int acerto = acertos ++;
	        	
	        }
	        else {
	        	JOptionPane.showMessageDialog(null, "Resposta Errada!!!");
	        	int erro = erros ++;
	        }
	        
	        pergunta2 = JOptionPane.showInputDialog("\n"+ usuario + "," + "\n"
	        		+ "O que significa Else? \n"
	        		+ "[1] Se  \n"
	        		+ "[2] Se n�o  \n"
	        		+ "[3] Ok  \n"
	        		+ "[4] Ent�o"
	        		);
	        if (("2".equals(pergunta2))) {
	        	JOptionPane.showMessageDialog(null, "Resposta Certa! ");
	        	int acerto = acertos ++;
	        }
	        else {
	        	JOptionPane.showMessageDialog(null, "Resposta Errada!!!");
	        	int erro = erros ++;
	        }
	       pergunta3 =  JOptionPane.showInputDialog("\n"+ usuario + "," + "\n"
	        		+ "O que � Java? \n"
	        		+ "[1] � um m�todo para criptrografar objetos  \n"
	        		+ "[2] � uma caixa de di�logo  \n"
	        		+ "[3] � um m�todo para pesquisas \n"
	        		+ "[4] � uma linguagem da programa��o orientada a objetos  \n"
	        		);
	       
	       if (("4".equals(pergunta3))) {
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
