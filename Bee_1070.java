package module_I;
import java.util.Scanner;

public class Bee_1070 {

	public static void main(String[] args) {
	/*
	Leia um valor inteiro X. Em seguida apresente os 6 valores 
	ímpares consecutivos a partir de X, um valor por linha, 
	inclusive o X ser for o caso.

	Entrada
	A entrada será um valor inteiro positivo.

	Saída
	A saída será uma sequência de seis números ímpares.

	Exemplo de Entrada		Exemplo de Saída
	8						9, 11, 13, 15, 17, 19

	*/
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y;
	
	if ( x % 2 == 0 ) {
		y = x + 1;
		for(int i = 0; i < 12; i+=2) {
			System.out.println(y + i);
		}
	}
	else {
		y = x;
		for(int i = 0; i < 12; i+=2) {
			System.out.println(y + i);
		}
	}


	sc.close();
		
}
}
