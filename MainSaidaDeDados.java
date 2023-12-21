package module_I;

import java.util.Locale;

public class MainSaidaDeDados {

	public static void main(String[] args) {
		//Comando para impressão sem quebra de linha ao final:
		
		/* 
		 Para concatenar vários elementos em um 
		mesmo comando de escrita
		Regra geral para print e println:
		elemento1 + elemento2 + elemento3 + ... + elementoN
		
		Para concatenar vários elementos em um 
		mesmo comando de escrita
		Regra geral para printf:
		"TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2
		System.out.printf("RESULTADO = %.2f METROS%n", x);  
		  
		  Para concatenar vários elementos em um 
		mesmo comando de escrita
		Regra geral para printf:
		"TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		%f = ponto flutuante
		%d = inteiro
		%s = texto
		%n = quebra de linha


		 */
		
		Locale.setDefault(Locale.US);
		int y = 32;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("Olá Mundo");
		System.out.print("Bom dia!");
		System.out.print("\n \\n => Quebra de Linha \n");
		
		//Comando para impressão com quebrade linha ao final:
		System.out.println("Bom dia!");
		
		System.out.println("y = " + y);
		System.out.println("x = " + x);
		System.out.printf("x =  %.2f%n", x);
		System.out.printf("x =  %.3f%n", x);
		System.out.printf("x =  %.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}
}


