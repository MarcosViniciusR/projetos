package empresa;

public class Tabuleiro { // Classe tabuleiro que irá mostrar o jogo, armazenar as jogadas, validar as jogadas e mostrar quem venceu.
	private String campo[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}}; // Matriz que representará o tabuleiro. Cada uma das três chaves dentro da chave principal, representa uma linha na matriz. A virgulas entre as strings separam as colunas dentro de cada linha.
	
	
	
	public String mostrar () { // Método para mostrar as posições da matriz (tabuleiro).
		for (int li=0; li<3; li++) { // Laço de repetição para ler as linhas da matriz.
			for (int co=0; co<3; co++) { // Laço de repetição para ler as colunas da matriz.
				System.out.printf("   " + campo[li][co]); // Comando para mostrar cada posição do tabuleiro, de acordo com as linhas e colunas da matriz.
			}
			System.out.println(""); // Comando para quebrar linha, alinhando as linhas e colunas da matriz, gerando visibilidade do campo do jogo.
		}
		return null; // Comando para retornar o campo sem valor definido.
	}//----------------------------------
	
	
	
	
	public boolean validar (String j) { // Método para validar se a jogada é valida, recebendo a jogada como parâmetro..
		for (int li=0; li<3; li++) { // Laço de repetição para ler as linhas da matriz. 
			for (int co=0; co<3; co++) { // Laço de repetição para ler as colunas da matriz.
				if (campo[li][co].equals(j)) { // Estrutura de condição para verificar se a posição na matriz ja está preenchida.
					return true; // Caso a posição esteja preenchida, retornar verdadeiro.
				}
			}
		}
		return false; // Caso a posição esteja disponível, retornar falso.
	}//-----------------------------------
	
	
	
	
	public void jogada (String posicao, String jogador) { // Método para o tabuleiro receber a posição jogada e identificar o jogador. Recebe como parâmetro a posição e quem fez a jogada.
		if (posicao.equals("1")) { // Estrutura de condição verificando a jogada e a qual posição na matriz ela corresponde.
			campo[0][0] = jogador; // Posição na matriz recebendo o valor da jogada.
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
	
	
	
	
	public String ganhou (int jogadas) { // Método para verificar se o jogador ganhou, perdeu, ou empatou (velha).
		String analise [] = new String [8]; //Vetor criado para armazenar as possibilidades de vitória.
		String vencedor = "null"; // variável vencedor recebendo nulo (um valor ainda não definido).
		if (jogadas == 9) { // Estrutura de condição verificando se foram feitas nove jogadas (valor que excede as possibilidades de vitória). 
			vencedor = "EMPATE"; // Variável que armazena o resultado final, recebendo o resultado da condição.
		}
		analise[0] = campo[0][0] + campo [0][1] + campo [0][2]; // Concatenando as posições do campo e armazenando as possibilidades de vitória dentro do vetor.
		analise[1] = campo[1][0] + campo [1][1] + campo [1][2];
		analise[2] = campo[2][0] + campo [2][1] + campo [2][2];
		
		analise[3] = campo[0][0] + campo [1][0] + campo [2][0];
		analise[4] = campo[0][1] + campo [1][1] + campo [2][1];
		analise[5] = campo[0][2] + campo [1][2] + campo [2][2];
		
		analise[6] = campo[0][0] + campo [1][1] + campo [2][2];
		analise[7] = campo[0][2] + campo [1][1] + campo [2][0];
		
		for (int i=0; i<analise.length; i++) { // Laço de repetição para ler cada posição do vetor.
			if (analise[i].equals("XXX")) { // Estrutura de condição verificando se na respectiva posição do vetor, corresponde a valores iguais. 
				vencedor = "Jogador 1"; // Variável recebendo a mensagem do jogador vencedor.
			}
			else if (analise[i].equals("OOO")) {
				vencedor = "Jogador 2";
			}		
		}
		return vencedor; // Retornando o resultado do laço de repetição.
		
	}//-----------------------------------
	
	
}
