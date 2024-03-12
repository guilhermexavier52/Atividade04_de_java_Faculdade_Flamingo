package exercicios;

/*Elaborar um programa que efetue a apresentação do valor da conversão em real 
 *de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar
 *e também a quantidade de dólares disponível com o usuário, para que seja apresentado 
 *o valor em moeda brasileira.*/

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);

	        // Solicita ao usuário que insira a cotação do dólar
	        System.out.print("Digite a cotação do dólar: ");
	        float cotacaoDolar = sc.nextFloat();

	        // Solicita ao usuário que insira a quantidade de dólares disponíveis
	        System.out.print("Digite a quantidade de dólares disponíveis: ");
	        float quantidadeDolares = sc.nextFloat();

	        // Calcula o valor em reais
	        float valorEmReais = cotacaoDolar * quantidadeDolares;

	        // Apresenta o valor em reais
	        System.out.println("O valor em reais é: R$ " + valorEmReais);

	        sc.close();

		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		
		
		
	}

}
