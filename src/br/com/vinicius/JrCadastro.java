/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius;

import Singleton.SCliente;
import br.com.vinicius.objeto.Pessoa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius.132217
 */
public class JrCadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public JrCadastro() {
        initComponents();
        jLblMostrarId.setText(String.valueOf(SCliente.getInstance().getCliente().size()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFNome2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLblCpf = new javax.swing.JLabel();
        jTFCpf = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jLblIdade = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jTFIdade = new javax.swing.JTextField();
        jLblRG = new javax.swing.JLabel();
        jLblTelefone = new javax.swing.JLabel();
        jTFRg = new javax.swing.JTextField();
        jTFTelefone = new javax.swing.JTextField();
        jLblTitulo = new javax.swing.JLabel();
        jBtnSalvar = new javax.swing.JButton();
        jLblId = new javax.swing.JLabel();
        jLblMostrarId = new javax.swing.JLabel();
        jBtnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLblCpf.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLblCpf.setForeground(new java.awt.Color(255, 255, 255));
        jLblCpf.setText("CPF :");

        jLblIdade.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLblIdade.setForeground(new java.awt.Color(255, 255, 255));
        jLblIdade.setText("Data de Nascimento :");

        jLblNome.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLblNome.setForeground(new java.awt.Color(255, 255, 255));
        jLblNome.setText("Nome :");

        jLblRG.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLblRG.setForeground(new java.awt.Color(255, 255, 255));
        jLblRG.setText("RG :");

        jLblTelefone.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLblTelefone.setText("Numero de Telefone :");

        jLblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLblTitulo.setFont(new java.awt.Font("BankGothic Md BT", 0, 36)); // NOI18N
        jLblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLblTitulo.setText("Cadastrar");

        jBtnSalvar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jBtnSalvar.setText("Salva");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jLblId.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLblId.setForeground(new java.awt.Color(255, 255, 255));
        jLblId.setText("ID :");

        jLblMostrarId.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLblMostrarId.setForeground(new java.awt.Color(255, 255, 255));

        jBtnMenu.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jBtnMenu.setText("Menu");
        jBtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnSalvar)
                            .addComponent(jLblMostrarId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblNome)
                                    .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblTelefone)
                                    .addComponent(jLblIdade)
                                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBtnMenu)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLblRG)
                                                .addComponent(jTFRg, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(99, 99, 99)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLblCpf)
                                                .addComponent(jTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLblTitulo)))
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMostrarId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblId))
                .addGap(14, 14, 14)
                .addComponent(jLblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblRG)
                    .addComponent(jLblCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLblTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLblIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSalvar)
                    .addComponent(jBtnMenu))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        jLblMostrarId.setText(String.valueOf(SCliente.getInstance().getCliente().size()));

        Date dataNascimenti = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int id = Integer.parseInt(jLblMostrarId.getText());
        String nome = jTFNome.getText();
        String rg = jTFRg.getText();
        String cpf = jTFCpf.getText();
        try {
            dataNascimenti = sdf.parse(jTFIdade.getText());
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(this, pe);
        }
        SCliente.getInstance().getCliente().add(new Pessoa(nome, rg, cpf, dataNascimenti));
        SCliente.getInstance().getCliente().get(SCliente.getInstance().getCliente().size() - 1).setId(id);
        JOptionPane.showMessageDialog(this, SCliente.getInstance().getCliente().get(SCliente.getInstance().getCliente().size() - 1));

    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void jBtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMenuActionPerformed
        JrMenu me = new JrMenu();
        me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(JrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JrCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnMenu;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jLblCpf;
    private javax.swing.JLabel jLblId;
    private javax.swing.JLabel jLblIdade;
    private javax.swing.JLabel jLblMostrarId;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblRG;
    private javax.swing.JLabel jLblTelefone;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCpf;
    private javax.swing.JTextField jTFIdade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNome2;
    private javax.swing.JTextField jTFRg;
    private javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables
}
