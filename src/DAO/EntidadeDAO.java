/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import control.ConexaoDB;
import javax.swing.JOptionPane;
import model.Entidade;

/**
 *
 * @author 201300571
 */
public class EntidadeDAO{
    //no consultar arrumar a parte do retorno do SQL Q NAO ESTA CONFIGURADO
	public void inserirEntidade(Entidade entidade){

         String sql = "insert into Entidade (nome,tel) VALUES('"+entidade.getNome()+"','"+entidade.getTel1()+"')";

	 ConexaoDB conn = new ConexaoDB();
	 conn.executarSQL(sql);
	 conn.fechaConexao();
         JOptionPane.showMessageDialog(null, "Operação concluida com sucesso.");
	}


	public Entidade consultarEntidade(String cpf){
		ConexaoDB conexao = new ConexaoDB();
		String sql ="select * from Entidade where cpf='"+cpf+"'";
		conexao.executarSQL(sql);
                return null;
	}

}

