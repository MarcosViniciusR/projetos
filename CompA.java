package empresa;

public class CompA extends Computador { // Subclasse, herdando atributos e m�todos da Superclasse Computador. Suas jogadas s�o feitas de forma aleat�ria no campo.

	@Override // Nota��o indicando que o m�todo ser� sobrescrito.
	String jogaComp() { // M�todo para a cria��o da jogada.
		int num = (int)(Math.random()*9); // Vari�vel que armazena um n�mero aleat�riamente at� nove, representando a op��o de posi��o de jogada do Computador.
		opcao = escolhas[num]; // Vari�vel recebendo o valor do vetor na posicao selecionada como par�metro. O parametr� sendo representado pelo valor da variavel num.
		return opcao; // Retorna o valor da vari�vel opcao como jogada do Computador.
	}
	
	
}
