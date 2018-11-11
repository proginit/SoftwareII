/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jlse
 */
public class Conexion {
    Connection con = null;
    
    public Connection getConexion(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/TenisMesa1");
            //JOptionPane.showMessageDialog(null,"Conexion en linea");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        }
        return con;
    }
    
    public ResultSet consulta(String consulta){
        ResultSet rs = null;
        try {
            PreparedStatement ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
        return rs;
    }
    
    public void Inseratar(String insertar){
        try {
            PreparedStatement ps = con.prepareStatement(insertar);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Guardados \n   Exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al Insertar: "+e.getMessage());
        }
    }
    
    public static void main(String[]args){
        Conexion c = new Conexion();
        c.getConexion();
    }
}
