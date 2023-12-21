package module_I;
import java.util.Scanner;

public class Estruturas_Repetitivas_I {

	public static void main(String[] args) {
	/*
	Estrutura repetitiva "enquanto"
	-É uma estrutura de controle que repete um bloco de comandos
	enquanto uma condição for verdadeira.
	- Quando usar: quando não se sabe previamente a quantidade
	de repetições que será realizada.
	- Problema exemplo:
	Fazer um programa que lê númerosinteiros até que um zero seja 
	lido. Ao final mostra a soma dos números lidos.
	Entrada 		Saída		- Regra:	
	5				11			V: executa e volta para testar a condição
	2							F: pula fora 
	4
	0

	- Sintaxe / regra
	while ( condição ) {								
		<comando 1>			
		<comando 2>							 
			.					
			.
			.
		<comando n>

	} 
	*/
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int soma = 0;
	
	while ( x != 0) {
		soma += x;
		x = sc.nextInt();
		
	}
	System.out.println(" ");
	System.out.println("SOMA = " + soma);
	
	sc.close();	
	}

}
