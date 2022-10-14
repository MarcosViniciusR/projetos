package empresa;


public class Jogador { // Classe Jogador, que ir� receber e armazenar a jogada do usu�rio.
	private String posicao; // Vari�vel privada que armazena a posi��o escolhida pelo jogador.
	
	

	public Jogador() { // Construtor vazio.
		super();
	}

	public Jogador(String posicao) { // Construtor que recebe a jogada como par�metro e armazena na vari�vel privada posi��o.
		super();
		this.posicao = posicao;
	}

	public String getPosicao() {  // M�todo para selecionar e retornar o valor da vari�vel privada posi��o. 
		return posicao;
	}

	public void setPosicao(String posicao) { // M�todo que recebe o valor digitado e armazena na vari�vel privada posi��o.
		this.posicao = posicao;
	}
	
	
	
	
	

}
