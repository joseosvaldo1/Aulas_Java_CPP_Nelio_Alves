package module_I;

import java.util.Scanner;

public class Bee_1007 {

	public static void main(String[] args) {
/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e 
mostre a diferença do produto de A e B pelo produto de C e D 
segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, 
conforme exemplo abaixo, com um espaço em branco antes e depois 
da igualdade.

Exemplos de Entrada		Exemplos de Saída
5
6
7
8						DIFERENCA = -26

0
0
7
8						DIFERENCA = -56

5
6
-7
8						DIFERENCA = 86
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Data:");
		System.out.println("Enter a value for A below:");
		int A = sc.nextInt();
		System.out.println("Enter a value for B below:");
		int B = sc.nextInt();
		System.out.println("Enter a value for C below:");
		int C = sc.nextInt();
		System.out.println("Enter a value for D below:");
		int D = sc.nextInt();
		
		int DIFFERENCE = (A*B) - (C*D);
		
		System.out.println("Output Data:");
		System.out.println("DIFERENCA = " + DIFFERENCE);
		
		
		sc.close();
	}

}
