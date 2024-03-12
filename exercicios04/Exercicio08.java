package exercicios;

import java.util.Scanner;

/*Elaborar um programa de computador que efetue a leitura de quatro valores inteiros
 *(variáveis A, B, C e D). Ao final o programa deve apresentar o resultado do produto
 *(variável P) do primeiro com o terceiro valor e o resultado da soma (variável S) do 
 *segundo com o quarto valor.*/

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		
			System.out.println("Digite o valor de A: ");
			int A = sc.nextInt();
			
			System.out.println("Digite o valor de B: ");
			int B = sc.nextInt();
			
			System.out.println("Digite o valor de C :");
			int C = sc.nextInt();
			
			System.out.println("Digite o valor de D: ");
			int D = sc.nextInt();
			
			int produtoA = A * C;
			
			int produtoB = B + D;
			
			System.out.println("O produto de A e C é: " + produtoA);
		    System.out.println("A soma de B e D é: " + produtoB);
		     
		    sc.close(); 
	
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida");
		}
		
		
	}
}
