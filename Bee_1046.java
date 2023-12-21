package module_I;
import java.util.Scanner;

public class Bee_1046 {

	public static void main(String[] args) {
	/*
	Leia a hora inicial e a hora final de um jogo. A seguir calcule a 
	duração do jogo, sabendo que o mesmo pode começar em um dia e 
	terminar em outro, tendo uma duração mínima de 1 hora e máxima 
	de 24 horas.

	Entrada
	A entrada contém dois valores inteiros representando a hora de 
	início e a hora de fim do jogo.

	Saída
	Apresente a duração do jogo conforme exemplo abaixo.

	Exemplo de Entrada			Exemplo de Saída
	16 2						O JOGO DUROU 10 HORA(S)

	0 0							O JOGO DUROU 24 HORA(S)

	2 16						O JOGO DUROU 14 HORA(S)
	
	*/
	Scanner sc = new Scanner(System.in);
	System.out.print("Hora inicial do jogo: ");
	int initialHour = sc.nextInt();
	System.out.print("Hora final do jogo: ");
	int finalHour = sc.nextInt();
	System.out.println(" ");
	int gameDuration;
	
	if ( finalHour > initialHour ) {
		gameDuration = finalHour - initialHour;
	} else {
		gameDuration = ( 24 + finalHour ) - ( initialHour );
	}
	System.out.println("O JOGO DUROU " + gameDuration + " HORA(S)");
	
	sc.close();
	}

}
