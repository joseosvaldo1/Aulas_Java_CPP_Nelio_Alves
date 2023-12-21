package module_I;
import java.util.Locale;
import java.util.Scanner;


public class Bee_1008 {

	public static void main(String[] args) {
/* 
 
 Escreva um programa que leia o número de um funcionário, 
 seu número de horas trabalhadas, o valor que recebe por hora e 
 calcula o salário desse funcionário. A seguir, mostre o número 
 e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas 
casas decimais, representando o número, quantidade de horas 
trabalhadas e o valor que o funcionário recebe por hora trabalhada, 
respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo 
fornecido, com um espaço em branco antes e depois da igualdade. 
No caso do salário, também deve haver um espaço em branco após o 
$.

Exemplos de Entrada		Exemplos de Saída
25						NUMBER = 25
100						SALARY = U$ 550.00				
5.50			

1						NUMBER = 1
200						SALARY = U$ 4100.00
20.50


6						NUMBER = 6
145						SALARY = U$ 2254.75  
15.55


 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Data: ");
		System.out.println("Enter a value 'employeeNumber': ");
		int employeeNumber = sc.nextInt();
		System.out.println("Enter a value 'workedHours': ");
		int workedHours = sc.nextInt();
		System.out.println("Enter a value 'hourlyWage': ");
		double hourlyWage = sc.nextDouble();
		double salary = workedHours*hourlyWage;

		System.out.println(" ");
		System.out.println("Output Data:");
		System.out.println("NUMBER = " + employeeNumber);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		
		sc.close();
		
	}

}
