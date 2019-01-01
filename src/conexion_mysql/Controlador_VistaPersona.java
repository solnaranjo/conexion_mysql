/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_mysql;

import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class Controlador_VistaPersona {
    
    
    
    // atributos de la clase
    private String idDocumento;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String usuario;
    private String contrasena;
    private String fecha;
    
    //Metodos
    
    // metodo constructor
    Controlador_VistaPersona(String idDocumento, String nombreUsuario, String apellidoUsuario, String usuario, String contrasena, String fecha){
    
        this.idDocumento = idDocumento;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena; 
        this.fecha = fecha;
        
      
    }
    
    // metodo constructor 2
    Controlador_VistaPersona(String idDocumento){
        
        this.idDocumento = idDocumento;
        
    }
    
    //
    public String insertarPersona(){
    
        String respuesta = "";
        
        Modelo_consultas_mysql sql_insertarPersona = new Modelo_consultas_mysql();
           
        respuesta = sql_insertarPersona.insertarPersona(getIdDocumento(), getNombreUsuario(), getApellidoUsuario(), getUsuario(), getContrasena(), getFecha());
        
        return respuesta;
        
    }
    
    //
    
    public String[] consultarPersona(){
    
        //String[] resUsuario = new String[6];    
        
        Modelo_consultas_mysql sql_consultarPersona = new Modelo_consultas_mysql();
           
        String[] resUsuario = sql_consultarPersona.consultarPersona(getIdDocumento());
        
        return resUsuario;
            
    }
   
    public String modificarPersona(){
   
        
        String respuesta = "";
        
        Modelo_consultas_mysql sql_modificarPersona = new Modelo_consultas_mysql();
        
        respuesta = sql_modificarPersona.modificarPersona(getIdDocumento(), getNombreUsuario(), getApellidoUsuario(), getUsuario(), getContrasena(), getFecha());
        
        return respuesta;
    
    }
    
    public String eliminarPersona(){
   
        
        String respuesta = "";
        
        Modelo_consultas_mysql sql_eliminarPersona = new Modelo_consultas_mysql();
        
        respuesta = sql_eliminarPersona.eliminarPersona(getIdDocumento());
        
        return respuesta;
    
    }
    

    /**
     * @return the idDocumento
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * @param idDocumento the idDocumento to set
     */
    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the apellidoUsuario
     */
    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    /**
     * @param apellidoUsuario the apellidoUsuario to set
     */
    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
