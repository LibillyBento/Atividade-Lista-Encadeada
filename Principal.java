package br.ifba.edu.principal;

import javax.swing.JOptionPane;

import br.ifba.edu.lista.Lista;

public class Principal {

	public static void main(String[] args) {

		Lista lista = new Lista();
		
		lista.adicionaNoComeco("Líbilly");
		lista.adicionaNoComeco("Igor");
		lista.adicionaNoComeco("Geovana");
		lista.adicionaNoComeco("Cícero");
		lista.adicionaNoComeco("Lucas");
		lista.adicionaNoComeco("Clara");
		lista.adicionaNoComeco("Mateus");
		lista.adicionaNoComeco("Edilson");
		lista.adicionaNoComeco("Mayan");
		lista.adicionaNoComeco("Alícia");
		
		System.out.println(lista.toString());
		
		lista.adicionaNoFinal("Jimin");
		lista.adicionaNoFinal("Jungkook");
		lista.adicionaNoFinal("Jin");
		lista.adicionaNoFinal("J-HOPE");
		lista.adicionaNoFinal("Alícia");
		
		System.out.println(lista.toString());
		
		lista.adicionaPorPosicao(22, "RM" );
		
		System.out.println(lista.toString());
		
		lista.removerDoComeco();
		
		JOptionPane.showMessageDialog(null, null);
		
		lista.removePPorsicao(3);
		System.out.println(lista.toString());
		
		lista.removeDoFim();
		System.out.println(lista.toString());
	}

}
