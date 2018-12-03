/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import AppPackage.AnimationClass;
import Clases.AWTUtilities;
import conexion.Conexion;
import java.sql.*;

import javax.swing.JOptionPane;
/**
 *
 * @author ProgInit
 */
public class Login extends javax.swing.JFrame {
   
    Connection cn = Conexion.conexiondb();

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        AWTUtilities.setOpaque(this, false);
        this.setLocationRelativeTo(null);
        Conexion.conexiondb();
        
        //this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_principal = new javax.swing.JPanel();
        jp_ingresar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iconUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_entrar = new javax.swing.JButton();
        txt_user = new app.bolivia.swing.JCTextField();
        txt_contra = new jpass.JRPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_face = new javax.swing.JLabel();
        txt_whatsat = new javax.swing.JLabel();
        txt_twiterr = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_principal.setBackground(new java.awt.Color(0, 51, 51));
        jp_principal.setForeground(new java.awt.Color(0, 51, 51));
        jp_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_ingresar.setBackground(new java.awt.Color(0, 51, 51));
        jp_ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jp_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jp_ingresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jp_ingresar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        jp_ingresar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        iconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/avatar (1).png"))); // NOI18N
        jp_ingresar.add(iconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 130, 130));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jp_ingresar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 220, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jp_ingresar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 220, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/avatar.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jp_ingresar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/candado.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jp_ingresar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 30));

        btn_entrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_entrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/enter1.jpg"))); // NOI18N
        btn_entrar.setBorder(null);
        btn_entrar.setBorderPainted(false);
        btn_entrar.setContentAreaFilled(false);
        btn_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_entrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/enter.jpg"))); // NOI18N
        btn_entrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/enter.jpg"))); // NOI18N
        btn_entrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/enter.jpg"))); // NOI18N
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        jp_ingresar.add(btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 80, 40));

        txt_user.setBackground(new java.awt.Color(0, 51, 51));
        txt_user.setBorder(null);
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setToolTipText("");
        txt_user.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txt_user.setPhColor(new java.awt.Color(255, 255, 255));
        txt_user.setPlaceholder("Ingrese Usuario");
        jp_ingresar.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, 30));

        txt_contra.setBackground(new java.awt.Color(0, 51, 51));
        txt_contra.setBorder(null);
        txt_contra.setToolTipText("");
        txt_contra.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txt_contra.setPhColor(new java.awt.Color(255, 255, 255));
        txt_contra.setPlaceholder("Password");
        jp_ingresar.add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 190, 30));

        jp_principal.add(jp_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 311, 490));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Tenis De Mesa");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 26, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tenis-de-mesa (2).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 272, -1));

        txt_face.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/facebook.png"))); // NOI18N
        jPanel1.add(txt_face, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        txt_whatsat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/whatsapp.png"))); // NOI18N
        jPanel1.add(txt_whatsat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        txt_twiterr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/gorjeo.png"))); // NOI18N
        jPanel1.add(txt_twiterr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        btn_salir.setBackground(new java.awt.Color(0, 51, 51));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar_1.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 20, 20));

        jp_principal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 380, 490));

        getContentPane().add(jp_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String login = "SELECT * FROM login WHERE usuarios=? AND password=?";
        
        if(txt_user.getText().isEmpty()||txt_contra.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Llenar todo los campos POR FAVOR");
        }else{
            try{
            ps = cn.prepareStatement(login);
            ps.setString(1,txt_user.getText());
            ps.setString(2,txt_contra.getText());
            rs = ps.executeQuery();
            
            if(rs.next()){
                dispose();
                MenuPrincipal mp = new MenuPrincipal();
                mp.setVisible(true);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
       }     
    }//GEN-LAST:event_btn_entrarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jp_ingresar;
    private javax.swing.JPanel jp_principal;
    private jpass.JRPasswordField txt_contra;
    private javax.swing.JLabel txt_face;
    private javax.swing.JLabel txt_twiterr;
    private app.bolivia.swing.JCTextField txt_user;
    private javax.swing.JLabel txt_whatsat;
    // End of variables declaration//GEN-END:variables
}
