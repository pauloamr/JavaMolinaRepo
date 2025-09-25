package aula7;

import java.util.ArrayList;

public class Biblioteca{

	public Biblioteca(){
		
	}
	
	public Biblioteca(arrayList<Livro> livros){
		this.livros = livros;
	}
	
	private String nome;
	private ArrayList<Livro> livros = new ArrayLis<Livro>();
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome;
	}
	
	public ArrayList<Livro> getLivros(){
		return livros;
	}
	
	public void setLivros(ArrayList<Livro> livros){
		this.livros = livros;
	}
}
