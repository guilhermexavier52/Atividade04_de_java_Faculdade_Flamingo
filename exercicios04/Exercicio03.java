package exercicios;

/* Ler dois inteiros (variáveis A e B) e imprimir o resultado
 *  do quadrado da diferença do primeiro valor pelo segundo.*/

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			//Pede para o usuario digitar o primeiro valor.
			System.out.println("Digite o valor inteiro de A: ");
			int A = sc.nextInt();
			
			//Pede para o usuario digitar o segundo valor.
			System.out.println("Digite o valor de inteiro de B: ");
			int B = sc.nextInt();
			
		    int diferenca = A - B;
	        int quadradoDiferenca = diferenca * diferenca;

		        // Imprimir o resultado
		    System.out.println("O quadrado da diferença entre A e B é: " + quadradoDiferenca);

		    sc.close();

		} catch (Exception e) {
			System.out.println("Digite uma Informação valida.");
		}
		
			    
	}

}
