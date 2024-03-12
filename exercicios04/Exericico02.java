package exercicios;

/* Elaborar um programa que calcule e apresente o volume de uma caixa retangular,
 *  por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.*/

import java.util.Scanner;

public class Exericico02 {
	
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			//Pede para o usuario digitar o comprimento da caixa.
			System.out.println("Digite o comprimento da caixa: ");
			float comprimento = sc.nextFloat();
			
			//Pede para o usuario digitar a largura da caixa.
			System.out.println("Digite a largura da caixa: ");
			float largura = sc.nextFloat();
			
			//Pede oara o usuario digitar a altura da caixa.
			System.out.println("Digite a altura da caixa: ");
			float altura = sc.nextFloat();
			
			//Faz a calculo dos tres valores.
			float volume = comprimento * largura * altura;
			
			//Imprime para o usuario o valor do volume.
			System.out.println("O volume da caixa é: "+ volume);
			
			sc.close();

			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida");
		}
		
		
			}

}
