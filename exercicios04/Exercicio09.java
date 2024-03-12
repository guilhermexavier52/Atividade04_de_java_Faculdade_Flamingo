package exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			 System.out.print("Digite o valor do salário mensal: ");
		        double salario = sc.nextDouble();

		        // Solicita o percentual de reajuste
		        System.out.print("Digite o percentual de reajuste: ");
		        double percentual = sc.nextDouble();

		        // Calcula o novo salário com base no percentual de reajuste
		        double novoSalario = salario * (1 + percentual / 100);

		        // Apresenta o novo salário
		        System.out.println("O novo salário é: " + novoSalario);

		        // Fecha o Scanner
		        sc.close();
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
	}
	
}
