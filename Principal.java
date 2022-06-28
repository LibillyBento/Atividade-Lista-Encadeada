package br.ifba.edu.principal;

import javax.swing.JOptionPane;

import br.ifba.edu.lista.Lista;

public class Principal {

	public static void main(String[] args) {

		Lista lista = new Lista();
		
		lista.adicionaNoComeco("L�billy");
		lista.adicionaNoComeco("Igor");
		lista.adicionaNoComeco("Geovana");
		lista.adicionaNoComeco("C�cero");
		lista.adicionaNoComeco("Lucas");
		lista.adicionaNoComeco("Clara");
		lista.adicionaNoComeco("Mateus");
		lista.adicionaNoComeco("Edilson");
		lista.adicionaNoComeco("Mayan");
		lista.adicionaNoComeco("Al�cia");
		
		System.out.println(lista.toString());
		
		lista.adicionaNoFinal("Jimin");
		lista.adicionaNoFinal("Jungkook");
		lista.adicionaNoFinal("Jin");
		lista.adicionaNoFinal("J-HOPE");
		lista.adicionaNoFinal("Al�cia");
		
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
