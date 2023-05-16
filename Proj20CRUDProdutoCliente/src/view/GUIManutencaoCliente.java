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
import modelo.ClienteVO;
import servicos.ClienteServicos;
import servicos.ServicosFactory;

/**
 *
 * @author 182210051
 */
public class GUIManutencaoCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIManutencaoCliente
     */
    public GUIManutencaoCliente() {
        initComponents();
        preencherTabela();
    }
    
    DefaultTableModel dtm = new DefaultTableModel(
        new Object[][]{},
        new Object[]{"Código", "Nome", "Endereço", "CPF", "Dt.Nascimento", "Fone", "Email"}
    );

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbtnPreencherCli = new javax.swing.JButton();
        jbtnLimparCli = new javax.swing.JButton();
        jbtnAlterarCli = new javax.swing.JButton();
        jbtnDeletarCli = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfCodCli = new javax.swing.JTextField();
        jtfNomeCli = new javax.swing.JTextField();
        jtfEnderecoCli = new javax.swing.JTextField();
        jtfCpfCli = new javax.swing.JTextField();
        jtfDtNascimento = new javax.swing.JTextField();
        jtfEmailCli = new javax.swing.JTextField();
        jtfFoneCli = new javax.swing.JTextField();
        jbtnConfirmarAlteracao = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jtfPesquisaCli = new javax.swing.JTextField();
        jcbPesquisaCli = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Manutenção Cliente");

        jbtnPreencherCli.setText("Preencher");
        jbtnPreencherCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreencherCliActionPerformed(evt);
            }
        });
        jbtnPreencherCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnPreencherCliKeyPressed(evt);
            }
        });

        jbtnLimparCli.setText("Limpar");
        jbtnLimparCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparCliActionPerformed(evt);
            }
        });
        jbtnLimparCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnLimparCliKeyPressed(evt);
            }
        });

        jbtnAlterarCli.setText("Alterar");
        jbtnAlterarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarCliActionPerformed(evt);
            }
        });
        jbtnAlterarCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAlterarCliKeyPressed(evt);
            }
        });

        jbtnDeletarCli.setText("Deletar");
        jbtnDeletarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarCliActionPerformed(evt);
            }
        });
        jbtnDeletarCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnDeletarCliKeyPressed(evt);
            }
        });

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("CPF:");

        jLabel6.setText("Dt. Nascimento: ");

        jLabel7.setText("E-mail: ");

        jLabel8.setText("Fone:");

        jtfCodCli.setEditable(false);

        jbtnConfirmarAlteracao.setText("Confirmar Alteração");
        jbtnConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmarAlteracaoActionPerformed(evt);
            }
        });
        jbtnConfirmarAlteracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnConfirmarAlteracaoKeyPressed(evt);
            }
        });

        jLayeredPane2.setLayer(jbtnPreencherCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnLimparCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnAlterarCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnDeletarCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCodCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfNomeCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfEnderecoCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCpfCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfDtNascimento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfEmailCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfFoneCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnConfirmarAlteracao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jbtnPreencherCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnLimparCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnAlterarCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnDeletarCli))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNomeCli, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jtfEnderecoCli)
                            .addComponent(jtfCpfCli)
                            .addComponent(jtfDtNascimento)
                            .addComponent(jtfEmailCli)
                            .addComponent(jtfFoneCli)
                            .addComponent(jtfCodCli))
                        .addGap(72, 72, 72)
                        .addComponent(jbtnConfirmarAlteracao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPreencherCli)
                    .addComponent(jbtnLimparCli)
                    .addComponent(jbtnAlterarCli)
                    .addComponent(jbtnDeletarCli))
                .addGap(37, 37, 37)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtfNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfEnderecoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbtnConfirmarAlteracao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfFoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel1.setText("Pesquisa: ");

        jtfPesquisaCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisaCliKeyReleased(evt);
            }
        });

        jcbPesquisaCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Endereço", "CPF", "E-mail", "Dt. Nascimento", "Fone" }));

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Endereço", "CPF", "E-mail", "Fone", "Dt.Nascimento"
            }
        ));
        jScrollPane1.setViewportView(jtCliente);

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfPesquisaCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbPesquisaCli, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbPesquisaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfPesquisaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbPesquisaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void preencherTabela(){
        try{
            ClienteServicos cs = ServicosFactory.getClienteServicos();
            
            ArrayList<ClienteVO> cli= new ArrayList<>();
            
            cli = cs.buscarCliente();
            for( int i=0; i<cli.size(); i++){
                dtm.addRow(new String[]{
                    String.valueOf(cli.get(i).getCodCli()),
                    String.valueOf(cli.get(i).getNome()),
                    String.valueOf(cli.get(i).getEndereco()),
                    String.valueOf(cli.get(i).getCpf()),
                    String.valueOf(cli.get(i).getDtNasc()),
                    String.valueOf(cli.get(i).getFone()),
                    String.valueOf(cli.get(i).getEmail())
                });
            }//fecha o laço for

            //Adicionando o modelo de tabela com os dados na tabela produto
            jtCliente.setModel(dtm);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha o catch
    //fecha o método preencherTabela
    }
     
     private void limparTabela() {
        
        /*  Para limpar a tabela temos que setar o número de
            linhas para zero no default table model        
        */
        dtm.setNumRows(0);
    }//fecha o métod
     
      private void deletarCliente(){
        try{
            int linha = jtCliente.getSelectedRow();
            if(linha == -1){
                JOptionPane.showMessageDialog(this, "Por favor selecione uma linha!");
            }else{
               int result = JOptionPane.showConfirmDialog(this, 
                        "Tem certeza que deseja deletar o cliente?" + JOptionPane.YES_NO_OPTION);
          
                if(result==JOptionPane.YES_OPTION){
                ClienteServicos cs = ServicosFactory.getClienteServicos();
                String codCliente = (String) jtCliente.getValueAt(linha, 0 );
                cs.deletarCliente(Integer.parseInt(codCliente));
                
                //Mensagem de sucesso para o usuário!
                JOptionPane.showMessageDialog(this, 
                        "Cliente excluído com sucesso!");
                limparTabela();
                preencherTabela();
                
                }else if(result==JOptionPane.NO_OPTION){
                    
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, 
                    "Erro ao deletar cliente! " + e.getMessage());
        }//fim do try catch
        
      }
      
      private void filtrarCliente(){
        try{
            if(jtfPesquisaCli.getText().isEmpty()){
                preencherTabela();
            }else{
                ClienteServicos cs = ServicosFactory.getClienteServicos();
                String pesquisa = (String) jcbPesquisaCli.getSelectedItem();
                String query = null;
                if(pesquisa.equals("Código") ){
                    query = "where idcliente = " + jtfPesquisaCli.getText();
                }else if(!pesquisa.equals("Nome") )
                    if(pesquisa.equals("Endereço") ){
                     query = "where enderecocli like '%" + jtfPesquisaCli.getText() + "%' ";
                }else if(pesquisa.equals("CPF") ){
                    query = "where cpfcli like '%" + jtfPesquisaCli.getText() + "%' ";
                }else {
                    if(!pesquisa.equals("Dt.Nascimento") )if(pesquisa.equals("Fone") ){
                        query = "where fonecli like '%" + jtfPesquisaCli.getText() + "%' ";
                    }else if(!pesquisa.equals("E-mail") ){
                        query = "where dtnasccli like '%" + jtfPesquisaCli.getText() + "%' ";
                    }else {
                        query = "where emailcli like '%" + jtfPesquisaCli.getText() + "%' ";
                    }
                }else {
                    query = "where nomecli like '%" + jtfPesquisaCli.getText() + "%' ";
                }
//fim do else
                
                ArrayList<ClienteVO> cli = new ArrayList();
                cli = cs.filtrarCliente(query);
                
                for(int i=0; i < cli.size(); i++ ){
                    dtm.addRow(new String[] {
                        String.valueOf(cli.get(i).getCodCli()),
                        String.valueOf(cli.get(i).getNome()),
                        String.valueOf(cli.get(i).getEndereco()),
                        String.valueOf(cli.get(i).getCpf()),
                        String.valueOf(cli.get(i).getDtNasc()),
                        String.valueOf(cli.get(i).getFone()),
                        String.valueOf(cli.get(i).getEmail())
                });
                }//fecha o laço for
                jtCliente.setModel(dtm);
                
            }//fim do else
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,
                    "Erro ao filtrar cliente! " + e.getMessage() );
        }//fim do catch        
    //fecha o método filtrar
    }
      
      
     private void alterarCliente(){
        int linha = jtCliente.getSelectedRow();
        
        jbtnDeletarCli.setEnabled(false);
                
        
        if(linha != -1){
            jtfCodCli.setText( (String) jtCliente.getValueAt(linha, 0) );
            jtfNomeCli.setText( (String) jtCliente.getValueAt(linha, 1) );
            jtfEnderecoCli.setText( (String) jtCliente.getValueAt(linha, 2) );
            jtfCpfCli.setText( (String) jtCliente.getValueAt(linha, 3) );
            jtfDtNascimento.setText((String) jtCliente.getValueAt(linha, 4));
            jtfFoneCli.setText( (String) jtCliente.getValueAt(linha, 5));
            jtfEmailCli.setText( (String) jtCliente.getValueAt(linha, 6));
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Você não selecionou nenhuma linha!");            
        }//fim do else
        
     }
     
     private void confirmarAlteracao(){
        try{
            ClienteVO  cVO = new ClienteVO();
            if( jtfNomeCli.getText().isEmpty() || jtfEnderecoCli.getText().isEmpty() || jtfCpfCli.getText().isEmpty() || jtfDtNascimento.getText().isEmpty() || jtfEmailCli.getText().isEmpty() || jtfFoneCli.getText().isEmpty()){
                JOptionPane.showMessageDialog(
                        rootPane, 
                        "Erro! Pro favor insira as informações corretamente!", 
                        "Erro!" , 
                        JOptionPane.ERROR_MESSAGE);
            }else{
                cVO.setCodCli(Long.parseLong(jtfCodCli.getText()));
                cVO.setNome(jtfNomeCli.getText());
                cVO.setEndereco(jtfEnderecoCli.getText());
                cVO.setCpf(Long.parseLong(jtfCpfCli.getText()));
                cVO.setDtNasc(jtfDtNascimento.getText());
                cVO.setFone(jtfFoneCli.getText());
                cVO.setEmail(jtfEmailCli.getText());
                
                ClienteServicos cs = ServicosFactory.getClienteServicos();
                cs.alterarCliente(cVO);
                
                JOptionPane.showMessageDialog(this, "Cliente alterado com sucesso!");
            }//fim do else
            jbtnDeletarCli.setEnabled(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "ERRO!" + e.getMessage());
        }
    }//fecha o método confirmarAlteracao
     
      private void limparAlteracao(){
        jtfCodCli.setText(null);
        jtfNomeCli.setText(null);
        jtfEmailCli.setText(null);
        jtfCpfCli.setText(null);
        jtfFoneCli.setText(null);
        jtfEnderecoCli.setText(null);
        jtfDtNascimento.setText(null);
    }
      
    private void jtfPesquisaCliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaCliKeyReleased
        // TODO add your handling code here:
         limparTabela();
        filtrarCliente();
    }//GEN-LAST:event_jtfPesquisaCliKeyReleased

    private void jbtnPreencherCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreencherCliActionPerformed
        // TODO add your handling code here:
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbtnPreencherCliActionPerformed

    private void jbtnPreencherCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnPreencherCliKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPreencherCliKeyPressed

    private void jbtnLimparCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparCliActionPerformed
        // TODO add your handling code here:
         limparTabela();
    }//GEN-LAST:event_jbtnLimparCliActionPerformed

    private void jbtnLimparCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnLimparCliKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnLimparCliKeyPressed

    private void jbtnAlterarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarCliActionPerformed
        // TODO add your handling code here:
         alterarCliente();
    }//GEN-LAST:event_jbtnAlterarCliActionPerformed

    private void jbtnAlterarCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAlterarCliKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            alterarCliente();
        }
    }//GEN-LAST:event_jbtnAlterarCliKeyPressed

    private void jbtnDeletarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarCliActionPerformed
        // TODO add your handling code here:
        deletarCliente();
    }//GEN-LAST:event_jbtnDeletarCliActionPerformed

    private void jbtnDeletarCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnDeletarCliKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDeletarCliKeyPressed

    private void jbtnConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarAlteracaoActionPerformed
        // TODO add your handling code here
        confirmarAlteracao();
        limparAlteracao();
                           
        
    }//GEN-LAST:event_jbtnConfirmarAlteracaoActionPerformed

    private void jbtnConfirmarAlteracaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnConfirmarAlteracaoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnConfirmarAlteracaoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAlterarCli;
    private javax.swing.JButton jbtnConfirmarAlteracao;
    private javax.swing.JButton jbtnDeletarCli;
    private javax.swing.JButton jbtnLimparCli;
    private javax.swing.JButton jbtnPreencherCli;
    private javax.swing.JComboBox<String> jcbPesquisaCli;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField jtfCodCli;
    private javax.swing.JTextField jtfCpfCli;
    private javax.swing.JTextField jtfDtNascimento;
    private javax.swing.JTextField jtfEmailCli;
    private javax.swing.JTextField jtfEnderecoCli;
    private javax.swing.JTextField jtfFoneCli;
    private javax.swing.JTextField jtfNomeCli;
    private javax.swing.JTextField jtfPesquisaCli;
    // End of variables declaration//GEN-END:variables
}
