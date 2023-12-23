package module_I;
import java.util.Scanner;

public class Bee_1159 {

	public static void main(String[] args) {
	/*
	O programa deve ler um valor inteiro X indefinidas vezes. 
	(O programa irá parar quando o valor de X for igual a 0). 
	Para cada X lido, imprima a soma dos 5 pares consecutivos 
	a partir de X, inclusive o X , se for par. Se o valor de 
	entrada for 4, por exemplo, a saída deve ser 40, que é o 
	resultado da operação: 4+6+8+10+12, enquanto que se o valor 
	de entrada for 11, por exempo, a saída deve ser 80, que é 
	a soma de 12+14+16+18+20.

	Entrada
	O arquivo de entrada contém muitos valores inteiros. O último 
	valor do arquivo é zero.

	Saída
	Imprima a saida conforme a explicação acima e o exemplo abaixo.

	Exemplo de Entrada			Exemplo de Saída
	4							40
	11							80
	0

	*/
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		while ( x !=0 ) {
			int soma = 0;
			if ( x % 2 == 0) {
				for (int i = 0; i < 5; i++) {
					soma += x;
					x += 2;	
				}
				System.out.println(soma);
			}
			else {
				x++; //Acrescenta 1 se o x inicial for ímpar
				for (int i = 0; i < 5; i++) {
					soma += x;
					x += 2;
				}
				System.out.println(soma);
				
			}
			x = sc.nextInt();
				
		}		
		
		
		sc.close();
				
		
	}

}
