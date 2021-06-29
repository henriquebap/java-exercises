package br.com.henrique.secao03;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Variaveis 
		
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o valor em metros: ");
		metros = teclado.nextInt();
		
		//processamentos
		
		centimetros = (metros * 100);
		
		System.out.println(metros + "metros em centimetros e " + centimetros);
		
		teclado.close();
		

	}

}
