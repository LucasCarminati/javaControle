package Controle;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i = 0;
		
		System.out.println("Digite a palavra: ");
		String palavra = entrada.nextLine();
		
		char letras[] = palavra.toCharArray();
		
		for (i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		entrada.close();
	}
}
