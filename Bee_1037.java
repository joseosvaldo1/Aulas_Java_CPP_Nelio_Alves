package module_I;

import java.util.Locale;
import java.util.Scanner;


public class Bee_1037 {

	public static void main(String[] args) {
	/* 
	 Você deve fazer um programa que leia um valor qualquer e apresente
	 uma mensagem dizendo em qual dos seguintes intervalos ([0,25], 
	 (25,50], (50,75], (75,100]) este valor se encontra. Obviamente 
	 se o valor não estiver em nenhum destes intervalos, deverá ser 
	 impressa a mensagem “Fora de intervalo”.

	O símbolo ( representa "maior que". Por exemplo:[0,25]  indica 
	valores entre 0 e 25.0000, inclusive eles. (25,50] indica valores 
	maiores que 25 Ex: 25.00001 até o valor 50.0000000

	Entrada
	O arquivo de entrada contém um número com ponto flutuante qualquer.

	Saída
	A saída deve ser uma mensagem conforme exemplo abaixo.

	Exemplo de Entrada		Exemplo de Saída
	25.01					Intervalo (25,50]

	25.00					Intervalo [0,25]

	100.00					Intervalo (75,100]

	-25.02					Fora de intervalo

	*/ 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//input Data:
		System.out.println("Entrada de Dados - Input Data:");
		System.out.print("Type a value: ");
		double x = sc.nextDouble();
		System.out.println(" ");
		System.out.println("Output Data - Saída de Dados:");
		//Processing Data:
		
		if ( x >= 0 && x <= 25 ){
			System.out.println("Intervalo [0,25]");
			
		}
		else if ( x > 25 && x <= 50 ){
			System.out.println("Intervalo (25,50]");
			
		}
		else if ( x > 50 && x <= 75 ){
			System.out.println("Intervalo (50,75]");
			
		}
		else if( x > 75 && x <= 100 ){
			System.out.println("Intervalo (75,100]");
		}
		else{
			System.out.println("Fora de intervalo");	
		}
		
		
			
		sc.close();

	}

}
