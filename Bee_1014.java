package module_I;

import java.util.Scanner;
import java.util.Locale;


public class Bee_1014 {

	public static void main(String[] args) {
	/*
	Calcule o consumo médio de um automóvel sendo fornecidos a 
	distância total percorrida (em Km) e o total de combustível 
	gasto (em litros).

	Entrada
	O arquivo de entrada contém dois valores: um valor inteiro X 
	representando a distância total percorrida (em Km), e um valor 
	real Y representando o total de combustível gasto, com um dígito 
	após o ponto decimal.

	Saída
	Apresente o valor que representa o consumo médio do automóvel com 
	3 casas após a vírgula, seguido da mensagem "km/l".

	Exemplo de Entrada			Exemplo de Saída
	500							14.286 km/l
	35.0

	2254						18.119 km/l
	124.4

	4554						9.802 km/l	
	464.6

		 
	 */ 
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Input Data:");
	System.out.println("Enter a value for 'travel distance' in km below:");
	int travellDistance = sc.nextInt();
	System.out.println("Enter a value for 'fuel consumed' in l below:");
	double fuelConsumed = sc.nextDouble();
	double averageConsumption = (double) travellDistance/fuelConsumed;
	System.out.println(" ");
	System.out.println("Output Data: ");
	System.out.print("Average Consumption: ");
	System.out.printf("%.3f km/l", averageConsumption);
	
	
	sc.close();
		
		
		
	}

}
