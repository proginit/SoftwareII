package Vista;
import Clases.Punto;
import java.awt.Color;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author ProgInit
 */
public class Game extends javax.swing.JFrame implements Runnable{
    Thread hilo;
    String hora, minutos, segundos;
    
    private int seg = 0;
    private int min = 0;
    private int hor = 0;
    private boolean continuar = true;
//    private Cronometro_Partido i;
    public int n=0;
    public int count = 0;
    public int ne,p2;
    

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        this.setLocationRelativeTo(null);
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
        
        this.setTitle("Cronometro");
     
        btn_play.setEnabled(true);
        
        if(n==0){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
        }
        
    }
    
    //Thread hilo;
    boolean cronometroActivo;
    
    /*public void run(){
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
                g.lbl_horaAct1.setText(min + ":" + seg + ":" + mil);
                //lbl_cronoPartido.setText( min + ":" + seg + ":" + mil );                
            }
        }catch(Exception e){}
        //Cuando se reincie se coloca nuevamente en 00:00:000
        g.lbl_horaAct1.setText( "00:00:000" );
    }*/
    
    public void iniciarCronometro() {
        cronometroActivo = true;
        hilo = new Thread( (Runnable) this);
        hilo.start();
    }
    
    public void hora(){
        Calendar calendario = new GregorianCalendar();
        Date hora_actual = new Date();
        calendario.setTime(hora_actual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    public void run(){
        Thread current = Thread.currentThread();
        while(current == hilo){
            hora();
            lbl_horaAct1.setText(hora+":"+minutos+":"+segundos);
        }
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpvista1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_horaAct1 = new javax.swing.JLabel();
        btn_play = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_cronoPartido = new javax.swing.JLabel();
        jpvista2 = new javax.swing.JPanel();
        lbl_jugador1 = new javax.swing.JLabel();
        lbl_jugador2 = new javax.swing.JLabel();
        jpvistaIzq = new javax.swing.JPanel();
        btn_MenIzq = new javax.swing.JButton();
        lbl_pelota1 = new javax.swing.JLabel();
        btn_MasIzq = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_NumIzq = new javax.swing.JLabel();
        jp_tarjetaIzq = new javax.swing.JPanel();
        jpvistaDerech = new javax.swing.JPanel();
        btn_MenDer = new javax.swing.JButton();
        btn_MasDer1 = new javax.swing.JButton();
        lbl_pelota2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_NumDer = new javax.swing.JLabel();
        jp_tarjetaDer = new javax.swing.JPanel();
        jpvista3 = new javax.swing.JPanel();
        lbl_puntuacion1 = new javax.swing.JLabel();
        jpvista4 = new javax.swing.JPanel();
        lbl_puntuacion2 = new javax.swing.JLabel();
        jpvista5 = new javax.swing.JPanel();
        btn_minJ1 = new javax.swing.JButton();
        btn_minJ2 = new javax.swing.JButton();
        jpvista7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpvista1.setBackground(new java.awt.Color(0, 51, 51));
        jpvista1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HORA");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CRONOMETRO");

        lbl_horaAct1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_horaAct1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_horaAct1.setText("00:00:00");

        btn_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/boton-de-reproduccion.png"))); // NOI18N
        btn_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(0, 51, 51));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        lbl_cronoPartido.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_cronoPartido.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cronoPartido.setText("00:00:000");

        javax.swing.GroupLayout jpvista1Layout = new javax.swing.GroupLayout(jpvista1);
        jpvista1.setLayout(jpvista1Layout);
        jpvista1Layout.setHorizontalGroup(
            jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista1Layout.createSequentialGroup()
                .addGroup(jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addGap(199, 199, 199))
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lbl_cronoPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addGap(68, 68, 68)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_play, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_horaAct1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jpvista1Layout.setVerticalGroup(
            jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista1Layout.createSequentialGroup()
                .addGroup(jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6)
                .addGroup(jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addComponent(lbl_horaAct1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addComponent(lbl_cronoPartido, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addComponent(btn_play, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.add(jpvista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 100));

        jpvista2.setBackground(new java.awt.Color(255, 255, 255));
        jpvista2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));

        lbl_jugador1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbl_jugador1.setForeground(new java.awt.Color(0, 51, 51));
        lbl_jugador1.setText("Jugador 1");

        lbl_jugador2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbl_jugador2.setForeground(new java.awt.Color(0, 51, 51));
        lbl_jugador2.setText("Jugador 2");

        javax.swing.GroupLayout jpvista2Layout = new javax.swing.GroupLayout(jpvista2);
        jpvista2.setLayout(jpvista2Layout);
        jpvista2Layout.setHorizontalGroup(
            jpvista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lbl_jugador1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addGap(483, 483, 483)
                .addComponent(lbl_jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpvista2Layout.setVerticalGroup(
            jpvista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpvista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_jugador1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lbl_jugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jpvista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1030, 50));

        jpvistaIzq.setBackground(new java.awt.Color(255, 255, 255));
        jpvistaIzq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));
        jpvistaIzq.setForeground(new java.awt.Color(0, 51, 51));
        jpvistaIzq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_MenIzq.setBackground(new java.awt.Color(0, 51, 51));
        btn_MenIzq.setForeground(new java.awt.Color(255, 255, 255));
        btn_MenIzq.setText("-");
        btn_MenIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenIzqActionPerformed(evt);
            }
        });
        jpvistaIzq.add(btn_MenIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 40, -1));

        lbl_pelota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tenisp.png"))); // NOI18N
        jpvistaIzq.add(lbl_pelota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, 40));

        btn_MasIzq.setBackground(new java.awt.Color(0, 51, 51));
        btn_MasIzq.setForeground(new java.awt.Color(255, 255, 255));
        btn_MasIzq.setText("+");
        btn_MasIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MasIzqActionPerformed(evt);
            }
        });
        jpvistaIzq.add(btn_MasIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 40, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lbl_NumIzq.setFont(new java.awt.Font("Arial", 0, 80)); // NOI18N
        lbl_NumIzq.setForeground(new java.awt.Color(0, 51, 51));
        lbl_NumIzq.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl_NumIzq)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_NumIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpvistaIzq.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jp_tarjetaIzq.setBackground(new java.awt.Color(255, 255, 255));
        jp_tarjetaIzq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jp_tarjetaIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_tarjetaIzqMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_tarjetaIzqLayout = new javax.swing.GroupLayout(jp_tarjetaIzq);
        jp_tarjetaIzq.setLayout(jp_tarjetaIzqLayout);
        jp_tarjetaIzqLayout.setHorizontalGroup(
            jp_tarjetaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jp_tarjetaIzqLayout.setVerticalGroup(
            jp_tarjetaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jpvistaIzq.add(jp_tarjetaIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 40));

        jPanel1.add(jpvistaIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 350, 430));

        jpvistaDerech.setBackground(new java.awt.Color(255, 255, 255));
        jpvistaDerech.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));
        jpvistaDerech.setForeground(new java.awt.Color(0, 51, 51));
        jpvistaDerech.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_MenDer.setBackground(new java.awt.Color(0, 51, 51));
        btn_MenDer.setForeground(new java.awt.Color(255, 255, 255));
        btn_MenDer.setText("-");
        btn_MenDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenDerActionPerformed(evt);
            }
        });
        jpvistaDerech.add(btn_MenDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        btn_MasDer1.setBackground(new java.awt.Color(0, 51, 51));
        btn_MasDer1.setForeground(new java.awt.Color(255, 255, 255));
        btn_MasDer1.setText("+");
        btn_MasDer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MasDer1ActionPerformed(evt);
            }
        });
        jpvistaDerech.add(btn_MasDer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        lbl_pelota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tenisp.png"))); // NOI18N
        jpvistaDerech.add(lbl_pelota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        lbl_NumDer.setFont(new java.awt.Font("Arial", 0, 80)); // NOI18N
        lbl_NumDer.setForeground(new java.awt.Color(0, 51, 51));
        lbl_NumDer.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl_NumDer)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_NumDer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpvistaDerech.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jp_tarjetaDer.setBackground(new java.awt.Color(255, 255, 255));
        jp_tarjetaDer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jp_tarjetaDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_tarjetaDerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_tarjetaDerLayout = new javax.swing.GroupLayout(jp_tarjetaDer);
        jp_tarjetaDer.setLayout(jp_tarjetaDerLayout);
        jp_tarjetaDerLayout.setHorizontalGroup(
            jp_tarjetaDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jp_tarjetaDerLayout.setVerticalGroup(
            jp_tarjetaDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jpvistaDerech.add(jp_tarjetaDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 40));

        jPanel1.add(jpvistaDerech, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 350, 430));

        jpvista3.setBackground(new java.awt.Color(0, 51, 51));
        jpvista3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lbl_puntuacion1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_puntuacion1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_puntuacion1.setText("0");

        javax.swing.GroupLayout jpvista3Layout = new javax.swing.GroupLayout(jpvista3);
        jpvista3.setLayout(jpvista3Layout);
        jpvista3Layout.setHorizontalGroup(
            jpvista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lbl_puntuacion1)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jpvista3Layout.setVerticalGroup(
            jpvista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpvista3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(lbl_puntuacion1)
                .addGap(52, 52, 52))
        );

        jPanel1.add(jpvista3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 160, 160));

        jpvista4.setBackground(new java.awt.Color(0, 51, 51));
        jpvista4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lbl_puntuacion2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_puntuacion2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_puntuacion2.setText("0");

        javax.swing.GroupLayout jpvista4Layout = new javax.swing.GroupLayout(jpvista4);
        jpvista4.setLayout(jpvista4Layout);
        jpvista4Layout.setHorizontalGroup(
            jpvista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpvista4Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(lbl_puntuacion2)
                .addGap(58, 58, 58))
        );
        jpvista4Layout.setVerticalGroup(
            jpvista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lbl_puntuacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.add(jpvista4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 150, 160));

        jpvista5.setBackground(new java.awt.Color(255, 255, 255));
        jpvista5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        btn_minJ1.setBackground(new java.awt.Color(0, 51, 51));
        btn_minJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cronometro.png"))); // NOI18N
        btn_minJ1.setText("T");
        btn_minJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minJ1ActionPerformed(evt);
            }
        });

        btn_minJ2.setBackground(new java.awt.Color(0, 51, 51));
        btn_minJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cronometro.png"))); // NOI18N
        btn_minJ2.setText("T");
        btn_minJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minJ2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpvista5Layout = new javax.swing.GroupLayout(jpvista5);
        jpvista5.setLayout(jpvista5Layout);
        jpvista5Layout.setHorizontalGroup(
            jpvista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_minJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(btn_minJ2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jpvista5Layout.setVerticalGroup(
            jpvista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jpvista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_minJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_minJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jpvista5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 330, 60));

        jpvista7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpvista7Layout = new javax.swing.GroupLayout(jpvista7);
        jpvista7.setLayout(jpvista7Layout);
        jpvista7Layout.setHorizontalGroup(
            jpvista7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jpvista7Layout.setVerticalGroup(
            jpvista7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jpvista7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 330, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MasDer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MasDer1ActionPerformed
        count++;
        String numero = String.valueOf(count);
        //prueba.setText(numero);
        
        if(count==2){
            lbl_pelota1.setVisible(false);
            lbl_pelota2.setVisible(true);
        }
        if(count==4){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
        }
         if(count==6){
            lbl_pelota1.setVisible(false);
            lbl_pelota2.setVisible(true);
        }
          if(count==8){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
        }
         if(count==10){
            lbl_pelota1.setVisible(false);
            lbl_pelota2.setVisible(true);
        } 
         if(count==12){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
        }
         if(count==14){
            lbl_pelota1.setVisible(false);
            lbl_pelota2.setVisible(true);
        }  
         if(count==16){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
        }
         if(count==18){
            lbl_pelota1.setVisible(false);
            lbl_pelota2.setVisible(true);
        }  
         if(count==20){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
         }
          
        String r = "0";
        Punto p = new Punto();
        String a = lbl_NumDer.getText();
        int b = p.Mas(Integer.parseInt(a));
        
        if(b<=11){
            lbl_NumDer.setText(Integer.toString(b));
            if(b==11){
                p2++;
                JOptionPane.showMessageDialog(null, "PUNTO!!");
                lbl_puntuacion2.setText(Integer.toString(p2));
                jp_tarjetaDer.setBackground(Color.WHITE);
                jp_tarjetaIzq.setBackground(Color.WHITE);
                lbl_NumIzq.setText(r);
                lbl_NumDer.setText(r);
            }
            
        }
    }//GEN-LAST:event_btn_MasDer1ActionPerformed

    private void btn_MenDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenDerActionPerformed
        // TODO add your handling code here:
        Punto p = new Punto();
        String a = lbl_NumDer.getText();
        int b = p.Menos(Integer.parseInt(a));
        
        if(b>=0){
            lbl_NumDer.setText(Integer.toString(b));
        }
    }//GEN-LAST:event_btn_MenDerActionPerformed

    private void btn_MasIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MasIzqActionPerformed
        // TODO add your handling code here:
        count++;
        String numero = String.valueOf(count);
        //prueba.setText(numero);
        if(count==2){
            lbl_pelota1.setVisible(false);
            lbl_pelota2.setVisible(true);
        }
        if(count==4){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
        }
        if(count==6){
            lbl_pelota1.setVisible(false);
            lbl_pelota2.setVisible(true);
        }
          if(count==8){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
        }
         if(count==10){
            lbl_pelota1.setVisible(false);
            lbl_pelota2.setVisible(true);
        }
         if(count==12){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
        }
         if(count==14){
            lbl_pelota1.setVisible(false);
            lbl_pelota2.setVisible(true);
        }  
         if(count==16){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
        }
         if(count==18){
            lbl_pelota1.setVisible(false);
            lbl_pelota2.setVisible(true);
        }  
         if(count==20){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
         }
        
        String r = "0";
        Punto p = new Punto();
        String a = lbl_NumIzq.getText();
        int b = p.Mas(Integer.parseInt(a));
        
        if(b<=11){
            lbl_NumIzq.setText(Integer.toString(b));
            if(b==11){
                ne++;
                JOptionPane.showMessageDialog(null, "PUNTO!!");
                lbl_puntuacion1.setText(Integer.toString(ne));
                jp_tarjetaDer.setBackground(Color.WHITE);
                jp_tarjetaIzq.setBackground(Color.WHITE);
                lbl_NumIzq.setText(r);
                lbl_NumDer.setText(r);
            }
        }
    }//GEN-LAST:event_btn_MasIzqActionPerformed

    private void btn_MenIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenIzqActionPerformed
        // TODO add your handling code here:
        Punto p = new Punto();
        String a = lbl_NumIzq.getText();
        int b = p.Menos(Integer.parseInt(a));
        
        if(b>=0){
            lbl_NumIzq.setText(Integer.toString(b));
        }
    }//GEN-LAST:event_btn_MenIzqActionPerformed

    private void btn_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playActionPerformed
        // TODO add your handling code here:
        
        Config c = new Config();
        c.setVisible(true);
        btn_play.setEnabled(false);
        this.dispose();
        String j1 = lbl_jugador1.getText();
        String j2 = lbl_jugador2.getText();
        c.lbl_jug1.setText(j1);
        c.lbl_jug2.setText(j2);
    }//GEN-LAST:event_btn_playActionPerformed
    //Inicializa el cronometro
    
    
    private void btn_minJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minJ1ActionPerformed
        // TODO add your handling code here:
        int ax = JOptionPane.showConfirmDialog(null, "Esta Seguro de solicitar minuto");
        if(ax == JOptionPane.YES_OPTION){
            // Instancia al formulario cronometro..
            Cronometro cr = new Cronometro();
            cr.setVisible(true);
            btn_minJ1.setEnabled(false);
        }
    }//GEN-LAST:event_btn_minJ1ActionPerformed

    private void btn_minJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minJ2ActionPerformed
        // TODO add your handling code here:
        int ax = JOptionPane.showConfirmDialog(null, "Esta Seguro de solicitar minuto");
        if(ax == JOptionPane.YES_OPTION){
            // Instancia al formulario cronometro..
            Cronometro cr = new Cronometro();
            cr.setVisible(true);
            btn_minJ2.setEnabled(false);
        }
    }//GEN-LAST:event_btn_minJ2ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void jp_tarjetaIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_tarjetaIzqMouseClicked
        // TODO add your handling code here:
        String r = "0";
        
        if(cont<=2){
            
            jp_tarjetaIzq.setBackground(Color.YELLOW);
            if(cont==2){
                jp_tarjetaIzq.setBackground(Color.red);
                JOptionPane.showMessageDialog(this, "EXPULSADO");
                jp_tarjetaDer.setBackground(Color.WHITE);
                jp_tarjetaIzq.setBackground(Color.WHITE);
                lbl_NumIzq.setText(r);
                lbl_NumDer.setText(r);
            }
        }  cont++;
    }//GEN-LAST:event_jp_tarjetaIzqMouseClicked

    private void jp_tarjetaDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_tarjetaDerMouseClicked
        // TODO add your handling code here:
        String r = "0";
        
        if(coun<=2){
            
            jp_tarjetaDer.setBackground(Color.YELLOW);
            if(coun==2){
                jp_tarjetaDer.setBackground(Color.red);
                JOptionPane.showMessageDialog(this, "EXPULSADO");
                jp_tarjetaDer.setBackground(Color.WHITE);
                jp_tarjetaIzq.setBackground(Color.WHITE);
                lbl_NumIzq.setText(r);
                lbl_NumDer.setText(r);
            }
        }  coun++;
    }//GEN-LAST:event_jp_tarjetaDerMouseClicked

    private int coun=1;    
    private int cont=1;
    
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_MasDer1;
    private javax.swing.JButton btn_MasIzq;
    private javax.swing.JButton btn_MenDer;
    private javax.swing.JButton btn_MenIzq;
    public javax.swing.JButton btn_minJ1;
    private javax.swing.JButton btn_minJ2;
    public javax.swing.JButton btn_play;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jp_tarjetaDer;
    public javax.swing.JPanel jp_tarjetaIzq;
    private javax.swing.JPanel jpvista1;
    private javax.swing.JPanel jpvista2;
    private javax.swing.JPanel jpvista3;
    private javax.swing.JPanel jpvista4;
    private javax.swing.JPanel jpvista5;
    private javax.swing.JPanel jpvista7;
    private javax.swing.JPanel jpvistaDerech;
    public javax.swing.JPanel jpvistaIzq;
    private javax.swing.JLabel lbl_NumDer;
    private javax.swing.JLabel lbl_NumIzq;
    private javax.swing.JLabel lbl_cronoPartido;
    public javax.swing.JLabel lbl_horaAct1;
    public javax.swing.JLabel lbl_jugador1;
    public javax.swing.JLabel lbl_jugador2;
    private javax.swing.JLabel lbl_pelota1;
    private javax.swing.JLabel lbl_pelota2;
    private javax.swing.JLabel lbl_puntuacion1;
    private javax.swing.JLabel lbl_puntuacion2;
    // End of variables declaration//GEN-END:variables
}

