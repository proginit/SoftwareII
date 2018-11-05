package Clases;

import Vista.Game;

/**
 *
 * @author ProgInit
 */
public class Cronometro_Partido extends Thread{
    private Game v;
    private int seg;
    private int min;
    private int hor;
    
    public Cronometro_Partido(Game v){
        this.v=v;
        seg = v.getSeg();
        min = v.getMin();
        hor = v.getHor();
    }
    
    public void run(){
        for(;;){
            if(seg!=59){
            seg=v.aumentSeg();
        }else{
                seg=0;
                //v.resetSeg();
                if(min!=59){
                    min=v.aumentMin();
                }else{
                hor=v.aumentHor();
                min=0;
                //v.resetMin();
                }
            }
        try{
            sleep(999);
        }catch (InterruptedException ex){
            System.err.println(ex.getMessage());
        }
        if(!v.isContinuar()){
            try {
                synchronized(this){
                    this.wait();
                }
            } catch (InterruptedException ex){
                System.err.println(ex.getMessage());
            }
        }
        }
    }
    public void seguir(){
        synchronized(this){
            notifyAll();
        }
    }
}
