package module_I;
import java.util.Scanner;
import java.util.Locale;

public class Bee_1015 {

	public static void main(String[] args) {
/*
Leia os quatro valores correspondentes aos eixos x e y de dois 
pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a 
distância entre eles, mostrando 4 casas decimais após a vírgula, 
segundo a fórmula:
            ___________________
Distância =√(x2-x1)² + (y2-y1)²

Entrada
O arquivo de entrada contém duas linhas de dados. 
A primeira linha contém dois valores de ponto flutuante:
x1 y1 e a segunda linha contém dois valores de ponto flutuante 
x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula 
fornecida, com 4 casas após o ponto decimal.

Exemplo de Entrada			Exemplo de Saída
1.0 7.0						4.4721
5.0 9.0

-2.5 0.4					16.1484
12.1 7.3

2.5 -0.4					16.4575
-12.2 7.0


 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Data - Values For Coordinates:");
		System.out.println("Enter a value 'x1' and 'y1' for point P1:");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println(" ");
		System.out.println("Enter a value 'x2' and 'y2' for point P2:");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.println(" ");
		
		//Processing:
		double distance = Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
		
		System.out.println("Output Data: ");
		System.out.printf("%.4f%n", distance);
				
				
		sc.close();
				
	}

}
