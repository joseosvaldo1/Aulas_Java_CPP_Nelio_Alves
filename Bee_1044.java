package module_I;
import java.util.Scanner;

public class Bee_1044 {

	public static void main(String[] args) {
	/*
	
	 Leia 2 valores inteiros (A e B). Após, o programa deve 
	 mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
	 indicando se os valores lidos são múltiplos entre si.

	Entrada
	A entrada contém valores inteiros.

	Saída
	 saída deve conter uma das mensagens conforme descrito acima.

	Exemplo de Entrada		Exemplo de Saída
	6 24					Sao Multiplos

	6 25					Nao sao Multiplos

	*/
	Scanner sc = new Scanner(System.in);
	System.out.print("Type a vale for first integer number: ");
	int a = sc.nextInt();
	System.out.print("Type a vale for second integer number: ");
	int b = sc.nextInt();
	System.out.println(" ");
	
	if ( b < a ) {
		System.out.println("The second number must be greater than the first to be a multiple!");
	}else if (( b > a ) && ( b % a == 0 ) ){
		System.out.println("São múltiplos!");
	}else {
		System.out.println("Não são Múltiplos!");
	}
	
	sc.close();
	}

}
