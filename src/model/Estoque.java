package model;

public class Estoque {
	private Produto produto;
	private double quantidade;
	private double quantidadeMinima;
	
	
			
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getQuantidadeMinima() {
		return quantidadeMinima;
	}
	public void setQuantidadeMinima(double quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
	

}
