package module_I;

import java.util.Scanner;

public class Exerc_Resolv_2_Est_Rep {

	public static void main(String[] args) {
	/*
	Faça um programa para ler um número indeterminado
	de dados, contendo cada um, a idade de um indivíduo.
	O último dado, que não entrará nos cálculos, contém
	um valor de idade negativa. Calcular e imprimir a 
	idade média deste grupo de indivíduos. Se for entrado
	um valor nagativo na primeira vez, mostrar a mensagem
	"impossível calcular".     
	Exemplo:
	Dados de entrada:		Dados de Saída:
	31						34.7 
	27
	46
	-5
	
	-10						impossível calcular
	
	*/
	Scanner sc = new Scanner(System.in);
	int idade = sc.nextInt();
	int soma = 0;
	int cont = 0;
	
	while ( idade >= 0) {
		soma += idade;
		cont += 1;
		idade = sc.nextInt();
	}
	if (cont > 0 ) {
		double mediaDasIdades = (double) soma / cont;
		System.out.printf("%.2f%n", mediaDasIdades);
	}else {
		System.out.println("impossível calcular");
	}
	
	
	
	sc.close();
	}
}
