/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author cralves
 */
public class MenuPrincipal extends javax.swing.JFrame implements InternalFrameListener{

    //Variáveis para cada janela do sistema
    private boolean flagGuiCadProduto = false;
    private boolean flagGuiManutencaoProduto = false;
    private boolean flagGuiCadCliente = false;
    private boolean flagGuiManutencaoCliente = false;
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpAreaDeTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiCadProduto = new javax.swing.JMenuItem();
        jmiCadCliente = new javax.swing.JMenuItem();
        jmManutencaoCliente = new javax.swing.JMenu();
        jmiManuProduto = new javax.swing.JMenuItem();
        jmiManuCliente = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpAreaDeTrabalhoLayout = new javax.swing.GroupLayout(jdpAreaDeTrabalho);
        jdpAreaDeTrabalho.setLayout(jdpAreaDeTrabalhoLayout);
        jdpAreaDeTrabalhoLayout.setHorizontalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        jdpAreaDeTrabalhoLayout.setVerticalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        jmCadastro.setText("Cadastro");

        jmiCadProduto.setText("Produto");
        jmiCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadProdutoActionPerformed(evt);
            }
        });
        jmiCadProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiCadProdutoKeyPressed(evt);
            }
        });
        jmCadastro.add(jmiCadProduto);

        jmiCadCliente.setText("Cliente");
        jmiCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadClienteActionPerformed(evt);
            }
        });
        jmiCadCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiCadClienteKeyPressed(evt);
            }
        });
        jmCadastro.add(jmiCadCliente);

        jMenuBar1.add(jmCadastro);

        jmManutencaoCliente.setText("Manutenção");
        jmManutencaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManutencaoClienteActionPerformed(evt);
            }
        });
        jmManutencaoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmManutencaoClienteKeyPressed(evt);
            }
        });

        jmiManuProduto.setText("ManuProduto");
        jmiManuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManuProdutoActionPerformed(evt);
            }
        });
        jmiManuProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiManuProdutoKeyPressed(evt);
            }
        });
        jmManutencaoCliente.add(jmiManuProduto);

        jmiManuCliente.setText("ManuCliente");
        jmiManuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManuClienteActionPerformed(evt);
            }
        });
        jmiManuCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiManuClienteKeyPressed(evt);
            }
        });
        jmManutencaoCliente.add(jmiManuCliente);

        jMenuBar1.add(jmManutencaoCliente);

        jmSair.setText("Sair");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpAreaDeTrabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpAreaDeTrabalho)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Métodos criados
    private void abrirCadProduto(){
        
        if(!flagGuiCadProduto){
            GUICadProduto gcp = new GUICadProduto();
            jdpAreaDeTrabalho.add(gcp);
            gcp.setVisible(true);
            
            flagGuiCadProduto = true;
            gcp.addInternalFrameListener(this);
        }//fim do if
    }//fim do método abrirCadProduto 
    
    
    
    private void abrirManuProduto(){
        if(!flagGuiManutencaoProduto){
            GUIManutencaoProduto gmp = new GUIManutencaoProduto();
            jdpAreaDeTrabalho.add(gmp);
            gmp.setVisible(true);
            
            flagGuiManutencaoProduto = true;
            gmp.addInternalFrameListener(this);
        }//fim do if
    }//fim do método abrirManuProduto 
    
    
    private void abrirCadCliente(){
        if(!flagGuiCadCliente){
            GUICadCliente gcc = new GUICadCliente();
            jdpAreaDeTrabalho.add(gcc);
            gcc.setVisible(true);
            
            flagGuiCadCliente = true;
            gcc.addInternalFrameListener(this);
        }//fim do if
    }//fim do método abrirCadCliente
    
     private void abrirManuCliente(){
        if(!flagGuiManutencaoCliente){
            GUIManutencaoCliente gmc = new GUIManutencaoCliente();
            jdpAreaDeTrabalho.add(gmc);
            gmc.setVisible(true);
            
            flagGuiManutencaoCliente = true;
            gmc.addInternalFrameListener(this);
        }//fim do if
    }//fim do método abrirManuProduto )
    //Eventos
    
    //Eventos
    private void jmiCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadProdutoActionPerformed
        abrirCadProduto();
        
    }//GEN-LAST:event_jmiCadProdutoActionPerformed

    private void jmiCadProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiCadProdutoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirCadProduto();
        }
    }//GEN-LAST:event_jmiCadProdutoKeyPressed

    private void jmiManuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManuProdutoActionPerformed
        abrirManuProduto();
    }//GEN-LAST:event_jmiManuProdutoActionPerformed

    private void jmiManuProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiManuProdutoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirManuProduto();
        }
    }//GEN-LAST:event_jmiManuProdutoKeyPressed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_jmSairMouseClicked

    private void jmiCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadClienteActionPerformed
        abrirCadCliente();
    }//GEN-LAST:event_jmiCadClienteActionPerformed

    private void jmiCadClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiCadClienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirCadCliente();
        }
    }//GEN-LAST:event_jmiCadClienteKeyPressed

    private void jmManutencaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManutencaoClienteActionPerformed
        // TODO add your handling code here:
        abrirManuCliente();
    }//GEN-LAST:event_jmManutencaoClienteActionPerformed

    private void jmManutencaoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmManutencaoClienteKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirManuCliente();
        }
    }//GEN-LAST:event_jmManutencaoClienteKeyPressed

    private void jmiManuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManuClienteActionPerformed
        // TODO add your handling code here:
        abrirManuCliente();
    }//GEN-LAST:event_jmiManuClienteActionPerformed

    private void jmiManuClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiManuClienteKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirManuCliente();
        }
    }//GEN-LAST:event_jmiManuClienteKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpAreaDeTrabalho;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmManutencaoCliente;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmiCadCliente;
    private javax.swing.JMenuItem jmiCadProduto;
    private javax.swing.JMenuItem jmiManuCliente;
    private javax.swing.JMenuItem jmiManuProduto;
    // End of variables declaration//GEN-END:variables

    
    //Métodos Abstratos
    
    @Override
    public void internalFrameOpened(InternalFrameEvent ife) {
       
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent ife) {
      
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent ife) {
        
        if(ife.getInternalFrame() instanceof GUICadProduto){
            flagGuiCadProduto = false;
        }else if (ife.getInternalFrame() instanceof GUIManutencaoProduto){
            flagGuiManutencaoProduto = false;
        }else if (ife.getInternalFrame() instanceof GUICadCliente){
            flagGuiCadCliente = false;
        }else if (ife.getInternalFrame() instanceof GUIManutencaoCliente ){
            flagGuiManutencaoCliente = false;
        }
//fim do else
    }// fim do método abstrato internalFrameClosed

    @Override
    public void internalFrameIconified(InternalFrameEvent ife) {
        
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent ife) {
        
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent ife) {
        
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent ife) {
       
    }
}