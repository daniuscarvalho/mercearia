package model;

import java.util.GregorianCalendar;

public class Pedido {

	private Entidade entidade;
	private Produto produto;
	private GregorianCalendar dataCompra;
	private double quantidade;
	
	
	public Pedido (Entidade entidade, Produto produto, GregorianCalendar dataCompra, double quantidade){
		this.setEntidade(entidade);
		this.setProduto(produto);
		this.setDataCompra(dataCompra);
		this.setQuantidade(quantidade);
	}
	
	public double valorTotalCompra(){
		double valorTotalCompra;
		valorTotalCompra = this.quantidade * produto.getPrecoUnitario();
		return  valorTotalCompra;
	}
	public double getPrecoUnitario(){
		return produto.getPrecoUnitario();
	}
	public Entidade getEntidade() {
		return entidade;
	}
	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}
	public GregorianCalendar getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(GregorianCalendar dataCompra) {
		this.dataCompra = dataCompra;
	}
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
	
	
}
