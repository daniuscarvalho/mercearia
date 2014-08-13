package model;

public class UnidadeMedida {

	private String nome;
	private String descricao;
	public UnidadeMedida (String nome, String descricao){
		this.setNome(nome);
		this.setDescricao(descricao);
	}
			
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
