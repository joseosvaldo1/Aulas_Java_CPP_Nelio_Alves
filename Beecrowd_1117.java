package module_I;

import java.util.Scanner;
import java.util.Locale;

public class Beecrowd_1117 {

	public static void main(String[] args) {
	/*
	Faça um programa que leia as notas referentes às duas avaliações 
	de um aluno. Calcule e imprima a média semestral. Faça com que o 
	algoritmo só aceite notas válidas (uma nota válida deve pertencer 
	ao intervalo [0,10]). Cada nota deve ser validada separadamente.

	Entrada
	A entrada contém vários valores reais, positivos ou negativos. 
	O programa deve ser encerrado quando forem lidas duas notas 
	válidas.

	Saída
	Se uma nota inválida  for lida, deve ser impressa a mensagem 
	"nota invalida". Quando duas notas válidas forem lidas, deve 
	ser impressa a mensagem "media = " seguido do valor do cálculo. 
	O valor deve ser apresentado com duas casas após o ponto decimal.

	Exemplo de Entrada		Exemplo de Saída
	-3.5					nota invalida
	3.5						
	11.0					nota invalida
	10.0					media = 6.75
	 
	*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		double somaNotas = 0.0;
		
		while ( count < 2 ) {
			double nota = sc.nextDouble();
			
			if ( (nota < 0) || (nota > 10) ){
				System.out.println("nota invalida");
			}
			else {
				count++;
				somaNotas += nota; 
			}		
		}
		
		double media = (double) (somaNotas/count);
		
		System.out.printf("media = %.2f%n", media);
		
		
		
		sc.close();
}
}
