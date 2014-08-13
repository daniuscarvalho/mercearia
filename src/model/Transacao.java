package model;

public class Transacao {

	private Entidade entidade;
	private double totalDivida;
	private double totalPago;
	
	
	public Transacao(Entidade entidade){
		this.setEntidade(entidade);
	}
	public double faltaQuitar(){
		double faltaQuitar;
		faltaQuitar = this.getTotalDivida()- this.getTotalPago();
		return faltaQuitar;
	}
	public Entidade getEntidade() {
		return entidade;
	}
	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}
	public double getTotalDivida() {
		return totalDivida;
	}
	public void setTotalDivida(double totalDivida) {
		this.totalDivida = totalDivida;
	}
	public double getTotalPago() {
		return totalPago;
	}
	public void setTotalPago(double totalPago) {
		this.totalPago = totalPago;
	}
	
}
