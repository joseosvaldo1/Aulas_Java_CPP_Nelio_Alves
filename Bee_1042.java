package module_I;

import java.util.Scanner;

public class Bee_1042 {

	public static void main(String[] args) {
	/* 
	Leia 3 valores inteiros e ordene-os em ordem crescente. No final, 
	mostre os valores em ordem crescente, uma linha em branco e em 
	seguida, os valores na sequência como foram lidos.

	Entrada
	A entrada contem três números inteiros.

	Saída
	Imprima a saída conforme foi especificado.

	Exemplo de Entrada		Exemplo de Saída
	7 21 -14				-14
							7
							21

							7
							21
							-14

	-14 21 7				-14
							7
							21

							-14
							21
							7	
								
	*/
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();
	
	int temp;
	//Como os números foram introduzidos:
	System.out.println(" ");
	System.out.println(n1);
	System.out.println(n2);
	System.out.println(n3);
	System.out.println(" ");
	
	if (n1 > n2) {
		temp = n1;
		n1 = n2;
		n2 = temp;
	}
	if (n1 > n3) {
		temp = n1;
		n1 = n3;
		n3 = temp;
	}
	if (n2 > n3) {
		temp = n2;
		n2 = n3;
		n3 = temp;
	}
	//Em ordem crescente:
	System.out.println(n1);
	System.out.println(n2);
	System.out.println(n3);
	
	sc.close();
		
		
	}

}
