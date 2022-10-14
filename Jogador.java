package empresa;


public class Jogador { // Classe Jogador, que irá receber e armazenar a jogada do usuário.
	private String posicao; // Variável privada que armazena a posição escolhida pelo jogador.
	
	

	public Jogador() { // Construtor vazio.
		super();
	}

	public Jogador(String posicao) { // Construtor que recebe a jogada como parâmetro e armazena na variável privada posição.
		super();
		this.posicao = posicao;
	}

	public String getPosicao() {  // Método para selecionar e retornar o valor da variável privada posição. 
		return posicao;
	}

	public void setPosicao(String posicao) { // Método que recebe o valor digitado e armazena na variável privada posição.
		this.posicao = posicao;
	}
	
	
	
	
	

}
