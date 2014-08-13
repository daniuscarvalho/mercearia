package model;

public class Fornecedor extends Entidade{

	private String cnpj;
	
	public Fornecedor(String nome, String tipo) {
		super(nome, tipo);
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
