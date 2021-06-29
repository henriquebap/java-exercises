package br.com.henrique.secao03;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// Variaveis 
		
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite sua altura: ");
		altura = teclado.nextFloat();
		
		peso_ideal = (float)(altura * 72.7) - 58; //cast
		
		System.out.printf("O seu peso ideal e %.2f", peso_ideal);
		
		teclado.close();
	}

}
