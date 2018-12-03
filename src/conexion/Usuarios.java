/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author ProgInit
 */
public class Usuarios {
    private int ID;
    private String NOMBRE;
    private String USUARIO;
    private int PASSWORD;
    
    public Usuarios(String USUARIO, int PASSWORD){
        this.USUARIO = USUARIO;
        this.PASSWORD = PASSWORD;
    }
    
    public int getId(){
        return ID;
    }
    
    public void setId(int ID){
        this.ID = ID;
    }
    
    public String getNombre(){
        return NOMBRE;
    }
    
    public void setNombre(String NOMBRE){
        this.NOMBRE = NOMBRE;
    }
    
    public String getUsuario(){
        return USUARIO;
    }
    
    public void setUsuario(String USUARIO){
        this.USUARIO = USUARIO;
    }
    
    public int getPassword(){
        return PASSWORD;
    }
    
    public void setPassword(int PASSWORD){
        this.PASSWORD = PASSWORD;
    }
}
