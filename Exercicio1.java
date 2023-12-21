package module_I;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		Fazer um programa para ler as medidas da largura e comprimento 
de um terreno retangular com uma casa decimal, bem como o valor do 
metro quadrado do terreno com duas casas decimais. Em seguida, o 
programa deve mostrar o valor da área do terreno, bem como o valor do 
preço do terreno, ambos com duas casas decimais, conforme exemplo.
	Entrada: 			Saída:
	10.0     			AREA = 300.00
	30.0	 			PRECO = 60000.0
	200.00

		*/
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("largura = ");
		double largura = sc.nextDouble();
		System.out.print("comprimento = ");
		double comprimento = sc.nextDouble();
		System.out.print("preço por m² = ");
		double metroQuadrado = sc.nextDouble();
		System.out.println(" ");
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.println(" ");
		
		System.out.printf("AREA = %.2f m²%n ", area);
		System.out.printf("PRECO = R$ %.2f %n ", preco);
		System.out.println(" ");
		sc.close();
	}
}
