package br.com.exemplo.comercio;

public class Compra {

	int valorTotal;
	int numeroDeParcelas;

	public Compra(int valor) {
		this.valorTotal = valor;
		this.numeroDeParcelas = 1;
	}

	public Compra(int quantidadeDeParcelas, int valorParcela) {
		this.numeroDeParcelas = quantidadeDeParcelas;
		this.valorTotal = valorParcela * quantidadeDeParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public int getValorParcelas() {
		return this.valorTotal / this.numeroDeParcelas;
	}
}
