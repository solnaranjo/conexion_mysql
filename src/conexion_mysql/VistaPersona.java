/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_mysql;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class VistaPersona extends javax.swing.JFrame {

    
    
    
    public final void initUI(){
    
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        this.addWindowListener(new WindowAdapter(){
        
                
            @Override
            public void windowClosing(WindowEvent we){
            
                dispose();
                
        }
        
        });
    
    }
    
    /**
     * Creates new form persona
     */
    public VistaPersona() {
        initComponents();
        initUI();
        jTextField_idDocumento.setText("");
        jTextField_nombreUsuario.setText("");
        jTextField_apellidoUsuario.setText("");
        jTextField_usuario.setText("");
        jTextField_contrasena.setText("");
        jTextField_fecha.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_idDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_apellidoUsuario = new javax.swing.JTextField();
        jTextField_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_nombreUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_contrasena = new javax.swing.JTextField();
        jButton_guardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_fecha = new javax.swing.JTextField();
        jButton_consultar = new javax.swing.JButton();
        jButton_modificar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jButton_nuevo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jTextField_idDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idDocumentoActionPerformed(evt);
            }
        });

        jLabel3.setText("Documento");

        jLabel4.setText("Usuario");

        jTextField_nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombreUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Contraseña");

        jTextField_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_contrasenaActionPerformed(evt);
            }
        });

        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha");

        jTextField_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fechaActionPerformed(evt);
            }
        });

        jButton_consultar.setText("Consultar");
        jButton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultarActionPerformed(evt);
            }
        });

        jButton_modificar.setText("Modificar");
        jButton_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificarActionPerformed(evt);
            }
        });

        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });

        jButton_nuevo.setText("Nuevo");
        jButton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jTextField_apellidoUsuario)
                            .addComponent(jTextField_contrasena)
                            .addComponent(jTextField_nombreUsuario)
                            .addComponent(jTextField_idDocumento))
                        .addGap(212, 212, 212))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_consultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_modificar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_idDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_apellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_guardar)
                    .addComponent(jButton_consultar)
                    .addComponent(jButton_modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_eliminar)
                    .addComponent(jButton_nuevo)
                    .addComponent(jButton1))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreUsuarioActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        // TODO add your handling code here:
        
        String respuesta;
          Controlador_VistaPersona controladorVistaPersona = new Controlador_VistaPersona(jTextField_idDocumento.getText(), jTextField_nombreUsuario.getText(), jTextField_apellidoUsuario.getText(), jTextField_usuario.getText(), jTextField_contrasena.getText(), jTextField_fecha.getText());
          respuesta = controladorVistaPersona.insertarPersona();
          JOptionPane.showMessageDialog(null, respuesta);
          
    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void jTextField_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_contrasenaActionPerformed

    private void jTextField_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fechaActionPerformed

    private void jButton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultarActionPerformed
        // TODO add your handling code here:
        
        
        
        Controlador_VistaPersona controladorVistaPersona = new Controlador_VistaPersona(jTextField_idDocumento.getText());
        String[] resUsuario = controladorVistaPersona.consultarPersona();
        
              jTextField_nombreUsuario.setText(resUsuario[1]);
              jTextField_apellidoUsuario.setText(resUsuario[2]);  
              jTextField_usuario.setText(resUsuario[3]); 
              jTextField_contrasena.setText(resUsuario[4]);
              jTextField_fecha.setText(resUsuario[5]);
        
    }//GEN-LAST:event_jButton_consultarActionPerformed

    private void jButton_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificarActionPerformed
        // TODO add your handling code here:
        
        String respuesta;
        Controlador_VistaPersona controladorVistaPersona = new Controlador_VistaPersona(jTextField_idDocumento.getText(), jTextField_nombreUsuario.getText(), jTextField_apellidoUsuario.getText(), jTextField_usuario.getText(), jTextField_contrasena.getText(), jTextField_fecha.getText());
        respuesta = controladorVistaPersona.modificarPersona();
        
        JOptionPane.showMessageDialog(null, respuesta);
    }//GEN-LAST:event_jButton_modificarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        // TODO add your handling code here:
        String respuesta;
        Controlador_VistaPersona controladorVistaPersona = new Controlador_VistaPersona(jTextField_idDocumento.getText(), jTextField_nombreUsuario.getText(), jTextField_apellidoUsuario.getText(), jTextField_usuario.getText(), jTextField_contrasena.getText(), jTextField_fecha.getText());
        
        //variable para confirmar la eliminacion del registro
        int confirmaEliminar = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar este registro?");
        
        // se valida si el confirm NO es falso
        if (confirmaEliminar != 1) {
            
            respuesta = controladorVistaPersona.eliminarPersona();
            JOptionPane.showMessageDialog(null, respuesta);
        
        } // fin if
                
        
        
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jButton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoActionPerformed
        // TODO add your handling code here:
        jTextField_idDocumento.setText("");
        jTextField_nombreUsuario.setText("");
        jTextField_apellidoUsuario.setText("");
        jTextField_usuario.setText("");
        jTextField_contrasena.setText("");
        jTextField_fecha.setText("");
        
    }//GEN-LAST:event_jButton_nuevoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        new Buscar().setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_idDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idDocumentoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new VistaPersona().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_consultar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JButton jButton_modificar;
    private javax.swing.JButton jButton_nuevo;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JTextField jTextField_apellidoUsuario;
    public static javax.swing.JTextField jTextField_contrasena;
    public static javax.swing.JTextField jTextField_fecha;
    public static javax.swing.JTextField jTextField_idDocumento;
    public static javax.swing.JTextField jTextField_nombreUsuario;
    public static javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
