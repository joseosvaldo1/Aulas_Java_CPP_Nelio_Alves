package module_I;

import java.util.Scanner;
import java.util.Locale;

public class Bee_1017 {

	public static void main(String[] args) {
		/*
	Joaozinho quer calcular e mostrar a quantidade de litros de 
	combustível gastos em uma viagem, ao utilizar um automóvel que 
	faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse 
	através de um simples programa. Para efetuar o cálculo, deve-se 
	fornecer o tempo gasto na viagem (em horas) e a velocidade média 
	durante a mesma (em km/h). Assim, pode-se obter distância 
	percorrida e, em seguida, calcular quantos litros seriam 
	necessários. Mostre o valor com 3 casas decimais após o ponto.

	Entrada
	O arquivo de entrada contém dois inteiros. O primeiro é o tempo 
	gasto na viagem (em horas) e o segundo é a velocidade média 
	durante a mesma (em km/h).

	Saída
	Imprima a quantidade de litros necessária para realizar a viagem, 
	com três dígitos após o ponto decimal

	Exemplo de Entrada			Exemplo de Saída
	10							70.833									
	85

	2							15.333
	92

	22							122.833  
	67
	
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Data:");
		System.out.print("Enter a value for time interval: ");
		int timeInterval = sc.nextInt();
		System.out.print("Enter a value for average speed: ");
		int averageSpeed = sc.nextInt();
		
		int travelledDistance = timeInterval*averageSpeed;
		
		double fuelConsumption = (double) travelledDistance / 12;

		System.out.println(" ");
		System.out.println("------------------------------------");
		System.out.printf("Travelled Distance = %d km %n", travelledDistance);
		System.out.println("Fuel Cosumption: ");
		System.out.printf("%.3f litros.%n ", fuelConsumption);
		
		
		
		sc.close();

	}


}
