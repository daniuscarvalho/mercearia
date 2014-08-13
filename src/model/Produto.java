package model;

import control.Validar;
import control.ValidarException;
import javax.swing.JOptionPane;


public class Produto {
	
	private String nome;
	private double precoUnitario;
	private String tipoUnidade;
	private Validar validar;
	public Produto(String nome){
		this.setNome(nome);
	}
	
	public Produto(String nome, String precoUnitario,String tipoUnidade) throws Exception{
       // public Produto(String nome, double precoUnitario){
       //  public Produto(String nome, String precoUnitario) {
		this.setNome(nome);
		this.setPrecoUnitario(precoUnitario);
                validar = new Validar();
		this.setTipoUnidade(tipoUnidade);
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		try{
                    new Validar().validarString(nome);
                    this.nome = nome;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
                
	}
	public double getPrecoUnitario() {
            
		return precoUnitario;
	}
	public void setPrecoUnitario(String precoUnitario) throws Exception{
                try{
                    new Validar().validarNumeros(precoUnitario);
                    this.precoUnitario = Double.parseDouble(precoUnitario);
                }finally{
                    
                }
                    //JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    //JOptionPane.showMessageDialog(null, e.getMessage());
               
		
	}
	public String getTipoUnidade() {
		return tipoUnidade;
	}
	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}
	
}
