package br.ufjf.dcc.poo.model;

public abstract class Veiculo {
	
	private String marca;
	private double capacidadeTanque;
	private double kmPorLitro;
	
	public double calcularConsumo(double precoLitro) {
		return 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public double getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}
	
	
}
