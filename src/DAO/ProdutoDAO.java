package DAO;

import control.ConexaoDB;
import javax.swing.JOptionPane;
import model.Produto;

public class ProdutoDAO {
	
	public void inserirProduto(Produto produto){
	 String sql = "INSERT INTO Produto(nome_produto,preco_produto) VALUES ('"+produto.getNome()+"',"+produto.getPrecoUnitario()+")";	
	 ConexaoDB conn = new ConexaoDB();
	 conn.executarSQL(sql);
	 conn.fechaConexao();
         JOptionPane.showMessageDialog(null, "Operação concluida com sucesso.");
     
                
		 
	}
	
	
}
