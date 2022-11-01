package Banca;

public class Livro extends Publicacao{
	private String autor;
	
	public Livro(String titulo, double custo, String autor) {
		super(titulo, custo);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return super.toString()+",    autor=" + autor;
	}

	@Override
	public double precoVenda() {
		return super.getCusto()*1.7;
	}
}
