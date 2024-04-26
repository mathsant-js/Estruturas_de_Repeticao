// Do While

package defautpackage;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		int idade;
		String nome;
		
		// Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		idade = 1;
		
		do {
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
			
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos.");
			} else {
				System.out.println("A idade digitada não corresponde!");
			}
			
		} while(idade > 0);
		
		
		teclado.close();
	}
	
}
