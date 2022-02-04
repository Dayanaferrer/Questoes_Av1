package questoes;
import java.util.Scanner;

public class ProgramaQuis {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        
	        String pergunta1 = "Qual destes passwords foi o mais usado na internet? ";
	        System.out.println(pergunta1);

	        System.out.println("\n[1] a1b2c3");
	        System.out.println("[2] abcdef");
	        System.out.println("[3] 123456");
	        
	        System.out.println("\nDigite sua resposta: ");
	        String resposta = scanner.nextLine();
	        
	        if (resposta.equals("3")) {
	        	System.out.println("Reposta Correta! ");
	        }else {
	        	System.out.println("Reposta Errada !!!!");
	        }
}
}