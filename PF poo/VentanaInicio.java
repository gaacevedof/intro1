package UI.video;

public class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        Instrucciones = new javax.swing.JButton();
        Jugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 720));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(255, 153, 153));
        Salir.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 660, -1, -1));

        Instrucciones.setBackground(new java.awt.Color(255, 204, 102));
        Instrucciones.setFont(new java.awt.Font("Agent Orange", 3, 16)); // NOI18N
        Instrucciones.setText("Instrucciones");
        Instrucciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(Instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 200, 50));

        Jugar.setBackground(new java.awt.Color(153, 255, 153));
        Jugar.setFont(new java.awt.Font("Agent Orange", 3, 16)); // NOI18N
        Jugar.setText("Jugar");
        Jugar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });
        getContentPane().add(Jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/video/Sorry.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void InstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstruccionesActionPerformed
        Instrucciones inst= new Instrucciones();
        inst.setVisible(true);
        dispose();
    }//GEN-LAST:event_InstruccionesActionPerformed

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JugarActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Instrucciones;
    private javax.swing.JButton Jugar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
