/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import formularios.*;
/**
 *
 * @author ProgInit
 */
public class registro extends javax.swing.JPanel {

    /**
     * Creates new form registro
     */
    public registro() {
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

        btn_arbitroR = new javax.swing.JButton();
        btn_jugadorR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_arbitroR.setBackground(new java.awt.Color(0, 51, 51));
        btn_arbitroR.setForeground(new java.awt.Color(255, 255, 255));
        btn_arbitroR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arbitroicon.png"))); // NOI18N
        btn_arbitroR.setText("ARBITRO");
        btn_arbitroR.setBorder(null);
        btn_arbitroR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_arbitroR.setFocusable(false);
        btn_arbitroR.setIconTextGap(10);
        btn_arbitroR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_arbitroRActionPerformed(evt);
            }
        });
        add(btn_arbitroR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 130, 50));

        btn_jugadorR.setBackground(new java.awt.Color(0, 51, 51));
        btn_jugadorR.setForeground(new java.awt.Color(255, 255, 255));
        btn_jugadorR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/jugatenis.png"))); // NOI18N
        btn_jugadorR.setText("JUGADOR");
        btn_jugadorR.setBorder(null);
        btn_jugadorR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_jugadorR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jugadorRActionPerformed(evt);
            }
        });
        add(btn_jugadorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 130, 50));

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("REGISTROS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_arbitroRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_arbitroRActionPerformed
        // TODO add your handling code here:
        arbitro a = new arbitro();
        a.setVisible(true);
    }//GEN-LAST:event_btn_arbitroRActionPerformed

    private void btn_jugadorRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jugadorRActionPerformed
        // TODO add your handling code here:
        jugador j = new jugador();
        j.setVisible(true);
    }//GEN-LAST:event_btn_jugadorRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_arbitroR;
    private javax.swing.JButton btn_jugadorR;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
