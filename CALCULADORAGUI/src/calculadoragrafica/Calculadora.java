/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragrafica;

import javax.swing.JTextArea;

/**
 *
 * @author TabSan
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButton_percent = new javax.swing.JButton();
        jButton_c = new javax.swing.JButton();
        jButton_del = new javax.swing.JButton();
        jButton_div = new javax.swing.JButton();
        jButton_per = new javax.swing.JButton();
        jButton_minus = new javax.swing.JButton();
        jButton_plus = new javax.swing.JButton();
        jButton_equal = new javax.swing.JButton();
        jButton_2 = new javax.swing.JButton();
        jButton_3 = new javax.swing.JButton();
        jButton_1 = new javax.swing.JButton();
        jButton_4 = new javax.swing.JButton();
        jButton_5 = new javax.swing.JButton();
        jButton_6 = new javax.swing.JButton();
        jButton_7 = new javax.swing.JButton();
        jButton_8 = new javax.swing.JButton();
        jButton_9 = new javax.swing.JButton();
        jButton_0 = new javax.swing.JButton();
        jButton_dot = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton_percent.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_percent.setForeground(new java.awt.Color(0, 0, 0));
        jButton_percent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_percent.setText("%");
        jButton_percent.setBorder(null);
        jButton_percent.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_percent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_percent.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_percent.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_percent.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_percentActionPerformed(evt);
            }
        });

        jButton_c.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_c.setForeground(new java.awt.Color(0, 0, 0));
        jButton_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_c.setText("C");
        jButton_c.setBorder(null);
        jButton_c.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_c.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cActionPerformed(evt);
            }
        });

        jButton_del.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_del.setForeground(new java.awt.Color(0, 0, 0));
        jButton_del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_del.setText("DEL");
        jButton_del.setBorder(null);
        jButton_del.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_del.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_del.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_del.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_del.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delActionPerformed(evt);
            }
        });

        jButton_div.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_div.setForeground(new java.awt.Color(0, 0, 0));
        jButton_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_div.setText("/");
        jButton_div.setBorder(null);
        jButton_div.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_div.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_div.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_divActionPerformed(evt);
            }
        });

        jButton_per.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_per.setForeground(new java.awt.Color(0, 0, 0));
        jButton_per.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_per.setText("x");
        jButton_per.setBorder(null);
        jButton_per.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_per.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_per.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_per.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_per.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_per.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_perActionPerformed(evt);
            }
        });

        jButton_minus.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_minus.setForeground(new java.awt.Color(0, 0, 0));
        jButton_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_minus.setText("-");
        jButton_minus.setBorder(null);
        jButton_minus.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_minus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_minus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_minus.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_minusActionPerformed(evt);
            }
        });

        jButton_plus.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_plus.setForeground(new java.awt.Color(0, 0, 0));
        jButton_plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_plus.setText("+");
        jButton_plus.setBorder(null);
        jButton_plus.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_plus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_plus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_plus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_plus.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_plusActionPerformed(evt);
            }
        });

        jButton_equal.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_equal.setForeground(new java.awt.Color(0, 0, 0));
        jButton_equal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3.png"))); // NOI18N
        jButton_equal.setText("=");
        jButton_equal.setBorder(null);
        jButton_equal.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_equal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_equal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_equal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_equal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_equalActionPerformed(evt);
            }
        });

        jButton_2.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_2.setForeground(new java.awt.Color(0, 0, 0));
        jButton_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_2.setText("2");
        jButton_2.setBorder(null);
        jButton_2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_2ActionPerformed(evt);
            }
        });

        jButton_3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_3.setForeground(new java.awt.Color(0, 0, 0));
        jButton_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_3.setText("3");
        jButton_3.setBorder(null);
        jButton_3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3ActionPerformed(evt);
            }
        });

        jButton_1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_1.setText("1");
        jButton_1.setBorder(null);
        jButton_1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1ActionPerformed(evt);
            }
        });

        jButton_4.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_4.setForeground(new java.awt.Color(0, 0, 0));
        jButton_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_4.setText("4");
        jButton_4.setBorder(null);
        jButton_4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_4ActionPerformed(evt);
            }
        });

        jButton_5.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_5.setForeground(new java.awt.Color(0, 0, 0));
        jButton_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_5.setText("5");
        jButton_5.setBorder(null);
        jButton_5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_5ActionPerformed(evt);
            }
        });

        jButton_6.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_6.setForeground(new java.awt.Color(0, 0, 0));
        jButton_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_6.setText("6");
        jButton_6.setBorder(null);
        jButton_6.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_6ActionPerformed(evt);
            }
        });

        jButton_7.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_7.setForeground(new java.awt.Color(0, 0, 0));
        jButton_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_7.setText("7");
        jButton_7.setBorder(null);
        jButton_7.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_7ActionPerformed(evt);
            }
        });

        jButton_8.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_8.setForeground(new java.awt.Color(0, 0, 0));
        jButton_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_8.setText("8");
        jButton_8.setBorder(null);
        jButton_8.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_8ActionPerformed(evt);
            }
        });

        jButton_9.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_9.setForeground(new java.awt.Color(0, 0, 0));
        jButton_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_9.setText("9");
        jButton_9.setBorder(null);
        jButton_9.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_9ActionPerformed(evt);
            }
        });

        jButton_0.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_0.setForeground(new java.awt.Color(0, 0, 0));
        jButton_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_0.setText("0");
        jButton_0.setBorder(null);
        jButton_0.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_0.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_0ActionPerformed(evt);
            }
        });

        jButton_dot.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_dot.setForeground(new java.awt.Color(0, 0, 0));
        jButton_dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_dot.setText(".");
        jButton_dot.setBorder(null);
        jButton_dot.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_dot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton_dot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton_dot.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_c)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_del)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_percent))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_4)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_5)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_0)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_dot)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_equal)
                    .addComponent(jButton_plus)
                    .addComponent(jButton_minus)
                    .addComponent(jButton_per)
                    .addComponent(jButton_div))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_c)
                    .addComponent(jButton_del)
                    .addComponent(jButton_percent)
                    .addComponent(jButton_div))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_7)
                        .addComponent(jButton_8)
                        .addComponent(jButton_9))
                    .addComponent(jButton_per))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_4)
                        .addComponent(jButton_5)
                        .addComponent(jButton_6))
                    .addComponent(jButton_minus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_1)
                        .addComponent(jButton_2)
                        .addComponent(jButton_3))
                    .addComponent(jButton_plus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_equal)
                    .addComponent(jButton_0)
                    .addComponent(jButton_dot))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtOperacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(0, 0, 0));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(0, 0, 0));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_percentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_percentActionPerformed

    private void jButton_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cActionPerformed
        // TODO add your handling code here:
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_jButton_cActionPerformed

    private void jButton_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_delActionPerformed

    private void jButton_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_divActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_divActionPerformed

    private void jButton_perActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_perActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_perActionPerformed

    private void jButton_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_minusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_minusActionPerformed

    private void jButton_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_plusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_plusActionPerformed

    private void jButton_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_equalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_equalActionPerformed

    private void jButton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_2ActionPerformed

    private void jButton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_3ActionPerformed

    private void jButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_1ActionPerformed

    private void jButton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_4ActionPerformed

    private void jButton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_5ActionPerformed

    private void jButton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_6ActionPerformed

    private void jButton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_7ActionPerformed

    private void jButton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_8ActionPerformed

    private void jButton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_9ActionPerformed

    private void jButton_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_0ActionPerformed
        // TODO add your handling code here:
        addNumero("0");
        jButton_equal.doClick();
    }//GEN-LAST:event_jButton_0ActionPerformed

    private void jButton_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_dotActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        

        public void addNumero(String digito) {
            txtOperacion.setText(txtOperacion.getText() + digito);
        }

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
        }
        catch (ClassNotFoundException ex


            ) {
                java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex


            ) {
                java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex


            ) {
                java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex


            ) {
                java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater ( new Runnable() {


            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_0;
    private javax.swing.JButton jButton_1;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_6;
    private javax.swing.JButton jButton_7;
    private javax.swing.JButton jButton_8;
    private javax.swing.JButton jButton_9;
    private javax.swing.JButton jButton_c;
    private javax.swing.JButton jButton_del;
    private javax.swing.JButton jButton_div;
    private javax.swing.JButton jButton_dot;
    private javax.swing.JButton jButton_equal;
    private javax.swing.JButton jButton_minus;
    private javax.swing.JButton jButton_per;
    private javax.swing.JButton jButton_percent;
    private javax.swing.JButton jButton_plus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
