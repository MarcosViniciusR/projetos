package empresa;

public class CompC extends Computador { // Subclasse, herdando atributos e m�todos da Superclasse Computador. Suas jogadas s�o sequenciais.
	
	int soma = 0; // Vari�vel que auxilia na itera��o, fazendo com que o m�todo gere um valor diferente a cada jogada.
	

	@Override // Nota��o indicando que o m�todo ser� sobrescrito.
	String jogaComp() { // M�todo da jogada.

		opcao = escolhas[soma]; // Seleciona a op��o desejada, e vai alterando a cada jogada conforme o valor do iterador.
		
		soma += 1; // Vari�vel recebendo um valor a cada jogada realizada.
		return opcao; // Retorna o valor da vari�vel.
		
	}
	

}
