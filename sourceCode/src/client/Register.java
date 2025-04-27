/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;

/**
 *
 * @author loukmane04
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */   
    public Register() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icons/applogo.png")).getImage());
    }
    Functions function = new Functions();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        Rgisterbtn = new javax.swing.JButton();
        professional_id = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        colse = new javax.swing.JButton();
        fialed_login = new javax.swing.JLabel();
        minimize = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        specialty = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QuickLab Login");
        setMinimumSize(new java.awt.Dimension(1120, 630));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(560, 630));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 630));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg-login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        jPanel2.setBackground(new java.awt.Color(0, 115, 194));
        jPanel2.setMinimumSize(new java.awt.Dimension(560, 630));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Register");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 560, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hello! Let's start your workday.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 570, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 204, 255));
        jLabel18.setText("First name");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 204, 255));
        jLabel14.setText("Passoword");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, 20));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-30.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 60, 40));

        hide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-invisible-30.png"))); // NOI18N
        hide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        jPanel2.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 60, 40));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eye-30.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 60, 40));

        Rgisterbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Rgisterbtn.setForeground(new java.awt.Color(0, 115, 194));
        Rgisterbtn.setText("register");
        Rgisterbtn.setBorder(null);
        Rgisterbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rgisterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RgisterbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Rgisterbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 400, 50));
        Rgisterbtn.setFocusPainted(false);
        Rgisterbtn.setBorderPainted(false);
        Rgisterbtn.setContentAreaFilled(false);
        Rgisterbtn.setOpaque(true);
        Rgisterbtn.setBackground(new Color(255, 255, 255)); // Set default background to white

        Rgisterbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Rgisterbtn.setBackground(new Color(240,240,240)); // Change to light gray on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Rgisterbtn.setBackground(new Color(255, 255, 255)); // Revert to white when not hovered
            }
        });

        professional_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        professional_id.setForeground(new java.awt.Color(0, 115, 194));
        professional_id.setActionCommand("<Not Set>");
        professional_id.setBorder(null);
        professional_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professional_idActionPerformed(evt);
            }
        });
        jPanel2.add(professional_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 340, 40));
        Color customBlue = new Color(0, 115, 194);

        jPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanel1.requestFocusInWindow();  // Request focus when panel is clicked
            }
        });
        jPanel1.setFocusable(true);  // Make the panel focusable

        jPanel2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanel2.requestFocusInWindow();  // Request focus when panel is clicked
            }
        });
        jPanel2.setFocusable(true);  // Make the panel focusable

        // Set initial properties for professional_id
        professional_id.setBackground(customBlue);
        professional_id.setForeground(Color.WHITE);
        professional_id.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)));

    // Focus listener for professional_id
    //username.addFocusListener(new FocusAdapter() {
        //@Override
        // public void focusGained(FocusEvent e) {
            //   professional_id.setBackground(Color.WHITE);
            //   professional_id.setBorder(BorderFactory.createCompoundBorder(
                //            BorderFactory.createMatteBorder(0, 0, 2, 0, customBlue),
                //           BorderFactory.createEmptyBorder(5, 10, 5, 10)));
        //  }

    //  @Override
    //    public void focusLost(FocusEvent e) {
        //     professional_id.setBackground(customBlue);
        //     professional_id.setForeground(Color.WHITE);
        //     professional_id.setBorder(BorderFactory.createCompoundBorder(
            //             BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
            //              BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    //    }
    //  });

    // Document listener to update text color dynamically
    //  professional_id.getDocument().addDocumentListener(new DocumentListener() {
        //     void updateTextColor() {
            //       if (professional_id.getText().isEmpty()) {
                //          professional_id.setForeground(Color.WHITE);
                //      } else {
                //          professional_id.setForeground(customBlue);
                //      }
            //    }

        //      @Override
        //      public void insertUpdate(DocumentEvent e) {
            //         updateTextColor();
            //    }
        //
        //    @Override
        //    public void removeUpdate(DocumentEvent e) {
            //        updateTextColor();
            //    }

        //    @Override
        //   public void changedUpdate(DocumentEvent e) {
            //       updateTextColor();
            //   }
        //    });

password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
password.setForeground(new java.awt.Color(0, 115, 194));
password.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        passwordActionPerformed(evt);
    }
    });
    jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 340, 40));
    jPanel1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            jPanel1.requestFocusInWindow();  // Request focus when panel is clicked
        }
    });
    jPanel1.setFocusable(true);  // Make the panel focusable

    jPanel2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            jPanel2.requestFocusInWindow();  // Request focus when panel is clicked
        }
    });
    jPanel2.setFocusable(true);  // Make the panel focusable

    // Set initial properties for professional_id
    password.setBackground(customBlue);
    password.setForeground(Color.WHITE);
    password.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
        BorderFactory.createEmptyBorder(5, 10, 5, 10)));

// Focus listener for professional_id
//    password.addFocusListener(new FocusAdapter() {
    //     @Override
    //      public void focusGained(FocusEvent e) {
        //        password.setBackground(Color.WHITE);
        //         password.setBorder(BorderFactory.createCompoundBorder(
            //                BorderFactory.createMatteBorder(0, 0, 2, 0, customBlue),
            //                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    //       }

    //      @Override
    //      public void focusLost(FocusEvent e) {
        //           password.setBackground(customBlue);
        //        password.setForeground(Color.WHITE);
        //          password.setBorder(BorderFactory.createCompoundBorder(
            //                  BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
            //                   BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    //       }
    //    });

    // Document listener to update text color dynamically
    //     password.getDocument().addDocumentListener(new DocumentListener() {
        //        void updateTextColor() {
            //            if (password.getText().isEmpty()) {
                //                password.setForeground(Color.WHITE);
                //           } else {
                //               password.setForeground(customBlue);
                //          }
            //      }

        //       @Override
        //        public void insertUpdate(DocumentEvent e) {
            //          updateTextColor();
            //       }

        //     @Override
        //     public void removeUpdate(DocumentEvent e) {
            //          updateTextColor();
            //       }

        //       @Override
        //       public void changedUpdate(DocumentEvent e) {
            //           updateTextColor();
            //       }
        //    });

colse.setBackground(new java.awt.Color(0, 115, 194));
colse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-30.png"))); // NOI18N
colse.setBorder(null);
colse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
colse.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        colseActionPerformed(evt);
    }
    });
    jPanel2.add(colse, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 5, 40, 40));
    colse.setFocusPainted(false);
    colse.setBorderPainted(false);
    colse.setContentAreaFilled(false);
    colse.setOpaque(true);

    fialed_login.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
    fialed_login.setForeground(new java.awt.Color(255, 175, 168));
    fialed_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    fialed_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerant icons/icons8-attention-20.png"))); // NOI18N
    fialed_login.setText("Email ou mot de passe incorrect.");
    jPanel2.add(fialed_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 400, 40));
    fialed_login.setVisible(false);

    minimize.setBackground(new java.awt.Color(0, 115, 194));
    minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gerant icons/icons8-minimize-30.png"))); // NOI18N
    minimize.setBorder(null);
    minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    minimize.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            minimizeActionPerformed(evt);
        }
    });
    jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 5, 40, 40));
    minimize.setFocusPainted(false);
    minimize.setBorderPainted(false);
    minimize.setContentAreaFilled(false);
    minimize.setOpaque(true);

    email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    email.setForeground(new java.awt.Color(0, 115, 194));
    email.setActionCommand("<Not Set>");
    email.setBorder(null);
    email.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            emailActionPerformed(evt);
        }
    });
    jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 340, 40));
    Color emailBlue = new Color(0, 115, 194);

    jPanel1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            jPanel1.requestFocusInWindow();  // Request focus when panel is clicked
        }
    });
    jPanel1.setFocusable(true);  // Make the panel focusable

    jPanel2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            jPanel2.requestFocusInWindow();  // Request focus when panel is clicked
        }
    });
    jPanel2.setFocusable(true);  // Make the panel focusable

    // Set initial properties for email
    email.setBackground(emailBlue);
    email.setForeground(Color.WHITE);
    email.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
        BorderFactory.createEmptyBorder(5, 10, 5, 10)));

// If you later decide to uncomment and reuse the focus or document listeners,
// replace `customBlue` with `emailBlue` there too.

// Focus listener for email
// email.addFocusListener(new FocusAdapter() {
    //     @Override
    //     public void focusGained(FocusEvent e) {
        //         email.setBackground(Color.WHITE);
        //         email.setBorder(BorderFactory.createCompoundBorder(
            //                 BorderFactory.createMatteBorder(0, 0, 2, 0, emailBlue),
            //                 BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    //     }
    //
    //     @Override
    //     public void focusLost(FocusEvent e) {
        //         email.setBackground(emailBlue);
        //         email.setForeground(Color.WHITE);
        //         email.setBorder(BorderFactory.createCompoundBorder(
            //                 BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
            //                 BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    //     }
    // });

    // Document listener to update text color dynamically
    // email.getDocument().addDocumentListener(new DocumentListener() {
        //     void updateTextColor() {
            //         if (email.getText().isEmpty()) {
                //             email.setForeground(Color.WHITE);
                //         } else {
                //             email.setForeground(emailBlue);
                //         }
            //     }
        //
        //     @Override
        //     public void insertUpdate(DocumentEvent e) {
            //         updateTextColor();
            //     }
        //
        //     @Override
        //     public void removeUpdate(DocumentEvent e) {
            //         updateTextColor();
            //     }
        //
        //     @Override
        //     public void changedUpdate(DocumentEvent e) {
            //         updateTextColor();
            //     }
        // });

jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
jLabel19.setForeground(new java.awt.Color(153, 204, 255));
jLabel19.setText("specialty");
jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

firstName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
firstName.setForeground(new java.awt.Color(0, 115, 194));
firstName.setActionCommand("<Not Set>");
firstName.setBorder(null);
firstName.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        firstNameActionPerformed(evt);
    }
    });
    jPanel2.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 340, 40));
    Color firstBlue = new Color(0, 115, 194);

    jPanel1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            jPanel1.requestFocusInWindow();  // Request focus when panel is clicked
        }
    });
    jPanel1.setFocusable(true);  // Make the panel focusable

    jPanel2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            jPanel2.requestFocusInWindow();  // Request focus when panel is clicked
        }
    });
    jPanel2.setFocusable(true);  // Make the panel focusable

    // Set initial properties for firstName
    firstName.setBackground(firstBlue);
    firstName.setForeground(Color.WHITE);
    firstName.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
        BorderFactory.createEmptyBorder(5, 10, 5, 10)));

// Focus listener for firstName
//firstName.addFocusListener(new FocusAdapter() {
    //    @Override
    //    public void focusGained(FocusEvent e) {
        //        firstName.setBackground(Color.WHITE);
        //        firstName.setBorder(BorderFactory.createCompoundBorder(
            //                BorderFactory.createMatteBorder(0, 0, 2, 0, customBlue),
            //                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    //    }
    //
    //    @Override
    //    public void focusLost(FocusEvent e) {
        //        firstName.setBackground(customBlue);
        //        firstName.setForeground(Color.WHITE);
        //        firstName.setBorder(BorderFactory.createCompoundBorder(
            //                BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
            //                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    //    }
    //});

    // Document listener to update text color dynamically
    //firstName.getDocument().addDocumentListener(new DocumentListener() {
        //    void updateTextColor() {
            //        if (firstName.getText().isEmpty()) {
                //            firstName.setForeground(Color.WHITE);
                //        } else {
                //            firstName.setForeground(customBlue);
                //        }
            //    }
        //
        //    @Override
        //    public void insertUpdate(DocumentEvent e) {
            //        updateTextColor();
            //    }
        //
        //    @Override
        //    public void removeUpdate(DocumentEvent e) {
            //        updateTextColor();
            //    }
        //
        //    @Override
        //    public void changedUpdate(DocumentEvent e) {
            //        updateTextColor();
            //    }
        //});

lastname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
lastname.setForeground(new java.awt.Color(0, 115, 194));
lastname.setActionCommand("<Not Set>");
lastname.setBorder(null);
lastname.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        lastnameActionPerformed(evt);
    }
    });
    jPanel2.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 340, 40));
    Color lastBlue = new Color(0, 115, 194);

    jPanel1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            jPanel1.requestFocusInWindow();  // Request focus when panel is clicked
        }
    });
    jPanel1.setFocusable(true);  // Make the panel focusable

    jPanel2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            jPanel2.requestFocusInWindow();  // Request focus when panel is clicked
        }
    });
    jPanel2.setFocusable(true);  // Make the panel focusable

    // Set initial properties for lastname
    lastname.setBackground(lastBlue);
    lastname.setForeground(Color.WHITE);
    lastname.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
        BorderFactory.createEmptyBorder(5, 10, 5, 10)));

// Focus listener for lastname
//lastname.addFocusListener(new FocusAdapter() {
    //    @Override
    //    public void focusGained(FocusEvent e) {
        //        lastname.setBackground(Color.WHITE);
        //        lastname.setBorder(BorderFactory.createCompoundBorder(
            //                BorderFactory.createMatteBorder(0, 0, 2, 0, customBlue),
            //                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    //    }
    //
    //    @Override
    //    public void focusLost(FocusEvent e) {
        //        lastname.setBackground(customBlue);
        //        lastname.setForeground(Color.WHITE);
        //        lastname.setBorder(BorderFactory.createCompoundBorder(
            //                BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
            //                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    //    }
    //});

    // Document listener to update text color dynamically
    //lastname.getDocument().addDocumentListener(new DocumentListener() {
        //    void updateTextColor() {
            //        if (lastname.getText().isEmpty()) {
                //            lastname.setForeground(Color.WHITE);
                //        } else {
                //            lastname.setForeground(customBlue);
                //        }
            //    }
        //
        //    @Override
        //    public void insertUpdate(DocumentEvent e) {
            //        updateTextColor();
            //    }
        //
        //    @Override
        //    public void removeUpdate(DocumentEvent e) {
            //        updateTextColor();
            //    }
        //
        //    @Override
        //    public void changedUpdate(DocumentEvent e) {
            //        updateTextColor();
            //    }
        //});

jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
jLabel20.setForeground(new java.awt.Color(153, 204, 255));
jLabel20.setText("Professional id");
jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
jLabel21.setForeground(new java.awt.Color(153, 204, 255));
jLabel21.setText("Last name");
jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

specialty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
specialty.setForeground(new java.awt.Color(0, 115, 194));
specialty.setActionCommand("<Not Set>");
specialty.setBorder(null);
specialty.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        specialtyActionPerformed(evt);
    }
    });
    jPanel2.add(specialty, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 340, 40));
    Color specialtyBlue = new Color(0, 115, 194);

    jPanel1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            jPanel1.requestFocusInWindow();  // Request focus when panel is clicked
        }
    });
    jPanel1.setFocusable(true);  // Make the panel focusable

    jPanel2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            jPanel2.requestFocusInWindow();  // Request focus when panel is clicked
        }
    });
    jPanel2.setFocusable(true);  // Make the panel focusable

    // Set initial properties for specialty
    specialty.setBackground(specialtyBlue);
    specialty.setForeground(Color.WHITE);
    specialty.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
        BorderFactory.createEmptyBorder(5, 10, 5, 10)));

// If you later decide to uncomment and reuse the focus or document listeners,
// replace `specialtyBlue` with `specialtyBlue` there too.

// Focus listener for specialty
// specialty.addFocusListener(new FocusAdapter() {
    //     @Override
    //     public void focusGained(FocusEvent e) {
        //         specialty.setBackground(Color.WHITE);
        //         specialty.setBorder(BorderFactory.createCompoundBorder(
            //                 BorderFactory.createMatteBorder(0, 0, 2, 0, specialtyBlue),
            //                 BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    //     }
    //
    //     @Override
    //     public void focusLost(FocusEvent e) {
        //         specialty.setBackground(specialtyBlue);
        //         specialty.setForeground(Color.WHITE);
        //         specialty.setBorder(BorderFactory.createCompoundBorder(
            //                 BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
            //                 BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    //     }
    // });

    // Document listener to update text color dynamically
    // specialty.getDocument().addDocumentListener(new DocumentListener() {
        //     void updateTextColor() {
            //         if (specialty.getText().isEmpty()) {
                //             specialty.setForeground(Color.WHITE);
                //         } else {
                //             specialty.setForeground(specialtyBlue);
                //         }
            //     }
        //
        //     @Override
        //     public void insertUpdate(DocumentEvent e) {
            //         updateTextColor();
            //     }
        //
        //     @Override
        //     public void removeUpdate(DocumentEvent e) {
            //         updateTextColor();
            //     }
        //
        //     @Override
        //     public void changedUpdate(DocumentEvent e) {
            //         updateTextColor();
            //     }
        // });

jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
jLabel22.setForeground(new java.awt.Color(153, 204, 255));
jLabel22.setText("Email");
jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, -10, 560, 770));

setSize(new java.awt.Dimension(1120, 757));
setLocationRelativeTo(null);
}// </editor-fold>//GEN-END:initComponents

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked

        password.setEchoChar((char)0);
        hide.setVisible(false);
        hide.setEnabled(false);
        show.setVisible(true);
        show.setEnabled(true);

    }//GEN-LAST:event_hideMouseClicked

    private void RgisterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RgisterbtnActionPerformed
            
        // Get input values
        String firstname = this.firstName.getText().trim();
        String lastName = this.lastname.getText().trim();
        String Email = this.email.getText().trim();
        String Specialty = this.specialty.getText().trim();
        String professionalId = this.professional_id.getText().trim();
        String Password = new String(this.password.getPassword()).trim();

        // Validate fields
        if (firstname.isEmpty() || lastName.isEmpty() || Email.isEmpty() || 
            Specialty.isEmpty() || professionalId.isEmpty() || Password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate email format
        if (!Email.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(this, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Call registration function
        try {
            Functions.register(firstname, lastName, Email, Specialty, professionalId, Password);
            JOptionPane.showMessageDialog(this, "Registration request sent for approval", "Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose(); // Close registration window
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Registration failed: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
   
    // Call function to register and handle the server response
    }//GEN-LAST:event_RgisterbtnActionPerformed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked

        password.setEchoChar((char)8226);
        hide.setVisible(true);
        hide.setEnabled(true);
        show.setVisible(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void professional_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professional_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professional_idActionPerformed

    private void colseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colseActionPerformed

        System.exit(0);
    }//GEN-LAST:event_colseActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
      //  setExtendedState(getExtendedState() | Gérer_Analyse_Medicale.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void specialtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specialtyActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rgisterbtn;
    private javax.swing.JButton colse;
    private javax.swing.JTextField email;
    private javax.swing.JLabel fialed_login;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastname;
    private javax.swing.JButton minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField professional_id;
    private javax.swing.JLabel show;
    private javax.swing.JTextField specialty;
    // End of variables declaration//GEN-END:variables
}
