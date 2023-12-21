package module_I;

import java.util.Locale;

public class ExercicioDeFixacaoSaidaDeDados {

	public static void main(String[] args) {
		/*
		 Em um novo programa, inicie as 
		seguintes variáveis:
		
		*/
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		/*
		 Em seguida, usando os valores das variáveis, produza a 
		seguinte saída na tela do console:
		 */
		System.out.printf("%s, which price is %.2f%n",product1, price1);
		System.out.printf("%s, which price is %.2f%n",product2, price2);
		System.out.println(" ");
		System.out.printf("Record: %d years-old, code %d and gender: %s ",age, code, gender);
		System.out.println(" ");
		System.out.printf("Mesure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places:: %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}

}
