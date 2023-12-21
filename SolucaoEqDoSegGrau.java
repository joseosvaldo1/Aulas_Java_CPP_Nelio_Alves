package module_I;

import java.util.Locale;
import java.util.Scanner;

public class SolucaoEqDoSegGrau {

    public static void main(String[] args) {
        // Solução da equação de 2º grau:

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;
        System.out.print(" a = ");
        a = sc.nextDouble();
        System.out.print(" b = ");
        b = sc.nextDouble();
        System.out.print(" c = ");
        c = sc.nextDouble();
        System.out.println("");
        
        System.out.println("Equação do Segundo Grau:");
        System.out.println(a+"x² + "+b+"x + "+c+" = 0");
        System.out.println("");
        
        delta = Math.pow(b, 2.0) - 4 * a * c;

        if (delta < 0) {
        	System.out.println("");
            System.out.println("delta = " + delta + " => Não há raízes reais");
            System.out.println("");
        } else if (delta == 0) {
        	System.out.println("");
            System.out.println("delta = " + delta);
            System.out.println("Há duas raízes reais e iguais");
            x1 = x2 = -b / (2.0 * a);

            System.out.println("x1 = x2 = " + x1);
            System.out.println("");
            
        } else {
            System.out.println("delta = " + delta);
            System.out.println("Há duas raízes reais e distintas");
            System.out.println("");
            x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            System.out.println("");
        }

        sc.close();
    }
}
