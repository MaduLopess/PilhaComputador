package negocio;

import modelagem.PecaComputador;

/**
 *  Classe Montador a qual possui atributos para vetor e métodos para empilhamento
 *  e desempilhamento de objetos nos vetores, além de um método de saída.
 */

public class Montador {
     
	 private int tamanhoPilha = 6;
	 private PecaComputador [] computador;
	 private int ponteiro;
	 
	 
	 public Montador() {
		 this.computador = new PecaComputador[tamanhoPilha];
		 this.ponteiro= 0;
		 
	 }


	public PecaComputador[] getComputador() {
		return computador;
	}


	public void setComputador(PecaComputador[] computador) {
		this.computador = computador;
	}

	public void movimentarPilha() {
		for(int i = 0; i < ponteiro; i++) {
			if(ponteiro - i < computador.length) {
			computador[ponteiro - i]= computador[ponteiro - i -1];
		}
	}
	computador [0]= null;
	
}
	public void empilharPecas(PecaComputador pecaComputador) {
		System.out.println("EMPILHANDO PEÇAS: " +pecaComputador.getNomePeca());
		
		movimentarPilha();
		computador [0] = pecaComputador;
		ponteiro++;
		
		printComputador();
	}
	public void printComputador() {
		String retorno = "";
		for(int i = 0; i < computador.length; i++) {
			retorno += String.format("\t \t [%s] -> %s", i, computador[i] != null ? computador[i].getNomePeca(): "");
		}
		System.out.println(retorno);
	}
	public void movimentarDesempilhamento() {
		for (int i = 0; i < ponteiro; i++) {
			if(i + 1 < computador.length) {
				computador[i] = computador [i+1];
			}
		}
		computador [ponteiro -1]= null;
	}
	
	public void desempilhar(PecaComputador pecaComputador) {
		System.out.println("DESEMPILHAR PEÇAS:" +pecaComputador.getNomePeca());
		
       movimentarDesempilhamento();
		
		ponteiro--;
		
		printComputador();
		
	}
}
