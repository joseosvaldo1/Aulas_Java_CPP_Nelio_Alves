package module_I;

import java.util.Scanner;
import java.util.Locale;

public class Bee_1016 {

	public static void main(String[] args) {
/*
Dois carros (X e Y) partem em uma mesma direção. O carro X sai com 
velocidade constante de 60 Km/h e o carro Y sai com velocidade 
constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se 
distanciar 30 quilômetros do carro X, ou seja, consegue se afastar 
um quilômetro a cada 2 minutos. 

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) 
para o carro Y tomar essa distância do outro carro.

Entrada
O arquivo de entrada contém um número inteiro.

Saída
Imprima o tempo necessário seguido da mensagem "minutos".

Exemplo de Entrada		Exemplo de Saída
30						60 minutos

110						220 minutos

7						14 minutos

#Velocidade relativa v entre os carros: v = 90 - 60 = 30 km/h = 0.5 km/min

*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Relative Speed between cars X and Y: 0.5 km/min = 30 km/h");
		final double relativeSpeedXY = 0.5;
		
		System.out.print("Ente a value for 'distance' in km: ");
		int distance = sc.nextInt();
		
		int timeInterval = ( (int)Math.pow(relativeSpeedXY, -1))*distance;
		
		System.out.println(" ");
		
		
		System.out.printf("The time interval is %d minutes%n", timeInterval);
		System.out.printf(" %d minutos%n", timeInterval);
		
		sc.close();
		
		
	}

}
