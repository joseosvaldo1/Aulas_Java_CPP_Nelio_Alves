package module_I;
import java.util.Scanner;

public class Bee_1061 {

	public static void main(String[] args) {
	/*
	Pedrinho está organizando um evento em sua Universidade. 
	O evento deverá ser no mês de Abril, iniciando e terminando 
	dentro do mês. O problema é que Pedrinho quer calcular o tempo 
	que o evento vai durar, uma vez que ele sabe quando inicia e 
	quando termina o evento.

	Sabendo que o evento pode durar de poucos segundos a vários dias, 
	você deverá ajudar Pedrinho a calcular a duração deste evento.

	Entrada
	Como entrada, na primeira linha vai haver a descrição “Dia”, 
	seguido de um espaço e o dia do mês no qual o evento vai começar. 
	Na linha seguinte, será informado o momento no qual o evento vai 
	iniciar, no formato hh : mm : ss. Na terceira e quarta linha de 
	entrada haverá outra informação no mesmo formato das duas primeiras 
	linhas, indicando o término do evento.

	Saída
	Na saída, deve ser apresentada a duração do evento, no seguinte 
	formato:

	W dia(s)
	X hora(s)
	Y minuto(s)
	Z segundo(s)

	Obs: Considere que o evento do caso de teste para o problema 
	tem duração mínima de 1 minuto.

	Exemplo de Entrada			Exemplo de Saída
	Dia 5						3 dia(s)
	08 : 12 : 23				22 hora(s)
	Dia 9						1 minuto(s)
	06 : 13 : 23				0 segundo(s)

	 */
	Scanner sc = new Scanner(System.in);
	//Input Data - Dados de Entrada:
	System.out.println("Input Data - Datos de Entrada: ");
	System.out.print("Type the initial day of tehe event: ");
	int dayStart = sc.nextInt();
	System.out.print("Enter the exact start time of the event ");
	int hourStart = sc.nextInt();
	int minuteStart = sc.nextInt();
	int secondStart = sc.nextInt();
	System.out.print("Type the final day of tehe event: ");
	int dayEnd = sc.nextInt();
	System.out.print("Enter the exact end time of the event: ");
	int hourEnd = sc.nextInt();
	int minuteEnd = sc.nextInt();
	int secondEnd = sc.nextInt();
	System.out.println(" ");
	
	//Variables Declaration:
	int intervalOfDays = 0; 
	int intervalOfHours = 0;
	int intervalOfMinutes = 0; 
	int intervalOfSeconds = 0;
	
	//Data processing - Processamento de Dados:
	if ( hourEnd<hourStart ) {
		dayEnd-=1;
		hourEnd+=24;
	} else if (minuteEnd < minuteStart) {
		hourEnd-=1;
		minuteEnd+=60;
	} else if (secondEnd < secondStart) {
		minuteEnd-=1;
		secondEnd+=60;
	} else {
		intervalOfDays = dayEnd - dayStart;
		intervalOfHours = hourEnd - hourStart;
		intervalOfMinutes = minuteEnd - minuteStart;
		intervalOfSeconds = secondEnd - secondStart;
	}

	
	System.out.println("Output Data - Saída de Dados: ");
	System.out.printf("%d dia(s)%n", intervalOfDays);
	System.out.printf("%d horas(s)%n", intervalOfHours);
	System.out.printf("%d minutos(s)%n", intervalOfMinutes);
	System.out.printf("%d segundos(s)%n", intervalOfSeconds);
	
	
	sc.close();

	}

}
