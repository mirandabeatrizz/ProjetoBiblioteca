/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import banco.ConexaoBanco;
import java.lang.System.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import model.Livro;

/**
 *
 * @author luis.santos6
 */
public class Troca extends javax.swing.JFrame {
 List<Livro> listaLivros = new ArrayList<Livro>();
    /**
     * Creates new form MeusLivros
     */
    public Troca() throws SQLException {
        initComponents();
        exibirLivros();
    }
    public void exibirLivros() throws SQLException {
        ConexaoBanco cDB = new ConexaoBanco();
        listaLivros = new ArrayList<Livro>();
        ResultSet rs = cDB.buscarDados("Livro");
        while (rs.next()) {
            Livro ctn = new Livro();
            ctn.setTitulo(rs.getString("nome_livro"));
            ctn.setAutor(rs.getString("autor"));
            ctn.setNumeroPaginas(rs.getString("nmr_pg"));
            ctn.setQuantidade(rs.getString("quant_livro"));
            ctn.setCategoria(rs.getString("Categoria"));
            ctn.setImagem(rs.getString("imagem"));                                 
            listaLivros.add(ctn);
        }
        for (int i = 0; i < listaLivros.size(); i++) {
            tblLivros.setValueAt(listaLivros.get(i).getTitulo(), i, 0);
            tblLivros.setValueAt(listaLivros.get(i).getAutor(), i, 1);
            tblLivros.setValueAt(listaLivros.get(i).getNumeroPaginas(), i, 2);
            tblLivros.setValueAt(listaLivros.get(i).getQuantidade(), i, 3);
            tblLivros.setValueAt(listaLivros.get(i).getCategoria(), i, 4);
            tblLivros.setValueAt(listaLivros.get(i).getImagem(), i, 5);
           
            
        }
         
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLivros = new javax.swing.JTable();
        jButtonSelec = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        tblLivros.setBackground(new java.awt.Color(153, 0, 255));
        tblLivros.setForeground(new java.awt.Color(255, 255, 255));
        tblLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Numero de paginas", "Quantidade", "Categoria", "Imagem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLivros.setGridColor(new java.awt.Color(255, 255, 255));
        tblLivros.setSelectionBackground(new java.awt.Color(255, 102, 255));
        tblLivros.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane3.setViewportView(tblLivros);
        if (tblLivros.getColumnModel().getColumnCount() > 0) {
            tblLivros.getColumnModel().getColumn(3).setResizable(false);
        }

        jButtonSelec.setBackground(new java.awt.Color(153, 0, 255));
        jButtonSelec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSelec.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSelec.setText("Selecionar");
        jButtonSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelec))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //nterface inter = new Interface();
        //inter.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecActionPerformed
        Livro li = new Livro();
        li.setTitulo(tblLivros.getModel().getValueAt(tblLivros.getSelectedRow(), 0).toString());
        li.setAutor(tblLivros.getModel().getValueAt(tblLivros.getSelectedRow(), 1).toString());
        li.setNumeroPaginas(tblLivros.getModel().getValueAt(tblLivros.getSelectedRow(), 2).toString());
        li.setQuantidade(tblLivros.getModel().getValueAt(tblLivros.getSelectedRow(), 3).toString());
        li.setCategoria(tblLivros.getModel().getValueAt(tblLivros.getSelectedRow(), 4).toString());
        li.setImagem(tblLivros.getModel().getValueAt(tblLivros.getSelectedRow(), 5).toString());
        Trocar tr = new Trocar();
        tr.setVisible(true);
        dispose();

       
    }//GEN-LAST:event_jButtonSelecActionPerformed

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
            java.util.logging.Logger.getLogger(MeusLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeusLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeusLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeusLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MeusLivros().setVisible(true);
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(MeusLivros.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSelec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblLivros;
    // End of variables declaration//GEN-END:variables
}
