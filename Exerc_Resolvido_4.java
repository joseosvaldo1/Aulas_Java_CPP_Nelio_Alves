package module_I;
import java.util.Scanner;

public class Exerc_Resolvido_4 {

	public static void main(String[] args) {
	/*
	Conversão de Tempo


Leia um valor inteiro, que é o tempo de duração em segundos de 
um determinado evento em uma fábrica, e informe-o expresso no 
formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido 
para horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada		Exemplo de Saída
556						0:9:16

1						0:0:1

140153					38:55:53

	 */
	Scanner sc = new Scanner(System.in);
	//Dados de entrada - Input Data:
	System.out.println("Input Data:");
	System.out.println("Enter a duration 'N' time in seconds:");
	int N = sc.nextInt();
	int hours, minutes, seconds, rest;
	System.out.println(" ");
	
	//Processing - Processamento:
	/*
	int hours = N / 3600;            				 // Quantidade de Horas;
	int minutes = (N - (hours*3600)) / 60;           // Quantidade de Minutos;
 	int seconds = (N - (hours*3600 + minutes*60));	 // Quantidade de segundos;  
	*/
	
	hours = N / 3600;
	rest = N % 3600;
	minutes = rest / 60;
	seconds = rest % 60;
	
	
	System.out.println("Output Data: ");
	System.out.printf("%d:%d:%d%n",hours,minutes,seconds);
	
	
	sc.close();	
	}

}
