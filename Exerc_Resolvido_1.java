package module_I;

import java.util.Locale;
import java.util.Scanner;


public class Exerc_Resolvido_1 {

	public static void main(String[] args) {
		/*
	Fazer um programa para ler as medidas da largura e comprimento de 
um terreno retangular com uma casa decimal, bem como o valor do metro 
quadrado do terreno com duas casas decimais. Em seguida, o programa 
deve mostrar o valor da área do terreno, bem como o valor do preço do 
terreno, ambos com duas casas decimais, conforme exemplo:

		ENTRADA				SAÍDA
		10.0				AREA = 300.00
		30.0				PRECO = 60000.00
		200.00
		  
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		//Variáveis:
		double largura, comprimento, area, preco; 
		double precoPorMetroQuadrado;
		
		//Entrada de dados:
		System.out.println("Dados de Entrada:");
		System.out.println("Digite abaixo um valor para a largura:");
		largura = sc.nextDouble();
		System.out.println("Digite abaixo um valor para o comprimento: ");
		comprimento = sc.nextDouble();
		System.out.println("Digite abaixo um valor para o preço por m²:");
		precoPorMetroQuadrado = sc.nextDouble();
		
		
		//Expressões para processamento:
		area = largura*comprimento;
		preco = area*precoPorMetroQuadrado;
		
		//Saída de Dados
		System.out.println("");
		System.out.println("Dados de Saída:");
		
		System.out.printf("AREA = %.2f%n",area);
		System.out.printf("PRECO = %.2f%n",preco);
	
		sc.close();

	
		
	}

}
