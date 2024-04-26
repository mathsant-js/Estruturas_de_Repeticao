// for

package defautpackage;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		int idade;
		String nome;
		
		// Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		// Variável de contador; Enquanto; Contador
			for (int i = 0; i < 5; i++) {
				System.out.println("Informe o seu nome:");
				nome = teclado.nextLine();
				
				/*
				 * Só para o caso de pegar apenas um nome sem espaço
				 * nome = teclado.next();
				 * 
				 */
				
				System.out.println("Informe a sua idade:");
				//idade = teclado.nextInt(); Bug!
				idade = Integer.parseInt(teclado.nextLine());
				
				System.out.println(nome + " tem " + idade + " anos.");
			}
		teclado.close();
	}

}
