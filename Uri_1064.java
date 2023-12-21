package module_I;

import java.util.Scanner;
import java.util.Locale;

public class Uri_1064 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	// Inicializando variáveis
    int valoresPositivos = 0;
    double somaPositivos = 0.0;

    // Lendo os 6 valores
    for (int i = 0; i < 6; i++) {
        double valor = sc.nextDouble();

        // Verificando se o valor é positivo
        if (valor > 0) {
            valoresPositivos++;
            somaPositivos += valor;
        }
    }

    // Exibindo os resultados
    if (valoresPositivos > 0) {
        // Calculando a média dos valores positivos
        double mediaPositivos = somaPositivos / valoresPositivos;

        System.out.println(valoresPositivos + " valores positivos");
        System.out.printf("%.1f%n", mediaPositivos);
    } else {
        System.out.println("Nenhum valor positivo encontrado.");
    }

	
	
	sc.close();

	}

}
