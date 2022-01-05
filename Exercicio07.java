package Controle;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int somadorDeNumeros = 0;
		
		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (negativo para sair): ");
			numero = entrada.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero;
				System.out.printf("A soma ate o momento: %d\n", somadorDeNumeros);
			}
		}
		
		entrada.close();
	}
}
