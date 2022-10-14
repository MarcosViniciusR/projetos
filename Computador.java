package empresa;

public abstract class Computador { // Classe abstrata computador, que serve como Superclasse para os objetos da classe computador.
	protected String escolhas [] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"}; // Vetor com as opções de posição de jogada.
	String opcao; // Variável que armazena a opção escolhida pelo computador.
	
	
	public Computador() { // Construtor vazio.
		super();
	}

	
	abstract String jogaComp(); // Método para criar as jogadas do computador, utilizando os conceitos de polimorfismo nas subclasses.
	

}