package empresa;

public abstract class Computador { // Classe abstrata computador, que serve como Superclasse para os objetos da classe computador.
	protected String escolhas [] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"}; // Vetor com as op��es de posi��o de jogada.
	String opcao; // Vari�vel que armazena a op��o escolhida pelo computador.
	
	
	public Computador() { // Construtor vazio.
		super();
	}

	
	abstract String jogaComp(); // M�todo para criar as jogadas do computador, utilizando os conceitos de polimorfismo nas subclasses.
	

}