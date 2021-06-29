package secao6;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//Start learning if
		int n;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva um numero de 0 - 9999");
		System.out.print(": ");
		n = teclado.nextInt();
		
		if (n > 100) {
			System.out.println(n);
		}else {
		
			System.out.println( n + "O seu numero e menor doq 100");
		}
		teclado.close();
		
		
	}

}
