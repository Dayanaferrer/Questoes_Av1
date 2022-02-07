package questao9;

import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int recebeNumeroFuncionario = 0;
			
			System.out.println("Digite o número de funcionarios da empresa: ");
			recebeNumeroFuncionario = in.nextInt();
			Funcionario [] funcionario = new Funcionario [recebeNumeroFuncionario];
			
			for (int i = 0; i < recebeNumeroFuncionario; i++) {
				in.nextLine();
				System.out.println("Digite o nome do " + (i +1) + " funcionario: ");
				String nome = in.nextLine();
				System.out.printf("Digite o valor do seu salário " + (i +1) + " funcionario: ");
				double salarios = in.nextDouble();
				funcionario [i] = new Funcionario(nome, salarios);
				
			}
			for (Funcionario fun : funcionario) {
				System.out.println();
				if (fun.getBonificacao() < 0 ) {
					System.out.printf("Funcionário %s %nSalário: %.2f %nDesconto: %.2f %nSalário Liquido: %.2f%n",
										fun.getNome(), fun.getSalario(),fun.getBonificacao(),fun.getSalarioLiquido());
							
				} else {
					System.out.printf("Funcionário %s %nSalário: %.2f %nBonificação: %.2f %nSalário Liquido: %.2f%" ,
										fun.getNome(), fun.getSalario(), fun.getBonificacao(), fun.getSalarioLiquido());
							
				}
			}
			
			in.close();

	}
}
