package module_I;
import java.util.Scanner;

public class Bee_1020 {

	public static void main(String[] args) {
	/*
	 Leia um valor inteiro correspondente à idade de uma pessoa 
	 em dias e informe-a em anos, meses e dias

	Obs.: apenas para facilitar o cálculo, considere todo ano com 
	365 dias e todo mês com 30 dias. Nos casos de teste nunca 
	haverá uma situação que permite 12 meses e alguns dias, como 
	360, 363 ou 364. Este é apenas um exercício com objetivo de 
	testar raciocínio matemático simples.

	Entrada
	O arquivo de entrada contém um valor inteiro.

	Saída
	Imprima a saída conforme exemplo fornecido.

	Exemplo de Entrada		Exemplo de Saída
	400						1 ano(s)
							1 mes(es)
							5 dia(s)

	800						2 ano(s)
							2 mes(es)
							10 dia(s)
	
	30						0 ano(s)
							1 mes(es)
							0 dia(s)
	 */
	Scanner sc = new Scanner(System.in);
	// Input Data - Dados de Entrada:
	System.out.println("A person's age in N days: ");
	int N = sc.nextInt();
	System.out.println(" ");
	
	//Definition of Variables - Definição de Variáveis:
	int years, months, days, restYears, restMonths;
	
	//Processinf:
	years = N / 365;
	restYears = N % 365;
	months = restYears / 30;
	restMonths = restYears % 30;
	days = restMonths;
	
	System.out.println("Output Data - Dados de Saída:");
	System.out.printf("%d ano(s)%n", years);
	System.out.printf("%d mes(es)%n", months);
	System.out.printf("%d dia(s)%n", days);
	
	
	sc.close();
		
		
		
	}

}
