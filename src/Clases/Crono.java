/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Vista.Game;

/**
 *
 * @author ProgInit
 */
public class Crono {
    Thread hilo;
    boolean cronometroActivo;
    
    public Crono(){
        
    }
    
    public void iniciarCronometro() {
        cronometroActivo = true;
        hilo = new Thread((Runnable) this);
        hilo.start();
        
    }
    
    public void run(){
        
        Integer minutos = 0 , segundos = 0, milesimas = 0;
        //min es minutos, seg es segundos y mil es milesimas de segundo
        String min="", seg="", mil="";
        Game g = new Game();
        try
        {
            //Mientras cronometroActivo sea verdadero entonces seguira
            //aumentando el tiempo
            while( cronometroActivo )
            {
                Thread.sleep( 4 );
                //Incrementamos 4 milesimas de segundo
                milesimas += 4;
                 
                //Cuando llega a 1000 osea 1 segundo aumenta 1 segundo
                //y las milesimas de segundo de nuevo a 0
                if( milesimas == 1000 )
                {
                    milesimas = 0;
                    segundos += 1;
                    //Si los segundos llegan a 60 entonces aumenta 1 los minutos
                    //y los segundos vuelven a 0
                    if( segundos == 60 )
                    {
                        segundos = 0;
                        minutos++;
                    }
                }
 
                //Esto solamente es estetica para que siempre este en formato
                //00:00:000
                if( minutos < 10 ) min = "0" + minutos;
                else min = minutos.toString();
                if( segundos < 10 ) seg = "0" + segundos;
                else seg = segundos.toString();
                 
                if( milesimas < 10 ) mil = "00" + milesimas;
                else if( milesimas < 100 ) mil = "0" + milesimas;
                else mil = milesimas.toString();
                 
                //Colocamos en la etiqueta la informacion
                g.lbl_cronoPartido.setText(min + ":" + seg + ":" + mil);
                //lbl_cronoPartido.setText( min + ":" + seg + ":" + mil );                
            }
        }catch(Exception e){}
        //Cuando se reincie se coloca nuevamente en 00:00:000
        g.lbl_cronoPartido.setText( "00:00:000" );
    }
    public static void main(String[] args) {
        //Esta parte es para look and feel por lo tanto es opcional, solo hay que descomentarla
        //try{
        //    UIManager.setLookAndFeel( new com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel() );
        //}catch( Exception e ){}
        new Crono();
    }
}
