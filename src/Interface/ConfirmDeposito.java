/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Logica.Idioma;
import java.awt.Color;
public class ConfirmDeposito extends javax.swing.JFrame {

    private Menu m;
    public ConfirmDeposito() {
        initComponents();
        this.setLocationRelativeTo(null);
        Idioma I = new Idioma();
        String direccion = "C:\\Archivos gestor\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Archivos gestor\\Idiomas\\Estado.txt");
        SubTitulo1.setText(I.leerFila(65,direccion));
        SubTitulo2.setText(I.leerFila(66,direccion));
        Recibo.setText(I.leerFila(67,direccion));
        SubTitulo3.setText(I.leerFila(68,direccion));
        SubTitulo4.setText(I.leerFila(69,direccion));
        Salir.setText(I.leerFila(13,direccion));
        Menu.setText(I.leerFila(15,direccion));  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubTitulo2 = new javax.swing.JLabel();
        SubTitulo1 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Panel02 = new javax.swing.JPanel();
        Menu = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        Recibo = new javax.swing.JLabel();
        SubTitulo4 = new javax.swing.JLabel();
        SubTitulo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 239, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTitulo2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTitulo2.setText("Correctamente");
        jPanel1.add(SubTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1200, 70));

        SubTitulo1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTitulo1.setText("Deposito realizado");
        jPanel1.add(SubTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 70));

        Panel3.setBackground(new java.awt.Color(115, 115, 115));

        Salir.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setText("Salir");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 240, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Diseño sin título (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, -240, 350, 540));

        Panel02.setBackground(new java.awt.Color(243, 214, 76));

        Menu.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu.setText("Menu");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel02Layout = new javax.swing.GroupLayout(Panel02);
        Panel02.setLayout(Panel02Layout);
        Panel02Layout.setHorizontalGroup(
            Panel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel02Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel02Layout.setVerticalGroup(
            Panel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel02Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel02, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 240, 70));

        Panel5.setBackground(new java.awt.Color(243, 214, 76));

        Recibo.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        Recibo.setForeground(new java.awt.Color(255, 255, 255));
        Recibo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Recibo.setText("Deseas un recibo?");
        Recibo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Recibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReciboMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReciboMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReciboMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Recibo, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 380, 70));

        SubTitulo4.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTitulo4.setText("nuestros servicios");
        jPanel1.add(SubTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1200, 70));

        SubTitulo3.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTitulo3.setText("Gracias por utilizar");
        jPanel1.add(SubTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 1200, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setMenu(Menu m){
        this.m = m;
    }
    
    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        Inicio a = new Inicio();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Panel3.setBackground(new Color(75,75,75));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Panel3.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_SalirMouseExited

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuMouseClicked

    private void MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseEntered
        Panel02.setBackground(new Color(210,180,23));
    }//GEN-LAST:event_MenuMouseEntered

    private void MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseExited
        Panel02.setBackground(new Color(243,214,76));
    }//GEN-LAST:event_MenuMouseExited

    private void ReciboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReciboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ReciboMouseClicked

    private void ReciboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReciboMouseEntered
        Panel5.setBackground(new Color(210,180,23));
    }//GEN-LAST:event_ReciboMouseEntered

    private void ReciboMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReciboMouseExited
        Panel5.setBackground(new Color(243,214,76));
    }//GEN-LAST:event_ReciboMouseExited

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
            java.util.logging.Logger.getLogger(ConfirmDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu;
    private javax.swing.JPanel Panel02;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel5;
    private javax.swing.JLabel Recibo;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel SubTitulo1;
    private javax.swing.JLabel SubTitulo2;
    private javax.swing.JLabel SubTitulo3;
    private javax.swing.JLabel SubTitulo4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
