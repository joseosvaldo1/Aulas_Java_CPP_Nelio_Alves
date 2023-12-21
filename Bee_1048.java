package module_I;

import java.util.Locale;
import java.util.Scanner;

public class Bee_1048 {

	public static void main(String[] args) {
	/*
	A empresa ABC resolveu conceder um aumento de salários a seus 
	funcionários de acordo com a tabela abaixo:


	Salário					Percentual de Reajuste
	0 - 400.00				15%
	400.01 - 800.00			12%
	800.01 - 1200.00		10%
	1200.01 - 2000.00		7%
	Acima de 2000.00		4%


	Leia o salário do funcionário e calcule e mostre o novo salário, 
	bem como o valor de reajuste ganho e o índice reajustado, em 
	percentual.

	Entrada
	A entrada contém apenas um valor de ponto flutuante, com duas 
	casas decimais.

	Saída
	Imprima 3 linhas na saída: o novo salário, o valor ganho de 
	reajuste (ambos devem ser apresentados com 2 casas decimais) e 
	o percentual de reajuste ganho, conforme exemplo abaixo.

	Exemplo de Entrada			Exemplo de Saída
	400.00						Novo salario: 460.00
								Reajuste ganho: 60.00
								Em percentual: 15 %

	800.01						Novo salario: 880.01	
								Reajuste ganho: 80.00
								Em percentual: 10 %

	2000.00						Novo salario: 2140.00
								Reajuste ganho: 140.00
								Em percentual: 7 % 
	*/
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	//Input Data:
	System.out.println("Entrada de Dados - Input Data:");
	System.out.println("Enter a value for salary of employee bellow:");
	double salary = sc.nextDouble();
	double increasePercentage;
	double newSalary, salaryAdjustment;
	

	//Processing Data:
	if ( salary <= 400.00 ) {
		increasePercentage = 15;
		
	} else if ( salary > 400.00 && salary <= 800.00 ) {
		increasePercentage = 12;	
	}else if ( salary > 800.00 && salary <= 1200.00 ) {
		increasePercentage = 10;	
	}else if ( salary > 1200.00 && salary <= 2000.00 ){
		increasePercentage = 7;
	} else {
		increasePercentage = 4;
	}
	
	System.out.println(" ");
	System.out.println("Saída de Dados - Output Data:");
	salaryAdjustment = salary*(increasePercentage/100);
	newSalary = (1+increasePercentage/100)*salary;
	System.out.printf("Novo salario: %.2f%n", newSalary);
	System.out.printf("Reajuste ganho:  %.2f%n", salaryAdjustment);
	System.out.printf("Em percentual: %.0f %%\n", increasePercentage);

	sc.close();

	}
}
