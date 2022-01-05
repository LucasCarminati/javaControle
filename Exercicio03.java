package Controle;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media >= 7) {
			System.out.print("Aprovado!!!");
		}
		else if ((media < 7) && (media >= 4)) {
			System.out.print("Recuperação");
		}
		else {
			System.out.print("Reprovado");
		}
		entrada.close();
	}
}
