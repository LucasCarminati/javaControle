package Controle;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
		if ((numero >= 0) && (numero <= 10)) {
			if(numero % 2 == 0) {
				System.out.println("O numero está entre 0 e 10 e também é par");
			} else {
				System.out.println("O numero " + numero + " esta entre 0 e 10 mas nao é par");
			}
		} else {
			System.out.println("O numero" + numero + "nao esta entre 0 e 10");
		}
		entrada.close();
	}
}
