package module_I;
import java.util.Scanner;

public class LeituraDeDadosII {

	public static void main(String[] args) {
		/* 
		 Para ler um texto ATÉ A QUEBRA DE LINHA
		 
		 Quando você usa um comando de leitura diferente do nextLine() 
		 e dá alguma quebra de linha, essa quebra de linha fica 
		 "pendente" na entrada padrão.
		
		 Se você então fizer um nextLine(), aquela quebra de linha 
		 pendente será absorvida pelo nextLine().
		 
		  
		 */
		
			Scanner sc = new Scanner(System.in);
			int x;
			String s1, s2, s3;
			x=sc.nextInt();
			sc.nextLine();
			/*
			O sc.nextLine() acima serviu para consumir a quebra 
			de linha pendente.
			*/
			s1 = sc.nextLine();
			s2 = sc.nextLine();
			s3 = sc.nextLine();
			
			System.out.println(" ");
			System.out.println("DADOS DIGITADOS:");
			System.out.println(" ");
			System.out.println(x);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			sc.close();
	}

}
