package br.com.henrique.secao03;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// Declarando as variaveis
		
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		num2 = teclado.nextInt();
		
		 soma = (num1 + num2);
		 
		 System.out.println("A soma e " + soma);
		 
		 teclado.close();
	}

}
