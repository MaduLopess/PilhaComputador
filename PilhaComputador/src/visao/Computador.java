package visao;

import javax.swing.JOptionPane;

import modelagem.PecaComputador;
import negocio.Montador;

// A classe Computador deverá interagir com o usuário por meio de telas da JOptionPane.

public class Computador {

	public static void main(String[] args) {
		
		// A criação de objetos e entrada do usuário via tela do JOptionPane.
		String nomePecaUm = JOptionPane.showInputDialog("Insira o nome da peça: ");
		PecaComputador pecaUm = new PecaComputador (0, nomePecaUm);
		
		
		String nomePecaDois = JOptionPane.showInputDialog("Insira o nome da peça: ");
		PecaComputador pecaDois = new PecaComputador (1, nomePecaDois);
		
		String nomePecaTres = JOptionPane.showInputDialog("Insira o nome da peça: ");
		PecaComputador pecaTres = new PecaComputador (2, nomePecaTres);
		
		
		
		String nomePecaQuatro = JOptionPane.showInputDialog("Insira o nome da peça: ");
		PecaComputador pecaQuatro = new PecaComputador (3, nomePecaQuatro);
		
		
		String nomePecaCinco = JOptionPane.showInputDialog("Insira o nome da peça: ");
		PecaComputador pecaCinco = new PecaComputador (4, nomePecaCinco);
		
		
		String nomePecaSeis = JOptionPane.showInputDialog("Insira o nome da peça: ");
		PecaComputador pecaSeis = new PecaComputador (5, nomePecaSeis);
		
		// criação do objeto montador
		Montador montador = new Montador();
		//imprime a informação ao usuário de que está empilhando
		System.out.println(" -- EMPILHANDO --");
		
		//chama o método empilharPecas e passa os objetos como parâmetro
		montador.empilharPecas(pecaSeis);
		montador.empilharPecas(pecaCinco);
		montador.empilharPecas(pecaQuatro);
		montador.empilharPecas(pecaTres);
		montador.empilharPecas(pecaDois);
		montador.empilharPecas(pecaUm);
		
		System.out.println();
		//imprime saída
		System.out.println("--IMPRIMINDO PILHA --");
		
		montador.printComputador();
		
		//informa ao usuário que está desempilhando 
		System.out.println("\n --DESEMPILHANDO --");
		//chama o método desempilhar e passa os objetos como parâmetro
		montador.desempilhar(pecaUm);
		montador.desempilhar(pecaDois);
		montador.desempilhar(pecaTres);
		montador.desempilhar(pecaQuatro);
		montador.desempilhar(pecaCinco);
		montador.desempilhar(pecaSeis);
		
		//imprime saída
		System.out.println("--IMPRIMINDO PILHA--");
		
		montador.printComputador();
		

}
}
