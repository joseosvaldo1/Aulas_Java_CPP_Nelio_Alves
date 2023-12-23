package module_I;

import java.util.Scanner;

public class Beecrowd_1134 {

	public static void main(String[] args) {
	/*

	Um Posto de combustíveis deseja determinar qual de 
	seus produtos tem a preferência de seus clientes. 
	Escreva um algoritmo para ler o tipo de combustível 
	abastecido (codificado da seguinte forma: 1.Álcool 
	2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe 
	um código inválido (fora da faixa de 1 a 4) deve ser 
	solicitado um novo código (até que seja válido). 
	O programa será encerrado quando o código informado 
	for o número 4.

	Entrada
	A entrada contém apenas valores inteiros e positivos.

	Saída
	Deve ser escrito a mensagem: "MUITO OBRIGADO" e a 
	quantidade de clientes que abasteceram cada tipo de 
	combustível, conforme exemplo.

	Exemplo de Entrada		Exemplo de Saída
	8						MUITO OBRIGADO
	1						Alcool: 1
	7						Gasolina: 2
	2						Diesel: 0	
	2
	4
 
	*/
	Scanner sc = new Scanner(System.in);
	int codigo = sc.nextInt();
	int clientesAlcool = 0;
	int clientesGasolina = 0;
	int clientesDiesel = 0;
	
	while ( codigo != 4 ) {
		codigo = sc.nextInt();
		
		if ( codigo == 1) {
			clientesAlcool++;
		}
		else if ( codigo == 2) {
			clientesGasolina++;
		}
		else if ( codigo == 3) {
			clientesDiesel++;
		}
		else {
			continue;
		}
		
		
		
	}
	
	System.out.println("MUITO OBRIGADO");
	System.out.println("Alcool: "+clientesAlcool);
	System.out.println("Gasolina: "+clientesGasolina);
	System.out.println("Diesel: "+clientesDiesel);
	
	sc.close();
		
		
	}

}
