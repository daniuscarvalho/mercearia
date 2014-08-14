package model;

import control.Validar;
import javax.swing.JOptionPane;


public class Produto {
	
	private String nome;
	private double precoUnitario;
	private String tipoUnidade;
	private Validar validar;
        
        	
	public Produto(String nome, String precoUnitario,String tipoUnidade) throws Exception{
        	validar = new Validar();	
                this.setNome(nome);
		this.setPrecoUnitario(precoUnitario);
		this.setTipoUnidade(tipoUnidade);
	}
        public Produto(String nome, String precoUnitario) throws Exception{
                validar = new Validar();	
                this.setNome(nome);
		this.setPrecoUnitario(precoUnitario);
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
            validar.ValidarObrigatorios(nome,"texto");
            this.nome = nome;
                
	}
	public double getPrecoUnitario() {   
            return precoUnitario;
	}
	public void setPrecoUnitario(String precoUnitario) throws Exception{
            validar.ValidarObrigatorios(precoUnitario,"numero");    
            this.precoUnitario = Double.parseDouble(precoUnitario);
               
	}
	public String getTipoUnidade() {
		return tipoUnidade;
	}
	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}
	
}
