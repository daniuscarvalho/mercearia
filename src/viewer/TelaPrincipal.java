/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaPrincipal.java
 *
 * Created on 21/08/2014, 18:55:33
 */

package viewer;

import control.ProdutoCrtl;
import model.Produto;

/**
 *
 * @author 201300571
 */
public class TelaPrincipal extends javax.swing.JFrame {
TelaEntidade telaEntidade;
TelaProdutos telaProdutos;
    /** Creates new form TelaPrincipal */
    public TelaPrincipal() {
        initComponents();
        //telaEntidade = new TelaEntidade();
        //telaProdutos = new TelaProdutos();
        //telaEntidade.setVisible(false);
        //telaProdutos.setFocusable(false);
        this.pnlClientes.setVisible(false);
        this.pnlProduto.setVisible(false);
    }
  public void nomeProdutoObrigatorio(){
       lblObrigatorio1.setVisible(true);
    }
    public void precoProdutoObrigatorio(){
        lblObrigatorio2.setVisible(true);
    }
    public void limparTelaProduto(){
         this.txtNomeProduto.setText("");
         this.txtPrecoProduto.setText("");
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        pnlClientes = new javax.swing.JPanel();
        lblNomeProduto3 = new javax.swing.JLabel();
        txtNomeProduto1 = new javax.swing.JTextField();
        btnSalvar1 = new javax.swing.JButton();
        lblNomeProduto4 = new javax.swing.JLabel();
        btnLimpar1 = new javax.swing.JButton();
        btnFechar1 = new javax.swing.JButton();
        lblObrigatorio4 = new javax.swing.JLabel();
        lblObrigatorio6 = new javax.swing.JLabel();
        txtPrecoProduto1 = new javax.swing.JTextField();
        lblNomeProduto5 = new javax.swing.JLabel();
        lblObrigatorio7 = new javax.swing.JLabel();
        txtPrecoProduto2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioCNPJ = new javax.swing.JRadioButton();
        jRadioCPF = new javax.swing.JRadioButton();
        txtCNPJ = new javax.swing.JTextField();
        pnlProduto = new javax.swing.JPanel();
        lblNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        txtPrecoProduto = new javax.swing.JTextField();
        lblNomeProduto1 = new javax.swing.JLabel();
        lblNomeProduto2 = new javax.swing.JLabel();
        cmbUnidadeMedida = new javax.swing.JComboBox();
        btnLimparProduto = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        lblObrigatorio1 = new javax.swing.JLabel();
        lblObrigatorio2 = new javax.swing.JLabel();
        lblObrigatorio3 = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuEntidade = new javax.swing.JMenuItem();
        jMenuProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuFechar = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlClientes.setName(""); // NOI18N

        lblNomeProduto3.setText("Nome do Cliente:");

        txtNomeProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProduto1ActionPerformed(evt);
            }
        });

        btnSalvar1.setText("Salvar");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        lblNomeProduto4.setText("Telefone:");

        btnLimpar1.setText("Limpar");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });

        btnFechar1.setText("Fechar");
        btnFechar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechar1ActionPerformed(evt);
            }
        });

        lblObrigatorio4.setForeground(new java.awt.Color(255, 0, 0));
        lblObrigatorio4.setText("*");

        lblObrigatorio6.setForeground(new java.awt.Color(255, 0, 0));
        lblObrigatorio6.setText("*");

        txtPrecoProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoProduto1ActionPerformed(evt);
            }
        });

        lblNomeProduto5.setText("Limite de Credito");

        lblObrigatorio7.setForeground(new java.awt.Color(255, 0, 0));
        lblObrigatorio7.setText("*");

        txtPrecoProduto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoProduto2ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF/CNPJ"));

        jRadioCNPJ.setText("CNPJ");

        jRadioCPF.setText("CPF");
        jRadioCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRadioCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jRadioCNPJ))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioCPF)
                    .addComponent(jRadioCNPJ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNPJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomeProduto4)
                            .addComponent(lblNomeProduto5)
                            .addComponent(lblNomeProduto3))
                        .addGap(18, 18, 18)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlClientesLayout.createSequentialGroup()
                                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblObrigatorio4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblObrigatorio6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeProduto1)
                                    .addComponent(txtPrecoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlClientesLayout.createSequentialGroup()
                                    .addComponent(btnSalvar1)
                                    .addGap(10, 10, 10)
                                    .addComponent(btnLimpar1)
                                    .addGap(10, 10, 10)
                                    .addComponent(btnFechar1))
                                .addGroup(pnlClientesLayout.createSequentialGroup()
                                    .addComponent(lblObrigatorio7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPrecoProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObrigatorio4)
                    .addComponent(lblNomeProduto3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblObrigatorio6)
                    .addComponent(txtPrecoProduto1)
                    .addComponent(lblNomeProduto4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblObrigatorio7)
                    .addComponent(lblNomeProduto5)
                    .addComponent(txtPrecoProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar1)
                    .addComponent(btnLimpar1)
                    .addComponent(btnSalvar1))
                .addGap(54, 54, 54))
        );

        pnlClientes.setBounds(0, 0, 710, 320);
        jLayeredPane2.add(pnlClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pnlProduto.setName(""); // NOI18N

        lblNomeProduto.setText("Nome do Produto:");

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoProdutoActionPerformed(evt);
            }
        });

        lblNomeProduto1.setText("Preço Unitario");

        lblNomeProduto2.setText("Unidade de Medida:");

        cmbUnidadeMedida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unidade", "Litro" }));
        cmbUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUnidadeMedidaActionPerformed(evt);
            }
        });

        btnLimparProduto.setText("Limpar");
        btnLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdutoActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblObrigatorio1.setForeground(new java.awt.Color(255, 0, 0));
        lblObrigatorio1.setText("*");

        lblObrigatorio2.setForeground(new java.awt.Color(255, 0, 0));
        lblObrigatorio2.setText("*");

        lblObrigatorio3.setForeground(new java.awt.Color(255, 0, 0));
        lblObrigatorio3.setText("*");

        javax.swing.GroupLayout pnlProdutoLayout = new javax.swing.GroupLayout(pnlProduto);
        pnlProduto.setLayout(pnlProdutoLayout);
        pnlProdutoLayout.setHorizontalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProdutoLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimparProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFechar))
                    .addGroup(pnlProdutoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlProdutoLayout.createSequentialGroup()
                                    .addGap(133, 133, 133)
                                    .addComponent(lblObrigatorio2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdutoLayout.createSequentialGroup()
                                    .addComponent(lblNomeProduto1)
                                    .addGap(250, 250, 250))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdutoLayout.createSequentialGroup()
                                    .addComponent(lblNomeProduto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblObrigatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlProdutoLayout.createSequentialGroup()
                                .addComponent(lblNomeProduto2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblObrigatorio3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        pnlProdutoLayout.setVerticalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObrigatorio1)
                    .addComponent(lblNomeProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto1)
                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObrigatorio2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto2)
                    .addComponent(cmbUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObrigatorio3))
                .addGap(28, 28, 28)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimparProduto)
                    .addComponent(btnFechar))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pnlProduto.setBounds(-31, -3, 740, 330);
        jLayeredPane2.add(pnlProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Cadastros");

        jMenuEntidade.setText("Cliente/Forneceador");
        jMenuEntidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEntidadeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEntidade);

        jMenuProduto.setText("Produto");
        jMenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuProduto);

        menuPrincipal.add(jMenu1);

        jMenu2.setText("Estoque");

        jMenuItem5.setText("Entrada");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        menuPrincipal.add(jMenu2);

        jMenu3.setText("Pedido");

        jMenuItem4.setText("Pedido de Venda");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem6.setText("Pedido de Compra");
        jMenu3.add(jMenuItem6);

        menuPrincipal.add(jMenu3);

        jMenuFechar.setText("Fechar");
        jMenuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFecharActionPerformed(evt);
            }
        });

        jMenuItem7.setText("Fechar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuFechar.add(jMenuItem7);

        menuPrincipal.add(jMenuFechar);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuEntidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEntidadeActionPerformed

            this.pnlClientes.setVisible(true);
            this.pnlClientes.setFocusable(true);
            this.pnlProduto.setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_jMenuEntidadeActionPerformed

    private void jMenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutoActionPerformed
            this.pnlProduto.setVisible(true);
            this.pnlProduto.setFocusable(true);
             this.pnlClientes.setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_jMenuProdutoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        System.exit(0);
        // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFecharActionPerformed

        // TODO add your handling code here:
}//GEN-LAST:event_jMenuFecharActionPerformed

    private void txtCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNPJActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtCNPJActionPerformed

    private void jRadioCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCPFActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jRadioCPFActionPerformed

    private void txtPrecoProduto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProduto2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtPrecoProduto2ActionPerformed

    private void txtPrecoProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProduto1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtPrecoProduto1ActionPerformed

    private void btnFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechar1ActionPerformed
        //this.dispose();
        this.pnlClientes.setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_btnFechar1ActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        txtNomeProduto.setText(null);
        txtCNPJ.setText(null);

        // TODO add your handling code here:
}//GEN-LAST:event_btnLimpar1ActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed

}//GEN-LAST:event_btnSalvar1ActionPerformed

    private void txtNomeProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProduto1ActionPerformed

        // TODO<nenhum> add your handling code here:
}//GEN-LAST:event_txtNomeProduto1ActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
       // this.dispose();
        this.pnlProduto.setVisible(false);
        //System.exit(0);
        // TODO add your handling code here:
}//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdutoActionPerformed
        this.limparTelaProduto();
}//GEN-LAST:event_btnLimparProdutoActionPerformed

    private void cmbUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUnidadeMedidaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cmbUnidadeMedidaActionPerformed

    private void txtPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProdutoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtPrecoProdutoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ProdutoCrtl produtoCrtl = new ProdutoCrtl();
        produtoCrtl.inserirProduto(txtNomeProduto, txtPrecoProduto);
}//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed

        // TODO<nenhum> add your handling code here:
}//GEN-LAST:event_txtNomeProdutoActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFechar1;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnLimparProduto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbUnidadeMedida;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuEntidade;
    private javax.swing.JMenu jMenuFechar;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuProduto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioCNPJ;
    private javax.swing.JRadioButton jRadioCPF;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblNomeProduto1;
    private javax.swing.JLabel lblNomeProduto2;
    private javax.swing.JLabel lblNomeProduto3;
    private javax.swing.JLabel lblNomeProduto4;
    private javax.swing.JLabel lblNomeProduto5;
    private javax.swing.JLabel lblObrigatorio1;
    private javax.swing.JLabel lblObrigatorio2;
    private javax.swing.JLabel lblObrigatorio3;
    private javax.swing.JLabel lblObrigatorio4;
    private javax.swing.JLabel lblObrigatorio6;
    private javax.swing.JLabel lblObrigatorio7;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlProduto;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtNomeProduto1;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextField txtPrecoProduto1;
    private javax.swing.JTextField txtPrecoProduto2;
    // End of variables declaration//GEN-END:variables

}
