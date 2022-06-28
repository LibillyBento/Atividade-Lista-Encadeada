package br.ifba.edu.lista;

import javax.swing.JOptionPane;

import br.ifba.edu.basica.Celula;

public class Lista {

	private Celula cabeca;
	private Celula cauda;
	private int totalElementos = 0;

	public void adicionaNoComeco(Object obj) {

		Celula nova = new Celula(this.cabeca, obj);
		this.cabeca = nova;

		if (totalElementos == 0) {
			this.cauda = nova;
		}

		this.totalElementos++;

	}
	
	public void adicionaNoFinal(Object obj) {
		
		if(this.totalElementos == 0) {
			this.adicionaNoComeco(obj);
		} else {
			Celula nova = new Celula(obj);
			this.cauda.setProxima(nova);
			this.cauda = nova;
			this.totalElementos++;
		}
	}
	
	public void adicionaPorPosicao(int posicao, Object obj) {
		
		if(posicao == 0) {
			this.adicionaNoComeco(obj);
		}else if (posicao == this.totalElementos) {
			this.adicionaNoFinal(obj);	
		}
		
		 if (posicao > this.totalElementos) {
			 JOptionPane.showMessageDialog(null, "Não existe essa posição");
			 
		}else {
	
		Celula anterior = this.cabeca;
		
		for(int cont = 0; cont < posicao - 1; cont++) {
			 anterior = anterior.getProxima();
			 
		}
		
		Celula nova = new Celula(anterior.getProxima(), obj);
		anterior.setProxima(nova);
		this.totalElementos++;
		
	}
}
	
	public void removerDoComeco() {
		Celula aux = this.cabeca;
		this.cabeca = this.cabeca.getProxima();
		aux.setProxima(null);

		this.totalElementos--;

	}

	public boolean verificar(int pos) {
		return pos >= 0 && pos < this.totalElementos;

	}

	public void removePPorsicao(int pos) {
		if (pos == 0) {

			this.removerDoComeco();

		} else if (pos == this.totalElementos) {

			this.removeDoFim();

		} else if (!this.verificar(pos)) {

			JOptionPane.showMessageDialog(null, "Posição Inválida", null, JOptionPane.ERROR_MESSAGE);
			throw new IllegalArgumentException("A posição digitada é inválida");

		} else {

			Celula aux = this.cabeca;

			for (int i = 0; i < pos - 1; i++) {

				aux = aux.getProxima();

			}

			aux.setProxima(aux.getProxima().getProxima());
			aux.getProxima();
			this.totalElementos--;
		}
	}

	public void removeDoFim() {

		Celula aux = this.cauda;

		aux.setProxima(null);
		this.totalElementos--;

	}

	public String toString() {

		if (this.totalElementos == 0) {
			return "[]";

		}

		StringBuilder listaencadeada = new StringBuilder("[");
		Celula atual = this.cabeca;

		for (int i = 0; i < this.totalElementos - 1; i++) {
			listaencadeada.append(atual.getObjeto());
			listaencadeada.append(",");
			atual = atual.getProxima();

		}

		listaencadeada.append(atual.getObjeto());
		listaencadeada.append("]");

		return listaencadeada.toString();

	}

}


	



	


