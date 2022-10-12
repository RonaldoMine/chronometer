package Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Paint;
import java.net.URL;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;

/**
 * @author MIMBE MINE ANDRE RONALDO Name : Chronometre
 */
public class Chronometre extends javax.swing.JFrame {

    protected Timer t;
    protected int milisec = 0;
    protected int sec = 0;
    protected int min = 0;
    protected int h = 0;
    protected int c = 0;
    protected AudioClip ac, ac2;
    protected File f;
    protected URL url, url2;
    Paint paint = null;
    int xMouse;
    int yMouse;

    public Chronometre() {
        this.t = new Timer(10, new Check());
        initComponents();
        this.setLocationRelativeTo(null);//centrer le chrono
        Date();
        Time();
        setIconImage(getToolkit().getImage("src/img/icons8_Stopwatch_48px.png"));

        heure.setBorder(BorderFactory.createDashedBorder(paint, 1, 1, 3, true));
        minute.setBorder(BorderFactory.createDashedBorder(paint, 1, 1, 3, true));
        seconde.setBorder(BorderFactory.createDashedBorder(paint, 1, 1, 3, true));
        tiers.setBorder(BorderFactory.createDashedBorder(paint, 1, 1, 3, true));
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panContenue = new javax.swing.JPanel();
        heure = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        seconde = new javax.swing.JLabel();
        tiers = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LabelDate = new javax.swing.JLabel();
        LabelTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chrono");
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(2, 26, 114));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mon Chronometre");

        jLabel12.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("x");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("-");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12))
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panContenue.setBackground(new java.awt.Color(55, 116, 175));
        panContenue.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panContenue.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panContenueMouseDragged(evt);
            }
        });
        panContenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panContenueMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panContenueMouseReleased(evt);
            }
        });

        heure.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        heure.setForeground(new java.awt.Color(236, 240, 240));
        heure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heure.setText("00");
        heure.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 74, 136), 1, true));
        heure.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        minute.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        minute.setForeground(new java.awt.Color(236, 240, 240));
        minute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minute.setText("00");
        minute.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 74, 136), 1, true));

        seconde.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        seconde.setForeground(new java.awt.Color(236, 240, 240));
        seconde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seconde.setText("00");
        seconde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 74, 136), 1, true));

        tiers.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        tiers.setForeground(new java.awt.Color(236, 240, 240));
        tiers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiers.setText("00");
        tiers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 74, 136), 1, true));

        start.setBackground(new java.awt.Color(0, 102, 51));
        start.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        start.setForeground(new java.awt.Color(236, 240, 240));
        start.setText("START");
        start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start.setFocusPainted(false);
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        stop.setBackground(new java.awt.Color(204, 0, 51));
        stop.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        stop.setForeground(new java.awt.Color(236, 240, 240));
        stop.setText("STOP");
        stop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stop.setFocusPainted(false);
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(153, 102, 0));
        reset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setFocusPainted(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(0, 51, 102));
        save.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("SAVE");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.setFocusPainted(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Heures");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Minutes");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Secondes");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tiers");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Temps Enregistrés");

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Numeros");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Heures");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Minutes");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Secondes");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tiers");

        LabelDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelDate.setForeground(new java.awt.Color(255, 255, 255));
        LabelDate.setText("dd/mm/yyyy");

        LabelTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelTime.setForeground(new java.awt.Color(255, 255, 255));
        LabelTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelTime.setText("00:00:00");

        javax.swing.GroupLayout panContenueLayout = new javax.swing.GroupLayout(panContenue);
        panContenue.setLayout(panContenueLayout);
        panContenueLayout.setHorizontalGroup(
            panContenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContenueLayout.createSequentialGroup()
                .addGroup(panContenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panContenueLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5))
                    .addGroup(panContenueLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(seconde, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tiers, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panContenueLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel6))
                    .addGroup(panContenueLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panContenueLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(start)
                        .addGap(18, 18, 18)
                        .addComponent(stop)
                        .addGap(18, 18, 18)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(save)))
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panContenueLayout.createSequentialGroup()
                .addComponent(LabelDate)
                .addGap(6, 6, 6)
                .addComponent(LabelTime)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panContenueLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(13, 13, 13)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(71, 71, 71))
        );
        panContenueLayout.setVerticalGroup(
            panContenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContenueLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panContenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addGroup(panContenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seconde, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panContenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(start)
                    .addComponent(stop)
                    .addComponent(reset)
                    .addComponent(save))
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panContenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(panContenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9))
                    .addComponent(jLabel11))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panContenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDate)
                    .addComponent(LabelTime)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panContenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panContenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        //permet d'activer le bouton save
        save.setEnabled(true);
        //remet les valeurs des variables et des champs de texte a 00
        milisec = 0;
        min = 0;
        sec = 0;
        h = 0;
        tiers.setText("00");
        seconde.setText("00");
        minute.setText("00");
        heure.setText("00");
        jTextPane1.setText("");
        //pour arreter le timer
        t.stop();
        c = 0;

    }//GEN-LAST:event_resetActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        //lancement du chronometre
        t.start();
        //pour activer le bouton save
        save.setEnabled(true);
        //musiqueBack();

    }//GEN-LAST:event_startActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        //arret du minuteurs et reinitialisation du compteur a 0
        t.stop();
        //pour desactiver le bouton save
        save.setEnabled(false);
    }//GEN-LAST:event_stopActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        //recuperation des valeurs contenus dans les champs de texte
        String getTiers, getSec, getMin, getHeure;
        getTiers = tiers.getText();
        getSec = seconde.getText();
        getMin = minute.getText();
        getHeure = heure.getText();
        //deuxieme methode pour afficher les temps enrengistres
        /*String ti[] = {getTiers,getSec,getMin,getHeure};
        c++;
         SavePanel.setText(SavePanel.getText().concat(c+". "+ti[3]+":"+ti[2]+":"+ti[1]+":"+ti[0]+"\n"));*/
        //methode pour affiche les temps enregistes au fur et a mesure que l'on presera sur le bouton save
        if (!"00".equals(getTiers)) {
            c += 1;
            jTextPane1.setText(jTextPane1.getText().concat("N°" + String.valueOf(c) + "\t " + String.valueOf(getHeure) + "\t"
                    + String.valueOf(getMin) + "\t" + String.valueOf(getSec) + "\t  " + String.valueOf(getTiers) + "\n"));
        }

    }//GEN-LAST:event_saveActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void panContenueMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panContenueMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
        setOpacity((float) 0.8);
    }//GEN-LAST:event_panContenueMouseDragged

    private void panContenueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panContenueMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panContenueMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        setOpacity((float) 1);
    }//GEN-LAST:event_formMouseReleased

    private void panContenueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panContenueMouseReleased
        setOpacity((float) 1);
    }//GEN-LAST:event_panContenueMouseReleased
    //Declarations des methodes
    //Methode pour faire jouer un son au fur et a mesure que les minutes et les heures augmentent 
    protected void musique() {
        try {
            url = getClass().getResource("/sons/clap.wav");
            ac = Applet.newAudioClip(url);
            ac.play();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    protected void Date() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        LabelDate.setText(s.format(d));
    }

    protected void Time() {
        new Timer(0, (ActionEvent e) -> {
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            LabelTime.setText(s.format(d));
        }).start();
    }

    //effectue une action lorsqu'il ya action sur un bouton
    class Check implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           /* milisec += 1;
            //Compteur pour les secondes
            if (milisec == 100) {
                sec += 1;
                milisec = 0;

            }
            //Compteur pour les minutes
            if (sec == 60) {
                min += 1;
                sec = 0;
                musique();
            }
            //Compteur pour les heures
            if (min == 60) {
                h += 1;
                min = 0;
                musique();
            }
            tiers.setText(String.valueOf(milisec));
            if (sec < 10) {
                seconde.setText(String.valueOf("0" + sec));
            } else {
                seconde.setText(String.valueOf(sec));
            }
            if (min < 10) {
                minute.setText(String.valueOf("0" + min));
            } else {
                minute.setText(String.valueOf(min));
            }
            if (h < 10) {
                heure.setText(String.valueOf("0" + h));
            } else {
                heure.setText(String.valueOf(h));
            }*/
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Chronometre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chronometre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chronometre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chronometre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Chronometre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDate;
    private javax.swing.JLabel LabelTime;
    private javax.swing.JLabel heure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel minute;
    private javax.swing.JPanel panContenue;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JLabel seconde;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    private javax.swing.JLabel tiers;
    // End of variables declaration//GEN-END:variables
}
