package Empresa;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		ListaSimples lista = new ListaSimples();
		
		lista.adicionaNoInicio("Líbilly");
		lista.adicionaNoInicio("Igor");
		lista.adicionaNoInicio("Geovana");
		lista.adicionaNoInicio("Cícero");
		lista.adicionaNoInicio("Lucas");
		lista.adicionaNoInicio("Clara");
		lista.adicionaNoInicio("Mateus");
		lista.adicionaNoInicio("Edilson");
		lista.adicionaNoInicio("Mayan");
		lista.adicionaNoInicio("Alícia");
		
		System.out.println(lista.toString());
		
		lista.adicionaNoFim("Jimin");
		lista.adicionaNoFim("Jungkook");
		lista.adicionaNoFim("Jin");
		lista.adicionaNoFim("J-HOPE");
		lista.adicionaNoFim("Suga");
		lista.adicionaNoFim("Alícia");
		
		System.out.println(lista.toString());
		
		lista.adicionaPorPosicao(2, "RM" );
		
		System.out.println(lista.toString());
		
		lista.removeDoFim();
		System.out.println(lista.toString());
		
		lista.removePorPorsicao(3);
		System.out.println(lista.toString());
		
		lista.removerDoInicio();
		System.out.println(lista.toString());
		
		JOptionPane.showMessageDialog(null, null);

	}

}
