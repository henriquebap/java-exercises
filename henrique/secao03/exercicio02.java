package br.com.henrique.secao03;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// variaveis 
		int quantidade_min, quantidade_max;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escreva a quantidade minima: ");
		quantidade_min = teclado.nextInt();
		
		System.out.print("Escreva a quantidade maxima: ");
		quantidade_max = teclado.nextInt();
		
		estoque_medio = (quantidade_max + quantidade_min) / 2;
		
		System.out.println("O estoque medio e " + estoque_medio);
		
		teclado.close();

	}

}
