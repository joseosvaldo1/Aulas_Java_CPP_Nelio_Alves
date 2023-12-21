package module_I;

public class ProcessamentoDeDados {

	public static void main(String[] args) {
		/* • Comentários de linha:
		• Começam com //
		
		• Atalhos:
		• Importar classes: CTRL + SHIFT + O
		• Autoendentação: CTRL + SHIFT + F
		• sysout CTRL + espaço
		
		Comando de atribuição.
		Sintaxe:
		<variável> = <expressão>
		
		REGRA:
		1) A expressão é calculada;
		2) O resultado da expressão é armazenado na variáve;
		 
		Boa prática: 
		Sempre indique o tipo do número, se a expressão for de ponto 
		flutuante (não inteira).
		Para double use: .0
		Para float use: f
		
		Casting
		É a conversão explícita de um tipo para outro.
		É necessário quando o compilador não é capaz de “adivinhar” 
		que o resultado de uma expressão deve ser de outro tipo.

		 
		 * 
		 * */
		
		
		
		System.out.println("Exemplo_1: ");
		int x,y;
		x = 5;
		y = 2*x;
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		System.out.println(" ");
		System.out.println("Exemplo_2: ");	
		int x1;
		double y1;
		x1 = 5;
		y1 = 2*x;
		System.out.println("x1 = "+ x1);
		System.out.println("y1 = "+ y1);
		System.out.println(" ");
		System.out.println("Exemplo_3: ");
		double b, B, h, area;
		b =  6.0;
		B =  8.0;
		h =  5.0;
		
		area = ((b+B)/2)*h;
		System.out.printf("area = %.1f", area);
		System.out.println(" ");
		System.out.println("Exemplo_4: ");
		float b1, B1, h1, area1;
		b1 =  6f;
		B1 =  8f;
		h1 =  5f;
		
		area1 = ((b1+B1)/2f)*h1;
		System.out.println("area1 = " + area1);
		System.out.println(" ");
		System.out.println("Exemplo_5:");
		int a2,b2;
		a2 = 5;
		b2 = 2;
 		double resultado2;
		resultado2 = (double) a2/b2;
		System.out.println("resultado2 = " + resultado2);
		System.out.println(" ");
		System.out.println("Exemplo_6:");
		double a3;
		int b3;
		a3 = 5.0;
		b3 = (int) a3;
		
		System.out.println("b3 = " + b3);
		
		
		
		
	}

}
