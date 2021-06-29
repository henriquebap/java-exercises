package br.com.henrique.secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// variaveis
		/* faca um algoritimo que pergunte qual e seu salario
		 * por hora e o numero de horas trabalhadas no mes
		 * calcule e mostre o total do seu salario no referido mes
		 * 
		 *
		 */
		float sal_hora, total;
		int horas_trab;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Escreva quanto voce recebe por hora: ");
		sal_hora = teclado.nextFloat();
		
		System.out.print("Escreva quantas horas trabalhou no mes: ");
		horas_trab = teclado.nextInt();
			
		
		total = (sal_hora * horas_trab);
		
		System.out.println("Voce ira receber R$" + total );
		
		teclado.close();
	}

}
