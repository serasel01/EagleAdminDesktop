/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Dialogs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mycompany.eagle.Entities.ListOfQuestions;
import com.mycompany.eagle.Entities.ListOfSubjects;
import com.mycompany.eagle.Entities.Question;
import com.mycompany.eagle.Utilities.FirebaseCaller;
import com.mycompany.eagle.Utilities.GoogleCloudCaller;
import com.mycompany.eagle.Utilities.UrlManager;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.thegreshams.firebase4j.error.FirebaseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class QuestionDialog extends javax.swing.JDialog {

    private String correct_answer, difficulty, course, filePath, isPublished;
    private Question question;
    private File file;
    private ArrayList<Question> list_of_questions;
    private static final String NUMERIC_STRING = "0123456789";

    public QuestionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public QuestionDialog(String course) throws IOException, 
            FileNotFoundException, ParseException {
        this.course = course;
        initComponents();
        initValues();
    }

    public QuestionDialog(Question question) throws IOException, 
            FileNotFoundException, ParseException {
        this.question = question;
        this.course = question.getCourse();
        initComponents();
        initValues();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_title = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tf_question_a = new javax.swing.JTextField();
        tf_question_question = new javax.swing.JTextField();
        btn_question_cancel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_question_add = new javax.swing.JPanel();
        lb_button = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_question_b = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_question_c = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_question_d = new javax.swing.JTextField();
        rad_question_easy = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        rad_question_medium = new javax.swing.JRadioButton();
        rad_question_hard = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        tf_question_rationale = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rad_question_a = new javax.swing.JRadioButton();
        rad_question_b = new javax.swing.JRadioButton();
        rad_question_c = new javax.swing.JRadioButton();
        rad_question_d = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        tf_question_keywords = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cb_question_subject = new javax.swing.JComboBox<>();
        cb_question_topic = new javax.swing.JComboBox<>();
        lb_question_image = new javax.swing.JLabel();
        btn_question_image = new javax.swing.JPanel();
        lb_student_add1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(103, 58, 183));

        lb_title.setFont(new java.awt.Font("Roboto Bk", 0, 25)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setText("Add Question");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lb_title)
                .addContainerGap(504, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_title)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 70));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_question_a.setBackground(new java.awt.Color(102, 102, 102));
        tf_question_a.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_question_a.setForeground(new java.awt.Color(255, 255, 255));
        tf_question_a.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_question_a.setBorder(null);
        tf_question_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_question_aActionPerformed(evt);
            }
        });
        jPanel3.add(tf_question_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 240, 30));

        tf_question_question.setBackground(new java.awt.Color(102, 102, 102));
        tf_question_question.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_question_question.setForeground(new java.awt.Color(255, 255, 255));
        tf_question_question.setBorder(null);
        jPanel3.add(tf_question_question, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 570, 50));

        btn_question_cancel.setBackground(new java.awt.Color(102, 102, 102));
        btn_question_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_question_cancelMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multiply.png"))); // NOI18N
        jLabel10.setText("CANCEL");

        javax.swing.GroupLayout btn_question_cancelLayout = new javax.swing.GroupLayout(btn_question_cancel);
        btn_question_cancel.setLayout(btn_question_cancelLayout);
        btn_question_cancelLayout.setHorizontalGroup(
            btn_question_cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btn_question_cancelLayout.setVerticalGroup(
            btn_question_cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel3.add(btn_question_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 130, -1));

        btn_question_add.setBackground(new java.awt.Color(255, 193, 7));
        btn_question_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_question_addMouseClicked(evt);
            }
        });

        lb_button.setBackground(new java.awt.Color(102, 102, 102));
        lb_button.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lb_button.setForeground(new java.awt.Color(255, 255, 255));
        lb_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        lb_button.setText("ADD");

        javax.swing.GroupLayout btn_question_addLayout = new javax.swing.GroupLayout(btn_question_add);
        btn_question_add.setLayout(btn_question_addLayout);
        btn_question_addLayout.setHorizontalGroup(
            btn_question_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btn_question_addLayout.setVerticalGroup(
            btn_question_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_button, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel3.add(btn_question_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 130, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Question:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("A:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("B:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        tf_question_b.setBackground(new java.awt.Color(102, 102, 102));
        tf_question_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_question_b.setForeground(new java.awt.Color(255, 255, 255));
        tf_question_b.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_question_b.setBorder(null);
        jPanel3.add(tf_question_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 240, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("C:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        tf_question_c.setBackground(new java.awt.Color(102, 102, 102));
        tf_question_c.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_question_c.setForeground(new java.awt.Color(255, 255, 255));
        tf_question_c.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_question_c.setBorder(null);
        jPanel3.add(tf_question_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 240, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("D:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 20, -1));

        tf_question_d.setBackground(new java.awt.Color(102, 102, 102));
        tf_question_d.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_question_d.setForeground(new java.awt.Color(255, 255, 255));
        tf_question_d.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_question_d.setBorder(null);
        jPanel3.add(tf_question_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 240, 30));

        rad_question_easy.setBackground(new java.awt.Color(51, 51, 51));
        rad_question_easy.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rad_question_easy.setForeground(new java.awt.Color(255, 255, 255));
        rad_question_easy.setText("Easy");
        rad_question_easy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_question_easyActionPerformed(evt);
            }
        });
        jPanel3.add(rad_question_easy, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Difficulty:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, 30));

        rad_question_medium.setBackground(new java.awt.Color(51, 51, 51));
        rad_question_medium.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rad_question_medium.setForeground(new java.awt.Color(255, 255, 255));
        rad_question_medium.setText("Medium");
        rad_question_medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_question_mediumActionPerformed(evt);
            }
        });
        jPanel3.add(rad_question_medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        rad_question_hard.setBackground(new java.awt.Color(51, 51, 51));
        rad_question_hard.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rad_question_hard.setForeground(new java.awt.Color(255, 255, 255));
        rad_question_hard.setText("Hard");
        rad_question_hard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_question_hardActionPerformed(evt);
            }
        });
        jPanel3.add(rad_question_hard, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rationale:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        tf_question_rationale.setBackground(new java.awt.Color(102, 102, 102));
        tf_question_rationale.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_question_rationale.setForeground(new java.awt.Color(255, 255, 255));
        tf_question_rationale.setBorder(null);
        jPanel3.add(tf_question_rationale, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 560, 60));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correct Answer:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, 30));

        rad_question_a.setBackground(new java.awt.Color(51, 51, 51));
        rad_question_a.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rad_question_a.setForeground(new java.awt.Color(255, 255, 255));
        rad_question_a.setText("A");
        rad_question_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_question_aActionPerformed(evt);
            }
        });
        jPanel3.add(rad_question_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        rad_question_b.setBackground(new java.awt.Color(51, 51, 51));
        rad_question_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rad_question_b.setForeground(new java.awt.Color(255, 255, 255));
        rad_question_b.setText("B");
        rad_question_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_question_bActionPerformed(evt);
            }
        });
        jPanel3.add(rad_question_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        rad_question_c.setBackground(new java.awt.Color(51, 51, 51));
        rad_question_c.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rad_question_c.setForeground(new java.awt.Color(255, 255, 255));
        rad_question_c.setText("C");
        rad_question_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_question_cActionPerformed(evt);
            }
        });
        jPanel3.add(rad_question_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        rad_question_d.setBackground(new java.awt.Color(51, 51, 51));
        rad_question_d.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rad_question_d.setForeground(new java.awt.Color(255, 255, 255));
        rad_question_d.setText("D");
        rad_question_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_question_dActionPerformed(evt);
            }
        });
        jPanel3.add(rad_question_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Keywords:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        tf_question_keywords.setBackground(new java.awt.Color(102, 102, 102));
        tf_question_keywords.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_question_keywords.setForeground(new java.awt.Color(255, 255, 255));
        tf_question_keywords.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_question_keywords.setBorder(null);
        jPanel3.add(tf_question_keywords, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 560, 30));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Subject:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Topic:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        cb_question_subject.setBackground(new java.awt.Color(102, 102, 102));
        cb_question_subject.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cb_question_subject.setForeground(new java.awt.Color(255, 255, 255));
        cb_question_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_question_subjectActionPerformed(evt);
            }
        });
        jPanel3.add(cb_question_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 270, 30));

        cb_question_topic.setBackground(new java.awt.Color(102, 102, 102));
        cb_question_topic.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cb_question_topic.setForeground(new java.awt.Color(255, 255, 255));
        cb_question_topic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_question_topicActionPerformed(evt);
            }
        });
        jPanel3.add(cb_question_topic, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 240, 30));

        lb_question_image.setBackground(new java.awt.Color(51, 51, 51));
        lb_question_image.setForeground(new java.awt.Color(51, 51, 51));
        lb_question_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_question_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo (1).png"))); // NOI18N
        jPanel3.add(lb_question_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 150, 120));

        btn_question_image.setBackground(new java.awt.Color(139, 195, 74));
        btn_question_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_question_imageMouseClicked(evt);
            }
        });

        lb_student_add1.setBackground(new java.awt.Color(102, 102, 102));
        lb_student_add1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lb_student_add1.setForeground(new java.awt.Color(255, 255, 255));
        lb_student_add1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_student_add1.setText("ATTACH PHOTO");

        javax.swing.GroupLayout btn_question_imageLayout = new javax.swing.GroupLayout(btn_question_image);
        btn_question_image.setLayout(btn_question_imageLayout);
        btn_question_imageLayout.setHorizontalGroup(
            btn_question_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_student_add1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btn_question_imageLayout.setVerticalGroup(
            btn_question_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_student_add1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(btn_question_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 150, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 680, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rad_question_easyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_question_easyActionPerformed
        if (rad_question_easy.isSelected()) {
            difficulty = "Easy";

            rad_question_medium.setSelected(false);
            rad_question_hard.setSelected(false);
        }
    }//GEN-LAST:event_rad_question_easyActionPerformed

    private void rad_question_mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_question_mediumActionPerformed
        if (rad_question_medium.isSelected()) {
            difficulty = "Medium";

            rad_question_easy.setSelected(false);
            rad_question_hard.setSelected(false);
        }
    }//GEN-LAST:event_rad_question_mediumActionPerformed

    private void rad_question_hardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_question_hardActionPerformed
        if (rad_question_hard.isSelected()) {
            difficulty = "Hard";

            rad_question_medium.setSelected(false);
            rad_question_easy.setSelected(false);
        }
    }//GEN-LAST:event_rad_question_hardActionPerformed

    private void rad_question_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_question_aActionPerformed
        if (rad_question_a.isSelected()) {
            correct_answer = "A";

            rad_question_b.setSelected(false);
            rad_question_c.setSelected(false);
            rad_question_d.setSelected(false);
        }
    }//GEN-LAST:event_rad_question_aActionPerformed

    private void rad_question_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_question_bActionPerformed
        if (rad_question_b.isSelected()) {
            correct_answer = "B";

            rad_question_a.setSelected(false);
            rad_question_c.setSelected(false);
            rad_question_d.setSelected(false);
        }
    }//GEN-LAST:event_rad_question_bActionPerformed

    private void rad_question_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_question_cActionPerformed
        if (rad_question_c.isSelected()) {
            correct_answer = "C";

            rad_question_a.setSelected(false);
            rad_question_b.setSelected(false);
            rad_question_d.setSelected(false);
        }
    }//GEN-LAST:event_rad_question_cActionPerformed

    private void rad_question_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_question_dActionPerformed
        if (rad_question_d.isSelected()) {
            correct_answer = "D";

            rad_question_a.setSelected(false);
            rad_question_c.setSelected(false);
            rad_question_b.setSelected(false);
        }
    }//GEN-LAST:event_rad_question_dActionPerformed

    private void btn_question_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_question_addMouseClicked
        String q_question = tf_question_question.getText();
        String q_rationale = tf_question_rationale.getText();
        String q_a = tf_question_a.getText();
        String q_b = tf_question_b.getText();
        String q_c = tf_question_c.getText();
        String q_d = tf_question_d.getText();
        String topic = (String) cb_question_topic.getSelectedItem();
        String subject = (String) cb_question_subject.getSelectedItem();
        String keywords = tf_question_keywords.getText();
        
        if (filePath != null){
            filePath = filePath.replace("\\", "\\\\");
        }
        
        
        //if editing a question
        if(question != null){
            question.setQ_a(q_a);
            question.setQ_b(q_b);
            question.setQ_c(q_c);
            question.setQ_d(q_d);
            question.setDifficulty(difficulty);
            question.setKeywords(keywords);
            question.setQ_question(q_question);
            question.setQ_rationale(q_rationale);
            question.setTopic(topic);
            question.setSubject(subject);
            question.setQ_answer(correct_answer);
            
            if (filePath != null){
                try {
                    question.setQ_imagePath(savePhoto(question.getQ_uid()));
                } catch (IOException ex) {
                    Logger.getLogger(QuestionDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        //if adding a question    
        } else {          
            String id = randomAlphaNumeric(10);
            
            if (filePath != null) {
                try {
                    String webPath = savePhoto(id);
                    
                    question = new Question(q_a, q_b, q_c, q_d, q_question,
                    q_rationale, correct_answer, id, course, subject, topic, 
                        difficulty, keywords, "false", webPath);
                    
                } catch (IOException ex) {
                    Logger.getLogger(QuestionDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            } else {
                question = new Question(q_a, q_b, q_c, q_d, q_question,
                q_rationale, correct_answer, id, course, subject, topic, 
                    difficulty, keywords, "false", null);
            }
    
        }
        
        try {
            try {
                addQuestion(new ListOfQuestions().readQuestions(), question);
            } catch (FileNotFoundException | ParseException ex) {
                Logger.getLogger(QuestionDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(QuestionDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btn_question_addMouseClicked

    private void btn_question_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_question_cancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_question_cancelMouseClicked

    private void tf_question_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_question_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_question_aActionPerformed

    private void cb_question_topicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_question_topicActionPerformed
        
    }//GEN-LAST:event_cb_question_topicActionPerformed

    private void cb_question_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_question_subjectActionPerformed
        try {
            getTopics( (String) cb_question_subject.getSelectedItem());                
        } catch (IOException ex) {
            Logger.getLogger(QuestionDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(QuestionDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cb_question_subjectActionPerformed

    private void btn_question_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_question_imageMouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        
        file = chooser.getSelectedFile();
        filePath = file.getAbsolutePath();    
        try {
            loadPhoto();
        } catch (IOException ex) {
            Logger.getLogger(QuestionDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_question_imageMouseClicked

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
            java.util.logging.Logger.getLogger(QuestionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuestionDialog dialog = new QuestionDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void addQuestion(ListOfQuestions readQuestions, Question question) 
            throws IOException {
        question.setIsPublished("false");
        readQuestions.getQuestions().add(question);
  
        FileWriter jsonFile = new FileWriter("ListOfQuestions.json");
        jsonFile.write(new ListOfQuestions().saveQuestions(readQuestions));
        jsonFile.flush();
        //saves a json file to local directory
        
        JOptionPane.showMessageDialog(null, "Question successfully added");
        
    }

    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
    
    private String savePhoto(String id) throws IOException {
        //save to local directory
        BufferedImage image = ImageIO.read(file);
        ImageIO.write(image, "jpg", new File("questions/" + id + ".jpg"));
        
        //upload to Firebase Storage and gets the link
        FileInputStream photo = new FileInputStream(new File(filePath));
        GoogleCloudCaller gc_call = new GoogleCloudCaller();
        String webPath = gc_call.saveImage(id, photo);
        
        //returns link
        return webPath;
    }
    
    private void initValues() throws IOException, FileNotFoundException, 
            ParseException {    
        
       if(question != null){
           lb_title.setText("Edit Question");
           lb_button.setText("EDIT");
           getQuestionInfo();
       }
       
       getSubjects();      
    }
    
    private void getSubjects() throws IOException, FileNotFoundException, 
            ParseException {     
        ArrayList<String> subjects = new ListOfSubjects().readSubjects(course);       
        for (String subject : subjects){
            cb_question_subject.addItem(subject);
        }         
    }
    
    private void getQuestionInfo() throws IOException, FileNotFoundException, 
            ParseException {
  
            cb_question_subject.setSelectedItem(question.getSubject());     
            tf_question_question.setText(question.getQ_question());
            tf_question_rationale.setText(question.getQ_rationale());
            tf_question_a.setText(question.getQ_a());
            tf_question_b.setText(question.getQ_b());
            tf_question_c.setText(question.getQ_c());
            tf_question_d.setText(question.getQ_d());
            tf_question_keywords.setText(question.getKeywords());
               
               getTopics(question.getSubject());
               cb_question_topic.setSelectedItem(question.getTopic());
               
               isPublished = question.getIsPublished();
               
               if (question.getQ_imagePath() != null){
                   file = new File("questions/" + question.getQ_uid() + ".jpg");
               }
                
               correct_answer = question.getQ_answer();
               switch (question.getQ_answer()){
                   case "A":
                       rad_question_a.setSelected(true);
                       break;
                   case "B":
                       rad_question_b.setSelected(true);
                       break;
                   case "C":
                       rad_question_c.setSelected(true);
                       break;
                   case "D":
                       rad_question_d.setSelected(true);
                       break;
               }
               
               difficulty = question.getDifficulty();
               switch (question.getDifficulty()){
                   case "Easy":
                       rad_question_easy.setSelected(true);
                       break;
                   case "Medium":
                       rad_question_medium.setSelected(true);
                       break;
                   case "Hard":
                       rad_question_hard.setSelected(true);
                       break;
               }
    }
    
    private void getTopics(String subject) throws IOException, 
            FileNotFoundException, ParseException {
        ArrayList<String> topics = new ListOfSubjects().readTopics(course, subject);
        cb_question_topic.removeAllItems();
        
        for (String topic : topics){
            cb_question_topic.addItem(topic);
        } 
    }
    
    private void loadPhoto() throws IOException {
        BufferedImage img = ImageIO.read(file);    
        Image image = img.getScaledInstance(lb_question_image.getWidth(),
                    lb_question_image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(image);  
        lb_question_image.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_question_add;
    private javax.swing.JPanel btn_question_cancel;
    private javax.swing.JPanel btn_question_image;
    private javax.swing.JComboBox<String> cb_question_subject;
    private javax.swing.JComboBox<String> cb_question_topic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_button;
    private javax.swing.JLabel lb_question_image;
    private javax.swing.JLabel lb_student_add1;
    private javax.swing.JLabel lb_title;
    private javax.swing.JRadioButton rad_question_a;
    private javax.swing.JRadioButton rad_question_b;
    private javax.swing.JRadioButton rad_question_c;
    private javax.swing.JRadioButton rad_question_d;
    private javax.swing.JRadioButton rad_question_easy;
    private javax.swing.JRadioButton rad_question_hard;
    private javax.swing.JRadioButton rad_question_medium;
    private javax.swing.JTextField tf_question_a;
    private javax.swing.JTextField tf_question_b;
    private javax.swing.JTextField tf_question_c;
    private javax.swing.JTextField tf_question_d;
    private javax.swing.JTextField tf_question_keywords;
    private javax.swing.JTextField tf_question_question;
    private javax.swing.JTextField tf_question_rationale;
    // End of variables declaration//GEN-END:variables
 
}
