package module_I;
import java.util.Scanner;
public class Bee_1035 {

	public static void main(String[] args) {
	/* 
	Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior 
	do que C e se D for maior do que A, e a soma de C com D for 
	maior que a soma de A e B e se C e D, ambos, forem positivos e 
	se a variável A for par escrever a mensagem "Valores aceitos", 
	senão escrever "Valores nao aceitos".

	Entrada
	Quatro números inteiros A, B, C e D.

	Saída
	Mostre a respectiva mensagem após a validação dos valores.

	Exemplo de Entrada			Exemplo de Saída
	5 6 7 8						Valores nao aceitos
	
	2 3 2 6						Valores aceitos
	
	*/
	Scanner sc = new Scanner(System.in);
	//Input Data - Dados de Entrada:
	System.out.println("Input Data - Dados de Entrada:");
	System.out.print("Type an integer value for 'a': ");
	int a = sc.nextInt();
	System.out.print("Type an integer value for 'b': ");
	int b = sc.nextInt();
	System.out.print("Type an integer value for 'c': ");
	int c = sc.nextInt();
	System.out.print("Type an integer value for 'd': ");
	int d = sc.nextInt();
	System.out.println(" ");
	
	System.out.println("Output Data - Dados de Saída:");
	if ( (b > c) && (d > a) && (c+d) > (a + b) && (c > 0) && (d >0) && (a%2 == 0) ) {
		System.out.println("Valores aceitos");
	} else {
		System.out.println("Valores não aceitos");
	}
	
	
	sc.close();
	
	}

}
