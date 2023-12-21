package module_I;

import java.util.Scanner;

public class Exerc_Resolv_1_Est_Rep {

	public static void main(String[] args) {
	/*				Crescente e Decrescente - Beecrowd 1113
	
	Leia uma quantidade indeterminada de duplas de valores inteiros 
	X e Y. Escreva para cada X e Y uma mensagem que indique se estes 
	valores foram digitados em ordem crescente ou decrescente.

	Entrada
	A entrada contém vários casos de teste. Cada caso contém dois 
	valores inteiros X e Y. A leitura deve ser encerrada ao ser 
	fornecido valores iguais para X e Y.

	Saída
	Para cada caso de teste imprima “Crescente”, caso os valores 
	tenham sido digitados na ordem crescente, caso contrário imprima 
	a mensagem “Decrescente”.

	Exemplo de Entrada			Exemplo de Saída
	5 4							Decrescente	
	7 2							Decrescente
	3 8							Crescente	
	
	2 2
	
	*/
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre two integer values below:");
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	while ( x != y ) {
		if ( y < x ) {
			System.out.println("Decrescente");
		}else{
			System.out.println("Crescente");
		}
		x = sc.nextInt();
		y = sc.nextInt();
	
}
	sc.close();
}
}
