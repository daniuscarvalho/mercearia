package DAO;

import control.ConexaoDB;
import javax.swing.JOptionPane;
import model.Produto;

public class ProdutoDAO {
	
	public void inserirProduto(Produto produto){
            //JOptionPane.showMessageDialog(null,produto.getNome()+produto.getPrecoUnitario());
		// String sql = "INSERT INTO Produto VALUES('"+produto.getNome()+"')";
		// String sql = "INSERT INTO Produto(nome_produto) VALUES ('eee')";
		 String sql = "INSERT INTO Produto(nome_produto,preco_produto) VALUES ('"+produto.getNome()+"',"+produto.getPrecoUnitario()+")";	
             //String sql = "INSERT INTO Produto(nome_produto) VALUES ('"+produto.getNome()+"')";	
		 ConexaoDB conn = new ConexaoDB();
		 conn.executarSQL(sql);
		 conn.fechaConexao();
                 JOptionPane.showMessageDialog(null, "enviou");
     
                
		 
	}
	
	
}
