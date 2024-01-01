package module_I;
import java.util.Scanner;

public class Bee_1071 {

	public static void main(String[] args) {
	/*
	Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a 
	soma dos números impares entre eles.

	Entrada
	O arquivo de entrada contém dois valores inteiros.

	Saída
	O programa deve imprimir um valor inteiro. Este valor é a soma 
	dos valores ímpares que estão entre os valores fornecidos na 
	entrada que deverá caber em um inteiro.

	Exemplo de Entrada		Exemplo de Saída
	6						5
	-5

	15						13
	12

	12						0
	12

	*/
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int somaImpares = 0;
	
	//Tranformando o x no valor menor:
	if ( x > y) {
		int temp = x;
		x = y;
		y = temp;
	}
	if (x % 2 == 0) {
		for (int i = x + 1; i < y; i+=2 ) {
			somaImpares += i;
		}
		System.out.println(somaImpares);
	}
	else {
		for (int i = x + 2; i < y; i+=2 ) {
			somaImpares += i;
		}
		System.out.println(somaImpares);
	}
	
	
	
	sc.close();
		
		

	}

}
