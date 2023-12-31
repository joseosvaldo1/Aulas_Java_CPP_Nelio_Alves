package module_I;
import java.util.Scanner;

public class Bee_1131 {

	public static void main(String[] args) {
	/*
	A Federação Gaúcha de Futebol contratou você para escrever um 
	programa para fazer uma estatística do resultado de vários 
	GRENAIS. Escreva um programa para ler o número de gols marcados 
	pelo Inter e pelo Grêmio em um GRENAL. Logo após escrever a
	mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. 
	Se a resposta for 1, o algoritmo deve ser executado novamente 
	solicitando o número de gols marcados pelos times em uma nova 
	partida, caso contrário deve ser encerrado imprimindo:

	- Quantos GRENAIS fizeram parte da estatística.
	- O número de vitórias do Inter.
	- O número de vitórias do Grêmio.
	- O número de Empates.
	- Uma mensagem indicando qual o time que venceu o maior número 
	de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

	Entrada
	O arquivo de entrada contém 2 valores inteiros, correspondentes 
	aos gols marcados pelo Inter e pelo Grêmio respectivamente. 
	Em seguida háverá um inteiro (1 ou 2), correspondente à repetição 
	do programa.

	Saída
	Após cada leitura dos gols, deve ser impressa a mensagem 
	"Novo grenal (1-sim 2-nao)". Quando o algoritmo for encerrado 
	devem ser mostradas as estatísticas conforme a descrição 
	apresentada acima. Obs: a palavra "Gremio" deve ser impressa 
	sem acento, conforme o exemplo abaixo.

	Exemplo de Entrada			Exemplo de Saída
	3 2							Novo grenal (1-sim 2-nao)
	1							Novo grenal (1-sim 2-nao)
	2 3							Novo grenal (1-sim 2-nao)
	1							3 grenais
	3 1							Inter:2
	2							Gremio:1
								Empates:0
								Inter venceu mais
 
	*/
		Scanner sc = new Scanner(System.in);
		
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empates = 0;
		int novoGrenal = 1;
		
		while (novoGrenal == 1) {
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();
			
			if (golsInter > golsGremio) {
				vitoriasInter++;
			}
			else if (golsGremio > golsInter) {
				vitoriasGremio++;
			}
			else {
				empates++;

			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
			}
		}
		
		int total = vitoriasGremio + vitoriasInter + empates;
		
		System.out.println(total + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		
		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		}
		else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}
		
				
		sc.close();

	}

}
