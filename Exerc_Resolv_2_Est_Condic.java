package module_I;
import java.util.Locale;
import java.util.Scanner;
public class Exerc_Resolv_2_Est_Condic {

	public static void main(String[] args) {
	/*
	Leia 3 valores de ponto flutuante e efetue o cálculo das raízes 
	da equação de Bhaskara. Se não for possível calcular as raízes, 
	mostre a mensagem correspondente “Impossivel calcular”, caso haja 
	uma divisão por 0 ou raiz de numero negativo.

	Entrada
	Leia três valores de ponto flutuante (double) A, B e C.

	Saída
	Se não houver possibilidade de calcular as raízes, apresente a 
	mensagem "Impossivel calcular". Caso contrário, imprima o 
	resultado das raízes com 5 dígitos após o ponto, com uma mensagem 
	correspondente conforme exemplo abaixo. Imprima sempre o final de 
	linha após cada mensagem.

	Exemplos de Entrada				Exemplos de Saída
	10.0 20.1 5.1					R1 = -0.29788
									R2 = -1.71212
	
	0.0 20.0 5.0					Impossivel calcular

	10.3 203.0 5.0					R1 = -0.02466
									R2 = -19.68408

	10.0 3.0 5.0					Impossivel calcular	 

	
	*/
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	//Dados de Entrada - Input Data:
	System.out.println("Resolvendo a equação AX²+BX+C = 0");
	System.out.print("Type a vale for A = ");
	double A = sc.nextDouble();
	System.out.print("Type a vale for B = ");
	double B = sc.nextDouble();
	System.out.print("Type a vale for C = ");
	double C = sc.nextDouble();
	double delta, R1, R2;
	
	System.out.println(" ");
	//Processamento de Dados - Data Processing:
	delta = Math.sqrt(Math.pow(B, 2) - 4*A*C);
	
	if (delta >= 0 && A != 0) {
		R1 = (-B + delta) / (2*A);
		R2 = (-B - delta) / (2*A);
		System.out.printf("R1 = %.5f%n", R1);
		System.out.printf("R2 = %.5f%n", R2);
	} else {
		System.out.println("Impossível calcular");
	}

	
	
	sc.close();
	}

}
