/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import DAO.ProdutoDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Produto;
import viewer.TelaProdutos;


   
public class ProdutoCrtl {
    
     private Produto produto;
     private TelaProdutos telaProdutos;
     
    public void inserirProduto(JTextField nomeProduto, JTextField precoProduto){
         try {
             this.telaProdutos = new TelaProdutos();
             this.produto = new Produto(nomeProduto.getText(),precoProduto.getText());
             ProdutoDAO produtoDao = new ProdutoDAO();
             produtoDao.inserirProduto(produto);           
             telaProdutos.limparTelaProduto();

         }catch(Exception ex){
             telaProdutos.nomeProdutoObrigatorio();
             telaProdutos.precoProdutoObrigatorio();
             JOptionPane.showMessageDialog(null, ex.getMessage());
           
         }
             
        
    }
}
