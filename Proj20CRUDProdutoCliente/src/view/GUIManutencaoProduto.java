/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProdutoVO;
import servicos.ProdutoServicos;
import servicos.ServicosFactory;

/**
 *
 * @author cralves
 */
public class GUIManutencaoProduto extends javax.swing.JInternalFrame {

    /*Criando um modelo de tabela padrão, com o  nome das colunas.
        O DefaultTableModel será o responsável pela criação de um modelo de 
        tabela com cabaçalho que quisermos. Para isso precisamos declarar
        ele como variável global da classe e inserir o nome das colunas que
        desejamos que tenha na tabela.
    
    */
    DefaultTableModel dtm = new DefaultTableModel(
        new Object[][]{},
        new Object[]{"Código", "Nome", "Valor Custo", "Quantidade"}
    );
    
    /**
     * Creates new form GUIManutencaoProduto
     */
    public GUIManutencaoProduto() {
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProduto = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jbtnPreencher = new javax.swing.JButton();
        jbtnLimpar = new javax.swing.JButton();
        jbtnAlterar = new javax.swing.JButton();
        jbtnDeletar = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jtfPesquisaPro = new javax.swing.JTextField();
        jcbPesquisaPro = new javax.swing.JComboBox<>();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfQuantidade = new javax.swing.JTextField();
        jtfValorCusto = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jtfCodigo = new javax.swing.JTextField();
        jbtnConfirmarALteracao = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção Produto");

        jtProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor Custo", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jtProduto);

        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );

        jbtnPreencher.setText("Preencher");
        jbtnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreencherActionPerformed(evt);
            }
        });

        jbtnLimpar.setText("Limpar");
        jbtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparActionPerformed(evt);
            }
        });

        jbtnAlterar.setText("Alterar");
        jbtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarActionPerformed(evt);
            }
        });
        jbtnAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAlterarKeyPressed(evt);
            }
        });

        jbtnDeletar.setText("Deletar");
        jbtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jbtnPreencher, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbtnLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbtnAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbtnDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jbtnPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jbtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPreencher)
                    .addComponent(jbtnLimpar)
                    .addComponent(jbtnAlterar)
                    .addComponent(jbtnDeletar))
                .addContainerGap())
        );

        jLabel1.setText("Pesquisa");

        jtfPesquisaPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisaProKeyReleased(evt);
            }
        });

        jcbPesquisaPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Valor Custo", "Quantidade" }));

        jLayeredPane3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jtfPesquisaPro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jcbPesquisaPro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtfPesquisaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbPesquisaPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfPesquisaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPesquisaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Código");

        jLabel3.setText("Nome");

        jLabel4.setText("Valor Custo");

        jLabel5.setText("Quantidade");

        jtfCodigo.setEditable(false);
        jtfCodigo.setFocusable(false);

        jbtnConfirmarALteracao.setText("Confirmar Alteração");
        jbtnConfirmarALteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmarALteracaoActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtfQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtfValorCusto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtfCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jbtnConfirmarALteracao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(jbtnConfirmarALteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfValorCusto)
                            .addComponent(jtfNome))))
                .addContainerGap())
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnConfirmarALteracao)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane4)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Métodos Criados
    private void preencherTabela(){
        try{
            //Buscando objeto na ProdutoServicos
            ProdutoServicos ps = ServicosFactory.getProdutoServicos();

            //Criando um ArrayList<ProdutoVO> vazio para receber o ArrayList com os dados
            ArrayList<ProdutoVO> prod = new ArrayList<>();
                    
            //Recebendo o ArrayList cheio em produtos
            prod = ps.buscarProduto();
            
            
            for( int i=0; i<prod.size(); i++){
                dtm.addRow(new String[]{
                    String.valueOf(prod.get(i).getIdProduto()),
                    String.valueOf(prod.get(i).getNome()),
                    String.valueOf(prod.get(i).getValorCusto()),
                    String.valueOf(prod.get(i).getQuantidade())
                });
            }//fecha o laço for

            //Adicionando o modelo de tabela com os dados na tabela produto
            jtProduto.setModel(dtm);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha o catch
    }//fecha o método preencherTabela
    
    private void limparTabela() {
        
        /*  Para limpar a tabela temos que setar o número de
            linhas para zero no default table model        
        */
        dtm.setNumRows(0);
    }//fecha o método limparTabela
    
    
    private void deletarProduto(){
        try{
            int linha = jtProduto.getSelectedRow();
            if(linha == -1){
                JOptionPane.showMessageDialog(this, "Por favor selecione uma linha!");
            }else{
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();
                String codProduto = (String) jtProduto.getValueAt(linha, 0 );
                ps.deletarProduto(Integer.parseInt(codProduto));
                
                //Mensagem de sucesso para o usuário!
                JOptionPane.showMessageDialog(this, 
                        "Produto excluído com sucesso!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, 
                    "Erro ao deletar produto! " + e.getMessage());
        }//fim do try catch
        
    }//fim do métoso deletarProduto
    
    
    private void filtrar(){
        try{
            if(jtfPesquisaPro.getText().isEmpty()){
                preencherTabela();
            }else{
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();
                String pesquisa = (String) jcbPesquisaPro.getSelectedItem();
                String query;
                if(pesquisa.equals("Código") ){
                    query = "where idProduto = " + jtfPesquisaPro.getText();
                }else if(pesquisa.equals("Nome") ){
                    query = "where nomePro like '%" + jtfPesquisaPro.getText() + "%' ";
                }else if(pesquisa.equals("Valor Custo") ){
                    query = "where valorcusto = " + jtfPesquisaPro.getText();
                }else{
                    query = "where quantidade = " + jtfPesquisaPro.getText();
                }//fim do else
                
                ArrayList<ProdutoVO> pro = new ArrayList();
                pro = ps.filtrarProduto(query);
                
                for(int i=0; i < pro.size(); i++ ){
                    dtm.addRow(new String[] {
                        String.valueOf(pro.get(i).getIdProduto()),
                        String.valueOf(pro.get(i).getNome()),
                        String.valueOf(pro.get(i).getValorCusto()),
                        String.valueOf(pro.get(i).getQuantidade())
                });
                }//fecha o laço for
                jtProduto.setModel(dtm);
                
            }//fim do else
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,
                    "Erro ao filtrar produto! " + e.getMessage() );
        }//fim do catch        
    }//fecha o método filtrar
    
    private void alterarProduto(){
        int linha = jtProduto.getSelectedRow();
        if(linha != -1){
            jtfCodigo.setText( (String) jtProduto.getValueAt(linha, 0) );
            jtfNome.setText( (String) jtProduto.getValueAt(linha, 1) );
            jtfValorCusto.setText( (String) jtProduto.getValueAt(linha, 2) );
            jtfQuantidade.setText( (String) jtProduto.getValueAt(linha, 3) );
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Você não selecionou nenhuma linha!");            
        }//fim do else
        
    }//fecha o método alterar produto
    
    private void confirmarAlteracao(){
        try{
            ProdutoVO  pVO = new ProdutoVO();
            if( jtfNome.getText().isEmpty() || jtfValorCusto.getText().isEmpty() || jtfQuantidade.getText().isEmpty() ){
                JOptionPane.showMessageDialog(
                        rootPane, 
                        "Erro! Pro favor insira as informações corretamente!", 
                        "Erro!" , 
                        JOptionPane.ERROR_MESSAGE);
            }else{
                pVO.setIdProduto(Integer.parseInt(jtfCodigo.getText()));
                pVO.setNome(jtfNome.getText());
                pVO.setValorCusto(Double.parseDouble(jtfValorCusto.getText()));
                pVO.setQuantidade(Integer.parseInt(jtfQuantidade.getText()));
                
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();
                ps.alterarProduto(pVO);
                
                JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!");
            }//fim do else
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro! " + e.getMessage());
        }//fim do catch
    }//fecha o método confirmarAlteracao
    
    private void limparAlteracao(){
        jtfCodigo.setText(null);
        jtfNome.setText(null);
        jtfValorCusto.setText(null);
        jtfQuantidade.setText(null);
    }//fim do método limparAlteracao
   
    
    //Métodos dos Eventos
    
    private void jbtnPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreencherActionPerformed
        limparTabela();
        preencherTabela();
       
    }//GEN-LAST:event_jbtnPreencherActionPerformed

    private void jbtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbtnLimparActionPerformed

    private void jbtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarActionPerformed
        deletarProduto();
    }//GEN-LAST:event_jbtnDeletarActionPerformed

    private void jtfPesquisaProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaProKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtfPesquisaProKeyReleased

    private void jbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarActionPerformed
        alterarProduto();
    }//GEN-LAST:event_jbtnAlterarActionPerformed

    private void jbtnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAlterarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            alterarProduto();
        }
    }//GEN-LAST:event_jbtnAlterarKeyPressed

    private void jbtnConfirmarALteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarALteracaoActionPerformed
        confirmarAlteracao();
        limparAlteracao();
    }//GEN-LAST:event_jbtnConfirmarALteracaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAlterar;
    private javax.swing.JButton jbtnConfirmarALteracao;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnPreencher;
    private javax.swing.JComboBox<String> jcbPesquisaPro;
    private javax.swing.JTable jtProduto;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisaPro;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfValorCusto;
    // End of variables declaration//GEN-END:variables
}
