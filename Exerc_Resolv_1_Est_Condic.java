package module_I;
import java.util.Scanner;
import java.util.Locale;

public class Exerc_Resolv_1_Est_Condic {

	public static void main(String[] args) {
	/*
	 Fazer um programa para ler as duas notas que um aluno obteve no 
primeiro e segundo semestres de uma disciplina anual. Em seguida, 
mostrar a nota final que o aluno obteve no ano juntamente com um texto 
explicativo. Caso a nota final do aluno seja inferior a 60.00, 
mostrar a mensagem "REPROVADO", conforme exemplos. Todos os valores 
devem ter uma casa decimal.
	Entrada: 				Saída:
	45.5					NOTA FINAL = 76.8
	31.3					
	Entrada: 				Saída:
	34.0					NOTA FINAL = 57.5
	23.5					REPROVADO

	 */
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	//Dados de Entrada:
	System.out.println("Dados de Entrada: ");
	System.out.print("Digite a nota do primeiro semestre: ");
	double notaDoPrimeiroSemestre = sc.nextDouble();
	System.out.print("Digite a nota do segundo semestre: ");
	double notaDoSegundoSemestre = sc.nextDouble();
	System.out.println(" ");
	
	//Processamento dos Dados:
	
	double notaFinal = notaDoPrimeiroSemestre + notaDoSegundoSemestre;
	
	//Saída de Dados:
	System.out.printf("NOTA FINAL = %.1f %n", notaFinal);
	if (notaFinal < 60.0) {
		System.out.println("REPROVADO");
	}/*else {
		System.out.println("APROVADO");
	}*/
	
	sc.close();

	}

}
