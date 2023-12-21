package module_I;
import java.util.Scanner;
import java.util.Locale;

public class Exerc_Resolv_4_Est_Condic {

	public static void main(String[] args) {
	/*
	Problema exemplo
	Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
	dá direito a 100 minutos de telefone. Cada minuto que exceder a
	franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler 
	a quantidade de minutos que uma pessoa consumiu, daí mostrar o 
	valor a ser pago.
	Entrada 		Saída
	22 				Valor a pagar: R$ 50.00
	Entrada 		Saída
	103 			Valor a pagar: R$ 56.00


	Operadores de atribuição cumulativa
	a += b => a = a + b;
	a -= b => a = a - b;
	a *= b => a = a * b;
	a /= b => a = a / b;
	a %= b => a = a % b;

	*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de minutos gastos: ");
		int minutes = sc.nextInt();
		
		double conta = 50.00;
		
		System.out.println(" ");
		
		if (minutes > 00) {
			conta += (minutes - 100)*2.0;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		
		
		sc.close();	

	}

}
