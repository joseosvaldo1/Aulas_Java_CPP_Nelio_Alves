package module_I;
import java.util.Scanner;
import java.util.Locale;

public class Bee_1154 {

	public static void main(String[] args) {
	/*
	Faça um algoritmo para ler um número indeterminado de dados, 
	contendo cada um, a idade de um indivíduo. O último dado, 
	que não entrará nos cálculos, contém o valor de idade negativa. 
	Calcular e imprimir a idade média deste grupo de indivíduos.


	Entrada
	A entrada contém um número indeterminado de inteiros. A entrada 
	será encerrada quando um valor negativo for lido.

	Saída
	A saída contém um valor correspondente à média de idade dos 
	indivíduos.

	A média deve ser impressa com dois dígitos após o ponto decimal.

	Exemplo de Entrada		Exemplo de Saída
	34						39.25 
	56
	44
	23
	-2
	
	*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int somaIdades = 0;
		double mediaDasIdades;
		
		int idade = sc.nextInt();
		
		while (idade > 0) {
			count++;
			somaIdades += idade;
			idade = sc.nextInt();
		}
		
		if (count > 0) {
			mediaDasIdades = (double) (somaIdades)/(count);
			System.out.printf("%.2f%n",mediaDasIdades);
		}
		
		
		
		sc.close();
	}

}
