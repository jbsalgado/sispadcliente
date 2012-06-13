/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.pe.saudecaruaru.sispad.desktop.gui;

import br.gov.pe.saudecaruaru.sispad.desktop.modelos.LogTableModel;
import br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView;

/**
 *
 * @author Junior Pires
 */
public class Log extends javax.swing.JFrame {

    /**
     * Creates new form Log
     */
    List<MessageWebService> dados;
    public Log(List<MessageWebService> dados) {
        this.dados=dados; 
        initComponents();
        createJTable();
      
        
    }
    
    public JTable createJTable() {  
  
     
    String[] colunas = new String[]{"Tipo", "Mensagem","Codigo"};  
  
    // Alimenta as linhas de dados  
//    dados.add(new MessageWebService("1", "SUCESSO", "3"));  
//    dados.add(new MessageWebService("0", "ERRO", "9"));  
//    dados.add(new MessageWebService("1", "SUCESSO", "3"));  
//    dados.add(new MessageWebService("0", "ERRO", "9"));  
//    dados.add(new MessageWebService("1", "SUCESSO", "3"));  
//    dados.add(new MessageWebService("0", "ERRO", "9"));  
//    
//    dados.add(new String[] { "RJ", "Rio de Janeiro" });  
//    dados.add(new String[] { "RN", "Rio Grande do Norte" });  
//    dados.add(new String[] { "ES", "Espirito Santo" });  
    boolean [] edicao = {false,true,true};
    LogTableModel modelo = new LogTableModel(this.dados, colunas,edicao);  
    this.jTableLog = new JTable(modelo);  
    this.jTableLog.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
     TableColumn column0;
     TableColumn column1;
     TableColumn column2;
     jTableLog.setRowHeight(30);
     column0=this.jTableLog.getColumnModel().getColumn(0);
     column0.setPreferredWidth(10);
     column1=this.jTableLog.getColumnModel().getColumn(1);
     column1.setPreferredWidth(900);
     column2=this.jTableLog.getColumnModel().getColumn(2);
     column2.setPreferredWidth(10);
    return this.jTableLog;  
  
}  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLog = createJTable();
        jScrollPane1.setViewportView(jTableLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /*
//         * Set the Nimbus look and feel
//         */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /*
//         * If Nimbus (introduced in Java SE 6) is not available, stay with the
//         * default look and feel. For details see
//         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /*
//         * Create and display the form
//         */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new Log().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLog;
    // End of variables declaration//GEN-END:variables
}
