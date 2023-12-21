package module_I;

import java.util.Scanner;

public class Bee_1013 {

	public static void main(String[] args) {
/*
Faça um programa que leia três valores e apresente o maior dos 
três valores lidos seguido da mensagem “eh o maior”. Utilize a 
fórmula: MaiorAB = (a+b+abs(a-b))/2.

Obs.: a fórmula apenas calcula o maior entre os dois primeiros 
(a e b). Um segundo passo, portanto é necessário para chegar no 
resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem 
"eh o maior".

Exemplos de Entrada			Exemplos de Saída
7 14 106					106 eh o maior

217 14 6					217 eh o maior


 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores para a, b e c:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(" ");
		int x = (a+b+(Math.abs(a-b)))/2;
		System.out.println(" ");
		
		System.out.println("Resultado: ");
		if(x > c && x == a) {
			System.out.printf("%d eh o maior.%n", x);
		} else if (x > c && x == b) {
			System.out.printf("%d eh o maior.%n", x);		
		} else {
			System.out.printf("%d eh o maior.%n", c);
		}
		
		sc.close();
		
	}

}
