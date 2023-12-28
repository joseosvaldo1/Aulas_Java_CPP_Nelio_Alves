package module_I;

import java.util.Scanner;

public class Exerc_Resolv_1_Est_Contr_For_Para {

	public static void main(String[] args) {
	/*
	Estrutura repetitiva "para":
	É uma estrutura de controle que repete um bloco de comandos
	para um certo intervalo de valores.

	Quando usar: quando se sabe previamente a quantidade de
	repetições, ou o intervalo de valores.
	
	
	Sintaxe / Regra:
	
	     Executa somente	V: Executa e volta	   Executa toda vez
	     na 1ª vez			F: Pula fora		   depois de voltar
	for (   inicio        ;     condição         ;    incremento   ) {
		<comando 1>; 
		<comando 2>;
			.
			.
			.
		<comando n>;
	}
 	
	Por exemplo:
	
	Fazer um programa que lê um valor inteiro N e depois N números 
	inteiros. Ao final, mostra a soma dos N números lidos
	Entrada 		Saída
	3				11
 	5
 	2
 	4
 	
	*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			int numero = sc.nextInt();
			soma += numero;
		}
		
		System.out.println(soma);
		
		
		sc.close();
		
	}

}
