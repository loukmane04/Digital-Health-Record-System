/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author belma
 */
public class RegisterNewPatient extends javax.swing.JFrame {

    /**
     * Creates new form Medecin
     */
    public RegisterNewPatient() {
        setIconImage(new ImageIcon(getClass().getResource("/icons/applogo.png")).getImage());
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        RegisterNewPatient2 = new javax.swing.JButton();
        ViewPatientRecord2 = new javax.swing.JButton();
        CreatePrescription2 = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        AddConsultation2 = new javax.swing.JButton();
        RecordVaccination2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        birthday = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        social_security_number = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        minimize = new javax.swing.JButton();
        colse = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QuickLab");
        setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 98, 166));
        jPanel4.setPreferredSize(new java.awt.Dimension(320, 1000));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterNewPatient2.setBackground(new java.awt.Color(0, 120, 200));
        RegisterNewPatient2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegisterNewPatient2.setForeground(new java.awt.Color(255, 255, 255));
        RegisterNewPatient2.setText("Register a New Patient");
        RegisterNewPatient2.setToolTipText("");
        RegisterNewPatient2.setBorder(null);
        RegisterNewPatient2.setBorderPainted(false);
        RegisterNewPatient2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterNewPatient2.setDoubleBuffered(true);
        RegisterNewPatient2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegisterNewPatient2.setIconTextGap(50);
        RegisterNewPatient2.setName(""); // NOI18N
        RegisterNewPatient2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RegisterNewPatient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterNewPatient2ActionPerformed(evt);
            }
        });
        jPanel4.add(RegisterNewPatient2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 320, 70));
        RegisterNewPatient2.setFocusPainted(false);
        RegisterNewPatient2.setBorderPainted(false);
        RegisterNewPatient2.setContentAreaFilled(false);
        RegisterNewPatient2.setOpaque(true);

        RegisterNewPatient2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                RegisterNewPatient2.setBackground(new Color(23,142,224)); // Darker blue when mouse hovers
            }

            @Override
            public void mouseExited(MouseEvent e) {
                RegisterNewPatient2.setBackground(new Color(0, 105, 170)); // Original color when mouse not hovering
            }
        });

        ViewPatientRecord2.setBackground(new java.awt.Color(0, 105, 170));
        ViewPatientRecord2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ViewPatientRecord2.setForeground(new java.awt.Color(255, 255, 255));
        ViewPatientRecord2.setText("View Patient Record");
        ViewPatientRecord2.setBorder(null);
        ViewPatientRecord2.setBorderPainted(false);
        ViewPatientRecord2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewPatientRecord2.setDoubleBuffered(true);
        ViewPatientRecord2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ViewPatientRecord2.setIconTextGap(50);
        ViewPatientRecord2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ViewPatientRecord2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPatientRecord2ActionPerformed(evt);
            }
        });
        jPanel4.add(ViewPatientRecord2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 320, 70));
        ViewPatientRecord2.setFocusPainted(false);
        ViewPatientRecord2.setBorderPainted(false);
        ViewPatientRecord2.setContentAreaFilled(false);
        ViewPatientRecord2.setOpaque(true);

        ViewPatientRecord2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ViewPatientRecord2.setBackground(new Color(23,142,224)); // Darker blue when mouse hovers
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ViewPatientRecord2.setBackground(new Color(0, 105, 170)); // Original color when mouse not hovering
            }
        });

        CreatePrescription2.setBackground(new java.awt.Color(0, 105, 170));
        CreatePrescription2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CreatePrescription2.setForeground(new java.awt.Color(255, 255, 255));
        CreatePrescription2.setText("Create Prescription");
        CreatePrescription2.setBorder(null);
        CreatePrescription2.setBorderPainted(false);
        CreatePrescription2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreatePrescription2.setDoubleBuffered(true);
        CreatePrescription2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CreatePrescription2.setIconTextGap(50);
        CreatePrescription2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CreatePrescription2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePrescription2ActionPerformed(evt);
            }
        });
        jPanel4.add(CreatePrescription2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 320, 70));
        CreatePrescription2.setFocusPainted(false);
        CreatePrescription2.setBorderPainted(false);
        CreatePrescription2.setContentAreaFilled(false);
        CreatePrescription2.setOpaque(true);

        CreatePrescription2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                CreatePrescription2.setBackground(new Color(23,142,224)); // Darker blue when mouse hovers
            }

            @Override
            public void mouseExited(MouseEvent e) {
                CreatePrescription2.setBackground(new Color(0, 105, 170)); // Original color when mouse not hovering
            }
        });

        home.setBackground(new java.awt.Color(0, 105, 170));
        home.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.setToolTipText("");
        home.setBorder(null);
        home.setBorderPainted(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setDoubleBuffered(true);
        home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home.setIconTextGap(50);
        home.setName(""); // NOI18N
        home.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel4.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 320, 70));
        home.setFocusPainted(false);
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setOpaque(true);

        home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                home.setBackground(new Color(23,142,224)); // Darker blue when mouse hovers
            }

            @Override
            public void mouseExited(MouseEvent e) {
                home.setBackground(new Color(0, 120, 200)); // Original color when mouse not hovering
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Doctor");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 16));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 320, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerant icons/icons8-user-100.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 0, 150, 150));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 115, 194));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerant icons/icons8-log-out-30.png"))); // NOI18N
        logout.setText("Disconnect");
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setDoubleBuffered(true);
        logout.setIconTextGap(5);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel4.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 940, 220, 60));
        logout.setFocusPainted(false);
        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.setOpaque(true);
        logout.setBackground(new Color(255, 255, 255)); // Set default background to white

        logout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                logout.setBackground(new Color(240,240,240)); // Change to light gray on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                logout.setBackground(new Color(255, 255, 255)); // Revert to white when not hovered
            }
        });

        AddConsultation2.setBackground(new java.awt.Color(0, 105, 170));
        AddConsultation2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddConsultation2.setForeground(new java.awt.Color(255, 255, 255));
        AddConsultation2.setText("Add Consultation");
        AddConsultation2.setBorder(null);
        AddConsultation2.setBorderPainted(false);
        AddConsultation2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddConsultation2.setDoubleBuffered(true);
        AddConsultation2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddConsultation2.setIconTextGap(50);
        AddConsultation2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddConsultation2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddConsultation2ActionPerformed(evt);
            }
        });
        jPanel4.add(AddConsultation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 320, 70));
        CreatePrescription2.setFocusPainted(false);
        CreatePrescription2.setBorderPainted(false);
        CreatePrescription2.setContentAreaFilled(false);
        CreatePrescription2.setOpaque(true);

        CreatePrescription2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                CreatePrescription2.setBackground(new Color(23,142,224)); // Darker blue when mouse hovers
            }

            @Override
            public void mouseExited(MouseEvent e) {
                CreatePrescription2.setBackground(new Color(0, 105, 170)); // Original color when mouse not hovering
            }
        });

        RecordVaccination2.setBackground(new java.awt.Color(0, 105, 170));
        RecordVaccination2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RecordVaccination2.setForeground(new java.awt.Color(255, 255, 255));
        RecordVaccination2.setText("Record Vaccination");
        RecordVaccination2.setBorder(null);
        RecordVaccination2.setBorderPainted(false);
        RecordVaccination2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RecordVaccination2.setDoubleBuffered(true);
        RecordVaccination2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RecordVaccination2.setIconTextGap(50);
        RecordVaccination2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RecordVaccination2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordVaccination2ActionPerformed(evt);
            }
        });
        jPanel4.add(RecordVaccination2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 320, 70));
        CreatePrescription2.setFocusPainted(false);
        CreatePrescription2.setBorderPainted(false);
        CreatePrescription2.setContentAreaFilled(false);
        CreatePrescription2.setOpaque(true);

        CreatePrescription2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                CreatePrescription2.setBackground(new Color(23,142,224)); // Darker blue when mouse hovers
            }

            @Override
            public void mouseExited(MouseEvent e) {
                CreatePrescription2.setBackground(new Color(0, 105, 170)); // Original color when mouse not hovering
            }
        });

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 320, 1060));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMinimumSize(new java.awt.Dimension(1600, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerant icons/icons8-register-50.png"))); // NOI18N
        jLabel14.setText("Create Prescription");
        jLabel14.setIconTextGap(20);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 460, 60));

        birthday.setBackground(new java.awt.Color(0, 143, 253));
        jPanel1.add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 300, 60));

        email.setBackground(new java.awt.Color(0, 143, 253));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 300, 60));

        password.setBackground(new java.awt.Color(0, 143, 253));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 800, 300, 60));

        lastname.setBackground(new java.awt.Color(0, 143, 253));
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 300, 60));

        social_security_number.setBackground(new java.awt.Color(0, 143, 253));
        jPanel1.add(social_security_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 300, 60));

        firstname.setBackground(new java.awt.Color(0, 143, 253));
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 300, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 760, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("First name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Last name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Birth day");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Social security number");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, -1, -1));

        register.setBackground(new java.awt.Color(0, 120, 200));
        register.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerant icons/icons8-register-24.png"))); // NOI18N
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 920, 300, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 1600, 1060));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setBackground(new java.awt.Color(0, 0, 0));
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerant icons/icons8-minimize-30.png"))); // NOI18N
        minimize.setBorder(null);
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 0, 40, 40));
        minimize.setFocusPainted(false);
        minimize.setBorderPainted(false);
        minimize.setContentAreaFilled(false);
        minimize.setOpaque(true);

        minimize.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                minimize.setBackground(new Color(20,20,20)); // Darker blue when mouse hovers
            }

            @Override
            public void mouseExited(MouseEvent e) {
                minimize.setBackground(new Color(0, 0,0)); // Original color when mouse not hovering
            }
        });

        colse.setBackground(new java.awt.Color(0, 0, 0));
        colse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerant icons/icons8-close-30.png"))); // NOI18N
        colse.setBorder(null);
        colse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colseActionPerformed(evt);
            }
        });
        jPanel2.add(colse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 0, 40, 40));
        colse.setFocusPainted(false);
        colse.setBorderPainted(false);
        colse.setContentAreaFilled(false);
        colse.setOpaque(true);

        colse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                colse.setBackground(new Color(20,20,20)); // Darker blue when mouse hovers
            }

            @Override
            public void mouseExited(MouseEvent e) {
                colse.setBackground(new Color(0, 0,0)); // Original color when mouse not hovering
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("QuickLab");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 320, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 40));

        setSize(new java.awt.Dimension(1920, 1092));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterNewPatient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterNewPatient2ActionPerformed
        smoothTransition("client.Gérer_Analyse_Medicale", 1000);
    }//GEN-LAST:event_RegisterNewPatient2ActionPerformed

    private void ViewPatientRecord2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPatientRecord2ActionPerformed
        smoothTransition("client.Produit", 1000, "medecin");

    }//GEN-LAST:event_ViewPatientRecord2ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed

          smoothTransition("client.Doctor", 500);


    }//GEN-LAST:event_homeActionPerformed

    private void CreatePrescription2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePrescription2ActionPerformed
        smoothTransition("client.Dossier", 1000, "medecin");
    }//GEN-LAST:event_CreatePrescription2ActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        //setExtendedState(getExtendedState() | Gérer_Analyse_Medicale.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void colseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colseActionPerformed

        System.exit(0);
    }//GEN-LAST:event_colseActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void AddConsultation2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddConsultation2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddConsultation2ActionPerformed

    private void RecordVaccination2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordVaccination2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecordVaccination2ActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
       String fn = this.firstname.getText();
       String ln = this.lastname.getText();
       String em = this.email.getText();
       String bd = this.birthday.getText();
       String scn = this.social_security_number.getText();
       String ps = this.password.getText();
       
        // Validate fields
        if (fn.isEmpty() || ln.isEmpty() || em.isEmpty() || 
            bd.isEmpty() || scn.isEmpty() || ps.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validate email format
        if (!em.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(this, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
         // Call registration function
        try {
            Functions.registerpatient(fn, ln, em, bd, scn, ps);
            JOptionPane.showMessageDialog(this, "Registration request sent for approval", "Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose(); // Close registration window
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Registration failed: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
       
       
    }//GEN-LAST:event_registerActionPerformed
    
     public static void openProduit(){
    // Open Gerant frame
    
    java.awt.EventQueue.invokeLater(() -> {
       // new Produit("medecin").setVisible(true);
    });
     }
    
    public static void openGérerAnalyseMedicale(){
    // Open Gerant frame
    java.awt.EventQueue.invokeLater(() -> {
        //new Gérer_Analyse_Medicale().setVisible(true);
    });
     }
    
//By: OussamaDeV


private void smoothTransition(String windowName, int delayMilliseconds) {
    // Initialize the Timer outside the EventQueue.invokeLater call
    Timer timer = new Timer(delayMilliseconds, null);

    java.awt.EventQueue.invokeLater(() -> {
        try {
            // Dynamically create an instance of the specified window class
            Class<?> clazz = Class.forName(windowName);
            java.awt.Window window = (java.awt.Window) clazz.getDeclaredConstructor().newInstance();
            
            // Make the window visible
            window.setVisible(true);

            // Update the Timer's ActionListener here
            timer.addActionListener((e) -> {
                // Hide the current window after the delay
                setVisible(false);
                
                // Stop the Timer
                timer.stop();
            });

            // Start the Timer
            timer.start();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            // Handle any exceptions
            ex.printStackTrace();
        }
    });
}
    
    
private void smoothTransition(String windowName, int delayMilliseconds, Object... constructorArgs) {
    // Initialize the Timer outside the EventQueue.invokeLater call
    Timer timer = new Timer(delayMilliseconds, null);

    java.awt.EventQueue.invokeLater(() -> {
        try {
            // Dynamically create an instance of the specified window class
            Class<?> clazz = Class.forName(windowName);
            // Determine parameter types from constructorArgs
            Class<?>[] parameterTypes = new Class<?>[constructorArgs.length];
            for (int i = 0; i < constructorArgs.length; i++) {
                parameterTypes[i] = constructorArgs[i].getClass();
            }
            java.awt.Window window = (java.awt.Window) clazz.getDeclaredConstructor(parameterTypes).newInstance(constructorArgs);
            
            // Make the window visible
            window.setVisible(true);

            // Update the Timer's ActionListener here
            timer.addActionListener((e) -> {
                // Hide the current window after the delay
                setVisible(false);
                
                // Stop the Timer
                timer.stop();
            });

            // Start the Timer
            timer.start();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            // Handle any exceptions
            ex.printStackTrace();
        }
    });
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
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterNewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddConsultation2;
    private javax.swing.JButton CreatePrescription2;
    private javax.swing.JButton RecordVaccination2;
    private javax.swing.JButton RegisterNewPatient2;
    private javax.swing.JButton ViewPatientRecord2;
    private javax.swing.JTextField birthday;
    private javax.swing.JButton colse;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastname;
    private javax.swing.JButton logout;
    private javax.swing.JButton minimize;
    private javax.swing.JTextField password;
    private javax.swing.JButton register;
    private javax.swing.JTextField social_security_number;
    // End of variables declaration//GEN-END:variables
}
