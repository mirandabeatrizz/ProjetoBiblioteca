/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import banco.ConexaoBanco;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

/**
 *
 * @author marin
 */
public class MeuPerfil extends javax.swing.JFrame {
    List<Usuario> listaUsuarios = new ArrayList<Usuario>();
    Usuario user;
    
    public MeuPerfil() throws SQLException  {
        initComponents();
       exibirInfo();
       //this.user = user;
    }  
    
    public MeuPerfil (Usuario user) throws SQLException {
        this.user = user;
        initComponents();
        exibirInfo();
        
    }
    
    public void exibirInfo() {
        /*ConexaoBanco BD = new ConexaoBanco();
        listaUsuarios = new ArrayList<Usuario>();
        ResultSet rs = BD.buscarDados("usuario");
        while (rs.next()) {
            Usuario user = new Usuario();
            user.setCPF(rs.getString("cpf"));
            user.setNome(rs.getString("nome_usuario"));
            user.setEmail(rs.getString("email"));
            user.setSenha(rs.getString("senha"));
            user.setTelefone(rs.getString("telefone"));
            user.setDataDeNascimento(rs.getString("data_nasc"));
            listaUsuarios.add(user);
        }*/
        //for (int i = 0; i < listaUsuarios.size(); i++) {
            labelNomeUser.setText(user.getNome());
            labelEmailUser.setText(user.getEmail());
        //}
        
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
        labelNomeUser = new javax.swing.JLabel();
        labelEmailUser = new javax.swing.JLabel();
        panelBiblioteca = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnMDados = new javax.swing.JButton();
        jButtonMLivros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        labelNomeUser.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        labelNomeUser.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeUser.setText("Nome do Usuário");
        labelNomeUser.setMaximumSize(new java.awt.Dimension(834, 698));

        labelEmailUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelEmailUser.setForeground(new java.awt.Color(255, 255, 255));
        labelEmailUser.setText("emailusuario@gmail.com");
        labelEmailUser.setMaximumSize(new java.awt.Dimension(834, 698));

        panelBiblioteca.setBackground(new java.awt.Color(153, 0, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Biblioteca Comunitária");
        jLabel7.setMaximumSize(new java.awt.Dimension(834, 698));

        btnVoltar.setBackground(new java.awt.Color(153, 51, 255));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("<");
        btnVoltar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBibliotecaLayout = new javax.swing.GroupLayout(panelBiblioteca);
        panelBiblioteca.setLayout(panelBibliotecaLayout);
        panelBibliotecaLayout.setHorizontalGroup(
            panelBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBibliotecaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addGap(45, 45, 45)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBibliotecaLayout.setVerticalGroup(
            panelBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBibliotecaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnMDados.setBackground(new java.awt.Color(153, 0, 255));
        btnMDados.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnMDados.setForeground(new java.awt.Color(255, 255, 255));
        btnMDados.setText("Meus Dados");
        btnMDados.setBorder(null);
        btnMDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMDadosActionPerformed(evt);
            }
        });

        jButtonMLivros.setBackground(new java.awt.Color(153, 0, 255));
        jButtonMLivros.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonMLivros.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMLivros.setText("Meus Livros");
        jButtonMLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMLivrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMDados, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jButtonMLivros))
                    .addComponent(labelNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(labelNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMDados, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            Interface principal = new Interface();
        principal.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MeuPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jButtonMLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMLivrosActionPerformed
        
        try {
            MeusLivros meusL = new MeusLivros(user);
             meusL.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MeuPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        dispose();
    }//GEN-LAST:event_jButtonMLivrosActionPerformed

    private void btnMDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMDadosActionPerformed
        
        CadastroUser cadUser = new CadastroUser(user);
        cadUser.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMDadosActionPerformed

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
            java.util.logging.Logger.getLogger(MeuPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeuPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeuPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeuPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MeuPerfil().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MeuPerfil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMDados;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButtonMLivros;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEmailUser;
    private javax.swing.JLabel labelNomeUser;
    private javax.swing.JPanel panelBiblioteca;
    // End of variables declaration//GEN-END:variables
}
