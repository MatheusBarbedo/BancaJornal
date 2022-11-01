package Banca;

public abstract class Publicacao {
	private String titulo;
	private double custo;
	public Publicacao(String titulo, double custo) {
		super();
		this.titulo = titulo;
		this.custo = custo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	@Override
	public String toString() {
		return "Titulo= " + titulo + ",    custo= " + custo;
	}
	
	public abstract double precoVenda ();
	

}
