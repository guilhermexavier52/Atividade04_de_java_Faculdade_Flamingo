package exercicios;

/*Elaborar um programa que efetue a leitura de três valores (A, B e C)
 *e apresente como resultado final à soma dos quadrados dos três valores lidos.*/

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Digite o valor de A: ");
			double A = sc.nextDouble();
			
			System.out.println("Digite o valor de B: ");
			double B = sc.nextDouble();
			
			System.out.println("Digite o valor de C: ");
			double C = sc.nextDouble();
			
			double quadradoA = Math.pow(A, 2);
			double quadradoB = Math.pow(B, 2);
			double quadradoC = Math.pow(C, 2);
			
			double somaDosQuadrados = quadradoA + quadradoB + quadradoC;
			
			System.out.println("A soma dos quadrados de A, B e C é: " + somaDosQuadrados);

	        sc.close();
		
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida");
		}
	}
}
