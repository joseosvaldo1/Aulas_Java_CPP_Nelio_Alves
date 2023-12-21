package module_I;
import java.util.Scanner;

public class Exemplo_condicional_1 {

	public static void main(String[] args) {
	
	/*
	 - Sintaxe da Estrutura Condicional:
	 1) Condicional Simples:
	 if (<condição>){				REGRA:
	    <comando 1>;					V: executa o bloco de comandos
	    <comando 2>;				F: pula o bloco de comandos
	         .
	         .
	         .
	    <comando n>;
	 }
	 
	 2) Condicional Composta:
	 if (<condição>){				REGRA:
	    <comando 1>;					V: executa o bloco de comandos
	    <comando 2>;					F: pula o bloco de comandos
	         .
	         .
	         .
	    <comando n>;
	 } else {
	    <comando 1>;					V: executa somente o bloco do if
	    <comando 2>;					F: executa somente o bloco do else
	         .
	         .
	         .
	    <comando n>;
	    }
	    Observação: O else não deve apresentar uma condição.
	    
	   - Encadeamento de estruturas condicionais
		if ( condição 1 ) {
			<comando 1>;
			<comando 2>;
		}
		else {	
 			if ( condição 2 ) {
				<comando 3>;
				<comando 4>;
			}
			else {
				<comando 5>;
				<comando 6>;
			}
	 
	 	}
	 	
	 	- Encadeamento de if else encadeados e alinhadas ao primeiro if:
	 	if ( condição 1) {
			<comando 1>;
			<comando 2>;
		}
		else if ( condição 2 ) {
			<comando 3>;
			<comando 4>;
		}
		else if (condição 3 ) {
			<comando 5>;
			<comando 6>;
		}
		else {
			<comando 7>;
			<comando 8>;
		}
	 
	 */
		Scanner sc = new Scanner(System.in);
		
		
		int hora;
		
		System.out.println("What time is it? ");
		System.out.print("Que horas são? ");
		hora = sc.nextInt();
		System.out.println(" ");
		
		
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else if(hora >= 12 && hora < 18) {
			System.out.println("Boa tarde!");
			}
		else {
			System.out.println("Boa noite!");
		}
		
		sc.close();
		
		
	}	
}
