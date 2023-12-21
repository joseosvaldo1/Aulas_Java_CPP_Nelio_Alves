package module_I;
import java.util.Scanner;


public class Bee_1052 {
	public static void main(String[] args) {
	/*
	Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a 
	este valor, deve ser apresentado como resposta o mês do ano por 
	extenso, em inglês, com a primeira letra maiúscula.

	Entrada
	A entrada contém um único valor inteiro.

	Saída
	Imprima por extenso o nome do mês correspondente ao número 
	existente na entrada, com a primeira letra em maiúscula.

	Exemplo de Entrada		Exemplo de Saída
	4						April
 	 
	*/
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	System.out.println(" ");
	
	switch (month) {
		case 1:
			month = 1;
			System.out.println("January");
			break;
		case 2:
			month = 2;
			System.out.println("February");
			break;
		case 3:
			month = 3;
			System.out.println("March");
			break;
		case 4:
			month = 4;
			System.out.println("April");
			break;
		case 5:
			month = 5;
			System.out.println("May");
			break;	
		case 6:
			month = 6;
			System.out.println("June");
			break;		
		case 7:
			month = 7;
			System.out.println("July");
			break;
		case 8:
			month = 8;
			System.out.println("August");
			break;
		case 9:
			month = 9;
			System.out.println("September");
			break;
		case 10:
			month = 10;
			System.out.println("October");
			break;
		case 11:
			month = 11;
			System.out.println("November");
			break;
		case 12:
			month = 12;
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid input");
			break;
			
	}
		
	sc.close();
		
	}
}
