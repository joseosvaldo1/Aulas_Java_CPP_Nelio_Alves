package module_I;

import java.util.Scanner;
import java.util.Locale;

public class Bee_1060 {

	public static void main(String[] args) {
	/*
	Faça um programa que leia 6 valores. Estes valores serão somente 
	negativos ou positivos (desconsidere os valores nulos). A seguir,
	mostre a quantidade de valores positivos digitados.

	Entrada
	Seis valores, negativos e/ou positivos.

	Saída
	Imprima uma mensagem dizendo quantos valores positivos foram lidos.

	Exemplo de Entrada		Exemplo de Saída
	7						4 valores positivos
	-5
	6
	-3.4
	4.6
	12
		 
	*/
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite seis valores:");
	double n1 = sc.nextDouble();
	double n2 = sc.nextDouble();
	double n3 = sc.nextDouble();
	double n4 = sc.nextDouble();
	double n5 = sc.nextDouble();
	double n6 = sc.nextDouble();
	
	
	System.out.println(" ");
	
	int count = 0;
	if (n1 > 0) {
		count++;
	}
	if (n2 > 0) {
		count++;
	}
	if (n3 > 0) {
		count++;
	}
	if (n4 > 0) {
		count++;
	}
	if (n5 > 0) {
		count++;
	}
	if (n6 > 0) {
		count++;
	}
	
	System.out.printf("%d valor(es) positivo(s)%n", count);
	sc.close();
	

	}

}
