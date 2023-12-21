package module_I;
import java.util.Scanner;
import java.util.Locale;


public class Bee_1012 {

	public static void main(String[] args) {
/*
Escreva um programa que leia três valores com ponto flutuante de 
dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto 
decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha 
corresponde a uma das áreas descritas acima, sempre com mensagem 
correspondente e um espaço entre os dois pontos e o valor. O valor 
calculado deve ser apresentado com 3 dígitos após o ponto decimal.

Exemplos de Entrada			Exemplos de Saída
3.0 4.0 5.2					TRIANGULO: 7.800
							CIRCULO: 84.949
							TRAPEZIO: 18.200
							QUADRADO: 16.000
							RETANGULO: 12.000



12.7 10.4 15.2 				TRIANGULO: 96.520
							CIRCULO: 725.833
							TRAPEZIO: 175.560
							QUADRADO: 108.160
							RETANGULO: 132.080
		 		 
*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Data - Measurements A, B and C: ");
		System.out.println("Enter values for 'A', 'B' and 'C' bellow: ");
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		final double π = 3.14159;  // Value for pi
		
		System.out.println(" ");
		
		//Processing:
		double triangleArea = A*C / 2.0;
		double circleArea = π*Math.pow(C, 2);
		double trapezeArea = ((A + B)/2.0)*C;
		double squareArea = Math.pow(B,2);
		double rectangleArea = A*B;
		
		System.out.println("Output Data:");
		System.out.printf("TRIANGULO: %.3f%n", triangleArea);
		System.out.printf("CIRCULO: %.3f%n", circleArea);
		System.out.printf("TRAPEZIO: %.3f%n", trapezeArea);
		System.out.printf("QUADRADO: %.3f%n", squareArea);
		System.out.printf("RETANGULO: %.3f%n", rectangleArea);
		
		sc.close();

	}

}
