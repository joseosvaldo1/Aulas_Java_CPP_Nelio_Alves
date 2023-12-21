package module_I;
import java.util.Locale;
import java.util.Scanner;


public class Exerc_Resolvido_2 {

	public static void main(String[] args) {
	/*
	Fazer um programa para ler as medidas da base e altura de um 
retângulo. Em seguida,mostrar o valor da área, perímetro e diagonal 
deste retângulo, com quatro casas decimais, conforme exemplo.
Entrada: 			Saída:
5.0 				AREA = 20.0000
4.0					PERIMETRO = 18.0000
					DIAGONAL = 6.4031
		
	*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Base do retângulo = ");
		double base = sc.nextDouble();
		System.out.print("Altura do retângulo = ");
		double altura = sc.nextDouble();
		double area = base * altura;
		double perimetro = 2.0 * (base + altura);
		double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		System.out.println(" ");
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		sc.close();
	}

}
