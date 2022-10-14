package empresa;

public class CompC extends Computador { // Subclasse, herdando atributos e métodos da Superclasse Computador. Suas jogadas são sequenciais.
	
	int soma = 0; // Variável que auxilia na iteração, fazendo com que o método gere um valor diferente a cada jogada.
	

	@Override // Notação indicando que o método será sobrescrito.
	String jogaComp() { // Método da jogada.

		opcao = escolhas[soma]; // Seleciona a opção desejada, e vai alterando a cada jogada conforme o valor do iterador.
		
		soma += 1; // Variável recebendo um valor a cada jogada realizada.
		return opcao; // Retorna o valor da variável.
		
	}
	

}
