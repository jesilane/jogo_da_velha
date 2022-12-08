package jogodavelha;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JV jogo=new JV();
		String posicao;
		int valida=0, jogadas=0;
		
		while(true) {
			System.out.println("________________JOGO DA VELHA________________");
			jogo.Mostrar();
			
			do {				
				System.out.println("Jogador 1 informe uma posição: ");
				posicao=sc.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada Invalida, Tente novamente:");
					System.out.println("Jogador 1, informe uma posição: ");
					posicao= sc.next();
					valida=0;
				}
				jogo.Jogada(posicao, "X");
				valida=1;
				
			}while(valida==0);
			
			jogadas++;
			valida=0;
			if(!jogo.Ganhou(jogadas).equals("null")) {
				break;
			}
			do {

				System.out.println("Jogador 2 informe uma posição que vai jogar:");
				posicao=sc.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada Invalida, Tente novamente:");
					System.out.println("Jogador 2, informe uma posição: ");
					posicao= sc.next();
					valida=0;
				}
				jogo.Jogada(posicao, "O");
				valida=1;
				jogo.Mostrar();
			}while(valida==0);
			
			jogadas++;
			valida=0;
			if(!jogo.Ganhou(jogadas).equals("null")) {
				break;
			}
		}
		
		System.out.println("O"+ jogo.Ganhou(jogadas)+" venceu");
	}

}
