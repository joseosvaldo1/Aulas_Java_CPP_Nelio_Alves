package module_I;
import java.util.Scanner;


public class Bee_1065 {

	public static void main(String[] args) {
	/*
	Faça um programa que leia 5 valores inteiros. Conte quantos 
	destes valores digitados são pares e mostre esta informação.

	Entrada
	O arquivo de entrada contém 5 valores inteiros quaisquer.

	Saída
	Imprima a mensagem conforme o exemplo fornecido, indicando a 
	quantidade de valores pares lidos.

	Exemplo de Entrada			Exemplo de Saída
	7							3 valores pares
	-5
	6
	-4
	12
	 
	*/
	Scanner sc = new Scanner(System.in);
	int numerosPares = 0;
	
	for (int i = 0; i < 5; i++) {
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			numerosPares++;
		}
		
	}
	
		
	System.out.printf("%d valores pares%n", numerosPares);
		
	sc.close();

	}

}
