package module_I;
import java.util.Scanner;

public class Bee_1067 {

	public static void main(String[] args) {
	/* 
	Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os 
	ímpares de 1 até X, um valor por linha, inclusive o X, se for 
	o caso.

	Entrada
	O arquivo de entrada contém 1 valor inteiro qualquer.

	Saída
	Imprima todos os valores ímpares de 1 até X, inclusive X, se 
	for o caso.

	Exemplo de Entrada	Exemplo de Saída
	8					1
						3
						5
						7  
	*/
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if ( x % 2 == 0) {
			for ( int i = 1; i < x; i+=2 ) {
				System.out.println(i);
			}
		}
		else {
			for ( int i = 1; i <= x; i+=2 ) {
				System.out.println(i);
			}
		}
		
			
		sc.close();
				
	}
}
