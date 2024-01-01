package module_I;
import java.util.Locale;
import java.util.Scanner;

public class Bee_1079 {

	public static void main(String[] args) {
	/*
	Leia 1 valor inteiro N, que representa o número de casos de teste que vem 
	a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles 
	com uma casa decimal. Apresente a média ponderada para cada um destes 
	conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo 
	valor tem peso 3 e o terceiro valor tem peso 5.

	Entrada
	O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N 
	linha a seguir contém um caso de teste com três valores com uma casa decimal 
	cada valor.

	Saída
	Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme 
	exemplo abaixo.

	Exemplo de Entrada			Exemplo de Saída
	3
	6.5 4.3 6.2					5.7
	5.1 4.2 8.1					6.3
	8.0 9.0 10.0				9.3
	 
	*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			double somaVezesPesos = 0.0;
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
			somaVezesPesos = 2.0*valor1 + 3.0*valor2 + 5.0*valor3;
			double mediaPonderada = somaVezesPesos / 10.0;
			System.out.printf("%.1f%n", mediaPonderada);						
		}
		
		
		sc.close();		
	}

}
