package module_I;
import java.util.Scanner;


public class Bee_1066 {

	public static void main(String[] args) {
	/*
	
	Leia 5 valores Inteiros. A seguir mostre quantos valores 
	digitados foram pares, quantos valores digitados foram 
	ímpares, quantos valores digitados foram positivos e 
	quantos valores digitados foram negativos.

	Entrada
	O arquivo de entrada contém 5 valores inteiros quaisquer.

	Saída
	Imprima a mensagem conforme o exemplo fornecido, uma mensagem 
	por linha, não esquecendo o final de linha após cada uma.

	Exemplo de Entrada		Exemplo de Saída
	-5						3 valor(es) par(es)
	0						2 valor(es) impar(es)
	-3						1 valor(es) positivo(s)
	-4						3 valor(es) negativo(s)
	12					
 
	*/
	Scanner sc = new Scanner(System.in);
	int valoresPares = 0;
	int valoresImpares = 0;
	int valoresPositivos = 0;
	int valoresNegativos = 0;
	
	for (int i = 0; i < 5; i++) {
		int valor = sc.nextInt();
		
		
		if (valor > 0) {
			valoresPositivos++;
		}
		if (valor < 0) {
			valoresNegativos++;
		}
		
		if (valor % 2 == 0) {
			valoresPares++;
		}
		else {
			valoresImpares++;
		}
		
	}
	
	System.out.printf("%d valor(es) par(es)%n", valoresPares);
	System.out.printf("%d valor(es) impar(es)%n", valoresImpares);
	System.out.printf("%d valor(es) positivo(s)%n", valoresPositivos);
	System.out.printf("%d valor(es) negativo(s)%n", valoresNegativos);
	
	sc.close();
		
	}

}
