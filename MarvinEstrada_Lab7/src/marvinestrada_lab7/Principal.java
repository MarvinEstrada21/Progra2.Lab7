package marvinestrada_lab7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_guerrero = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombre_dragon = new javax.swing.JTextField();
        tf_nickname_dragon = new javax.swing.JTextField();
        tf_ataque_dragon = new javax.swing.JTextField();
        tf_defensa_dragon = new javax.swing.JTextField();
        tf_salud_dragon = new javax.swing.JTextField();
        tf_puntos_dragon = new javax.swing.JTextField();
        bt_guardar_dragon = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tf_nombre_fenix = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_nickname_fenix = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_ataque_fenix = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_defensa_fenix = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_salud_fenix = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_puntos_fenix = new javax.swing.JTextField();
        bt_guardar_fenix = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tf_nombre_hl = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_nickname_hl = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_ataque_hl = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tf_defensa_hl = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_salud_hl = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_puntos_hl = new javax.swing.JTextField();
        bt_guardar_hl = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        tf_nombre_minotauro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf_nickname_minotauro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf_ataque_minotauro = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tf_defensa_minotauro = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf_salud_minotauro = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf_puntos_minotauro = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        tf_nombre_alumno = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tf_nickname_alumno = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tf_ataque_alumno = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tf_defensa_alumno = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tf_salud_alumno = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tf_puntos_alumno = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        tf_cuenta_alumno = new javax.swing.JTextField();
        tf_carrera_alumno = new javax.swing.JTextField();
        tf_edad_alumno = new javax.swing.JTextField();
        bt_guardar_alumno = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_bestias = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_alumno = new javax.swing.JTable();
        jd_modificar_bestia = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tf_nombre_bestia = new javax.swing.JTextField();
        tf_nickname_bestia = new javax.swing.JTextField();
        tf_ataque_bestia = new javax.swing.JTextField();
        tf_defensa_bestia = new javax.swing.JTextField();
        tf_salud_bestia = new javax.swing.JTextField();
        tf_puntos_bestia = new javax.swing.JTextField();
        bt_guardar_dragon1 = new javax.swing.JButton();
        pp_bestia = new javax.swing.JPopupMenu();
        modificar_bestia = new javax.swing.JMenuItem();
        eliminar_bestia = new javax.swing.JMenuItem();
        jd_modificar_alumno = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        tf_nombre_alumno1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        tf_nickname_alumno1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        tf_ataque_alumno1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        tf_defensa_alumno1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        tf_salud_alumno1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        tf_puntos_alumno1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        tf_cuenta_alumno1 = new javax.swing.JTextField();
        tf_carrera_alumno1 = new javax.swing.JTextField();
        tf_edad_alumno1 = new javax.swing.JTextField();
        bt_guardar_alumno1 = new javax.swing.JButton();
        pp_alumnos = new javax.swing.JPopupMenu();
        modificar_alumno = new javax.swing.JMenuItem();
        eliminar_alumno = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Nombre:");

        jLabel2.setText("Nickname:");

        jLabel3.setText("Poder de Ataque:");

        jLabel4.setText("Poder de Defensa:");

        jLabel5.setText("Salud:");

        jLabel6.setText("Puntos:");

        bt_guardar_dragon.setText("Guardar");
        bt_guardar_dragon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardar_dragonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nombre_dragon)
                    .addComponent(tf_nickname_dragon)
                    .addComponent(tf_ataque_dragon)
                    .addComponent(tf_defensa_dragon)
                    .addComponent(tf_salud_dragon)
                    .addComponent(tf_puntos_dragon, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addComponent(bt_guardar_dragon)
                .addGap(246, 246, 246))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombre_dragon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nickname_dragon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_ataque_dragon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_defensa_dragon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_salud_dragon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_puntos_dragon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(bt_guardar_dragon)
                .addGap(36, 36, 36))
        );

        jTabbedPane3.addTab("Dragón", jPanel5);

        jLabel7.setText("Nombre:");

        jLabel8.setText("Nickname:");

        jLabel9.setText("Poder de Ataque:");

        jLabel10.setText("Poder de Defensa:");

        jLabel11.setText("Salud:");

        jLabel12.setText("Puntos:");

        bt_guardar_fenix.setText("Guardar");
        bt_guardar_fenix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardar_fenixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre_fenix)
                            .addComponent(tf_nickname_fenix)
                            .addComponent(tf_ataque_fenix)
                            .addComponent(tf_defensa_fenix)
                            .addComponent(tf_salud_fenix)
                            .addComponent(tf_puntos_fenix, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(bt_guardar_fenix)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_nombre_fenix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nickname_fenix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_ataque_fenix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_defensa_fenix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_salud_fenix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_puntos_fenix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(bt_guardar_fenix)
                .addGap(41, 41, 41))
        );

        jTabbedPane3.addTab("Fénix", jPanel6);

        jLabel13.setText("Nombre:");

        jLabel14.setText("Nickname:");

        jLabel15.setText("Poder de Ataque:");

        jLabel16.setText("Poder de Defensa:");

        jLabel17.setText("Salud:");

        jLabel18.setText("Puntos:");

        bt_guardar_hl.setText("Guardar");
        bt_guardar_hl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardar_hlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre_hl)
                            .addComponent(tf_nickname_hl)
                            .addComponent(tf_ataque_hl)
                            .addComponent(tf_defensa_hl)
                            .addComponent(tf_salud_hl)
                            .addComponent(tf_puntos_hl, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(bt_guardar_hl)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_nombre_hl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_nickname_hl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_ataque_hl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_defensa_hl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_salud_hl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_puntos_hl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(bt_guardar_hl)
                .addGap(36, 36, 36))
        );

        jTabbedPane3.addTab("Hombre Lobo", jPanel7);

        jLabel19.setText("Nombre:");

        jLabel20.setText("Nickname:");

        jLabel21.setText("Poder de Ataque:");

        jLabel22.setText("Poder de Defensa:");

        jLabel23.setText("Salud:");

        jLabel24.setText("Puntos:");

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre_minotauro)
                            .addComponent(tf_nickname_minotauro)
                            .addComponent(tf_ataque_minotauro)
                            .addComponent(tf_defensa_minotauro)
                            .addComponent(tf_salud_minotauro)
                            .addComponent(tf_puntos_minotauro, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jButton3)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_nombre_minotauro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_nickname_minotauro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_ataque_minotauro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tf_defensa_minotauro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_salud_minotauro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tf_puntos_minotauro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(38, 38, 38))
        );

        jTabbedPane3.addTab("Minotauro", jPanel8);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane2.addTab("Bestias", jPanel3);

        jLabel25.setText("Nombre:");

        jLabel26.setText("Nickname:");

        jLabel27.setText("Poder de Ataque:");

        jLabel28.setText("Poder de Defensa:");

        jLabel29.setText("Salud:");

        jLabel30.setText("Puntos:");

        jLabel31.setText("Número de Cuenta:");

        jLabel32.setText("Carrera:");

        jLabel33.setText("Edad:");

        bt_guardar_alumno.setText("Guardar");
        bt_guardar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardar_alumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre_alumno)
                            .addComponent(tf_nickname_alumno)
                            .addComponent(tf_ataque_alumno)
                            .addComponent(tf_defensa_alumno)
                            .addComponent(tf_salud_alumno)
                            .addComponent(tf_puntos_alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(tf_cuenta_alumno)
                            .addComponent(tf_carrera_alumno)
                            .addComponent(tf_edad_alumno)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(bt_guardar_alumno)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf_nombre_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_nickname_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_ataque_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tf_defensa_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tf_salud_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tf_puntos_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tf_cuenta_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_carrera_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tf_edad_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(bt_guardar_alumno)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Alumnos", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        tabla_bestias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nickname", "Poder de Ataque", "Poder de Defensa", "Salud", "Puntos"
            }
        ));
        tabla_bestias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_bestiasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_bestias);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("Bestias", jPanel10);

        tabla_alumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nickname", "Poder de Ataque", "Poder de Defensa", "Salud", "Puntos", "Cuenta", "Carrera", "Edad"
            }
        ));
        tabla_alumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_alumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_alumno);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("Alumnos", jPanel11);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane1.addTab("Modificar & Eliminar", jPanel2);

        javax.swing.GroupLayout jd_guerreroLayout = new javax.swing.GroupLayout(jd_guerrero.getContentPane());
        jd_guerrero.getContentPane().setLayout(jd_guerreroLayout);
        jd_guerreroLayout.setHorizontalGroup(
            jd_guerreroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jd_guerreroLayout.setVerticalGroup(
            jd_guerreroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jLabel34.setText("Nombre:");

        jLabel35.setText("Nickname:");

        jLabel36.setText("Poder de Ataque:");

        jLabel37.setText("Poder de Defensa:");

        jLabel38.setText("Salud:");

        jLabel39.setText("Puntos:");

        bt_guardar_dragon1.setText("Guardar");
        bt_guardar_dragon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_guardar_dragon1MouseClicked(evt);
            }
        });
        bt_guardar_dragon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardar_dragon1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nombre_bestia)
                    .addComponent(tf_nickname_bestia)
                    .addComponent(tf_ataque_bestia)
                    .addComponent(tf_defensa_bestia)
                    .addComponent(tf_salud_bestia)
                    .addComponent(tf_puntos_bestia, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(bt_guardar_dragon1)
                .addGap(246, 246, 246))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tf_nombre_bestia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(tf_nickname_bestia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(tf_ataque_bestia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(tf_defensa_bestia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(tf_salud_bestia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(tf_puntos_bestia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(bt_guardar_dragon1)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jd_modificar_bestiaLayout = new javax.swing.GroupLayout(jd_modificar_bestia.getContentPane());
        jd_modificar_bestia.getContentPane().setLayout(jd_modificar_bestiaLayout);
        jd_modificar_bestiaLayout.setHorizontalGroup(
            jd_modificar_bestiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
            .addGroup(jd_modificar_bestiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_modificar_bestiaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jd_modificar_bestiaLayout.setVerticalGroup(
            jd_modificar_bestiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
            .addGroup(jd_modificar_bestiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_modificar_bestiaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        modificar_bestia.setText("Modificar");
        modificar_bestia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_bestiaActionPerformed(evt);
            }
        });
        pp_bestia.add(modificar_bestia);

        eliminar_bestia.setText("Eliminar");
        eliminar_bestia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_bestiaActionPerformed(evt);
            }
        });
        pp_bestia.add(eliminar_bestia);

        jLabel40.setText("Nombre:");

        jLabel41.setText("Nickname:");

        jLabel42.setText("Poder de Ataque:");

        jLabel43.setText("Poder de Defensa:");

        jLabel44.setText("Salud:");

        jLabel45.setText("Puntos:");

        jLabel46.setText("Número de Cuenta:");

        jLabel47.setText("Carrera:");

        jLabel48.setText("Edad:");

        bt_guardar_alumno1.setText("Guardar");
        bt_guardar_alumno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_guardar_alumno1MouseClicked(evt);
            }
        });
        bt_guardar_alumno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardar_alumno1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre_alumno1)
                            .addComponent(tf_nickname_alumno1)
                            .addComponent(tf_ataque_alumno1)
                            .addComponent(tf_defensa_alumno1)
                            .addComponent(tf_salud_alumno1)
                            .addComponent(tf_puntos_alumno1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(tf_cuenta_alumno1)
                            .addComponent(tf_carrera_alumno1)
                            .addComponent(tf_edad_alumno1)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(bt_guardar_alumno1)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(tf_nombre_alumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(tf_nickname_alumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(tf_ataque_alumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(tf_defensa_alumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(tf_salud_alumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(tf_puntos_alumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(tf_cuenta_alumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(tf_carrera_alumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(tf_edad_alumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(bt_guardar_alumno1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_modificar_alumnoLayout = new javax.swing.GroupLayout(jd_modificar_alumno.getContentPane());
        jd_modificar_alumno.getContentPane().setLayout(jd_modificar_alumnoLayout);
        jd_modificar_alumnoLayout.setHorizontalGroup(
            jd_modificar_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
            .addGroup(jd_modificar_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificar_alumnoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jd_modificar_alumnoLayout.setVerticalGroup(
            jd_modificar_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
            .addGroup(jd_modificar_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificar_alumnoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        modificar_alumno.setText("Modificar");
        modificar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_alumnoActionPerformed(evt);
            }
        });
        pp_alumnos.add(modificar_alumno);

        eliminar_alumno.setText("Eliminar");
        eliminar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_alumnoActionPerformed(evt);
            }
        });
        pp_alumnos.add(eliminar_alumno);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Guerreros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Programar Batalla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(65, 65, 65)
                .addComponent(jButton2)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_guardar_dragonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardar_dragonActionPerformed
        String nombre, nickaname;
        double ataque, defensa, salud, puntos;
        try {
            nombre = tf_nombre_dragon.getText();
            nickaname = tf_nickname_dragon.getText();
            ataque = Double.parseDouble(tf_ataque_dragon.getText());
            defensa = Double.parseDouble(tf_defensa_dragon.getText());
            salud = Double.parseDouble(tf_salud_dragon.getText());
            puntos = 0;
            lista.add(new Dragon(nombre, nickaname, ataque, defensa, salud, puntos));
            JOptionPane.showMessageDialog(this, "El dragon ha sido creado exitosamente");
            
            DefaultTableModel modelo = (DefaultTableModel) tabla_bestias.getModel();
            Object[] newrow = {nombre, nickaname, ataque, defensa, salud, puntos};
            modelo.addRow(newrow);
            tabla_bestias.setModel(modelo);
            
            AdminGuerreros war = new AdminGuerreros("./Guerreros.cbm");
            for (int i = 0; i < lista.size(); i++) {
                war.cargarArchivo();
                war.setGuerrero(((Guerrero)lista.get(i)));
                war.escribirArchivo();
                Guardar(lista);
            }
            
            tf_nombre_dragon.setText("");
            tf_nickname_dragon.setText("");
            tf_ataque_dragon.setText("");
            tf_defensa_dragon.setText("");
            tf_salud_dragon.setText("");
            tf_puntos_dragon.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_bt_guardar_dragonActionPerformed

    private void bt_guardar_fenixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardar_fenixActionPerformed
        String nombre, nickaname;
        double ataque, defensa, salud, puntos;
        try {
            nombre = tf_nombre_fenix.getText();
            nickaname = tf_nickname_fenix.getText();
            ataque = Double.parseDouble(tf_ataque_fenix.getText());
            defensa = Double.parseDouble(tf_defensa_fenix.getText());
            salud = Double.parseDouble(tf_salud_fenix.getText());
            puntos = Double.parseDouble(tf_puntos_fenix.getText());
            lista.add(new Fenix(nombre, nickaname, ataque, defensa, salud, puntos));
            JOptionPane.showMessageDialog(this, "El fenix ha sido creado exitosamente");
            
            DefaultTableModel modelo = (DefaultTableModel) tabla_bestias.getModel();
            Object[] newrow = {nombre, nickaname, ataque, defensa, salud, puntos};
            modelo.addRow(newrow);
            tabla_bestias.setModel(modelo);
            
            AdminGuerreros war = new AdminGuerreros("./Guerreros.cbm");
            for (int i = 0; i < lista_alumnos.size(); i++) {
                war.cargarArchivo();
                war.setGuerrero(((Guerrero)lista.get(i)));
                war.escribirArchivo();
                Guardar(lista);
            }
            
            tf_nombre_fenix.setText("");
            tf_nickname_fenix.setText("");
            tf_ataque_fenix.setText("");
            tf_defensa_fenix.setText("");
            tf_salud_fenix.setText("");
            tf_puntos_fenix.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_bt_guardar_fenixActionPerformed

    private void bt_guardar_hlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardar_hlActionPerformed
        String nombre, nickaname;
        double ataque, defensa, salud, puntos;
        try {
            nombre = tf_nombre_hl.getText();
            nickaname = tf_nickname_hl.getText();
            ataque = Double.parseDouble(tf_ataque_hl.getText());
            defensa = Double.parseDouble(tf_defensa_hl.getText());
            salud = Double.parseDouble(tf_salud_hl.getText());
            puntos = Double.parseDouble(tf_puntos_hl.getText());
            lista.add(new Hombre_Lobo(nombre, nickaname, ataque, defensa, salud, puntos));
            JOptionPane.showMessageDialog(this, "El hombre lobo ha sido creado exitosamente");
            
            DefaultTableModel modelo = (DefaultTableModel) tabla_bestias.getModel();
            Object[] newrow = {nombre, nickaname, ataque, defensa, salud, puntos};
            modelo.addRow(newrow);
            tabla_bestias.setModel(modelo);
            
            AdminGuerreros war = new AdminGuerreros("./Guerreros.cbm");
            for (int i = 0; i < lista.size(); i++) {
                war.cargarArchivo();
                war.setGuerrero(((Guerrero)lista.get(i)));
                war.escribirArchivo();
                Guardar(lista);
            }
            
            tf_nombre_hl.setText("");
            tf_nickname_hl.setText("");
            tf_ataque_hl.setText("");
            tf_defensa_hl.setText("");
            tf_salud_hl.setText("");
            tf_puntos_hl.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_bt_guardar_hlActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nombre, nickaname;
        double ataque, defensa, salud, puntos;
        try {
            nombre = tf_nombre_minotauro.getText();
            nickaname = tf_nickname_minotauro.getText();
            ataque = Double.parseDouble(tf_ataque_minotauro.getText());
            defensa = Double.parseDouble(tf_defensa_minotauro.getText());
            salud = Double.parseDouble(tf_salud_minotauro.getText());
            puntos = Double.parseDouble(tf_puntos_minotauro.getText());
            lista.add(new Minotauro(nombre, nickaname, ataque, defensa, salud, puntos));
            JOptionPane.showMessageDialog(this, "El minotauro ha sido creado exitosamente");
            
            DefaultTableModel modelo = (DefaultTableModel) tabla_bestias.getModel();
            Object[] newrow = {nombre, nickaname, ataque, defensa, salud, puntos};
            modelo.addRow(newrow);
            tabla_bestias.setModel(modelo);
            
            AdminGuerreros war = new AdminGuerreros("./Guerreros.cbm");
            for (int i = 0; i < lista.size(); i++) {
                war.cargarArchivo();
                war.setGuerrero(((Guerrero)lista.get(i)));
                war.escribirArchivo();
                Guardar(lista);
            }
            
            tf_nombre_minotauro.setText("");
            tf_nickname_minotauro.setText("");
            tf_ataque_minotauro.setText("");
            tf_defensa_minotauro.setText("");
            tf_salud_minotauro.setText("");
            tf_puntos_minotauro.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bt_guardar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardar_alumnoActionPerformed
        String nombre, nickaname, carrera;
        double ataque, defensa, salud, puntos;
        int cuenta, edad;
        try {
            nombre = tf_nombre_alumno.getText();
            nickaname = tf_nickname_alumno.getText();
            ataque = Double.parseDouble(tf_ataque_alumno.getText());
            defensa = Double.parseDouble(tf_defensa_alumno.getText());
            salud = Double.parseDouble(tf_salud_alumno.getText());
            puntos = Double.parseDouble(tf_puntos_alumno.getText());
            cuenta = Integer.parseInt(tf_cuenta_alumno.getText());
            carrera  = tf_carrera_alumno.getText();
            edad = Integer.parseInt(tf_edad_alumno.getText());
            lista_alumnos.add(new Alumnos(cuenta, carrera, edad, nombre, nickaname, ataque, defensa, salud, puntos));
            JOptionPane.showMessageDialog(this, "El alumno ha sido creado exitosamente");
            
            DefaultTableModel modelo = (DefaultTableModel) tabla_alumno.getModel();
            Object[] newrow = {nombre, nickaname, ataque, defensa, salud, puntos, cuenta, carrera, edad};
            modelo.addRow(newrow);
            tabla_alumno.setModel(modelo);
            
            AdminAlumnos al = new AdminAlumnos("./Alumnos.cbm");
            for (int i = 0; i < lista_alumnos.size(); i++) {
                al.cargarArchivo();
                al.setAlumno(((Alumnos)lista_alumnos.get(i)));
                al.escribirArchivo();
                Guardar(lista);
            }
            
            tf_nombre_alumno.setText("");
            tf_nickname_alumno.setText("");
            tf_ataque_alumno.setText("");
            tf_defensa_alumno.setText("");
            tf_salud_alumno.setText("");
            tf_puntos_alumno.setText("");
            tf_cuenta_alumno.setText("");
            tf_carrera_alumno.setText("");
            tf_edad_alumno.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_bt_guardar_alumnoActionPerformed

    private void tabla_bestiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_bestiasMouseClicked
        if (evt.isMetaDown()){
            int pp = tabla_bestias.getSelectedRow();
            pp_bestia.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabla_bestiasMouseClicked

    private void modificar_bestiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_bestiaActionPerformed
        this.jd_modificar_bestia.setModal(true);
        this.jd_modificar_bestia.pack();
        this.jd_modificar_bestia.setLocationRelativeTo(this);
        this.jd_modificar_bestia.setVisible(true);
        DefaultTableModel modelo = (DefaultTableModel) tabla_bestias.getModel();
        modelo.removeRow(tabla_bestias.getSelectedRow());
        lista.remove(tabla_bestias.getSelectedRowCount());
        tabla_bestias.setModel(modelo);
    }//GEN-LAST:event_modificar_bestiaActionPerformed

    private void bt_guardar_dragon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardar_dragon1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla_bestias.getModel();
        Object[] newrow = {tf_nombre_bestia.getText(),
                            tf_nickname_bestia.getText(),
                            Double.parseDouble(tf_ataque_bestia.getText()),
                            Double.parseDouble(tf_defensa_bestia.getText()),
                            Double.parseDouble(tf_salud_bestia.getText()),
                            Double.parseDouble(tf_puntos_bestia.getText())};
        modelo.addRow(newrow);
        tabla_bestias.setModel(modelo);
        this.jd_modificar_bestia.setVisible(false);
    }//GEN-LAST:event_bt_guardar_dragon1ActionPerformed

    private void bt_guardar_dragon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_guardar_dragon1MouseClicked
        lista = new ArrayList();
        String nombre, nickaname;
        double ataque, defensa, salud, puntos;
        nombre = tf_nombre_bestia.getText();
        nickaname = tf_nickname_bestia.getText();
        ataque = Double.parseDouble(tf_ataque_bestia.getText());
        defensa = Double.parseDouble(tf_defensa_bestia.getText());
        salud = Double.parseDouble(tf_salud_bestia.getText());
        puntos = Double.parseDouble(tf_puntos_bestia.getText());
        lista.add(new Bestias(nombre, nickaname, ataque, defensa, salud, puntos));
        Guerrero gu = new Bestias();
        gu.setNombre(nombre);
        gu.setNickname(nickaname);
        gu.setAtaque(ataque);
        gu.setDefensa(defensa);
        gu.setSalud(salud);
        gu.setPuntos(puntos);
    }//GEN-LAST:event_bt_guardar_dragon1MouseClicked

    private void eliminar_bestiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_bestiaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)tabla_bestias.getModel();
        modelo.removeRow(tabla_bestias.getSelectedRow());
        lista.remove(tabla_bestias.getSelectedRowCount());
        tabla_bestias.setModel(modelo);
    }//GEN-LAST:event_eliminar_bestiaActionPerformed

    private void tabla_alumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_alumnoMouseClicked
        if (evt.isMetaDown()){
            int pp = tabla_alumno.getSelectedRow();
            pp_alumnos.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabla_alumnoMouseClicked

    private void modificar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_alumnoActionPerformed
        this.jd_modificar_alumno.setModal(true);
        this.jd_modificar_alumno.pack();
        this.jd_modificar_alumno.setLocationRelativeTo(this);
        this.jd_modificar_alumno.setVisible(true);
        DefaultTableModel modelo = (DefaultTableModel) tabla_alumno.getModel();
        modelo.removeRow(tabla_alumno.getSelectedRow());
        lista_alumnos.remove(tabla_alumno.getSelectedRowCount());
        tabla_alumno.setModel(modelo);
    }//GEN-LAST:event_modificar_alumnoActionPerformed

    private void bt_guardar_alumno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardar_alumno1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla_alumno.getModel();
        Object[] newrow = {tf_nombre_alumno.getText(),
                            tf_nickname_alumno.getText(),
                            Double.parseDouble(tf_ataque_alumno.getText()),
                            Double.parseDouble(tf_defensa_alumno.getText()),
                            Double.parseDouble(tf_salud_alumno.getText()),
                            Double.parseDouble(tf_puntos_alumno.getText()),
                            Integer.parseInt(tf_cuenta_alumno.getText()),
                            tf_carrera_alumno.getText(),
                            Integer.parseInt(tf_edad_alumno.getText())};
        modelo.addRow(newrow);
        tabla_alumno.setModel(modelo);
        this.jd_modificar_alumno.setVisible(false);
    }//GEN-LAST:event_bt_guardar_alumno1ActionPerformed

    private void bt_guardar_alumno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_guardar_alumno1MouseClicked
        lista_alumnos = new ArrayList();
        String nombre, nickaname, carrera;
        double ataque, defensa, salud, puntos;
        int cuenta, edad;
        nombre = tf_nombre_alumno1.getText();
        nickaname = tf_nickname_alumno1.getText();
        ataque = Double.parseDouble(tf_ataque_alumno1.getText());
        defensa = Double.parseDouble(tf_defensa_alumno1.getText());
        salud = Double.parseDouble(tf_salud_alumno1.getText());
        puntos = Double.parseDouble(tf_puntos_alumno1.getText());
        cuenta = Integer.parseInt(tf_cuenta_alumno1.getText());
        carrera  = tf_carrera_alumno1.getText();
        edad = Integer.parseInt(tf_edad_alumno1.getText());
        lista_alumnos.add(new Alumnos(cuenta, carrera, edad, nombre, nickaname, ataque, defensa, salud, puntos));
        Alumnos al = new Alumnos();
        al.setNombre(nombre);
        al.setNickname(nickaname);
        al.setAtaque(ataque);
        al.setDefensa(defensa);
        al.setSalud(salud);
        al.setPuntos(puntos);
        al.setCuenta(cuenta);
        al.setCarrera(carrera);
        al.setEdad(edad);
    }//GEN-LAST:event_bt_guardar_alumno1MouseClicked

    private void eliminar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_alumnoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)tabla_alumno.getModel();
        modelo.removeRow(tabla_alumno.getSelectedRow());
        lista_alumnos.remove(tabla_alumno.getSelectedRowCount());
        tabla_alumno.setModel(modelo);
    }//GEN-LAST:event_eliminar_alumnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jd_guerrero.setModal(true);
        this.jd_guerrero.pack();
        this.jd_guerrero.setLocationRelativeTo(this);
        this.jd_guerrero.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public void Guardar(ArrayList lista) {
        try {
            FileOutputStream archivotxt = new FileOutputStream("./usuario.cbm");
            ObjectOutputStream pollo = new ObjectOutputStream(archivotxt);
            pollo.writeObject(lista);
            pollo.close();
        } catch (IOException ex) {
        }
    }

    public void Abrir() {
        try {
            FileInputStream entrada = new FileInputStream("./usuario.cbm");
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try {
                lista= (ArrayList<Guerrero>)objeto.readObject();
            } catch (ClassNotFoundException ex) {
            }
        } catch (IOException ex) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_guardar_alumno;
    private javax.swing.JButton bt_guardar_alumno1;
    private javax.swing.JButton bt_guardar_dragon;
    private javax.swing.JButton bt_guardar_dragon1;
    private javax.swing.JButton bt_guardar_fenix;
    private javax.swing.JButton bt_guardar_hl;
    private javax.swing.JMenuItem eliminar_alumno;
    private javax.swing.JMenuItem eliminar_bestia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JDialog jd_guerrero;
    private javax.swing.JDialog jd_modificar_alumno;
    private javax.swing.JDialog jd_modificar_bestia;
    private javax.swing.JMenuItem modificar_alumno;
    private javax.swing.JMenuItem modificar_bestia;
    private javax.swing.JPopupMenu pp_alumnos;
    private javax.swing.JPopupMenu pp_bestia;
    private javax.swing.JTable tabla_alumno;
    private javax.swing.JTable tabla_bestias;
    private javax.swing.JTextField tf_ataque_alumno;
    private javax.swing.JTextField tf_ataque_alumno1;
    private javax.swing.JTextField tf_ataque_bestia;
    private javax.swing.JTextField tf_ataque_dragon;
    private javax.swing.JTextField tf_ataque_fenix;
    private javax.swing.JTextField tf_ataque_hl;
    private javax.swing.JTextField tf_ataque_minotauro;
    private javax.swing.JTextField tf_carrera_alumno;
    private javax.swing.JTextField tf_carrera_alumno1;
    private javax.swing.JTextField tf_cuenta_alumno;
    private javax.swing.JTextField tf_cuenta_alumno1;
    private javax.swing.JTextField tf_defensa_alumno;
    private javax.swing.JTextField tf_defensa_alumno1;
    private javax.swing.JTextField tf_defensa_bestia;
    private javax.swing.JTextField tf_defensa_dragon;
    private javax.swing.JTextField tf_defensa_fenix;
    private javax.swing.JTextField tf_defensa_hl;
    private javax.swing.JTextField tf_defensa_minotauro;
    private javax.swing.JTextField tf_edad_alumno;
    private javax.swing.JTextField tf_edad_alumno1;
    private javax.swing.JTextField tf_nickname_alumno;
    private javax.swing.JTextField tf_nickname_alumno1;
    private javax.swing.JTextField tf_nickname_bestia;
    private javax.swing.JTextField tf_nickname_dragon;
    private javax.swing.JTextField tf_nickname_fenix;
    private javax.swing.JTextField tf_nickname_hl;
    private javax.swing.JTextField tf_nickname_minotauro;
    private javax.swing.JTextField tf_nombre_alumno;
    private javax.swing.JTextField tf_nombre_alumno1;
    private javax.swing.JTextField tf_nombre_bestia;
    private javax.swing.JTextField tf_nombre_dragon;
    private javax.swing.JTextField tf_nombre_fenix;
    private javax.swing.JTextField tf_nombre_hl;
    private javax.swing.JTextField tf_nombre_minotauro;
    private javax.swing.JTextField tf_puntos_alumno;
    private javax.swing.JTextField tf_puntos_alumno1;
    private javax.swing.JTextField tf_puntos_bestia;
    private javax.swing.JTextField tf_puntos_dragon;
    private javax.swing.JTextField tf_puntos_fenix;
    private javax.swing.JTextField tf_puntos_hl;
    private javax.swing.JTextField tf_puntos_minotauro;
    private javax.swing.JTextField tf_salud_alumno;
    private javax.swing.JTextField tf_salud_alumno1;
    private javax.swing.JTextField tf_salud_bestia;
    private javax.swing.JTextField tf_salud_dragon;
    private javax.swing.JTextField tf_salud_fenix;
    private javax.swing.JTextField tf_salud_hl;
    private javax.swing.JTextField tf_salud_minotauro;
    // End of variables declaration//GEN-END:variables
    ArrayList lista = new ArrayList();
    ArrayList<Alumnos> lista_alumnos = new ArrayList();
}
