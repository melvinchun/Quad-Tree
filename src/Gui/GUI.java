/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Tree.Nodo;
import Tree.Tree;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import Sound.Sounds;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Brenda
 */
public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        B_run.setVisible(false);
        profundidad.setValue(1);
        prof = 1;
        this.setLocationRelativeTo(null);
        intro.pack();
        intro.setModal(true);
        intro.setLocationRelativeTo(this);
        intro.setVisible(true);
        bi = null;
        arbol = new Tree();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intro = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        resultado = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        B_Exportar = new javax.swing.JButton();
        icono2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        instrucciones = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Progress = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        ProBarEspera = new javax.swing.JProgressBar();
        text_infoTxt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        B_Cargar = new javax.swing.JButton();
        icono = new javax.swing.JLabel();
        B_run = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        profundidad = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Krungthep", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FBI");

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("ffdfdfdf");

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Este software fue creado por el Hexágono Hondureño\npara el análisis de contorno en imágenes.  Su uso es \nexclusivo para el FBI.\n");
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Krungthep", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Avanzar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jButton1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout introLayout = new javax.swing.GroupLayout(intro.getContentPane());
        intro.getContentPane().setLayout(introLayout);
        introLayout.setHorizontalGroup(
            introLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        introLayout.setVerticalGroup(
            introLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        B_Exportar.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        B_Exportar.setForeground(new java.awt.Color(255, 255, 255));
        B_Exportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save-.png"))); // NOI18N
        B_Exportar.setText("Exportar");
        B_Exportar.setBorderPainted(false);
        B_Exportar.setContentAreaFilled(false);
        B_Exportar.setFocusable(false);
        B_Exportar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        B_Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ExportarActionPerformed(evt);
            }
        });

        icono2.setText(" ");

        jLabel1.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vista Previa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Exportar)
                    .addComponent(jLabel1)
                    .addComponent(icono2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icono2)
                .addGap(18, 18, 18)
                .addComponent(B_Exportar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout resultadoLayout = new javax.swing.GroupLayout(resultado.getContentPane());
        resultado.getContentPane().setLayout(resultadoLayout);
        resultadoLayout.setHorizontalGroup(
            resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        resultadoLayout.setVerticalGroup(
            resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setToolTipText("ffdfdfdf");

        jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("Instrucciones\n\nUse el boton cargar para subir su imagen.\n\nUse el boton Inicio para empezar el analisis de su \nimagen.\n\nUse el boton de Exportar para guardar su imagen.\n\nCon la profundidad obtendra la precision de la \nimagen.");
        jTextArea2.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea2);

        jButton2.setFont(new java.awt.Font("Krungthep", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Aceptar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/load-.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save-.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa-.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(93, 93, 93))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout instruccionesLayout = new javax.swing.GroupLayout(instrucciones.getContentPane());
        instrucciones.getContentPane().setLayout(instruccionesLayout);
        instruccionesLayout.setHorizontalGroup(
            instruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        instruccionesLayout.setVerticalGroup(
            instruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Progress.setTitle("Generando imagen en blanco y negro");
        Progress.setBackground(new java.awt.Color(0, 0, 0));
        Progress.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        Progress.setResizable(false);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        text_infoTxt.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        text_infoTxt.setForeground(new java.awt.Color(180, 180, 180));
        text_infoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_infoTxt.setText("NULL");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProBarEspera, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(text_infoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProBarEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_infoTxt)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout ProgressLayout = new javax.swing.GroupLayout(Progress.getContentPane());
        Progress.getContentPane().setLayout(ProgressLayout);
        ProgressLayout.setHorizontalGroup(
            ProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ProgressLayout.setVerticalGroup(
            ProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        B_Cargar.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        B_Cargar.setForeground(new java.awt.Color(255, 255, 255));
        B_Cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/load-.png"))); // NOI18N
        B_Cargar.setText("Cargar");
        B_Cargar.setBorderPainted(false);
        B_Cargar.setContentAreaFilled(false);
        B_Cargar.setFocusable(false);
        B_Cargar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/load--.png"))); // NOI18N
        B_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CargarActionPerformed(evt);
            }
        });

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-.png"))); // NOI18N

        B_run.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        B_run.setForeground(new java.awt.Color(255, 255, 255));
        B_run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa-.png"))); // NOI18N
        B_run.setText("Iniciar");
        B_run.setBorder(null);
        B_run.setBorderPainted(false);
        B_run.setContentAreaFilled(false);
        B_run.setFocusable(false);
        B_run.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa--.png"))); // NOI18N
        B_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_runActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nivel de Profundidad");

        profundidad.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        profundidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), null, Integer.valueOf(99), Integer.valueOf(1)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(icono))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B_Cargar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(B_run))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profundidad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(icono)
                .addGap(28, 28, 28)
                .addComponent(B_Cargar)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(profundidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(B_run)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jMenu1.setText("Ayuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Instrucciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CargarActionPerformed
        //sound("src/Sound/push.wav");
        Sounds.push.play();
        new Thread() {
            public void run() {
                try {
                    JFileChooser jfc = new JFileChooser();
                    FileFilter filtro = new FileNameExtensionFilter("Imagenes", "PNG", "jpg", "jpeg");
                    jfc.setFileFilter(filtro);
                    File archivo = null;
                    int op = jfc.showOpenDialog(null);
                    if (op == JFileChooser.APPROVE_OPTION) {
                        archivo = jfc.getSelectedFile();
                        bi = ImageIO.read(archivo);
                        bi = convertBufferedImageToGrayScale(bi);
                        Image img;
                        img = Toolkit.getDefaultToolkit().createImage(bi.getSource()).getScaledInstance(200, 200, 0);
                        icono.setIcon(new ImageIcon(img));
                        Progress.setVisible(false);
                        B_run.setVisible(true);
                        Sounds.ding.play();
                    }
                } catch (Exception e) {
                    Sounds.error.play();
                    JOptionPane.showMessageDialog(null, "Error al cargar la imagen", "ERROR", 2);
                }
            }
        }.start();
    }//GEN-LAST:event_B_CargarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sounds.push.play();
        intro.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void B_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_runActionPerformed
        Sounds.push.play();
        if ((int) profundidad.getValue() >= 0) {
            new Thread() {
                public void run() {
                    ProBarEspera.setVisible(false);
                    Progress.setTitle("Generando Arbol");
                    text_infoTxt.setText("Generando Arbol, espere.......");
                    Progress.pack();
                    Progress.setVisible(true);
                    Arbol(bi, 1, arbol.getRaiz());
                    if (prof < (int) profundidad.getValue()) {
                        Sounds.pop.play();
                        JOptionPane.showMessageDialog(null, "La profundidad es muy grande\n"
                                + "Profundidad deseada: " + profundidad.getValue() + "\n"
                                + "Profundidad maxima alcanzada: " + prof);
                    }
                    prof = 0;
                    Progress.setTitle("Generando Imagen");
                    text_infoTxt.setText("Generando Imagen, espere........");
                    generada = createOpaqueColorImage(bi.getWidth(), bi.getHeight(), Color.LIGHT_GRAY.getRGB());
                    cutImage(generada, Color.BLACK.getRGB(), arbol.getRaiz());
                    double ratio = 1.0 * generada.getWidth() / generada.getHeight();
                    int newWidth = 600;
                    if (generada.getWidth() < 500 && generada.getHeight() < 500) {
                        Image img;
                        img = Toolkit.getDefaultToolkit().createImage(generada.getSource()).getScaledInstance(generada.getWidth(), generada.getHeight(), 0);
                        icono2.setIcon(new ImageIcon(img));
                    } else {
                        Image img;
                        img = Toolkit.getDefaultToolkit().createImage(generada.getSource()).getScaledInstance((int) (newWidth), (int) (newWidth / ratio), 0);
                        icono2.setIcon(new ImageIcon(img));
                    }
                    Progress.setVisible(false);
                    ProBarEspera.setVisible(true);
                    resultado.pack();
                    resultado.setModal(false);
                    Sounds.error.play();
                    resultado.setLocationRelativeTo(null);
                    resultado.setVisible(true);
                }

            }.start();
        } else {
            Sounds.error.play();
            JOptionPane.showMessageDialog(this, "Profundidad debe moyor igual a 0", "ERROR", 2);
        }
    }//GEN-LAST:event_B_runActionPerformed

    private void B_ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ExportarActionPerformed
        Sounds.save.play();
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Especifique un Nombre");
        int result = chooser.showSaveDialog(resultado);
        try {
            if (result == chooser.APPROVE_OPTION) {
                File outputfile = new File(chooser.getSelectedFile() + ".bmp");
                ImageIO.write(generada, "bmp", outputfile);
                Sounds.pop.play();
                JOptionPane.showMessageDialog(resultado, "Archivo guardado exitosamente", "Guardado", 1);
            }
        } catch (Exception e) {
            Sounds.error.play();
            JOptionPane.showMessageDialog(resultado, "Error al guardar la imagen", "ERROR", 2);
        }
    }//GEN-LAST:event_B_ExportarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Sounds.push.play();
        instrucciones.pack();
        instrucciones.setModal(true);
        instrucciones.setLocationRelativeTo(this);
        instrucciones.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Sounds.push.play();
        instrucciones.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    void Arbol(BufferedImage image, int depth, Nodo raiz) {
        try {
            int temp = image.getRGB(image.getWidth() - 1, image.getHeight() - 1);
            boolean cambio = false;
            for (int i = 0; i < image.getWidth(); i++) {
                for (int j = 0; j < image.getHeight(); j++) {
                    if (image.getRGB(i, j) != temp) {
                        cambio = true;
                        break;
                    }
                }
                if (cambio) {
                    break;
                }
            }
            if (cambio && depth <= (int) profundidad.getValue() && image.getWidth() > 4 && image.getHeight() > 4) {
                if (prof < depth) {
                    prof = depth;
                }
                raiz.setValue(true);
                //PrimerCuadrante
                Arbol(image.getSubimage(image.getWidth() / 2, 0, image.getWidth() / 2, image.getHeight() / 2), depth + 1, raiz.getCuadrante1());
                //SegundoCuadrante
                Arbol(image.getSubimage(0, 0, image.getWidth() / 2, image.getHeight() / 2), depth + 1, raiz.getCuadrante2());
                //TercerCuadrante
                Arbol(image.getSubimage(0, image.getHeight() / 2, image.getWidth() / 2, image.getHeight() / 2), depth + 1, raiz.getCuadrante3());
                //CuartoCuadante
                Arbol(image.getSubimage(image.getWidth() / 2, image.getHeight() / 2, image.getWidth() / 2, image.getHeight() / 2), depth + 1, raiz.getCuadrante4());
            }
        } catch (NullPointerException e) {
            Sounds.error.play();
            JOptionPane.showMessageDialog(this, "NO GENERO DIVISIONES", "Advertencia!", JOptionPane.WARNING_MESSAGE);
        } catch (StackOverflowError e) {
            Sounds.error.play();
            JOptionPane.showMessageDialog(this, "SU RAM NO PERMITE MAS CORTES", "Advertencia!", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            Sounds.error.play();
            JOptionPane.showMessageDialog(this, "ERROR AL GENERAR IMAGEN");
        }
    }

    BufferedImage convertBufferedImageToGrayScale(BufferedImage external) {
        if (external.getType() == BufferedImage.TYPE_BYTE_GRAY) {
            System.out.println("Ya esta en blanco y negro");
            return external;
        }
        int sizeX = external.getWidth();
        int sizeY = external.getHeight();
        ProBarEspera.setMaximum(sizeX * sizeY);
        ProBarEspera.setValue(0);
        Progress.setTitle("Convitiendo a escala de grises");
        Progress.pack();
        text_infoTxt.setText(null);
        Progress.setLocationRelativeTo(this);
        Progress.setVisible(true);
        BufferedImage retImg = new BufferedImage(sizeX, sizeY, BufferedImage.TYPE_BYTE_GRAY);
        int proBarCont = 0;
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                ProBarEspera.setValue(++proBarCont);
                if (getAlpha(external, i, j) < 100) {
                    retImg.setRGB(i, j, Color.WHITE.getRGB());
                } else {
                    retImg.setRGB(i, j, external.getRGB(i, j));
                }
            }
        }
        return retImg;
    }

    int getAlpha(BufferedImage image, int x, int y) {
        Color pixel = new Color(image.getRGB(x, y), true);
        return pixel.getAlpha();
    }

    void cutImage(BufferedImage image, int colorRGB, Nodo quadrant) {
        if (quadrant.isValue()) {
            for (int i = 0; i < image.getWidth(); i++) {
                image.setRGB(i, image.getHeight() / 2, colorRGB);
            }
            for (int i = 0; i < image.getHeight(); i++) {
                image.setRGB(image.getWidth() / 2, i, colorRGB);
            }
        }
        try {
            if (quadrant.getCuadrante1().isValue()) {
                //.getSubimage(INICIO en X, INICIO en Y, ancho, alto)
                cutImage(image.getSubimage(image.getWidth() / 2, 0, image.getWidth() / 2, image.getHeight() / 2), colorRGB, quadrant.getCuadrante1());
            }
            if (quadrant.getCuadrante2().isValue()) {
                cutImage(image.getSubimage(0, 0, image.getWidth() / 2, image.getHeight() / 2), colorRGB, quadrant.getCuadrante2());
            }
            if (quadrant.getCuadrante3().isValue()) {
                cutImage(image.getSubimage(0, image.getHeight() / 2, image.getWidth() / 2, image.getHeight() / 2), colorRGB, quadrant.getCuadrante3());
            }
            if (quadrant.getCuadrante4().isValue()) {
                cutImage(image.getSubimage(image.getWidth() / 2, image.getHeight() / 2, image.getWidth() / 2, image.getHeight() / 2), colorRGB, quadrant.getCuadrante4());
            }
        } catch (NullPointerException nullErr) {
            Sounds.error.play();
            JOptionPane.showMessageDialog(this, "NO GENERO DIVISIONES", "Advertencia!", JOptionPane.WARNING_MESSAGE);
        } catch (StackOverflowError e) {
            Sounds.error.play();
            JOptionPane.showMessageDialog(this, "SU RAM NO PERMITE MAS CORTES", "Advertencia!", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            Sounds.error.play();
            JOptionPane.showMessageDialog(this, "ERROR AL GENERAR IMAGEN");
        }
    }

    BufferedImage createOpaqueColorImage(int x, int y, int RGB) {
        BufferedImage retImg = new BufferedImage(x, y, BufferedImage.TYPE_BYTE_GRAY);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                retImg.setRGB(i, j, RGB);
            }
        }
        return retImg;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cargar;
    private javax.swing.JButton B_Exportar;
    private javax.swing.JButton B_run;
    private javax.swing.JProgressBar ProBarEspera;
    private javax.swing.JDialog Progress;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel icono2;
    private javax.swing.JDialog instrucciones;
    private javax.swing.JDialog intro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JSpinner profundidad;
    private javax.swing.JDialog resultado;
    private javax.swing.JLabel text_infoTxt;
    // End of variables declaration//GEN-END:variables
    BufferedImage bi;
    Tree arbol;
    BufferedImage generada;
    int prof;
}
