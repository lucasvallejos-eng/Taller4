/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.awt.BorderLayout;



/**
 *
 * @author lucas
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    


    public Principal() {
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

        FondoPrincipal = new javax.swing.JPanel();
        BarraNavegacion = new javax.swing.JPanel();
        OTNormal = new javax.swing.JButton();
        OTGlobo = new javax.swing.JButton();
        RegistroNormal = new javax.swing.JButton();
        RegistroGlobo = new javax.swing.JButton();
        PanelUso = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        BarraNavegacion.setBackground(new java.awt.Color(153, 255, 255));

        OTNormal.setText("Ot Normal");
        OTNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTNormalActionPerformed(evt);
            }
        });

        OTGlobo.setText("Ot Globo");
        OTGlobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTGloboActionPerformed(evt);
            }
        });

        RegistroNormal.setText("Registro");
        RegistroNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroNormalActionPerformed(evt);
            }
        });

        RegistroGlobo.setText("Regsitro");

        javax.swing.GroupLayout BarraNavegacionLayout = new javax.swing.GroupLayout(BarraNavegacion);
        BarraNavegacion.setLayout(BarraNavegacionLayout);
        BarraNavegacionLayout.setHorizontalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraNavegacionLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OTGlobo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegistroNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OTNormal, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(RegistroGlobo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        BarraNavegacionLayout.setVerticalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraNavegacionLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(OTNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegistroNormal)
                .addGap(51, 51, 51)
                .addComponent(OTGlobo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegistroGlobo)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        PanelUso.setBackground(new java.awt.Color(0, 255, 102));

        javax.swing.GroupLayout PanelUsoLayout = new javax.swing.GroupLayout(PanelUso);
        PanelUso.setLayout(PanelUsoLayout);
        PanelUsoLayout.setHorizontalGroup(
            PanelUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        PanelUsoLayout.setVerticalGroup(
            PanelUsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FondoPrincipalLayout = new javax.swing.GroupLayout(FondoPrincipal);
        FondoPrincipal.setLayout(FondoPrincipalLayout);
        FondoPrincipalLayout.setHorizontalGroup(
            FondoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoPrincipalLayout.createSequentialGroup()
                .addComponent(BarraNavegacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FondoPrincipalLayout.setVerticalGroup(
            FondoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraNavegacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelUso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OTNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OTNormalActionPerformed
        OTNormal p1=new OTNormal();
        p1.setSize(900,500);
        p1.setLocation(0,0);
        
        PanelUso.removeAll();
        PanelUso.add(p1,BorderLayout.CENTER);
        PanelUso.revalidate();
        PanelUso.repaint();
    }//GEN-LAST:event_OTNormalActionPerformed

    private void RegistroNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistroNormalActionPerformed

    private void OTGloboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OTGloboActionPerformed
      OTGlobo p1=new OTGlobo();
        p1.setSize(900,500);
        p1.setLocation(0,0);
        
        PanelUso.removeAll();
        PanelUso.add(p1,BorderLayout.CENTER);
        PanelUso.revalidate();
        PanelUso.repaint();
    }//GEN-LAST:event_OTGloboActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraNavegacion;
    private javax.swing.JPanel FondoPrincipal;
    private javax.swing.JButton OTGlobo;
    private javax.swing.JButton OTNormal;
    private javax.swing.JPanel PanelUso;
    private javax.swing.JButton RegistroGlobo;
    private javax.swing.JButton RegistroNormal;
    // End of variables declaration//GEN-END:variables

    private void initPanelUso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
