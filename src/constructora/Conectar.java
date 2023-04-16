/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rene Everardo Contreras Arias
 * matricula ES202112291
 * Version 1.0
 */
public class Conectar {
    
    Connection cn;
    
    //metodo para conectar a la base de datos
    
    public Connection conexion(){
        
           try {
                Class.forName("com.mysql.jdbc.Driver");
                
                cn=DriverManager.getConnection("jdbc:mysql://localhost/constructora","root","");
                
                System.out.println("Conectado a la base de datos");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            
            return cn;
        
        
    }
    
}
