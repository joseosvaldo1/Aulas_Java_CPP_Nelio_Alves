package module_I;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Bee_1045 {

	public static void main(String[] args) {
	/* 
	 Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem 
	 decrescente, de modo que o lado A representa o maior dos 3 lados. 
	 A seguir, determine o tipo de triângulo que estes três lados 
	 formam, com base nos seguintes casos, sempre escrevendo uma 
	 mensagem adequada:
	 
	se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
	se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
	se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
	se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
	se os três lados forem iguais, apresente a mensagem: TRIANGULO 
	EQUILATERO
	se apenas dois dos lados forem iguais, apresente a mensagem: 
	TRIANGULO ISOSCELES
	
	Entrada
	A entrada contem três valores de ponto flutuante de dupla 
	precisão A (0 < A) , B (0 < B) e C (0 < C).

	Saída
	Imprima todas as classificações do triângulo especificado na 
	entrada.

Exemplos de Entrada			Exemplos de Saída
7.0 5.0 7.0					TRIANGULO ACUTANGULO
							TRIANGULO ISOSCELES

6.0 6.0 10.0				TRIANGULO OBTUSANGULO
							TRIANGULO ISOSCELES

6.0 6.0 6.0					TRIANGULO ACUTANGULO
							TRIANGULO EQUILATERO

5.0 7.0 2.0					NAO FORMA TRIANGULO

6.0 8.0 10.0				TRIANGULO RETANGULO
 
	 
	*/
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Input Data - Dados de Entrada:");
	System.out.println("Possíveis lados do triângulo:");
	//Possible sides of triangles: 
	
	double[] sides = new double[3];
    for (int i = 0; i < 3; i++) {
        sides[i] = sc.nextDouble();
    }
    Arrays.sort(sides);

    double a = sides[2];
    double b = sides[1];
    double c = sides[0];
	
	
	System.out.println(" ");
	
	System.out.printf("A = %.1f, B = %.1f, C = %.1f%n",a, b, c);
	System.out.println(" ");
	
	//Classifying triangles:
	if (a >= b + c) {
        System.out.println("NAO FORMA TRIANGULO");
    } else {
        if (a * a == b * b + c * c) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if (a * a > b * b + c * c) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (a * a < b * b + c * c) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }


	sc.close();
		
}
}
