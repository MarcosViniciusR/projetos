package empresa;

import java.util.Scanner; // Classe importada para ler os dados.

public class Principal { // Classe principal, onde terá as relações entre as classes e suas funções, executando o jogo.

	
	public static void main(String[] args) { // Classe principal, onde são executadas as funções do jogo.
		Tabuleiro tab = new Tabuleiro (); // Instanciação do objeto Tabuleiro que armazena, valida, mostra as jogadas e quem venceu a partida.
		Jogador ronaldo = new Jogador(); // Instanciação do objeto Jogador, que recebe as jogadas via teclado e retorna uma posição para o tabuleiro.
		
		
		Scanner teclado = new Scanner(System.in); // Instanciação do objeto teclado, que recebe os dados de entrada do jogador.
		String posicao; // Armazena dados que serão utilizados como parâmetros para os métodos.
		int valida = 0; //Auxilia no laço de repetição While, alterando seu valor a cada condição satisfeita do laço.
		int jogadas =0; // Contador de jogadas executadas.
		
		
		System.out.println("Bem vindo ao Jogo da Velha, selecione a dificuldade: "); // Menu para escolher a dificuldade.
		System.out.println("Nível A, digite 1"); 
		System.out.println("Nível B, digite 2");
		System.out.println("Nível C, digite 3");
		
		
		int opcao = teclado.nextInt(); // Variável que recebe a escolha do usuário e direciona à estrutura de condição correspondente. 
		
		
		
		if (opcao == 1) { //Estrutura de condição, caso escolha do usuário seja "nivel A".
			while (opcao == 1) { //Estrutura de repetição para inicializar o jogo, enquanto espera uma mudança no valor do parâmetro para finalizar o jogo.
				CompA computador = new CompA(); // Instanciação o objeto CompA. Nesse nível, o computador (compA) realiza jogas aleatórias.
				while(true) { //Estrutura de repetição para fazer o jogo funcionar.
					System.out.println("=-=-=-=-= JOGO DA VELHA =-=-=-=-="); // Titulo do jogo.
					tab.mostrar(); // Mostra as posições do tabuleiro para o jogador.
					
					do { // Estrutura de jogadas do Jogador 1 (usuário).
						System.out.println("Jogador 1, informe uma posicao: "); //Mensagem para o jogador informar a posição que deseja colocar o "x" no tabuleiro. 
						ronaldo.setPosicao(teclado.next()); //Método para receber uma posição no tabuleiro escolhida pelo jogador.
						while(!tab.validar(ronaldo.getPosicao())) { //Estrutura de repetição com o método para validar a posição selecionada pelo jogador.
							System.out.println("Jogada invalida, tente novamente!"); // Informativo de que a jogada não foi válida.
							System.out.println("Jogador 1, informe uma posicao: ");
							posicao = teclado.next(); // Variável posição recebendo o valor digitado.
							valida = 0;
							
						}
						tab.jogada(ronaldo.getPosicao(), "X"); //Método para armazenar as jogadas no tabuleiro, e indicar o simbolo do jogador.
						valida = 1;
						
					}while(valida == 0); // Condição da estrutura de repetição. O código acima se repete enquanto a váriavel valida for igual a 0.
					
					jogadas++; // Variável recebe um acrescimo de valor, para que o tabuleiro possa analizaar o número de jogadas executadas.
					valida = 0; // Variável recebe o valor 0 para que a estrutura de repetição possa ser utilizada novamente em outro momento.
					tab.mostrar(); // Mostra a situação do tabuleiro após realização a jogada.
					if (!tab.ganhou(jogadas).equals("null")) { // Mostra o resultado do jogo caso seja diferente de um valor não definido (null).
						break; // finaliza o laço de repetição, encerrando o jogo.
					}
					
					do { // Estrutura de jogadas do Computador (CompA). ------------------------
						posicao = computador.jogaComp(); // Variavel recebendo a jogada do Computador através do método chamado.
						while(!tab.validar(posicao)) { // Laço de repetição para validar a jogada. Diferente do laço anterior, esse não apresenta mensagens informativas ao jogador(CompA).
							posicao = computador.jogaComp();
							valida = 0;
							
						}
						tab.jogada(posicao, "O"); //Método para armazenar as jogadas no tabuleiro, e indicar o simbolo do jogador que agora é diferente.
						valida = 1;
						
					}while(valida == 0);
					
					jogadas++;
					valida = 0;
					if (!tab.ganhou(jogadas).equals("null")) {
						break;
					}
					
				}//-------------
			opcao = 0; // Variável recebe valor diferente para encerrar o laço de repetição, finalizando a estrutura de jogadas.
				
			}
			
		}
		
		
		
		
		if (opcao == 2) { //Estrutura de condição, caso escolha do usuário seja "nivel B".
			while (opcao == 2) {
				CompB computador = new CompB(); // Instanciação do objeto CompB. Nesse nível, o computador (CompB) joga com base nas jogadas realizadas pelo jogador.
				while(true) {
					System.out.println("=-=-=-=-= JOGO DA VELHA =-=-=-=-=");
					tab.mostrar();
					
					do { // Estrutura de jogadas do Jogador 1 (usuário). -------------------
						System.out.println("Jogador 1, informe uma posicao: ");
						ronaldo.setPosicao(teclado.next());
						while(!tab.validar(ronaldo.getPosicao())) {
							System.out.println("Jogada invalida, tente novamente!");
							System.out.println("Jogador 1, informe uma posicao: ");
							posicao = teclado.next();
							valida = 0;
							
						}
						tab.jogada(ronaldo.getPosicao(), "X");
						computador.setAdversario(ronaldo.getPosicao()); // Método chamado para que o jogador CompA identifique qual jogada foi feita pelo jogador Usuário.
						valida = 1;
						
					}while(valida == 0);
					
					jogadas++;
					valida = 0;
					tab.mostrar();
					if (!tab.ganhou(jogadas).equals("null")) {
						break;
					}
					
					
					do { // Estrutura de jogadas do Computador (CompB). ------------------------
						posicao = computador.jogaComp();
						while(!tab.validar(posicao)) {
							posicao = computador.jogaComp();
							valida = 0;
							
						}
						tab.jogada(posicao, "O");
						valida = 1;
	
					}while(valida == 0);
					
					jogadas++;
					valida = 0;
					if (!tab.ganhou(jogadas).equals("null")) {
						break;
					}
					
				}//-------------
			opcao = 0;
				
			}
			
		}
		
		
		
		
		if (opcao == 3) { //Estrutura de condição, caso escolha do usuário seja "nivel C".
			while (opcao == 3) {
				CompC computador = new CompC(); // Instanciação do objeto CompC. Nesse nível, o computador (CompC) joga em posições sequenciais.
				while(true) {
					System.out.println("=-=-=-=-= JOGO DA VELHA =-=-=-=-=");
					tab.mostrar();
					
					do { // Estrutura de jogadas do Jogador 1 (usuário). -------------------
						System.out.println("Jogador 1, informe uma posicao: ");
						ronaldo.setPosicao(teclado.next());
						while(!tab.validar(ronaldo.getPosicao())) {
							System.out.println("Jogada invalida, tente novamente!");
							System.out.println("Jogador 1, informe uma posicao: ");
							posicao = teclado.next();
							valida = 0;
							
						}
						tab.jogada(ronaldo.getPosicao(), "X");
						valida = 1;
						
					}while(valida == 0);
					
					jogadas++;
					valida = 0;
					tab.mostrar();
					if (!tab.ganhou(jogadas).equals("null")) {
						break;
					}
					
					
					do { // Estrutura de jogadas do Computador (CompC). ------------------------
						posicao = computador.jogaComp();
						while(!tab.validar(posicao)) {
							posicao = computador.jogaComp();
							valida = 0;
							
						}
						tab.jogada(posicao, "O");
						valida = 1;
	
					}while(valida == 0);
					
					jogadas++;
					valida = 0;
					if (!tab.ganhou(jogadas).equals("null")) {
						break;
					}
					
				}//-------------
			opcao = 0;
				
			}
			
		}
		
		
		System.out.println("O " + tab.ganhou(jogadas) + " venceu!"); // Mensagem informativa mostrando o resultado da partida.
	}

}


// OBS: Linhas de código não comentadas são linhas que já foram descritas no decorrer do código, evitando repetição de palavras.