package Banca;

public class Revista extends Publicacao{
	private int mes, ano;
	

	public Revista(String titulo, double custo, int mes, int ano) {
		super(titulo, custo);
		this.mes = mes;
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return super.toString()+",    mes= "+mes+",   ano= "+ano;
	}

	@Override
	public double precoVenda() {
		return super.getCusto()*1.5;
	}
}
