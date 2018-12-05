/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



/**
 *
 * @author Asus
 */
public class Conexion {
   
    //atributos
    

    //metodos
    public Connection conexion_mysql() {
        
        Connection conn = null;
                  
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/planetadegatos", "root", "solnye");
                  
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
        System.out.println("fin programa.");
        
        
        return conn;
        
    }
    
    
}
    

