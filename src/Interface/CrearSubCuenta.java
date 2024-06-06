/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Logica.Idioma;
import Logica.Operaciones;
import Logica.Registros;
import Logica.Usuarios;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Random;



public class CrearSubCuenta extends javax.swing.JFrame {

    private String x;
    private String y;
    String ruta = "C:\\Archivos gestor\\Archivos gestor\\Cuentas\\";
    Idioma I = new Idioma();
    String direccion = "C:\\Archivos gestor\\Archivos gestor\\Idiomas\\" + I.leerFila(1,"C:\\Archivos gestor\\Archivos gestor\\Idiomas\\Estado.txt");
    public CrearSubCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        Aceptar.setText(I.leerFila(10,direccion));
        Salir.setText(I.leerFila(13,direccion));
        Atras.setText(I.leerFila(14,direccion));
        SubTitulo1.setText(I.leerFila(24,direccion));
        ci.setText(I.leerFila(25,direccion)+":");
        CC.setText(I.leerFila(26,direccion));
        CH.setText(I.leerFila(27,direccion));
        DL.setText(I.leerFila(28,direccion));
        BL.setText(I.leerFila(29,direccion));
        EU.setText(I.leerFila(30,direccion));
        YU.setText(I.leerFila(31,direccion));
        
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
        SubTitulo1 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        CC = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        DL = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        BL = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        Aceptar = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        CH = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        EU = new javax.swing.JLabel();
        Panel8 = new javax.swing.JPanel();
        Atras = new javax.swing.JLabel();
        Panel7 = new javax.swing.JPanel();
        YU = new javax.swing.JLabel();
        Panel04 = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        ci = new javax.swing.JLabel();
        CI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 239, 82));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 675));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubTitulo1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SubTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTitulo1.setText("Seleccione tipo de sub cuenta que desea crear");
        jPanel1.add(SubTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1200, -1));

        Panel1.setBackground(new java.awt.Color(0, 205, 57));

        CC.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        CC.setForeground(new java.awt.Color(255, 255, 255));
        CC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CC.setText("Cuenta Corriente");
        CC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CCMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CC, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CC, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 350, 70));

        Panel2.setBackground(new java.awt.Color(0, 205, 57));

        DL.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        DL.setForeground(new java.awt.Color(255, 255, 255));
        DL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DL.setText("Dolares");
        DL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DL, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DL, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 250, 70));

        Panel3.setBackground(new java.awt.Color(0, 205, 57));

        BL.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        BL.setForeground(new java.awt.Color(255, 255, 255));
        BL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BL.setText("Bolivianos");
        BL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BL, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 250, -1));

        Panel4.setBackground(new java.awt.Color(0, 205, 57));

        Aceptar.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aceptar.setText("Aceptar");
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AceptarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 240, 60));

        Panel5.setBackground(new java.awt.Color(0, 205, 57));

        CH.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        CH.setForeground(new java.awt.Color(255, 255, 255));
        CH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CH.setText("Cuenta Ahorro");
        CH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CHMouseDragged(evt);
            }
        });
        CH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CHMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CH, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CH, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 350, 70));

        Panel6.setBackground(new java.awt.Color(0, 205, 57));

        EU.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        EU.setForeground(new java.awt.Color(255, 255, 255));
        EU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EU.setText("Euros");
        EU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EUMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EU, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EU, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 250, -1));

        Panel8.setBackground(new java.awt.Color(0, 205, 57));

        Atras.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Atras.setForeground(new java.awt.Color(255, 255, 255));
        Atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Atras.setText("Atras");
        Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel8Layout = new javax.swing.GroupLayout(Panel8);
        Panel8.setLayout(Panel8Layout);
        Panel8Layout.setHorizontalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Atras, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        Panel8Layout.setVerticalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Atras, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(Panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 240, 60));

        Panel7.setBackground(new java.awt.Color(0, 205, 57));

        YU.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        YU.setForeground(new java.awt.Color(255, 255, 255));
        YU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YU.setText("Yuanes");
        YU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        YU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                YUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                YUMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel7Layout = new javax.swing.GroupLayout(Panel7);
        Panel7.setLayout(Panel7Layout);
        Panel7Layout.setHorizontalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(YU, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel7Layout.setVerticalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(YU, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, 250, -1));

        Panel04.setBackground(new java.awt.Color(115, 115, 115));

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

        javax.swing.GroupLayout Panel04Layout = new javax.swing.GroupLayout(Panel04);
        Panel04.setLayout(Panel04Layout);
        Panel04Layout.setHorizontalGroup(
            Panel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel04Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel04Layout.setVerticalGroup(
            Panel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel04Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Panel04, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 240, 60));

        Mensaje.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1200, 60));

        ci.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        ci.setForeground(new java.awt.Color(255, 255, 255));
        ci.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ci.setText("Ingrese Ci:");
        jPanel1.add(ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 280, 60));

        CI.setBackground(new java.awt.Color(255, 255, 255));
        CI.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        CI.setForeground(new java.awt.Color(0, 0, 0));
        CI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CIMouseClicked(evt);
            }
        });
        jPanel1.add(CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 350, 60));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CCMouseEntered

    }//GEN-LAST:event_CCMouseEntered

    private void CHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHMouseEntered

    }//GEN-LAST:event_CHMouseEntered

    private void CCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CCMouseExited

    }//GEN-LAST:event_CCMouseExited

    private void CHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHMouseExited

    }//GEN-LAST:event_CHMouseExited

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        Inicio a = new Inicio();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Panel04.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Panel04.setBackground(new Color(115,115,115));
    }//GEN-LAST:event_SalirMouseExited

    private void CCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CCMouseClicked
        Panel1.setBackground(new Color(0,139,43));
        Panel5.setBackground(new Color(0,205,57));
        this.x = "Cuenta Corriente";
        Mensaje.setText("");
    }//GEN-LAST:event_CCMouseClicked

    private void CHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHMouseClicked
         Panel5.setBackground(new Color(0,139,43));
        Panel1.setBackground(new Color(0,205,57));
        this.x = "Cuenta Ahorro";
        Mensaje.setText("");
    }//GEN-LAST:event_CHMouseClicked

    private void CHMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHMouseDragged
        
    }//GEN-LAST:event_CHMouseDragged

    private void YUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YUMouseExited

    }//GEN-LAST:event_YUMouseExited

    private void YUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YUMouseEntered

    }//GEN-LAST:event_YUMouseEntered

    private void YUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YUMouseClicked
        Panel7.setBackground(new Color(0,139,43));
        Panel6.setBackground(new Color(0,205,57));
        Panel3.setBackground(new Color(0,205,57));
        Panel2.setBackground(new Color(0,205,57));
        this.y = "Cuenta4";
        Mensaje.setText("");
    }//GEN-LAST:event_YUMouseClicked

    private void AtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseExited
        Panel8.setBackground(new Color(0,205,57));
    }//GEN-LAST:event_AtrasMouseExited

    private void AtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseEntered
        Panel8.setBackground(new Color(0,139,43));
    }//GEN-LAST:event_AtrasMouseEntered

    private void AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasMouseClicked
        CrearCuenta a = new CrearCuenta();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_AtrasMouseClicked

    private void EUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EUMouseExited
        
    }//GEN-LAST:event_EUMouseExited

    private void EUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EUMouseEntered

    }//GEN-LAST:event_EUMouseEntered

    private void EUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EUMouseClicked
        Panel6.setBackground(new Color(0,139,43));
        Panel7.setBackground(new Color(0,205,57));
        Panel3.setBackground(new Color(0,205,57));
        Panel2.setBackground(new Color(0,205,57));
        this.y = "Cuenta3";
        Mensaje.setText("");
    }//GEN-LAST:event_EUMouseClicked

    private void AceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseExited
        Panel4.setBackground(new Color(0,205,57));
    }//GEN-LAST:event_AceptarMouseExited

    private void AceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseEntered
        Panel4.setBackground(new Color(0,139,43));
    }//GEN-LAST:event_AceptarMouseEntered

    private void AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseClicked
        Usuarios a = new Usuarios();
        String f = a.DevolverId(CI.getText());
        String c1 = I.leerFila(33,direccion);
        String c = I.leerFila(34,direccion);
        boolean existe = false;
        if(a.Control("C:\\Archivos gestor\\Archivos gestor\\Usuarios.txt",CI.getText(),2)){
          Mensaje.setText(I.leerFila(32,direccion));
        }else{ 
          File directorio = new File("C:\\Archivos gestor\\Archivos gestor\\Cuentas\\" + f + "\\" + this.x);
          if (!directorio.exists()) {
              directorio.mkdirs();
          }else{
          String direccion = "C:\\Archivos gestor\\Archivos gestor\\Cuentas\\" + f + "\\" + this.x +"\\" + this.y +".txt";
          File archivo = new File(direccion);
          try {
             if (archivo.createNewFile()){ 
             String Texto1 = "";
             Random random = new Random();
             String numPorcen = ":"+Double.toString(Math.round((0.01 + (0.99 - 0.01) * random.nextDouble()) * 100.0) / 100.0);
             String numCuenta = ":"+Integer.toString(10000000 + random.nextInt(90000000));
             Operaciones s = new Operaciones();
             while(s.buscarArchivoPorNumeroCuenta(numCuenta) != null){
                numCuenta = ":"+Integer.toString(10000000 + random.nextInt(90000000));
             }
             if(this.x == "Cuenta Corriente"){
                 if(this.y == "Cuenta1") Texto1 = "0.00:USD" + numCuenta;
                 if(this.y == "Cuenta2") Texto1 = "0.00:BS" + numCuenta;
                 if(this.y == "Cuenta3") Texto1 = "0.00:EUR" + numCuenta;
                 if(this.y == "Cuenta4") Texto1 = "0.00:CNY" + numCuenta;
             }else{
                 if(this.y == "Cuenta1") Texto1 = "0.00:USD" + numCuenta + numPorcen;
                 if(this.y == "Cuenta2") Texto1 = "0.00:BS" + numCuenta + numPorcen;
                 if(this.y == "Cuenta3") Texto1 = "0.00:EUR" + numCuenta + numPorcen;
                 if(this.y == "Cuenta4") Texto1 = "0.00:CNY" + numCuenta + numPorcen;
             }
             a.guardarEnArchivo(Texto1,direccion);
             Mensaje.setText(c1+ " " + numCuenta);
             }else Mensaje.setText(c);
          }catch(IOException e){existe =  false;} 
          } 
        }
        
    }//GEN-LAST:event_AceptarMouseClicked

    private void BLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BLMouseExited
        
    }//GEN-LAST:event_BLMouseExited

    private void BLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BLMouseEntered

    }//GEN-LAST:event_BLMouseEntered

    private void BLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BLMouseClicked
        Panel3.setBackground(new Color(0,139,43));
        Panel7.setBackground(new Color(0,205,57));
        Panel6.setBackground(new Color(0,205,57));
        Panel2.setBackground(new Color(0,205,57));
        this.y = "Cuenta2";
        Mensaje.setText("");
    }//GEN-LAST:event_BLMouseClicked

    private void DLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DLMouseExited
        
    }//GEN-LAST:event_DLMouseExited

    private void DLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DLMouseEntered

    }//GEN-LAST:event_DLMouseEntered

    private void DLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DLMouseClicked
        Panel2.setBackground(new Color(0,139,43));
        Panel7.setBackground(new Color(0,205,57));
        Panel6.setBackground(new Color(0,205,57));
        Panel3.setBackground(new Color(0,205,57));
        this.y = "Cuenta1";
        Mensaje.setText("");
    }//GEN-LAST:event_DLMouseClicked

    private void CIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CIMouseClicked
        Mensaje.setText("");
    }//GEN-LAST:event_CIMouseClicked

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
            java.util.logging.Logger.getLogger(CrearSubCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearSubCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearSubCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearSubCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearSubCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aceptar;
    private javax.swing.JLabel Atras;
    private javax.swing.JLabel BL;
    private javax.swing.JLabel CC;
    private javax.swing.JLabel CH;
    private javax.swing.JTextField CI;
    private javax.swing.JLabel DL;
    private javax.swing.JLabel EU;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JPanel Panel04;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel SubTitulo1;
    private javax.swing.JLabel YU;
    private javax.swing.JLabel ci;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
