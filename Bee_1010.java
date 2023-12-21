package module_I;

import java.util.Locale;
import java.util.Scanner;

public class Bee_1010 {
	public static void main(String[] args) {
	/* 
	Neste problema, deve-se ler o código de uma peça 1, o número de 
	peças 1, o valor unitário de cada peça 1, o código de uma peça 2, 
	o número de peças 2 e o valor unitário de cada peça 2. Após, 
	calcule e mostre o valor a ser pago.

	Entrada
	O arquivo de entrada contém duas linhas de dados. Em cada linha 
	haverá 3 valores, respectivamente dois inteiros e um valor com 2 
	casas decimais.

	Saída
	A saída deverá ser uma mensagem conforme o exemplo fornecido 
	abaixo, lembrando de deixar um espaço após os dois pontos e 
	um espaço após o "R$". O valor deverá ser apresentado com 2 
	casas após o ponto.

	Exemplos de Entrada			Exemplos de Saída
	12 1 5.30					VALOR A PAGAR: R$ 15.50
	16 2 5.10

	13 2 15.30					VALOR A PAGAR: R$ 51.40
	161 4 5.20

	1 1 15.10					VALOR A PAGAR: R$ 30.20
	2 1 15.10

	*/
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Input Data: ");
	System.out.println("Enter code, quantity and price for part 1 bellow:");
	int partCode1 = sc.nextInt();
	int quantityPart1 = sc.nextInt();
	double pricePart1 = sc.nextDouble();
	System.out.println("Enter code, quantity and price for part 2 bellow:");
	int partCode2 = sc.nextInt();
	int quantityPart2 = sc.nextInt();
	double pricePart2 = sc.nextDouble();
	
	double partExpense1 = quantityPart1*pricePart1;
	double partExpense2 = quantityPart2*pricePart2;
	
	double amountToPay = partExpense1 + partExpense2; 
	System.out.println(" ");
	System.out.println("Output Data: ");
	System.out.printf("Total spent on part 1 (whose code is%d): %.2f%n", partCode1, partExpense1);
	System.out.printf("Total spent on part 2 (whose code is %d): %.2f%n", partCode2, partExpense2);
	System.out.println(" ");
	
	System.out.printf("VALOR A PAGAR: R$ %.2f%n", amountToPay);
	System.out.printf("AMOUNT TO PAY: R$ %.2f%n", amountToPay);
	
	
	sc.close();
		
		
		
	}
}
