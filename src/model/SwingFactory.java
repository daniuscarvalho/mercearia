package model;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SwingFactory {

	
	public JFrame janelaNova(){
		
		JFrame janela = new JFrame();
		return janela;
	}
	public JFrame janelaNova(String titulo,int size1, int size2,int localizacao1,int localizacao2){
		JFrame janela = this.janelaNova();
		janela.setTitle(titulo);
		janela.setSize(size1, size2);
		janela.setLocation(500, 200);
		return janela;
	}
	
	public void janelaAdd(JFrame janela, JPanel painel){
		janela.add(painel);
		janela.setVisible(true);
	}

	public JPanel painelNovo(){
		JPanel painel = new JPanel();
		return painel;	
	}
	
	public void painelAdd(JPanel painel, Component componente){
		painel.add(componente);
	}
	
	public JLabel labelNovo(String texto){
		JLabel label = new JLabel(texto);
		return label;
	}
	public JTextField campoTextoNovo(int numero){
		JTextField campoTexto = new JTextField(numero);
		return campoTexto;
	}
	public JButton botaoNovo(String texto){
		JButton botao = new JButton(texto);
		return botao;
	}
	
	public JRadioButton botaoRadioNovo(){
		JRadioButton botao = new JRadioButton();
		return botao;
	}
}
