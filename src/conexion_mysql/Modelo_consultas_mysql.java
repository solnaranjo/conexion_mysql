/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_mysql;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */

public class Modelo_consultas_mysql {
    
    //atributos de clase
    
    //metodos
    
    //metodo 1 
    public void consultaUsuarios() {
        
        // conexion_mysql a la base de datos
        Conexion conex = new Conexion();
        Connection conn = conex.conexion_mysql();
        
        //        
        if (conn != null) {
                     
            //crea la declaracion
            try (Statement st = conn.createStatement()) {
                
                // texto consulta sql
                String query = "SELECT * FROM usuarios;";
                
                // ejecuta la consulta y obtiene el resultado
                ResultSet rs = st.executeQuery(query);
                
                // recorre la respuesta
                while (rs.next()) {
                    
                    //pasando los datos de mysql a java
                    int id = rs.getInt("idDocumento");
                    String nombre = rs.getString("nombreUsuario");
                    
                    // imprime el resultado por pantalla
                    System.out.format("%s | %s\n", id, nombre);
                    
                }//fin while
                
            } catch (SQLException ex) {
                
                //en caso de error, imprime el tipo de error
                System.err.println(ex.getMessage());
            
            }//fin trycatch
            
        }// fin if (conn != null)       
        
    }// fin metodo consultaUsuario()
    
    
    //metodo 2
    public String[] consultarPersona(String idDocumento) {
        
        
        
        // se crea un array para guardar la respuesta
        String[] resUsuario = new String[6];
        
        // conexion_mysql a la base de datos
        Conexion conex = new Conexion();
        Connection conn = conex.conexion_mysql();
        
        //        
        if (conn != null) {
                     
            //crea la declaracion
            try (Statement st = conn.createStatement()) {
                
                // texto consulta sql
                String query = "SELECT * FROM usuarios WHERE idDocumento = '" + idDocumento + "'";
                
                System.out.println(query);
                
               // ejecuta la consulta y obtiene el resultado
                ResultSet rs = st.executeQuery(query);
                             
                        // recorre la respuesta
                        while (rs.next()) {

                            resUsuario[0] = rs.getString("idDocumento");
                            resUsuario[1] = rs.getString("nombreUsuario");
                            resUsuario[2] = rs.getString("apellidoUsuario");
                            resUsuario[3] = rs.getString("usuario");
                            resUsuario[4] = rs.getString("contrasena");
                            resUsuario[5] = rs.getString("fecha");


                        }//fin while
                
            } catch (SQLException ex) {
                
                //en caso de error, imprime el tipo de error
                System.err.println(ex.getMessage());
            
            }//fin trycatch
            
        }// fin if (conn != null)       
        
       return resUsuario;
        
    }// fin metodo consultarPersona()
    
    
    
    // metodo 2
    
    public String insertarPersona(String idDocumento, String nombreUsuario, String apellidoUsuario, String usuario, String contrasena, String fecha){
    
        String respuesta = "Registro insertado con exito"; 
        
     // conexion_mysql a la base de datos
        Conexion conex = new Conexion();
        Connection conn = conex.conexion_mysql();
        
        //
        int a = 0;
        
        //        
        if (conn != null) {
                     
            //crea la declaracion
            try (Statement st = conn.createStatement()) {
                
                // texto consulta sql
                String query = "INSERT INTO `usuarios`(`idDocumento`, `nombreUsuario`, `apellidoUsuario`, `usuario`, `contrasena`, `fecha`) VALUES (" + idDocumento + ", '" + nombreUsuario + "', '" + apellidoUsuario + "','" + usuario + "','" + contrasena + "', '" + fecha + "');";
                
                // ejecuta la consulta y obtiene el resultado
                
                a = st.executeUpdate(query);
                
         
                  
            } catch (SQLException ex) {
                
                //en caso de error, imprime el tipo de error
                System.err.println(ex.getMessage());
                
                respuesta = ex.getMessage();
                
                // se valida si el registro ya existe en la base de datos--
                    String palabra = "Duplicate";
                    String texto = respuesta;
                    boolean resultado = texto.contains(palabra);

                    if (resultado == true) {

                        respuesta = "Este usuario ya existe en la base de datos";

                    }
                
                // fin valida si el registro ya existe en la base de datos
                //-------------------------------------------------------------
                
                
                return respuesta;
            
            }//fin trycatch
            
        }// fin if (conn != null)      

        if (a != 1){
        
            respuesta = "El registro no se pudo guardar. Intentelo de nuevo";
        
        }
        
        return respuesta;
        
    }
    
    // metodo 3
    public String modificarPersona(String idDocumento, String nombreUsuario, String apellidoUsuario, String usuario, String contrasena, String fecha){
    
        String respuesta = "Registro modificado con exito.";
        
        // conexion_mysql a la base de datos
        Conexion conex = new Conexion();
        Connection conn = conex.conexion_mysql();
        
        try (Statement st = conn.createStatement()){
        
            int a = 0;
            
            // consulta sql
            String query = "UPDATE usuarios SET nombreUsuario ='" + nombreUsuario + "', apellidoUsuario = '" + apellidoUsuario + "', usuario = '" + usuario + "', contrasena = '" + contrasena + "', fecha = '" + fecha + "' WHERE idDocumento ="+ idDocumento +"";
           
            System.out.println(query);

            // ejecuta la consulta
            a = st.executeUpdate(query);
            
        } catch (SQLException e){
        
            respuesta = e.getMessage();
            
            return respuesta; 
            
        }
        
        return respuesta;
    
    }
    
   // metodo 4
   public String eliminarPersona(String idDocumento){
   
       String respuesta = "Registro eliminado con exito";
       
       // conexion_mysql a la base de datos
       Conexion conex = new Conexion();
       Connection conn = conex.conexion_mysql();
       
       try (Statement st = conn.createStatement()){
       
           int a = 0;
           
           // consulta
           String query = "DELETE FROM usuarios WHERE idDocumento = "+ idDocumento +"";
           
           // ejecuta la consulta (query)
           a = st.executeUpdate(query);
           
           
           
           
       } catch (SQLException e){
       
           respuesta = e.getMessage();
           
           return respuesta;
           
       }
       
       return respuesta;
       
   }
   
   // metodo 4
       public boolean loginUsuario(String idDocumento, String contrasena) {
        
        // conexion_mysql a la base de datos
        Conexion conex = new Conexion();
        Connection conn = conex.conexion_mysql();
        
        boolean login = false;
        
        //        
        if (conn != null) {
                     
            //crea la declaracion
            try (Statement st = conn.createStatement()) {
                
                // texto consulta sql
                String query = "SELECT idDocumento, contrasena FROM usuarios WHERE idDocumento = '" + idDocumento + "' AND contrasena = '" + contrasena +"';";
                
                System.out.println(":D");
                
                // ejecuta la consulta y obtiene el resultado
                ResultSet rs = st.executeQuery(query);
                MenuPrograma menu = new MenuPrograma();  
                if(rs.next()){
                
                    menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    menu.setVisible(true);
                    login = true;
                    JOptionPane.showMessageDialog(menu, "Login exitoso");
                    return login;
                    
                } else {
                
                    JOptionPane.showMessageDialog(menu, "Error al entrar. Por favor intentelo otra vez!");
                    
                    login = false;
                    
                    return login;
                    
                }
                
                
                
               
            } catch (SQLException ex) {
                
                System.out.println(ex.getMessage());
                
            } 
            
        }// fin if (conn != null)       
        
        
        return login;
        
    }// fin metodo consultaUsuario()
    
    
}//fin clase Modelo_consultas_mysql
