package exercicios;

/* Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, 
 * baseando-se na utilização do conceito da propriedade distributiva. Ou seja, se 
 * forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D. 
 * ]Depois B com C, B com D e por fim C com D. Perceba que será necessário efetuar seis operações de adição
 *  e seis operações de multiplicação e apresentar doze resultados de saída.*/

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		try {
			//Pede para o usuario digitar o valor de A.
			System.out.println("Digite o valor de A: ");
			int A = sc.nextInt();
			
			//Pede para o usuario digitar o valor de B.
			System.out.println("Digite o valor de B: ");
			int B = sc.nextInt();

			//Pede para o usuario digitar o valor de C.
			System.out.println("Digite o valor de C: ");
			int C =  sc.nextInt();
			
			//Pede para o usuario digitar o valor de D.
			System.out.println("Digite o valor de D: ");
			int D = sc.nextInt();
			
			//Soma dos valores.
			int somaAB = A + B;
	        int somaAC = A + C;
	        int somaAD = A + D;
	        int somaBC = B + C;
	        int somaBD = B + D;
	        int somaCD = C + D;
			
	        //Multiplicação dos valores.
	        int multAB = A * B;
	        int multAC = A * C;
	        int multAD = A * D;
	        int multBC = B * C;
	        int multBD = B * D;
	        int multCD = C * D;
	        
	        //Resultados das somas.
	        System.out.println("Resultados das adições:");
	        System.out.println("A + B = " + somaAB);
	        System.out.println("A + C = " + somaAC);
	        System.out.println("A + D = " + somaAD);
	        System.out.println("B + C = " + somaBC);
	        System.out.println("B + D = " + somaBD);
	        System.out.println("C + D = " + somaCD);
	        
	        //Resultados das multiplicações.
	        System.out.println("\nResultados das multiplicações:");
	        System.out.println("A * B = " + multAB);
	        System.out.println("A * C = " + multAC);
	        System.out.println("A * D = " + multAD);
	        System.out.println("B * C = " + multBC);
	        System.out.println("B * D = " + multBD);
	        System.out.println("C * D = " + multCD);
	        
	        sc.close();
			
		} catch (Exception e) {
			System.out.println("Digite um informação valida.");
		}
		
		
	}
	
}
