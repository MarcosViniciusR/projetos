package empresa;

import java.util.Scanner; // Classe importada para ler os dados.

public class Principal { // Classe principal, onde ter� as rela��es entre as classes e suas fun��es, executando o jogo.

	
	public static void main(String[] args) { // Classe principal, onde s�o executadas as fun��es do jogo.
		Tabuleiro tab = new Tabuleiro (); // Instancia��o do objeto Tabuleiro que armazena, valida, mostra as jogadas e quem venceu a partida.
		Jogador ronaldo = new Jogador(); // Instancia��o do objeto Jogador, que recebe as jogadas via teclado e retorna uma posi��o para o tabuleiro.
		
		
		Scanner teclado = new Scanner(System.in); // Instancia��o do objeto teclado, que recebe os dados de entrada do jogador.
		String posicao; // Armazena dados que ser�o utilizados como par�metros para os m�todos.
		int valida = 0; //Auxilia no la�o de repeti��o While, alterando seu valor a cada condi��o satisfeita do la�o.
		int jogadas =0; // Contador de jogadas executadas.
		
		
		System.out.println("Bem vindo ao Jogo da Velha, selecione a dificuldade: "); // Menu para escolher a dificuldade.
		System.out.println("N�vel A, digite 1"); 
		System.out.println("N�vel B, digite 2");
		System.out.println("N�vel C, digite 3");
		
		
		int opcao = teclado.nextInt(); // Vari�vel que recebe a escolha do usu�rio e direciona � estrutura de condi��o correspondente. 
		
		
		
		if (opcao == 1) { //Estrutura de condi��o, caso escolha do usu�rio seja "nivel A".
			while (opcao == 1) { //Estrutura de repeti��o para inicializar o jogo, enquanto espera uma mudan�a no valor do par�metro para finalizar o jogo.
				CompA computador = new CompA(); // Instancia��o o objeto CompA. Nesse n�vel, o computador (compA) realiza jogas aleat�rias.
				while(true) { //Estrutura de repeti��o para fazer o jogo funcionar.
					System.out.println("=-=-=-=-= JOGO DA VELHA =-=-=-=-="); // Titulo do jogo.
					tab.mostrar(); // Mostra as posi��es do tabuleiro para o jogador.
					
					do { // Estrutura de jogadas do Jogador 1 (usu�rio).
						System.out.println("Jogador 1, informe uma posicao: "); //Mensagem para o jogador informar a posi��o que deseja colocar o "x" no tabuleiro. 
						ronaldo.setPosicao(teclado.next()); //M�todo para receber uma posi��o no tabuleiro escolhida pelo jogador.
						while(!tab.validar(ronaldo.getPosicao())) { //Estrutura de repeti��o com o m�todo para validar a posi��o selecionada pelo jogador.
							System.out.println("Jogada invalida, tente novamente!"); // Informativo de que a jogada n�o foi v�lida.
							System.out.println("Jogador 1, informe uma posicao: ");
							posicao = teclado.next(); // Vari�vel posi��o recebendo o valor digitado.
							valida = 0;
							
						}
						tab.jogada(ronaldo.getPosicao(), "X"); //M�todo para armazenar as jogadas no tabuleiro, e indicar o simbolo do jogador.
						valida = 1;
						
					}while(valida == 0); // Condi��o da estrutura de repeti��o. O c�digo acima se repete enquanto a v�riavel valida for igual a 0.
					
					jogadas++; // Vari�vel recebe um acrescimo de valor, para que o tabuleiro possa analizaar o n�mero de jogadas executadas.
					valida = 0; // Vari�vel recebe o valor 0 para que a estrutura de repeti��o possa ser utilizada novamente em outro momento.
					tab.mostrar(); // Mostra a situa��o do tabuleiro ap�s realiza��o a jogada.
					if (!tab.ganhou(jogadas).equals("null")) { // Mostra o resultado do jogo caso seja diferente de um valor n�o definido (null).
						break; // finaliza o la�o de repeti��o, encerrando o jogo.
					}
					
					do { // Estrutura de jogadas do Computador (CompA). ------------------------
						posicao = computador.jogaComp(); // Variavel recebendo a jogada do Computador atrav�s do m�todo chamado.
						while(!tab.validar(posicao)) { // La�o de repeti��o para validar a jogada. Diferente do la�o anterior, esse n�o apresenta mensagens informativas ao jogador(CompA).
							posicao = computador.jogaComp();
							valida = 0;
							
						}
						tab.jogada(posicao, "O"); //M�todo para armazenar as jogadas no tabuleiro, e indicar o simbolo do jogador que agora � diferente.
						valida = 1;
						
					}while(valida == 0);
					
					jogadas++;
					valida = 0;
					if (!tab.ganhou(jogadas).equals("null")) {
						break;
					}
					
				}//-------------
			opcao = 0; // Vari�vel recebe valor diferente para encerrar o la�o de repeti��o, finalizando a estrutura de jogadas.
				
			}
			
		}
		
		
		
		
		if (opcao == 2) { //Estrutura de condi��o, caso escolha do usu�rio seja "nivel B".
			while (opcao == 2) {
				CompB computador = new CompB(); // Instancia��o do objeto CompB. Nesse n�vel, o computador (CompB) joga com base nas jogadas realizadas pelo jogador.
				while(true) {
					System.out.println("=-=-=-=-= JOGO DA VELHA =-=-=-=-=");
					tab.mostrar();
					
					do { // Estrutura de jogadas do Jogador 1 (usu�rio). -------------------
						System.out.println("Jogador 1, informe uma posicao: ");
						ronaldo.setPosicao(teclado.next());
						while(!tab.validar(ronaldo.getPosicao())) {
							System.out.println("Jogada invalida, tente novamente!");
							System.out.println("Jogador 1, informe uma posicao: ");
							posicao = teclado.next();
							valida = 0;
							
						}
						tab.jogada(ronaldo.getPosicao(), "X");
						computador.setAdversario(ronaldo.getPosicao()); // M�todo chamado para que o jogador CompA identifique qual jogada foi feita pelo jogador Usu�rio.
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
		
		
		
		
		if (opcao == 3) { //Estrutura de condi��o, caso escolha do usu�rio seja "nivel C".
			while (opcao == 3) {
				CompC computador = new CompC(); // Instancia��o do objeto CompC. Nesse n�vel, o computador (CompC) joga em posi��es sequenciais.
				while(true) {
					System.out.println("=-=-=-=-= JOGO DA VELHA =-=-=-=-=");
					tab.mostrar();
					
					do { // Estrutura de jogadas do Jogador 1 (usu�rio). -------------------
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


// OBS: Linhas de c�digo n�o comentadas s�o linhas que j� foram descritas no decorrer do c�digo, evitando repeti��o de palavras.