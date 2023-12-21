package module_I;
import java.util.Locale;
import java.util.Scanner;

public class Bee_1011 {

	public static void main(String[] args) {
/*
Faça um programa que calcule e mostre o volume de uma esfera sendo 
fornecido o valor de seu raio (R). A fórmula para calcular o volume 
é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois 
algumas linguagens (dentre elas o C++), assumem que o resultado da 
divisão entre dois inteiros é outro inteiro.

Entrada
O arquivo de entrada contém um valor de ponto flutuante (dupla 
precisão), correspondente ao raio da esfera.

Saída
A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido 
abaixo, com um espaço antes e um espaço depois da igualdade. O valor 
deverá ser apresentado com 3 casas após o ponto.

Exemplos de Entrada			Exemplos de Saída
3							VOLUME = 113.097

15							VOLUME = 14137.155

1523						VOLUME = 14797486501.627
 */

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	final double π = 3.14159;
	
	System.out.println("Input Data - Radius Sphere: ");
	System.out.print("Enter a value for radius of the sphere = ");
	double radiusSphere = sc.nextDouble();
	
	//Calculation of the volume of the sphere
	double volumeSphere = (4.0/3)*π*(Math.pow(radiusSphere,3));
	
	
	System.out.println(" ");
	System.out.println("Output Data - Volume Of The Sphere:");
	System.out.printf("VOLUME = %.3f%n", volumeSphere);

	sc.close();
	}

}
