/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import DAO.EntidadeDAO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Entidade;
import model.Produto;
import viewer.TelaProdutos;


   
public class EntidadeCrtl {
    
     private Entidade entidade;
   //  private TelaProdutos telaProdutos;
     
    public void inserirEntidade(JTextField nomeEntidade, JTextField tipoEntidade){
         try {
             //this.telaProdutos = new TelaProdutos();
             this.entidade = new Entidade(nomeEntidade.getText(),tipoEntidade.getText());
             EntidadeDAO entidadeDao = new EntidadeDAO();
             entidadeDao.inserirEntidade(entidade);
             //telaProdutos.limparTelaProduto();

         }catch(Exception ex){
             //telaProdutos.nomeProdutoObrigatorio();
             //telaProdutos.precoProdutoObrigatorio();
             JOptionPane.showMessageDialog(null, ex.getMessage());
           
         }
             
        
    }
}
