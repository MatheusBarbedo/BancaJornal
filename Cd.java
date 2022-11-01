package Banca;

public class Cd extends Publicacao{
	private int numFaixas;

	

	public Cd(String titulo, double custo, int numFaixas) {
		super(titulo, custo);
		this.numFaixas = numFaixas;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}

	@Override
	public String toString() {
		return super.toString()+",   num de faixas= "+numFaixas;
	}

	@Override
	public double precoVenda() {
		return super.getCusto()*1.4;
	}


}
