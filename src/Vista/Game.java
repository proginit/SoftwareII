package Vista;
import Clases.Cronometro_Partido;
import Clases.Punto;
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
    private Cronometro_Partido i;
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
        lbl_horaC.setText(String.valueOf(hor));
        lbl_minC.setText(String.valueOf(min));
        lbl_segC.setText(String.valueOf(seg));
        btn_play.setEnabled(true);
        
        if(n==0){
            lbl_pelota1.setVisible(true);
            lbl_pelota2.setVisible(false);
        }
        
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
            lbl_horaAct.setText(hora+":"+minutos+":"+segundos);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpvista1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_minC = new javax.swing.JLabel();
        lbl_horaAct = new javax.swing.JLabel();
        btn_play = new javax.swing.JButton();
        lbl_hora = new javax.swing.JLabel();
        lbl_horaC = new javax.swing.JLabel();
        lbl_hora1 = new javax.swing.JLabel();
        lbl_segC = new javax.swing.JLabel();
        btn_tarjeta = new javax.swing.JButton();
        prueba = new javax.swing.JLabel();
        jpvista2 = new javax.swing.JPanel();
        lbl_jugador1 = new javax.swing.JLabel();
        lbl_jugador2 = new javax.swing.JLabel();
        jpvistaIzq = new javax.swing.JPanel();
        btn_MenIzq = new javax.swing.JButton();
        lbl_NumIzq = new javax.swing.JLabel();
        lbl_pelota1 = new javax.swing.JLabel();
        btn_MasIzq = new javax.swing.JButton();
        btn_tarjetaIzq = new javax.swing.JButton();
        jpvistaDerech = new javax.swing.JPanel();
        btn_MenDer = new javax.swing.JButton();
        btn_MasDer1 = new javax.swing.JButton();
        lbl_NumDer = new javax.swing.JLabel();
        lbl_pelota2 = new javax.swing.JLabel();
        btn_tarjetaDer = new javax.swing.JButton();
        jpvista3 = new javax.swing.JPanel();
        lbl_puntuacion1 = new javax.swing.JLabel();
        jpvista4 = new javax.swing.JPanel();
        lbl_puntuacion2 = new javax.swing.JLabel();
        jpvista5 = new javax.swing.JPanel();
        btn_minJ1 = new javax.swing.JButton();
        btn_minJ2 = new javax.swing.JButton();
        jpvista7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpvista1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("HORA");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("CRONOMETRO");

        lbl_minC.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_minC.setText("00");

        lbl_horaAct.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_horaAct.setText("00:00:00");

        btn_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/boton-de-reproduccion.png"))); // NOI18N
        btn_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playActionPerformed(evt);
            }
        });

        lbl_hora.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_hora.setText(":");

        lbl_horaC.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_horaC.setText("00");

        lbl_hora1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_hora1.setText(":");

        lbl_segC.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_segC.setText("00");

        btn_tarjeta.setText("F");
        btn_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tarjetaActionPerformed(evt);
            }
        });

        prueba.setText("jLabel3");

        javax.swing.GroupLayout jpvista1Layout = new javax.swing.GroupLayout(jpvista1);
        jpvista1.setLayout(jpvista1Layout);
        jpvista1Layout.setHorizontalGroup(
            jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista1Layout.createSequentialGroup()
                .addGroup(jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2))
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lbl_horaC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_hora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_minC)))
                .addGap(6, 6, 6)
                .addComponent(lbl_hora1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_segC)
                .addGap(12, 12, 12)
                .addGroup(jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpvista1Layout.createSequentialGroup()
                        .addComponent(btn_play)
                        .addGap(72, 72, 72)
                        .addComponent(prueba))
                    .addComponent(btn_tarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addGroup(jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpvista1Layout.createSequentialGroup()
                        .addComponent(lbl_horaAct)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpvista1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(102, 102, 102))))
        );
        jpvista1Layout.setVerticalGroup(
            jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(prueba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpvista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_minC)
                    .addComponent(lbl_horaAct)
                    .addComponent(lbl_hora)
                    .addComponent(lbl_horaC)
                    .addComponent(lbl_hora1)
                    .addComponent(lbl_segC))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jpvista1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_play)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_tarjeta)
                .addContainerGap())
        );

        getContentPane().add(jpvista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        jpvista2.setBackground(new java.awt.Color(153, 204, 255));

        lbl_jugador1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbl_jugador1.setText("Jugador 1");

        lbl_jugador2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbl_jugador2.setText("Jugador 2");

        javax.swing.GroupLayout jpvista2Layout = new javax.swing.GroupLayout(jpvista2);
        jpvista2.setLayout(jpvista2Layout);
        jpvista2Layout.setHorizontalGroup(
            jpvista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lbl_jugador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 487, Short.MAX_VALUE)
                .addComponent(lbl_jugador2)
                .addGap(120, 120, 120))
        );
        jpvista2Layout.setVerticalGroup(
            jpvista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpvista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_jugador1)
                    .addComponent(lbl_jugador2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jpvista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 860, 50));

        jpvistaIzq.setBackground(new java.awt.Color(204, 204, 204));

        btn_MenIzq.setText("-");
        btn_MenIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenIzqActionPerformed(evt);
            }
        });

        lbl_NumIzq.setFont(new java.awt.Font("Arial", 1, 150)); // NOI18N
        lbl_NumIzq.setText("0");

        lbl_pelota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tenis.png"))); // NOI18N

        btn_MasIzq.setText("+");
        btn_MasIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MasIzqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpvistaIzqLayout = new javax.swing.GroupLayout(jpvistaIzq);
        jpvistaIzq.setLayout(jpvistaIzqLayout);
        jpvistaIzqLayout.setHorizontalGroup(
            jpvistaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvistaIzqLayout.createSequentialGroup()
                .addComponent(btn_MenIzq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_MasIzq))
            .addGroup(jpvistaIzqLayout.createSequentialGroup()
                .addGroup(jpvistaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpvistaIzqLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lbl_pelota1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpvistaIzqLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lbl_NumIzq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(btn_tarjetaIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpvistaIzqLayout.setVerticalGroup(
            jpvistaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpvistaIzqLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_NumIzq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(lbl_pelota1)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpvistaIzqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tarjetaIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpvistaIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_MenIzq)
                    .addComponent(btn_MasIzq)))
        );

        getContentPane().add(jpvistaIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 300, 330));

        jpvistaDerech.setBackground(new java.awt.Color(204, 204, 204));

        btn_MenDer.setText("-");
        btn_MenDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenDerActionPerformed(evt);
            }
        });

        btn_MasDer1.setText("+");
        btn_MasDer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MasDer1ActionPerformed(evt);
            }
        });

        lbl_NumDer.setFont(new java.awt.Font("Arial", 1, 150)); // NOI18N
        lbl_NumDer.setText("0");

        lbl_pelota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tenis.png"))); // NOI18N

        javax.swing.GroupLayout jpvistaDerechLayout = new javax.swing.GroupLayout(jpvistaDerech);
        jpvistaDerech.setLayout(jpvistaDerechLayout);
        jpvistaDerechLayout.setHorizontalGroup(
            jpvistaDerechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvistaDerechLayout.createSequentialGroup()
                .addGroup(jpvistaDerechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_MasDer1)
                    .addGroup(jpvistaDerechLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_tarjetaDer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jpvistaDerechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_MenDer, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpvistaDerechLayout.createSequentialGroup()
                        .addComponent(lbl_pelota2)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpvistaDerechLayout.createSequentialGroup()
                        .addComponent(lbl_NumDer)
                        .addGap(99, 99, 99))))
        );
        jpvistaDerechLayout.setVerticalGroup(
            jpvistaDerechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpvistaDerechLayout.createSequentialGroup()
                .addGroup(jpvistaDerechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpvistaDerechLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbl_NumDer, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpvistaDerechLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_tarjetaDer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(lbl_pelota2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpvistaDerechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_MenDer)
                    .addComponent(btn_MasDer1)))
        );

        getContentPane().add(jpvistaDerech, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 300, 330));

        jpvista3.setBackground(new java.awt.Color(255, 153, 255));

        lbl_puntuacion1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_puntuacion1.setText("0");

        javax.swing.GroupLayout jpvista3Layout = new javax.swing.GroupLayout(jpvista3);
        jpvista3.setLayout(jpvista3Layout);
        jpvista3Layout.setHorizontalGroup(
            jpvista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lbl_puntuacion1)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jpvista3Layout.setVerticalGroup(
            jpvista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lbl_puntuacion1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jpvista3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 130, 140));

        jpvista4.setBackground(new java.awt.Color(204, 255, 255));

        lbl_puntuacion2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lbl_puntuacion2.setText("0");

        javax.swing.GroupLayout jpvista4Layout = new javax.swing.GroupLayout(jpvista4);
        jpvista4.setLayout(jpvista4Layout);
        jpvista4Layout.setHorizontalGroup(
            jpvista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpvista4Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(lbl_puntuacion2)
                .addGap(51, 51, 51))
        );
        jpvista4Layout.setVerticalGroup(
            jpvista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpvista4Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(lbl_puntuacion2)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jpvista4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 130, 140));

        jpvista5.setBackground(new java.awt.Color(255, 255, 102));

        btn_minJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cronometro.png"))); // NOI18N
        btn_minJ1.setText("T");
        btn_minJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minJ1ActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(btn_minJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btn_minJ2)
                .addContainerGap())
        );
        jpvista5Layout.setVerticalGroup(
            jpvista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvista5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpvista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_minJ1)
                    .addComponent(btn_minJ2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpvista5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 260, 50));

        jpvista7.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jpvista7Layout = new javax.swing.GroupLayout(jpvista7);
        jpvista7.setLayout(jpvista7Layout);
        jpvista7Layout.setHorizontalGroup(
            jpvista7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jpvista7Layout.setVerticalGroup(
            jpvista7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jpvista7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 260, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MasDer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MasDer1ActionPerformed
        count++;
        String numero = String.valueOf(count);
        prueba.setText(numero);
        
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
          
        Punto p = new Punto();
        String a = lbl_NumDer.getText();
        int b = p.Mas(Integer.parseInt(a));
        
        if(b<=11){
            lbl_NumDer.setText(Integer.toString(b));
            if(b==11){
                p2++;
                JOptionPane.showMessageDialog(null, "PUNTO!!"+lbl_jugador2);
                lbl_puntuacion2.setText(Integer.toString(p2));
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
        prueba.setText(numero);
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
        
        Punto p = new Punto();
        String a = lbl_NumIzq.getText();
        int b = p.Mas(Integer.parseInt(a));
        
        if(b<=11){
            lbl_NumIzq.setText(Integer.toString(b));
            if(b==11){
                ne++;
                JOptionPane.showMessageDialog(null, "PUNTO!!");
                lbl_puntuacion1.setText(Integer.toString(ne));
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
        //seguir();
        //i=null;
        //i = new Cronometro_Partido(this);
        //i.start();
    }//GEN-LAST:event_btn_playActionPerformed
    //Inicializa el cronometro
    public void IniciarConometor(){
        i = null;
        i = new Cronometro_Partido(this);
        i.start();
    }
    
    
    private void btn_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tarjetaActionPerformed
        // TODO add your handling code here:
        tarjetas t = new tarjetas();
        
        String nt = lbl_jugador1.getText();
        String nn = lbl_jugador2.getText();
        
        t.lbl_jugadorT1.setText(nt);
        t.lbl_jugadorT2.setText(nn);
        btn_tarjeta.setEnabled(false);
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_tarjetaActionPerformed

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

    public synchronized int aumentSeg(){
        seg++;
        lbl_segC.setText(String.valueOf(seg));
        return seg;
    }
    
    public synchronized int aumentMin(){
        min++;
        lbl_minC.setText(String.valueOf(min));
        return min;
    }
    
    public synchronized int aumentHor(){
        hor++;
        lbl_horaC.setText(String.valueOf(hor));
        return hor;
    }
    
    public synchronized int getMin(){
        return min;
    }
    
    public synchronized int getSeg(){
        return seg;
    }
    
    public synchronized int getHor(){
        return hor;
    }
    
    public synchronized boolean isContinuar(){
        return continuar;
    }
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
    private javax.swing.JButton btn_tarjeta;
    private javax.swing.JButton btn_tarjetaDer;
    public javax.swing.JButton btn_tarjetaIzq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpvista1;
    private javax.swing.JPanel jpvista2;
    private javax.swing.JPanel jpvista3;
    private javax.swing.JPanel jpvista4;
    private javax.swing.JPanel jpvista5;
    private javax.swing.JPanel jpvista7;
    private javax.swing.JPanel jpvistaDerech;
    private javax.swing.JPanel jpvistaIzq;
    private javax.swing.JLabel lbl_NumDer;
    private javax.swing.JLabel lbl_NumIzq;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_hora1;
    private javax.swing.JLabel lbl_horaAct;
    private javax.swing.JLabel lbl_horaC;
    public javax.swing.JLabel lbl_jugador1;
    public javax.swing.JLabel lbl_jugador2;
    private javax.swing.JLabel lbl_minC;
    private javax.swing.JLabel lbl_pelota1;
    private javax.swing.JLabel lbl_pelota2;
    private javax.swing.JLabel lbl_puntuacion1;
    private javax.swing.JLabel lbl_puntuacion2;
    private javax.swing.JLabel lbl_segC;
    private javax.swing.JLabel prueba;
    // End of variables declaration//GEN-END:variables
}

