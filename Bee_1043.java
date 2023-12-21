package module_I;
import java.util.Scanner;
import java.util.Locale;

public class Bee_1043 {

	public static void main(String[] args) {
		/*
		Leia 3 valores reais (A, B e C) e verifique se eles formam ou 
		não um triângulo. Em caso positivo, calcule o perímetro do 
		triângulo e apresente a mensagem:


		Perimetro = XX.X


		Em caso negativo, calcule a área do trapézio que tem A e B 
		como base e C como altura, mostrando a mensagem


		Area = XX.X

		Entrada
		A entrada contém três valores reais.

		Saída
		O resultado deve ser apresentado com uma casa decimal.

		Exemplo de Entrada			Exemplo de Saída
		6.0 4.0 2.0					Area = 10.0

		6.0 4.0 2.1					Perimetro = 12.1
		
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os possíveis valores de lados do triângulo:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		System.out.println(" ");
		
		if ((a < b+c) && (b < a+c) && (c < a+b)) {
			double perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		}
		else {
			double area = ((a+b)*c)/2.0;
			System.out.printf("Area = %.1f%n", area);
		}
		
		sc.close();
		
		
	}

}
