package module_I;

import java.util.Scanner;

public class Bee_1049 {

	public static void main(String[] args) {
	/*
	Neste problema, você deverá ler 3 palavras que definem o tipo 
	de animal possível segundo o esquema abaixo, da esquerda para 
	a direita.  Em seguida conclua qual dos animais seguintes foi 
	escolhido, através das três palavras fornecidas.
	
							    carnivoro  =>    aguia
					ave
		
							    onivoro	   =>    pombo
	vertebrado 
	
	
								onivoro => 	     homem
	
					mamifero
	
								herbivoro =>     vaca
	
	
	
	
	
	
			    				hematofago  =>    pulga
					inseto
		
							    herbivoro	=>    lagarta
	invertebrado 
	
	
								hematofago => 	  sanguessuga
	
					anelideo
	
								onivoro =>        minhoca
	
	
	
	Entrada
	A entrada contém 3 palavras, uma em cada linha, necessárias para 
	identificar o animal segundo a figura acima, com todas as letras 
	minúsculas.

	Saída
	Imprima o nome do animal correspondente à entrada fornecida.

	Exemplos de Entrada			Exemplos de Saída
	vertebrado					homem
	mamifero
	onivoro

	vertebrado					aguia
	ave
	carnivoro

	invertebrado				minhoca
	anelideo
	onivoro
		 
	*/
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite as três características - uma por linha:");
	String coluna = sc.nextLine();
	String filo = sc.nextLine();
	String ordem = sc.nextLine();
	
	if (coluna.equals("vertebrado")) { 
		if (filo.equals("ave")) {
			if(ordem.equals("carnivoro")) {
				System.out.println("aguia");
			}
			else {
				System.out.println("pomba");
			}
		}
		else {
			if(ordem.equals("onivoro")) {
				System.out.println("homem");
			}
			else {
				System.out.println("vaca");
				}
				
			}
		}
	
	else {
		if(filo.equals("inseto")) {
			if(ordem.equals("hematofago")) {
				System.out.println("pulga");
			}
			else {
				System.out.println("lagarta");
			}
		}
		else {
			if(ordem.equals("hematofago")) {
				System.out.println("sanguessuga");
			}
			else {
				System.out.println("minhoca");
				}
			}
			
		}
	
		
	sc.close();	
	
		
	}

}
