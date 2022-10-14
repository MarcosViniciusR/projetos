package empresa;

public class Tabuleiro { // Classe tabuleiro que ir� mostrar o jogo, armazenar as jogadas, validar as jogadas e mostrar quem venceu.
	private String campo[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}}; // Matriz que representar� o tabuleiro. Cada uma das tr�s chaves dentro da chave principal, representa uma linha na matriz. A virgulas entre as strings separam as colunas dentro de cada linha.
	
	
	
	public String mostrar () { // M�todo para mostrar as posi��es da matriz (tabuleiro).
		for (int li=0; li<3; li++) { // La�o de repeti��o para ler as linhas da matriz.
			for (int co=0; co<3; co++) { // La�o de repeti��o para ler as colunas da matriz.
				System.out.printf("   " + campo[li][co]); // Comando para mostrar cada posi��o do tabuleiro, de acordo com as linhas e colunas da matriz.
			}
			System.out.println(""); // Comando para quebrar linha, alinhando as linhas e colunas da matriz, gerando visibilidade do campo do jogo.
		}
		return null; // Comando para retornar o campo sem valor definido.
	}//----------------------------------
	
	
	
	
	public boolean validar (String j) { // M�todo para validar se a jogada � valida, recebendo a jogada como par�metro..
		for (int li=0; li<3; li++) { // La�o de repeti��o para ler as linhas da matriz. 
			for (int co=0; co<3; co++) { // La�o de repeti��o para ler as colunas da matriz.
				if (campo[li][co].equals(j)) { // Estrutura de condi��o para verificar se a posi��o na matriz ja est� preenchida.
					return true; // Caso a posi��o esteja preenchida, retornar verdadeiro.
				}
			}
		}
		return false; // Caso a posi��o esteja dispon�vel, retornar falso.
	}//-----------------------------------
	
	
	
	
	public void jogada (String posicao, String jogador) { // M�todo para o tabuleiro receber a posi��o jogada e identificar o jogador. Recebe como par�metro a posi��o e quem fez a jogada.
		if (posicao.equals("1")) { // Estrutura de condi��o verificando a jogada e a qual posi��o na matriz ela corresponde.
			campo[0][0] = jogador; // Posi��o na matriz recebendo o valor da jogada.
		}
		else if (posicao.equals("2")) {
			campo [0][1] = jogador;
		}
		else if (posicao.equals("3")) {
			campo [0][2] = jogador;
		}
		else if (posicao.equals("4")) {
			campo [1][0] = jogador;
		}
		else if (posicao.equals("5")) {
			campo [1][1] = jogador;
		}
		else if (posicao.equals("6")) {
			campo [1][2] = jogador;
		}
		else if (posicao.equals("7")) {
			campo [2][0] = jogador;
		}
		else if (posicao.equals("8")) {
			campo [2][1] = jogador;
		}
		else if (posicao.equals("9")) {
			campo [2][2] = jogador;
		}
	} //----------------------------------
	
	
	
	
	public String ganhou (int jogadas) { // M�todo para verificar se o jogador ganhou, perdeu, ou empatou (velha).
		String analise [] = new String [8]; //Vetor criado para armazenar as possibilidades de vit�ria.
		String vencedor = "null"; // vari�vel vencedor recebendo nulo (um valor ainda n�o definido).
		if (jogadas == 9) { // Estrutura de condi��o verificando se foram feitas nove jogadas (valor que excede as possibilidades de vit�ria). 
			vencedor = "EMPATE"; // Vari�vel que armazena o resultado final, recebendo o resultado da condi��o.
		}
		analise[0] = campo[0][0] + campo [0][1] + campo [0][2]; // Concatenando as posi��es do campo e armazenando as possibilidades de vit�ria dentro do vetor.
		analise[1] = campo[1][0] + campo [1][1] + campo [1][2];
		analise[2] = campo[2][0] + campo [2][1] + campo [2][2];
		
		analise[3] = campo[0][0] + campo [1][0] + campo [2][0];
		analise[4] = campo[0][1] + campo [1][1] + campo [2][1];
		analise[5] = campo[0][2] + campo [1][2] + campo [2][2];
		
		analise[6] = campo[0][0] + campo [1][1] + campo [2][2];
		analise[7] = campo[0][2] + campo [1][1] + campo [2][0];
		
		for (int i=0; i<analise.length; i++) { // La�o de repeti��o para ler cada posi��o do vetor.
			if (analise[i].equals("XXX")) { // Estrutura de condi��o verificando se na respectiva posi��o do vetor, corresponde a valores iguais. 
				vencedor = "Jogador 1"; // Vari�vel recebendo a mensagem do jogador vencedor.
			}
			else if (analise[i].equals("OOO")) {
				vencedor = "Jogador 2";
			}		
		}
		return vencedor; // Retornando o resultado do la�o de repeti��o.
		
	}//-----------------------------------
	
	
}
