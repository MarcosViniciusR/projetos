package empresa;

public class CompA extends Computador { // Subclasse, herdando atributos e métodos da Superclasse Computador. Suas jogadas são feitas de forma aleatória no campo.

	@Override // Notação indicando que o método será sobrescrito.
	String jogaComp() { // Método para a criação da jogada.
		int num = (int)(Math.random()*9); // Variável que armazena um número aleatóriamente até nove, representando a opção de posição de jogada do Computador.
		opcao = escolhas[num]; // Variável recebendo o valor do vetor na posicao selecionada como parâmetro. O parametrô sendo representado pelo valor da variavel num.
		return opcao; // Retorna o valor da variável opcao como jogada do Computador.
	}
	
	
}
