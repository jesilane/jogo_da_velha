package jogodavelha;

public class JV {

	private int jogadas = 0;

	private String[][] m = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

	// esses for s�o pra andar as linhas.
	public String Mostrar() {
		for (int li = 0; li < 3; li++) {// vai ler a linha
			for (int co = 0; co < 3; co++) {// ler as colunas.
				System.out.printf("     " + m[li][co]);
			}
			System.out.println("\n");
		}
		return null;
	}

	public boolean Valido(String p) {
		for (int li = 0; li < 3; li++) {
			for (int co = 0; co < 3; co++) {
				if (m[li][co].equals(p))
					return true;

			}
		}
		return false;
	}

	public void Jogada(String p, String j) {
		if (p.equals("1"))
			m[0][0] = j;
		else if (p.equals("2"))
			m[0][1] = j;
		else if (p.equals("3"))
			m[0][2] = j;
		else if (p.equals("4"))
			m[1][0] = j;
		else if (p.equals("5"))
			m[1][1] = j;
		else if (p.equals("6"))
			m[1][2] = j;
		else if (p.equals("7"))
			m[2][0] = j;
		else if (p.equals("8"))
			m[2][1] = j;
		else if (p.equals("9"))
			m[2][2] = j;
	}

	public String Ganhou() {// saber quem ganhou o jogo, o vetor e de 8 posicoe porque sao as possiblidades
										// de ganhar
		String[] T = new String[8];
		String vencedor = "null";
		if (jogadas == 9) {
			vencedor = "EMPATE";
		}
		T[0] = m[0][0] + m[0][1] + m[0][2];//possiveis formas de ganhar o jogo.
		T[1] = m[1][0] + m[1][1] + m[1][2];
		T[2] = m[2][0] + m[2][1] + m[2][2];

		T[3] = m[0][0] + m[1][0] + m[2][0];
		T[4] = m[0][1] + m[1][1] + m[2][1];
		T[5] = m[0][2] + m[1][2] + m[2][2];

		T[6] = m[0][0] + m[1][1] + m[2][2];
		T[7] = m[0][2] + m[1][1] + m[2][0];

		for (int i = 0; i < T.length; i++) {// for pra varrer o vetor
			if (T[i].equals("XXX")) {
				return "Jogador 1";
			} else if (T[i].equals("OOO")) {
				return "Jogador 2";
			}
		}
		return vencedor;
	}

}
