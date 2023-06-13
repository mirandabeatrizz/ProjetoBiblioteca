/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import banco.ConexaoBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Livro;

/**
 *
 * @author luis.santos6
 */
public class CadastroLivro extends javax.swing.JFrame {

    ImageIcon imageIcon;
    String caminhoImagem;
    Livro li;
    String Titulo;

    /**
     * Creates new form Projeto
     */
    public CadastroLivro() {
        initComponents();
    }

    public CadastroLivro(Livro li) {
        initComponents();
        this.li = li;
        Titulo = this.li.getTitulo();
        jTextFieldTitulo.setText(this.li.getTitulo());
        jTextFieldAutor.setText(this.li.getAutor());
        jTextFieldNumeroDePaginas.setText(this.li.getNumeroPaginas());
        jTextFieldQuantidade.setText(this.li.getQuantidade());
        jTextFieldCategoria.setText(this.li.getCategoria());
        caminhoImagem = this.li.getImagem();
        imageIcon = new ImageIcon(caminhoImagem);
        Image image = imageIcon.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);;
        imageIcon = new ImageIcon(image);
        jLabelImagem.setIcon(imageIcon);
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
        jLabelCadastroDoLivro = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabelAutor = new javax.swing.JLabel();
        jTextFieldAutor = new javax.swing.JTextField();
        jLabelNumeroDePaginas = new javax.swing.JLabel();
        jTextFieldNumeroDePaginas = new javax.swing.JTextField();
        jLabelQuantidade = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonImagem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelImagem = new javax.swing.JLabel();
        jLabelCategorias = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelCadastroDoLivro.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabelCadastroDoLivro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroDoLivro.setText("Cadastro do Livro");

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Titulo");

        jTextFieldTitulo.setBackground(new java.awt.Color(204, 51, 255));
        jTextFieldTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextFieldTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelAutor.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAutor.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAutor.setText("Autor");

        jTextFieldAutor.setBackground(new java.awt.Color(204, 51, 255));
        jTextFieldAutor.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextFieldAutor.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldAutor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNumeroDePaginas.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNumeroDePaginas.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabelNumeroDePaginas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroDePaginas.setText("Numero de Paginas");

        jTextFieldNumeroDePaginas.setBackground(new java.awt.Color(204, 51, 255));
        jTextFieldNumeroDePaginas.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextFieldNumeroDePaginas.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroDePaginas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        jLabelQuantidade.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabelQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuantidade.setText("Quantidade");

        jTextFieldQuantidade.setBackground(new java.awt.Color(204, 51, 255));
        jTextFieldQuantidade.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextFieldQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonSalvar.setBackground(new java.awt.Color(204, 153, 255));
        jButtonSalvar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBorder(null);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonImagem.setBackground(new java.awt.Color(204, 153, 255));
        jButtonImagem.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonImagem.setForeground(new java.awt.Color(255, 255, 255));
        jButtonImagem.setText("Imagem");
        jButtonImagem.setBorder(null);
        jButtonImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImagemActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelCategorias.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCategorias.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabelCategorias.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategorias.setText("Categorias");

        jTextFieldCategoria.setBackground(new java.awt.Color(204, 51, 255));
        jTextFieldCategoria.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextFieldCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabelAutor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabelNumeroDePaginas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabelQuantidade))
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNumeroDePaginas, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(jTextFieldCategoria))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCadastroDoLivro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabelCategorias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButtonSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelCadastroDoLivro)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNumeroDePaginas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumeroDePaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabelCategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        ConexaoBanco BD = new ConexaoBanco();
        if (li == null) {
            li = new Livro(jTextFieldTitulo.getText(), jTextFieldAutor.getText(), jTextFieldNumeroDePaginas.getText(), jTextFieldQuantidade.getText(), jTextFieldCategoria.getText());
            BD.inserir("livro(nome_livro,autor, nmr_pg, quant_livro, imagem, Categoria)",
                    "("
                    + "\'" + li.getTitulo() + "\'" + ","
                    + "\'" + li.getAutor() + "\'" + ","
                    + "\'" + li.getNumeroPaginas() + "\'" + ","
                    + "\'" + li.getQuantidade() + "\'" + ","
                    + "\'" + caminhoImagem + "\'" + ","
                    + "\'" + li.getCategoria() + "\'"
                    + ")");

        } else {
            li = new Livro(jTextFieldTitulo.getText(), jTextFieldAutor.getText(),
                    jTextFieldNumeroDePaginas.getText(), jTextFieldQuantidade.getText(), jTextFieldCategoria.getText());
            BD.alterar("livro",
                    "nome_livro = " + "\'" + li.getTitulo() + "\'" + ","
                    + "autor = " + "\'" + li.getAutor() + "\'" + ","
                    + "nmr_pg = " + "\'" + li.getNumeroPaginas() + "\'" + ","
                    + "quant_livro = " + "\'" + li.getQuantidade() + "\'" + ","
                    + "Categoria = " + "\'" + li.getCategoria() + "\'" + ","
                    + "imagem = " + "\'" + caminhoImagem + "\'"
                    + "Where nome_livro = " + "\'" + Titulo + "\'");
            li = null;

        }

        try {
            MeusLivros rv = new MeusLivros();
            rv.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImagemActionPerformed

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().
                getHomeDirectory());
        File selectedFile = null;
        int returnValue = jfc.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = jfc.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
        }
        imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
        caminhoImagem = selectedFile.getAbsolutePath();
        Image image = imageIcon.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);;
        imageIcon = new ImageIcon(image);
        jLabelImagem.setIcon(imageIcon);
    }//GEN-LAST:event_jButtonImagemActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImagem;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelCadastroDoLivro;
    private javax.swing.JLabel jLabelCategorias;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelNumeroDePaginas;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldNumeroDePaginas;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
