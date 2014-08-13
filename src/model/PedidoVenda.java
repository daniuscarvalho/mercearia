package model;

import java.util.GregorianCalendar;

public class PedidoVenda extends Pedido {

	public PedidoVenda(Entidade entidade, Produto produto,GregorianCalendar dataCompra, double quantidade) {
		super(entidade, produto, dataCompra, quantidade);
	}
	

}
