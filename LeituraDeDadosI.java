package module_I;
import java.util.Scanner;
import java.util.Locale;

public class LeituraDeDadosI {

	public static void main(String[] args) {
		/*
		Entrada de dados
		Usuário => Programa (dentro de variáveis)
		Também chamada de LEITURA: "O programa está lendo dados." 
		  
		Scanner
		Para fazer entrada de dados, nós vamos criar um objeto 
		do tipo "Scanner" da seguinte forma:
		Scanner sc = new Scanner(System.in);
				import java.util.Scanner;
				faça sc.close() quando não precisar mais do objeto sc  
		
		Para ler uma palavra (texto sem espaços)
		Suponha uma variável tipo String declarada:
		String x;
		x = sc.next();
		
		System.out.println("x");
		
		Para ler um número com ponto flutuante
		Suponha uma variável tipo double declarada:
		double x;
		x = sc.nextDouble(); => reflete a localidade do sistema local
		ATENÇÃO:
		Para considerar o separador de decimais como ponto, 
		ANTES da declaração do Scanner, faça:
		Locale.setDefault(Locale.US);
		
		Para ler um caractere
		Suponha uma variável tipo char declarada:
		char x;
		x = sc.next().charAt(0);

		Quando você usa um comando de leitura diferente do nextLine() 
		e dá alguma quebra de linha, essa quebra de linha fica 
		pendente"na entrada padrão.
		Se você então fizer um nextLine(), aquela quebra de linha 
		pendente será absorvida pelo nextLine(). 
		  
		 
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome> ");
		String name = sc.next();
		System.out.print("Digite sua idade> ");
		int age = sc.nextInt();
		System.out.print("Digite sua altura> ");
		double high = sc.nextDouble();
		System.out.print("Digite a letra do seu gênero> ");
		char gender = sc.next().charAt(0);
		
		String x;
		int y;
		double z;
		System.out.print("Digite valores apropriados para x, y e z");
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		
		
		System.out.println(" ");
		System.out.println("Dados digitados:");
		System.out.println(" ");
		
		System.out.println("Nome: " +name);
		System.out.println("Idade: " +age);
		System.out.println("Altura: " +high);
		System.out.println("Gênero: " +gender);
		
		System.out.println(" ");
		System.out.println("Dados digitados para x, y e x:");
		System.out.println(" ");
		System.out.println("x: " +x);
		System.out.println("y: " +y);
		System.out.println("z: " +z);
		
		
		
		
		sc.close();
		
		
	}

}

