package module_I;

import java.util.Scanner;
import java.util.Locale;

public class ExercResolvidoEstrDeControleDoWhile {

	public static void main(String[] args) {
	/*
	Estrutura repetitiva "faça-enquanto":
	
	Menos utilizada, mas em alguns casos se encaixa melhor 
	ao problema.
	
	O bloco de comandos executa pelo menos uma vez, pois a 
	condição é verificada no final.
	
	Sintaxe							Regra:
	
	do {
		<comando 1>					V: volta ao loop;
		<comando 2>					F: Pula fora do loop.
			.
			.
			.
		<comando n>
		} while (condição);
	
	Fazer um programa para ler uma temperatura em Celsius e mostrar 
	o equivalente em Fahrenheit. Perguntar se o usuário deseja 
	repetir (s/n). Caso o usuário digite "s", repetir o programa.

	Fórmula: F = (9C/5) + 32
	Digite a temperatura em Celsius: 30.0
	Equivalente em Fahrenheit: 86.0
	Deseja repetir (s/n)? s
	Digite a temperatura em Celsius: 21.0
	Equivalente em Fahrenheit: 69.8
	Deseja repetir (s/n)? s
	Digite a temperatura em Celsius: -10.5
	Equivalente em Fahrenheit: 13.1
	Deseja repetir (s/n)? n
	 
	*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char option; 
		
		do {
		double temperaturaEmCelsius = sc.nextDouble();
		double temperaturaEmFahrenheit = (9.0*temperaturaEmCelsius/5.0) + 32.0;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", temperaturaEmFahrenheit);
		System.out.println("Deseja repetir (s/n)?");
		option = sc.next().charAt(0);
		} while (option != 'n');
		
		
		
		
		
		sc.close();

	}

}
