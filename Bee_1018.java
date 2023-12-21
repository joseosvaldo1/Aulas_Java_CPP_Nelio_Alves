package module_I;

import java.util.Scanner;

public class Bee_1018 {

	public static void main(String[] args) {
	/*
	Leia um valor inteiro. A seguir, calcule o menor número de 
	notas possíveis (cédulas) no qual o valor pode ser decomposto. 
	As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
	A seguir mostre o valor lido e a relação de notas necessárias.

	Entrada
	O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

	Saída
	Imprima o valor lido e, em seguida, a quantidade mínima de notas 
	de cada tipo necessárias, conforme o exemplo fornecido. Não 
	esqueça de imprimir o fim de linha após cada linha, caso contrário 
	seu programa apresentará a mensagem: “Presentation Error”.

	Exemplo de Entrada	
	576

	Exemplo de Saída
	576
	5 nota(s) de R$ 100,00
	1 nota(s) de R$ 50,00
	1 nota(s) de R$ 20,00
	0 nota(s) de R$ 10,00
	1 nota(s) de R$ 5,00
	0 nota(s) de R$ 2,00
	1 nota(s) de R$ 1,00
	 */
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Input Data - Monetary value");
	int N = sc.nextInt();
	System.out.println(" ");
	int rest100, rest50, rest20, rest10, rest5, rest2;
	int bill100, bill50, bill20, bill10, bill5, bill2, bill1;
	
	
	
	//Processing:
	bill100 = N / 100;
	rest100 = N % 100;
	
	bill50 = rest100 / 50;
	rest50 = rest100 % 50;
	
	bill20 = rest50 / 20;
	rest20 = rest50 % 20;
	
	bill10 = rest20 / 10;
	rest10 = rest20 % 10;
	
	bill5 = rest10 / 5;
	rest5 = rest10 % 5;
	
	bill2 = rest5 / 2;
	rest2 = rest5 % 2;
	bill1 = rest2;
	
	System.out.println("Output Data: ");
	System.out.printf("%d nota(s) de R$ 100,00%n", bill100);
	System.out.printf("%d nota(s) de R$ 50,00%n", bill50);
	System.out.printf("%d nota(s) de R$ 20,00%n", bill20);
	System.out.printf("%d nota(s) de R$ 10,00%n", bill10);
	System.out.printf("%d nota(s) de R$ 5,00%n", bill5);
	System.out.printf("%d nota(s) de R$ 2,00%n", bill2);
	System.out.printf("%d nota(s) de R$ 1,00%n", bill1);
	
	sc.close();	
	}

}
