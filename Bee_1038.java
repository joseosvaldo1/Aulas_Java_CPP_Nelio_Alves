package module_I;
import java.util.Scanner;
import java.util.Locale;

public class Bee_1038 {

	public static void main(String[] args) {
	/* Timelimit: 1
		Com base na tabela abaixo, escreva um programa que leia o 
		código de um item e a quantidade deste item. A seguir, 
		calcule e mostre o valor da conta a pagar.
				
	Código		Especificação		Preço
	1			Cachorro-quente		R$ 4.00
	2			X-Salada			R$ 4.50
	3			X-Bacon				R$ 5.00
	4			Torrada Simples		R$ 2.00
	5			Refrigerante		R$ 1.50

	Entrada
		O arquivo de entrada contém dois valores inteiros 
		correspondentes ao código e à quantidade de um item 
		conforme tabela acima.

	Saída
		O arquivo de saída deve conter a mensagem "Total: R$ " 
		seguido pelo valor a ser pago, com 2 casas após o ponto 
		decimal.


	Exemplo de Entrada			Exemplo de Saída
	3 2							Total: R$ 10.00

	4 3							Total: R$ 6.00

	2 3							Total: R$ 13.50

	 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Input Data - Dados de Entrada:
		System.out.println("Input Data - Dados de Entrada:");
		System.out.print("Choose an item from those on the price table: ");
		int code = sc.nextInt();
		System.out.print("Choose the quantity of the chosen item: ");
		int quantity = sc.nextInt();
		double price = 0;
		
		System.out.println(" ");
		
		//Processing Data:
		switch (code) {
			case 1:
				price = 4.00;
				break;
			case 2:
				price = 4.50;
				break;
			case 3:
				price = 5.00;
				break;
			case 4:
				price = 2.00;
				break;
			case 5:
				price = 1.50;
				break;
		}
		
		double total = price*quantity;
		
		System.out.println("Output Data - Saída de Dados:");
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	}

}
