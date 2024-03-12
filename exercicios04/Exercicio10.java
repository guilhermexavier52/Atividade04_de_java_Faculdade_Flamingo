package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 try {
			
			 System.out.print("Digite a quantidade de votos válidos para o candidato A: ");
		        int votosA = sc.nextInt();

		        System.out.print("Digite a quantidade de votos válidos para o candidato B: ");
		        int votosB = sc.nextInt();

		        System.out.print("Digite a quantidade de votos válidos para o candidato C: ");
		        int votosC = sc.nextInt();

		        // Leitura da quantidade de votos nulos e votos em branco
		        System.out.print("Digite a quantidade de votos nulos: ");
		        int votosNulos = sc.nextInt();

		        System.out.print("Digite a quantidade de votos em branco: ");
		        int votosEmBranco = sc.nextInt();

		        // Total de eleitores
		        int totalEleitores = votosA + votosB + votosC + votosNulos + votosEmBranco;

		        // Percentual de votos válidos em relação ao total de eleitores
		        double percentualValidos = (double) (votosA + votosB + votosC) / totalEleitores * 100;

		        // Percentuais de votos válidos para cada candidato em relação ao total de eleitores
		        double percentualA = (double) votosA / totalEleitores * 100;
		        double percentualB = (double) votosB / totalEleitores * 100;
		        double percentualC = (double) votosC / totalEleitores * 100;

		        // Percentuais de votos nulos e em branco em relação ao total de eleitores
		        double percentualNulos = (double) votosNulos / totalEleitores * 100;
		        double percentualBranco = (double) votosEmBranco / totalEleitores * 100;

		        // Apresentação dos resultados
		        System.out.println("Número total de eleitores: " + totalEleitores);
		        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
		        System.out.println("Percentual de votos válidos para o candidato A: " + percentualA + "%");
		        System.out.println("Percentual de votos válidos para o candidato B: " + percentualB + "%");
		        System.out.println("Percentual de votos válidos para o candidato C: " + percentualC + "%");
		        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
		        System.out.println("Percentual de votos em branco: " + percentualBranco + "%");

		        sc.close();
			 
		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
	}
	
}
