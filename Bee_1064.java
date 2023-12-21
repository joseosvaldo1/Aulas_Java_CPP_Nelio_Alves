package module_I;

import java.util.Scanner;
import java.util.Locale;

public class Bee_1064 {

	public static void main(String[] args) {
	/*

	Leia 6 valores. Em seguida, mostre quantos destes valores 
	digitados foram positivos. Na próxima linha, deve-se mostrar 
	a média de todos os valores positivos digitados, com um dígito 
	após o ponto decimal.

	Entrada
	A entrada contém 6 números que podem ser valores inteiros ou de 
	ponto flutuante. Pelo menos um destes números será positivo.

	Saída
	O primeiro valor de saída é a quantidade de valores positivos. 
	A próxima linha deve mostrar a média dos valores positivos 
	digitados.

	Exemplo de Entrada		Exemplo de Saída
	7						4 valores positivos
	-5						7.4
	6
	-3.4
	4.6
	12
	
	*/
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite os seis valores:");
	double n1 = sc.nextDouble();
	double n2 = sc.nextDouble();
	double n3 = sc.nextDouble();
	double n4 = sc.nextDouble();
	double n5 = sc.nextDouble();
	double n6 = sc.nextDouble();
	
	double soma = 0;
	int count = 0;
	double avarage;
	
	if (n1>0) {
		count++;
		soma+=n1;
	}
	if (n2>0) {
		count++;
		soma+=n2;
	}
	if (n3>0) {
		count++;
		soma+=n3;
	}
	if (n4>0) {
		count++;
		soma+=n4;
	}
	if (n5>0) {
		count++;
		soma+=n5;
	}
	if (n6>0) {
		count++;
		soma+=n6;
	}
	
	
		
	avarage = (float) (soma)/(count);
	
	System.out.printf("%d valores positivos%n", count);
	System.out.printf("%.1f%n", avarage);
	
	sc.close();
		

	}

}
