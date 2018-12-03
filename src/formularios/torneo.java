/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import com.sun.glass.events.KeyEvent;
import conexion.Conexion;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Jlse
 */
public class torneo extends javax.swing.JFrame {

    /**
     * Creates new form torneo
     */
    public torneo() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtModalidad = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        btnSelecJuga = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setForeground(new java.awt.Color(0, 51, 51));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setForeground(new java.awt.Color(0, 51, 51));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 76, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Datos del Torneo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 126, -1));

        jLabel2.setText("Detalle: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setText("Modalidad: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setText("Lugar:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 157, -1));
        jPanel1.add(txtModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 157, -1));

        txtPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaisKeyTyped(evt);
            }
        });
        jPanel1.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 157, -1));

        btnSelecJuga.setText("Seleccionar Jugadores");
        btnSelecJuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecJugaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelecJuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 160, -1));

        btn_salir.setBackground(new java.awt.Color(0, 51, 51));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();
        String Modalidad = txtModalidad.getText();
        String pais = txtPais.getText();
        System.out.print(nombre+" "+Modalidad+" "+pais);
        Conexion cn = new Conexion();
        cn.getConexion();
        if("".equals(nombre) || nombre == null){
            JOptionPane.showMessageDialog(null, "Error:\nEscriba el Nombre");
        }else if("".equals(Modalidad) || Modalidad == null){
            JOptionPane.showMessageDialog(null, "Error:\nEscriba la Modalidad");
        }else if("".equals(pais) || pais == null){
            JOptionPane.showMessageDialog(null, "Error:\nEscriba el pais");
        }else{
            cn.Inseratar("insert into TORNEO (DETALLE,MODALIDAD,LUGAR) values('"+nombre+"','"+Modalidad+"','"+pais+"')");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtNombre.setText("");
        txtModalidad.setText("");
        txtPais.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisKeyTyped
       char c = evt.getKeyChar();
        if(!Character.isLetter(c) && !(c == KeyEvent.VK_SPACE) && !(c == KeyEvent.VK_BACKSPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPaisKeyTyped

    private void btnSelecJugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecJugaActionPerformed
        seleccionarJugador se = new seleccionarJugador();
        se.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSelecJugaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new torneo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSelecJuga;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtModalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
