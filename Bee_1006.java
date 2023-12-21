package module_I;
import java.util.Locale;
import java.util.Scanner;

public class Bee_1006 {

	public static void main(String[] args) {
/* 
 Leia 3 valores, no caso, variáveis A, B e C, que são as três 
 notas de um aluno. A seguir, calcule a média do aluno, sabendo 
 que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 
 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma 
 casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla 
precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, 
com 1 dígito após o ponto decimal e com um espaço em branco antes e 
depois da igualdade. Assim como todos os problemas, não esqueça de 
imprimir o fim de linha após o resultado
 
	Exemplos de Entrada			Exemplos de Saída
	5.0							MEDIA = 6.3
	6.0
	7.0

	5.0							MEDIA = 9.0
	10.0
	10.0

	10.0						MEDIA = 7.5
	10.0
	5.0

 */
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Input Data - Grades A, B and C:");
	
	System.out.println("Enter a value for grade A bellow: ");
	double A = sc.nextDouble();
	System.out.println("Enter a value for grade B bellow: ");
	double B = sc.nextDouble();
	System.out.println("Enter a value for grade C bellow: ");
	double C = sc.nextDouble();
	
	//Processing Average:
	double average = (2.0*A + 3.0*B + 5.0*C) / 10.0;
	
	System.out.println(" ");
	System.out.println("Output Data - Student Average:");
	System.out.printf("AVERAGE = %.1f%n", average);
	System.out.printf("MEDIA = %.1f%n", average);

	sc.close();
	}

}
