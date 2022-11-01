package Banca;

import java.util.ArrayList;
import java.util.Scanner;

public class BancaApp {
	static ArrayList<Cd> cd = new ArrayList<Cd>();
	static ArrayList<Livro> livro = new ArrayList<Livro>();
	static ArrayList<Revista> revista = new ArrayList<Revista>();
	static ArrayList<Publicacao> publicacao = new ArrayList<Publicacao>();
	
	public static void main(String[] args) {
		
		cadastrarBanca();	
		imprimirRevistas();
		imprimirPublicacoes(revista);
	}

	private static void cadastrarBanca() {
		
		livro.add(new Livro("teste1", 2000, "Ciclano"));
		livro.add(new Livro("teste2", 4000, "Beltrano"));
		
		revista.add(new Revista("teste1", 10, 02, 2002));
		revista.add(new Revista("teste2", 99, 04, 2004));
		
		cd.add(new Cd("teste1", 1000, 10));
		cd.add(new Cd("teste2", 50, 30));		
				
	}
	
	private static void imprimirRevistas() {
		
		for(Revista revistaRecuperada: revista) {
			
			String tituloRevista = revistaRecuperada.toString();		
			System.out.println(tituloRevista);
		}	
		
		System.out.println("Possui " + revista.size() + " titulos registrados.");
	}
	
	private static void imprimirPublicacoes(ArrayList<Revista> revista) {
				
		for(Publicacao publicacaoRecuperada: revista) {
		
			String tituloPublicacao = publicacaoRecuperada.toString();
			double precoVendaPublicacao = publicacaoRecuperada.precoVenda();
			
			if(precoVendaPublicacao < 100) 
				System.out.println(tituloPublicacao + " Preço de venda: " + precoVendaPublicacao);		
		}
	}
}
