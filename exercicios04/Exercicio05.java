package exercicios;

/*Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real.
 *O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o
 *usuário, para que seja apresentado o valor em moeda americana.

*/

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			// Solicita ao usuário que insira a cotação do dólar
	        System.out.print("Digite a cotação do dólar: ");
	        float cotacaoDolar = sc.nextFloat();

	        // Solicita ao usuário que insira a quantidade de reais disponíveis
	        System.out.print("Digite a quantidade de Reais disponíveis: ");
	        float quantidadeReais = sc.nextFloat();

	        // Calcula o valor em reais
	        float valorEmdolar = quantidadeReais/ cotacaoDolar;

	        // Apresenta o valor em dolars
	        System.out.println("O valor em dolars é: $ " + valorEmdolar);

	        sc.close();

		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		
        
	}

}
