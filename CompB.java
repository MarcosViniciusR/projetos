package empresa;

public class CompB extends Computador { // Subclasse, herdando atributos e métodos da Superclasse Computador. Suas jogadas são baseadas nas jogadas do adversário.
	private String adversario; // atributo acrescentado para analisar a jogada do adversário.
	private int num; 
	

	public CompB() { // Construtor vazio.
		super();
	}
	
	



	public String getAdversario() { // Método para selecionar a jogada armazenada na variável adversario.
		return adversario;
	}





	public void setAdversario(String adversario) { // Método para armazenar a jogada do adversário na variável adversario.
		this.adversario = adversario;
	}





	@Override
	String jogaComp() { // Notação indicando que o método será sobrescrito.
		
		switch (adversario) { // Estrutura de condição, analisando as jogadas do adversário e retornando suas opções de jogada baseada nas condições.
		
		case "1": // Caso o adversário tenha jogado o valor igual a 1.
			String escolhasC [] = {"2", "3", "4", "5","7", "9"}; // Vetor com as opções de escolha já eliminando o valor de jogada do adversário.
			num = (int)(Math.random()*6); // Variável selecionando um valor aleatório com base nas opções do vetor.
			opcao = escolhasC[num]; // Variável recebendo o valor do vetor na posicao selecionada como parâmetro. O parametrô sendo representado pelo valor da variavel num.
		break; // Comando para quebrar a estrutura de condição.
		
		
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
		return opcao; // Retorna o valor da váriavel como jogada do computador.
	}

}
