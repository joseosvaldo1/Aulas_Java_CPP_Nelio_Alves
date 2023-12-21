package module_I;
import java.util.Scanner;


public class Bee_1072 {

	public static void main(String[] args) {
	/*
	Leia um valor inteiro N. Este valor será a quantidade de valores 
	inteiros X que serão lidos em seguida.
	Mostre quantos destes valores X estão dentro do intervalo [10,20] 
	e quantos estão fora do intervalo, mostrando essas informações.

	Entrada
	A primeira linha da entrada contém um valor inteiro N (N < 10000),
	que indica o número de casos de teste.
	Cada caso de teste a seguir é um valor inteiro X (-10⁷ < X <10⁷).
 

	Saída
	Para cada caso, imprima quantos números estão dentro (in) e 
	quantos valores estão fora (out) do intervalo.

	Exemplo de Entrada		Exemplo de Saída
	4						2 in
	14						2 out
	123
	10		
	-25
	 
	*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int valoresDentroDointervalo = 0;
		int valoresForaDoIntervalo = 0;
		
		for (int i = 0; i < n; i++) {
			int valor = sc.nextInt();
			if ((valor < 10) || (valor > 20)) {
				valoresForaDoIntervalo++;
			}
			else {
				valoresDentroDointervalo++;
			}	
		}
		System.out.printf("%d in%n", valoresDentroDointervalo);
		System.out.printf("%d out%n", valoresForaDoIntervalo);
		
		
		sc.close();

	}

}
