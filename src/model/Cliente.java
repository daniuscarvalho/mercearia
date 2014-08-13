package model;

public class Cliente extends Entidade{

	private String cpf;
	
	public Cliente(String nome, String tipo) {
		super(nome, tipo);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}
