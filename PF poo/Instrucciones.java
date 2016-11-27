package UI.video;

public class Instrucciones extends javax.swing.JFrame {

    public Instrucciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        regresoMenu = new javax.swing.JButton();
        Tarjetas = new javax.swing.JButton();
        Objetivo = new javax.swing.JLabel();
        obj = new javax.swing.JLabel();
        obj3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Desarrollo = new javax.swing.JButton();
        Movimientos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(255, 153, 153));
        Salir.setFont(new java.awt.Font("Agent Orange", 3, 16)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 650, -1, 40));

        regresoMenu.setBackground(new java.awt.Color(255, 153, 51));
        regresoMenu.setFont(new java.awt.Font("Agent Orange", 3, 16)); // NOI18N
        regresoMenu.setText("Regresar al menu principal");
        regresoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresoMenuActionPerformed(evt);
            }
        });
        getContentPane().add(regresoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, 420, 40));

        Tarjetas.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        Tarjetas.setText("Descripción de las cartas");
        Tarjetas.setMaximumSize(null);
        Tarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetasActionPerformed(evt);
            }
        });
        getContentPane().add(Tarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 260, 40));

        Objetivo.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        Objetivo.setForeground(new java.awt.Color(255, 255, 255));
        Objetivo.setText("Tu objetivo en el juego es llevar las cuatro fichas a casa (HOME).");
        getContentPane().add(Objetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        obj.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        obj.setForeground(new java.awt.Color(255, 255, 255));
        obj.setText(" lleno de fichas que intentarán comerte y enviarte de nuevo al inicio.");
        getContentPane().add(obj, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        obj3.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        obj3.setForeground(new java.awt.Color(255, 255, 255));
        obj3.setText("Para ello, deberás partir desde la salida (START) y atravesar un enorme tablero");
        getContentPane().add(obj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Sobre qué quieres saber? ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        Desarrollo.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        Desarrollo.setText("Desarrollo del juego");
        Desarrollo.setMaximumSize(null);
        Desarrollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesarrolloActionPerformed(evt);
            }
        });
        getContentPane().add(Desarrollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 260, 40));

        Movimientos.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        Movimientos.setText("Movimientos especiales");
        Movimientos.setMaximumSize(null);
        Movimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovimientosActionPerformed(evt);
            }
        });
        getContentPane().add(Movimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 260, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/video/Sorry_1a.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void regresoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresoMenuActionPerformed
        VentanaInicio inicio= new VentanaInicio();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresoMenuActionPerformed

    private void TarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetasActionPerformed
        Tarjetas t = new Tarjetas();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_TarjetasActionPerformed

    private void DesarrolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesarrolloActionPerformed
        DesarrolloJ d = new DesarrolloJ();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_DesarrolloActionPerformed

    private void MovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovimientosActionPerformed
        MovimientosS m = new MovimientosS();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_MovimientosActionPerformed

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
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instrucciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Desarrollo;
    private javax.swing.JButton Movimientos;
    private javax.swing.JLabel Objetivo;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Tarjetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel obj;
    private javax.swing.JLabel obj3;
    private javax.swing.JButton regresoMenu;
    // End of variables declaration//GEN-END:variables
}
