package module_I;
import java.util.Scanner;
import java.util.Locale;

public class Bee_1041 {
	public static void main(String[] args) {
	/*
	Leia 2 valores com uma casa decimal (x e y), que devem representar
	as coordenadas de um ponto em um plano. A seguir, determine qual 
	o quadrante ao qual pertence o ponto, ou se está sobre um dos 
	eixos cartesianos ou na origem (x = y = 0).


						|   Q1
				Q2	    |
			   _________|_________
						|
				Q3		| 	Q4
						|
	Se o ponto estiver na origem, escreva a mensagem “Origem”.

	Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”,
	conforme for a situação.

	Entrada
	A entrada contem as coordenadas de um ponto.

	Saída
	A saída deve apresentar o quadrante em que o ponto se encontra.

	Exemplo de Entrada			Exemplo de Saída
	4.5 -2.2					Q4

	0.1 0.1						Q1

	0.0 0.0						Origem	

			 
	*/
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Input Data - Dados de Entrada");
	System.out.print("Enter a value for x: ");
	double x = sc.nextDouble();
	System.out.print("Enter a value for y: ");
	double y = sc.nextDouble();
	System.out.println(" ");
	System.out.println("Output Data ");
	
	// Data Processing:
	if (x == 0.0 && y == 0.0) {
		System.out.println("Origem");
	} else if (x == 0.0) {
		System.out.println("Eixo y");
	} else if ( y == 0.0) {
		System.out.println("Eixo x");
	} else if (x > 0.0 && y > 0.0) {
		System.out.println("Q1");
	} else if (x < 0.0 && y > 0.0) {
		System.out.println("Q2");
	} else if (x < 0.0 && y < 0.0) {
		System.out.println("Q3");
	} else {
		System.out.println("Q4");
	}
	
	sc.close();	
	}
}
