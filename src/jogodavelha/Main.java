package jogodavelha;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JV jogo=new JV();
		
		while(true) {
			System.out.println("________________JOGO DA VELHA________________");
			jogo.Mostrar();
			
			for(int jogador=1; jogador <=2; jogador++) {
				jogar(jogo, jogador);
				jogo.Mostrar();
				if(!jogo.Ganhou().equals("null")) {
					System.out.println("O jogador " + jogador + " venceu!");
					return;
				}
			}
		}
		
	}

	public static boolean jogar(JV jogo, int jogador){
		int valida = 0;
		String posicao;
		String letraJogador = "";
		if(jogador == 1) {
			letraJogador = "X";
		} else {
			letraJogador = "O";
		}
		do {				
			System.out.println("Jogador "+ jogador +" informe uma posi��o: ");
			posicao=sc.next();
			while(!jogo.Valido(posicao)) {
				System.out.println("Jogada Invalida, Tente novamente:");
				System.out.println("Jogador "+jogador+", informe uma posi��o: ");
				posicao= sc.next();
				valida=0;
			}
			jogo.Jogada(posicao, letraJogador);
			valida=1;
		}while(valida==0);
		jogo.jogadas++;
		valida=0;
		return jogadas;
	}

}
