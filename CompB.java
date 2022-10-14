package empresa;

public class CompB extends Computador { // Subclasse, herdando atributos e m�todos da Superclasse Computador. Suas jogadas s�o baseadas nas jogadas do advers�rio.
	private String adversario; // atributo acrescentado para analisar a jogada do advers�rio.
	private int num; 
	

	public CompB() { // Construtor vazio.
		super();
	}
	
	



	public String getAdversario() { // M�todo para selecionar a jogada armazenada na vari�vel adversario.
		return adversario;
	}





	public void setAdversario(String adversario) { // M�todo para armazenar a jogada do advers�rio na vari�vel adversario.
		this.adversario = adversario;
	}





	@Override
	String jogaComp() { // Nota��o indicando que o m�todo ser� sobrescrito.
		
		switch (adversario) { // Estrutura de condi��o, analisando as jogadas do advers�rio e retornando suas op��es de jogada baseada nas condi��es.
		
		case "1": // Caso o advers�rio tenha jogado o valor igual a 1.
			String escolhasC [] = {"2", "3", "4", "5","7", "9"}; // Vetor com as op��es de escolha j� eliminando o valor de jogada do advers�rio.
			num = (int)(Math.random()*6); // Vari�vel selecionando um valor aleat�rio com base nas op��es do vetor.
			opcao = escolhasC[num]; // Vari�vel recebendo o valor do vetor na posicao selecionada como par�metro. O parametr� sendo representado pelo valor da variavel num.
		break; // Comando para quebrar a estrutura de condi��o.
		
		
		case "2":
			String escolhasD [] = {"1", "3", "5", "8"};
			num = (int)(Math.random()*4);
			opcao = escolhasD[num];
		break;
		
		
		case "3": 
			String escolhasE [] = {"2", "5", "6", "7"};
			num = (int)(Math.random()*4);
			opcao = escolhasE[num];
		
		break;
		
		
		case "4": 
			String escolhasF [] = {"1","2","5", "6", "7", "8"};
			num = (int)(Math.random()*6);
			opcao = escolhasF[num];		
		break;
		
		
		case "5": 
			String escolhasG [] = {"1", "2", "3", "4", "6", "7", "8", "9"};
			num = (int)(Math.random()*8);
			opcao = escolhasG[num];	
		break;
		
		
		case "6": 
			String escolhasH [] = {"2", "3", "4", "5", "8", "9",};
			num = (int)(Math.random()*6);
			opcao = escolhasH[num];
		break;
		
		
		case "7": 
			String escolhasI [] = {"4", "5", "8", "9", "3", "1"};
			num = (int)(Math.random()*6);
			opcao = escolhasI[num];
		break;
		
		
		case "8": 
			String escolhasJ [] = {"7", "5", "9", "2"};
			num = (int)(Math.random()*4);
			opcao = escolhasJ[num];
		break;
		
		
		case "9": 
			String escolhasK [] = {"3", "6", "8", "7", "5", "1"};
			num = (int)(Math.random()*6);
			opcao = escolhasK[num];
		break;
			
		

		}
		return opcao; // Retorna o valor da v�riavel como jogada do computador.
	}

}
