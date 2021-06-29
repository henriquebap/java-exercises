package secao6;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, a , b;
		
		Scanner teclado =  new Scanner(System.in);
		
		System.out.print("Escreva um numero : ");
		numero = teclado.nextInt();
		
		
	//processamentos
		if(numero > 0) {
			a = numero;
			System.out.println(a + "O numero e positivo");
					
		}else {
			b = numero;
			System.out.println(b + "O numero e negativo");
		}
		
	}

}
