/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author sapat
 */
public class Login_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Login_GUI
     */
    public Login_GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        password_txt = new javax.swing.JPasswordField();
        username_txt = new javax.swing.JTextField();
        goBack_btn = new javax.swing.JButton();
        send_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        aumigoBG_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        password_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password_txt.setText("password");
        jPanel1.add(password_txt);
        password_txt.setBounds(80, 210, 330, 40);

        username_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username_txt.setText("username");
        jPanel1.add(username_txt);
        username_txt.setBounds(80, 140, 330, 40);

        goBack_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        goBack_btn.setText("VOLTAR");
        goBack_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBack_btnActionPerformed(evt);
            }
        });
        jPanel1.add(goBack_btn);
        goBack_btn.setBounds(380, 400, 100, 31);

        send_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        send_btn.setText("ENVIAR");
        send_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_btnActionPerformed(evt);
            }
        });
        jPanel1.add(send_btn);
        send_btn.setBounds(280, 270, 130, 50);

        exit_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit_btn.setText("SAIR");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });
        jPanel1.add(exit_btn);
        exit_btn.setBounds(380, 440, 100, 30);

        aumigoBG_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AUMIGO_BG.png"))); // NOI18N
        jPanel1.add(aumigoBG_lbl);
        aumigoBG_lbl.setBounds(0, 0, 500, 500);

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

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void send_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_btnActionPerformed
        try {
        
            if (main.Main.menuFuncs.login(username_txt.getText(), password_txt.getText())) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                Model.MenuFuncs_DAO.changeScreen(this, new MainMenu_GUI());
            } else {
                JOptionPane.showMessageDialog(null, "Impossivel fazer login, verifique as informacoes!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\nCódigo do erro: " + e);
        }
    }//GEN-LAST:event_send_btnActionPerformed

    private void goBack_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBack_btnActionPerformed
        Model.MenuFuncs_DAO.changeScreen(this, new SetUp_GUI());
    }//GEN-LAST:event_goBack_btnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        Model.MenuFuncs_DAO.exit();
    }//GEN-LAST:event_exit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aumigoBG_lbl;
    public static javax.swing.JButton exit_btn;
    public static javax.swing.JButton goBack_btn;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField password_txt;
    public static javax.swing.JButton send_btn;
    public static javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
