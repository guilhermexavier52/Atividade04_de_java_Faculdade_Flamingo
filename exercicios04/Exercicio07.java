package exercicios;

/*Elaborar um programa que efetue a leitura de três valores (A, B e C)
 *e apresente como resultado final o quadrado da soma dos três valores lidos.
*/

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Digite o valor de A: ");
	        double A = sc.nextDouble();

	        System.out.print("Digite o valor de B: ");
	        double B = sc.nextDouble();

	        System.out.print("Digite o valor de C: ");
	        double C = sc.nextDouble();

	        // Calcula a soma dos três valores
	        double soma = A + B + C;

	        // Calcula o quadrado da soma
	        double quadradoDaSoma = Math.pow(soma, 2);

	        // Apresenta o resultado final
	        System.out.println("O quadrado da soma de A, B e C é: " + quadradoDaSoma);

	        sc.close();
	
		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		
    }
}
