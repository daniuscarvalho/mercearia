package model;

import java.util.GregorianCalendar;

public class PedidoCompra  extends Pedido {

	public PedidoCompra(Entidade entidade, Produto produto,GregorianCalendar dataCompra, double quantidade) {
		super(entidade, produto, dataCompra, quantidade);
	}

	
}
