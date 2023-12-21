package module_I;
import java.util.Scanner;

public class Exerc_Resolv_3_Est_Condic {

	public static void main(String[] args) {
	/*
	 Fazer um programa para ler três números inteiros. Em seguida, 
	 mostrar qual o menor dentre os três números lidos. Em caso de 
	 empate, mostrar apenas uma vez.
	
	EXEMPLOS:
	Entrada: 		Saída:
	7 3 8 			MENOR = 3
	Entrada: 		Saída:
	5 12 5 			MENOR = 5
	Entrada: 		Saída:
	9 9 9 			MENOR = 9
	
	 */
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	System.out.println(" ");
	
	if ( a < b && a < c) {
		System.out.println("MENOR = " + a);
	} 
	else if ( b < c ) {
		System.out.println("MENOR = " + b);
	}
	else {
		System.out.println("MENOR = " + c);
	}
	
	
	sc.close();

	}

}
