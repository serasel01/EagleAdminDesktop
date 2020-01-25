package com.mycompany.eagle.Frames;

import com.mycompany.eagle.Dialogs.QuestionDialog;
import com.mycompany.eagle.Dialogs.StudentDialog;
import com.mycompany.eagle.Entities.ListOfQuestions;
import com.mycompany.eagle.Entities.ListOfSubjects;
import com.mycompany.eagle.Entities.Question;
import com.mycompany.eagle.Entities.Result;
import com.mycompany.eagle.Entities.Student;
import com.mycompany.eagle.Utilities.FirebaseCaller;
import com.mycompany.eagle.Utilities.GoogleCloudCaller;
import com.mycompany.eagle.Utilities.SharedPrefManager;
import com.mycompany.eagle.Utilities.UrlManager;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import net.thegreshams.firebase4j.error.FirebaseException;
import org.json.simple.parser.ParseException;

public class MainFrame extends javax.swing.JFrame {
    
    private ArrayList<Student> students;
    private ListOfQuestions listOfQuestions;
    private String course, category, subject;

    public MainFrame() throws FirebaseException, UnsupportedEncodingException {
        initComponents();
        this.students = new FirebaseCaller(
                new UrlManager().setStudents()).getStudents();
        addStudentList(students);
    }

    public MainFrame(String id, String name, String course) throws FirebaseException, 
            UnsupportedEncodingException, IOException, FileNotFoundException, 
            ParseException {
        initComponents();
        lb_main_admin.setText("Administrator: " + name);
        lb_main_id.setText("ID: " + id);
        lb_main_course.setText("Course: " + course);
        
        ArrayList<String> subjects = new ListOfSubjects().readSubjects(course);
        for (String subject : subjects){
            cb_subject.addItem(subject);
        }
        
        this.course = course;
        category = (String) cb_category.getSelectedItem();
        subject = (String) cb_subject.getSelectedItem();
        
        this.students = new FirebaseCaller(
                new UrlManager().setStudents()).getStudents();
        addStudentList(students);  
        
        this.listOfQuestions = new ListOfQuestions().readQuestions(course, 
                category, subject);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lp_main_side = new javax.swing.JLayeredPane();
        pn_lp_review = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_review_list = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        tf_review_searchId = new javax.swing.JTextField();
        btn_review_refresh = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_review_search = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_review_add = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btn_review_edit = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btn_review_delete = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btn_review_result = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pn_lp_exam = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_exam_list = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        btn_exam_refresh = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cb_category = new javax.swing.JComboBox<>();
        lb_main_admin1 = new javax.swing.JLabel();
        lb_main_admin2 = new javax.swing.JLabel();
        cb_subject = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        btn_exam_add = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btn_exam_edit = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btn_exam_delete = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btn_exam_publish = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lb_main_admin = new javax.swing.JLabel();
        lb_main_id = new javax.swing.JLabel();
        lb_main_course = new javax.swing.JLabel();
        btn_main_logout = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pn_main_review = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pn_main_exam = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(66, 66, 66));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lp_main_side.setBackground(new java.awt.Color(51, 51, 51));
        lp_main_side.setLayout(new java.awt.CardLayout());

        pn_lp_review.setBackground(new java.awt.Color(51, 51, 51));
        pn_lp_review.setMinimumSize(new java.awt.Dimension(700, 560));
        pn_lp_review.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_review_list.setBackground(new java.awt.Color(255, 255, 255));
        tb_review_list.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tb_review_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Course"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_review_list);
        if (tb_review_list.getColumnModel().getColumnCount() > 0) {
            tb_review_list.getColumnModel().getColumn(0).setHeaderValue("ID");
            tb_review_list.getColumnModel().getColumn(1).setHeaderValue("Name");
            tb_review_list.getColumnModel().getColumn(2).setHeaderValue("Course");
        }

        pn_lp_review.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 600, 327));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_review_searchId.setBackground(new java.awt.Color(102, 102, 102));
        tf_review_searchId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tf_review_searchId.setForeground(new java.awt.Color(255, 255, 255));
        tf_review_searchId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_review_searchId.setBorder(null);
        jPanel7.add(tf_review_searchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 320, 30));

        btn_review_refresh.setBackground(new java.awt.Color(139, 195, 74));
        btn_review_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_refreshMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REFRESH");

        javax.swing.GroupLayout btn_review_refreshLayout = new javax.swing.GroupLayout(btn_review_refresh);
        btn_review_refresh.setLayout(btn_review_refreshLayout);
        btn_review_refreshLayout.setHorizontalGroup(
            btn_review_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btn_review_refreshLayout.setVerticalGroup(
            btn_review_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.add(btn_review_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, 30));

        btn_review_search.setBackground(new java.awt.Color(255, 193, 7));
        btn_review_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_searchMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 193, 7));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEARCH");

        javax.swing.GroupLayout btn_review_searchLayout = new javax.swing.GroupLayout(btn_review_search);
        btn_review_search.setLayout(btn_review_searchLayout);
        btn_review_searchLayout.setHorizontalGroup(
            btn_review_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btn_review_searchLayout.setVerticalGroup(
            btn_review_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.add(btn_review_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 30));

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ID:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 30));

        pn_lp_review.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 600, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LIST OF REVIEWEES");
        pn_lp_review.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 590, -1));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_review_add.setBackground(new java.awt.Color(63, 81, 181));
        btn_review_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_addMouseClicked(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N

        javax.swing.GroupLayout btn_review_addLayout = new javax.swing.GroupLayout(btn_review_add);
        btn_review_add.setLayout(btn_review_addLayout);
        btn_review_addLayout.setHorizontalGroup(
            btn_review_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(btn_review_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );
        btn_review_addLayout.setVerticalGroup(
            btn_review_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(btn_review_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        jPanel8.add(btn_review_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 70));

        btn_review_edit.setBackground(new java.awt.Color(63, 81, 181));
        btn_review_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_editMouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(102, 102, 102));
        jLabel22.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pencil.png"))); // NOI18N

        javax.swing.GroupLayout btn_review_editLayout = new javax.swing.GroupLayout(btn_review_edit);
        btn_review_edit.setLayout(btn_review_editLayout);
        btn_review_editLayout.setHorizontalGroup(
            btn_review_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(btn_review_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );
        btn_review_editLayout.setVerticalGroup(
            btn_review_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(btn_review_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        jPanel8.add(btn_review_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 140, 70));

        btn_review_delete.setBackground(new java.awt.Color(63, 81, 181));
        btn_review_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_deleteMouseClicked(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(102, 102, 102));
        jLabel23.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N

        javax.swing.GroupLayout btn_review_deleteLayout = new javax.swing.GroupLayout(btn_review_delete);
        btn_review_delete.setLayout(btn_review_deleteLayout);
        btn_review_deleteLayout.setHorizontalGroup(
            btn_review_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(btn_review_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );
        btn_review_deleteLayout.setVerticalGroup(
            btn_review_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(btn_review_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        jPanel8.add(btn_review_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 140, 70));

        btn_review_result.setBackground(new java.awt.Color(63, 81, 181));
        btn_review_result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_resultMouseClicked(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(102, 102, 102));
        jLabel24.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test.png"))); // NOI18N

        javax.swing.GroupLayout btn_review_resultLayout = new javax.swing.GroupLayout(btn_review_result);
        btn_review_result.setLayout(btn_review_resultLayout);
        btn_review_resultLayout.setHorizontalGroup(
            btn_review_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(btn_review_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );
        btn_review_resultLayout.setVerticalGroup(
            btn_review_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(btn_review_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        jPanel8.add(btn_review_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 140, 70));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD REVIEWEE");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 140, 20));

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EDIT INFORMATION");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 140, 20));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DELETE REVIEWEE");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 140, 20));

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("VIEW RESULTS");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 140, 20));

        pn_lp_review.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 590, 100));

        lp_main_side.add(pn_lp_review, "card2");

        pn_lp_exam.setBackground(new java.awt.Color(51, 51, 51));
        pn_lp_exam.setMinimumSize(new java.awt.Dimension(600, 517));
        pn_lp_exam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_exam_list.setBackground(new java.awt.Color(255, 255, 255));
        tb_exam_list.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tb_exam_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Question", "Category", "Rationale", "Answer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_exam_list);

        pn_lp_exam.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 600, 320));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_exam_refresh.setBackground(new java.awt.Color(139, 195, 74));
        btn_exam_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exam_refreshMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REFRESH");

        javax.swing.GroupLayout btn_exam_refreshLayout = new javax.swing.GroupLayout(btn_exam_refresh);
        btn_exam_refresh.setLayout(btn_exam_refreshLayout);
        btn_exam_refreshLayout.setHorizontalGroup(
            btn_exam_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btn_exam_refreshLayout.setVerticalGroup(
            btn_exam_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.add(btn_exam_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 130, 29));

        cb_category.setBackground(new java.awt.Color(102, 102, 102));
        cb_category.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cb_category.setForeground(new java.awt.Color(255, 255, 255));
        cb_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy", "Medium", "Hard" }));
        cb_category.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_categoryItemStateChanged(evt);
            }
        });
        jPanel10.add(cb_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, -1));

        lb_main_admin1.setBackground(new java.awt.Color(255, 255, 255));
        lb_main_admin1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_main_admin1.setForeground(new java.awt.Color(255, 255, 255));
        lb_main_admin1.setText("Category:");
        jPanel10.add(lb_main_admin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 30));

        lb_main_admin2.setBackground(new java.awt.Color(255, 255, 255));
        lb_main_admin2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_main_admin2.setForeground(new java.awt.Color(255, 255, 255));
        lb_main_admin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_main_admin2.setText("Subject:");
        jPanel10.add(lb_main_admin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 70, 30));

        cb_subject.setBackground(new java.awt.Color(102, 102, 102));
        cb_subject.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cb_subject.setForeground(new java.awt.Color(255, 255, 255));
        cb_subject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_subjectItemStateChanged(evt);
            }
        });
        jPanel10.add(cb_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 160, -1));

        pn_lp_exam.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 560, 50));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("LIST OF QUESTIONS");
        pn_lp_exam.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 80, 600, -1));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_exam_add.setBackground(new java.awt.Color(76, 175, 80));
        btn_exam_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exam_addMouseClicked(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(102, 102, 102));
        jLabel25.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-file.png"))); // NOI18N

        javax.swing.GroupLayout btn_exam_addLayout = new javax.swing.GroupLayout(btn_exam_add);
        btn_exam_add.setLayout(btn_exam_addLayout);
        btn_exam_addLayout.setHorizontalGroup(
            btn_exam_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(btn_exam_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );
        btn_exam_addLayout.setVerticalGroup(
            btn_exam_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(btn_exam_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        jPanel14.add(btn_exam_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 70));

        btn_exam_edit.setBackground(new java.awt.Color(76, 175, 80));
        btn_exam_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exam_editMouseClicked(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(102, 102, 102));
        jLabel26.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file.png"))); // NOI18N

        javax.swing.GroupLayout btn_exam_editLayout = new javax.swing.GroupLayout(btn_exam_edit);
        btn_exam_edit.setLayout(btn_exam_editLayout);
        btn_exam_editLayout.setHorizontalGroup(
            btn_exam_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(btn_exam_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );
        btn_exam_editLayout.setVerticalGroup(
            btn_exam_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(btn_exam_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        jPanel14.add(btn_exam_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 140, 70));

        btn_exam_delete.setBackground(new java.awt.Color(76, 175, 80));
        btn_exam_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exam_deleteMouseClicked(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(102, 102, 102));
        jLabel27.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete file.png"))); // NOI18N

        javax.swing.GroupLayout btn_exam_deleteLayout = new javax.swing.GroupLayout(btn_exam_delete);
        btn_exam_delete.setLayout(btn_exam_deleteLayout);
        btn_exam_deleteLayout.setHorizontalGroup(
            btn_exam_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(btn_exam_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );
        btn_exam_deleteLayout.setVerticalGroup(
            btn_exam_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(btn_exam_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        jPanel14.add(btn_exam_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 140, 70));

        btn_exam_publish.setBackground(new java.awt.Color(76, 175, 80));
        btn_exam_publish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exam_publishMouseClicked(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(102, 102, 102));
        jLabel28.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publish.png"))); // NOI18N

        javax.swing.GroupLayout btn_exam_publishLayout = new javax.swing.GroupLayout(btn_exam_publish);
        btn_exam_publish.setLayout(btn_exam_publishLayout);
        btn_exam_publishLayout.setHorizontalGroup(
            btn_exam_publishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(btn_exam_publishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );
        btn_exam_publishLayout.setVerticalGroup(
            btn_exam_publishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(btn_exam_publishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        jPanel14.add(btn_exam_publish, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 140, 70));

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ADD QUESTION");
        jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 140, 20));

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("EDIT QUESTION");
        jPanel14.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 140, 20));

        jLabel21.setBackground(new java.awt.Color(102, 102, 102));
        jLabel21.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("DELETE QUESTION");
        jPanel14.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 138, 20));

        jLabel29.setBackground(new java.awt.Color(102, 102, 102));
        jLabel29.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("PUBLISH");
        jPanel14.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 140, 20));

        pn_lp_exam.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 590, 90));

        lp_main_side.add(pn_lp_exam, "card3");

        jPanel3.add(lp_main_side, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 630, 580));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 0, 630, 580));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 150, 136));

        lb_main_admin.setBackground(new java.awt.Color(255, 255, 255));
        lb_main_admin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lb_main_admin.setForeground(new java.awt.Color(255, 255, 255));
        lb_main_admin.setText("Administrator: ");

        lb_main_id.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lb_main_id.setForeground(new java.awt.Color(255, 255, 255));
        lb_main_id.setText("ID Number:");

        lb_main_course.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lb_main_course.setForeground(new java.awt.Color(255, 255, 255));
        lb_main_course.setText("Course:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_main_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_main_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_main_course, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_main_admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_main_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_main_course)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, 70));

        btn_main_logout.setBackground(new java.awt.Color(0, 154, 168));
        btn_main_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_main_logoutMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Logout");

        javax.swing.GroupLayout btn_main_logoutLayout = new javax.swing.GroupLayout(btn_main_logout);
        btn_main_logout.setLayout(btn_main_logoutLayout);
        btn_main_logoutLayout.setHorizontalGroup(
            btn_main_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        btn_main_logoutLayout.setVerticalGroup(
            btn_main_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_main_logoutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btn_main_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 220, 50));

        pn_main_review.setBackground(new java.awt.Color(255, 152, 0));
        pn_main_review.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_main_reviewMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Reviewees");

        javax.swing.GroupLayout pn_main_reviewLayout = new javax.swing.GroupLayout(pn_main_review);
        pn_main_review.setLayout(pn_main_reviewLayout);
        pn_main_reviewLayout.setHorizontalGroup(
            pn_main_reviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_main_reviewLayout.setVerticalGroup(
            pn_main_reviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(pn_main_review, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 220, 50));

        pn_main_exam.setBackground(new java.awt.Color(0, 154, 168));
        pn_main_exam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_main_examMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Exams");

        javax.swing.GroupLayout pn_main_examLayout = new javax.swing.GroupLayout(pn_main_exam);
        pn_main_exam.setLayout(pn_main_examLayout);
        pn_main_examLayout.setHorizontalGroup(
            pn_main_examLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        pn_main_examLayout.setVerticalGroup(
            pn_main_examLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_main_examLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(pn_main_exam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, 50));

        jLabel15.setFont(new java.awt.Font("Roboto Bk", 0, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Eagle Reviewer");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eaglereviewer icon.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pn_main_reviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_main_reviewMouseClicked
        switchPanel(pn_lp_review);
        pn_main_review.setBackground(Color.decode("#FF9800"));
    }//GEN-LAST:event_pn_main_reviewMouseClicked

    private void pn_main_examMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_main_examMouseClicked
        switchPanel(pn_lp_exam);      
        pn_main_exam.setBackground(Color.decode("#FF9800"));
        addExamList(listOfQuestions);    
    }//GEN-LAST:event_pn_main_examMouseClicked

    private void btn_review_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_review_addMouseClicked
        new StudentDialog().setVisible(true);
    }//GEN-LAST:event_btn_review_addMouseClicked

    private void btn_review_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_review_editMouseClicked
        int row = tb_review_list.getSelectedRow();
        String id = tb_review_list.getValueAt(row, 0).toString();

        for (Student student : students) {
            if (student.getStu_id().equals(id)){
                try {
                    new StudentDialog(student).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }        
        }
        
    }//GEN-LAST:event_btn_review_editMouseClicked

    private void btn_review_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_review_deleteMouseClicked
        int reply = JOptionPane.showConfirmDialog(null,
                "Are you sure to delete this student?", "WARNING",
                JOptionPane.YES_NO_OPTION);
        
        String id = tb_review_list.getValueAt(tb_review_list.getSelectedRow(), 0).toString();

        if (reply == JOptionPane.YES_OPTION) {
            try {
                new FirebaseCaller(new UrlManager().setStudent(id)).deleteStudent();
            } catch (FirebaseException | UnsupportedEncodingException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Student deleted");
        }
    }//GEN-LAST:event_btn_review_deleteMouseClicked

    private void btn_exam_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exam_addMouseClicked
        try {
            new QuestionDialog(course).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_exam_addMouseClicked

    private void btn_exam_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exam_editMouseClicked
        int row = tb_exam_list.getSelectedRow();    
        String id = tb_exam_list.getValueAt(row, 0).toString();
        
        for (Question question : listOfQuestions.getQuestions()){
            if (question.getQ_uid().equals(id)){
                try {
                    new QuestionDialog(question).setVisible(true);
                } catch (IOException | ParseException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btn_exam_editMouseClicked

    private void btn_exam_publishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exam_publishMouseClicked
        int row = tb_exam_list.getSelectedRow();
        String id = tb_exam_list.getValueAt(row, 0).toString();
        
        try {     
            for (Question question : listOfQuestions.getQuestions()){
                //cycles through the list of questions and finds the question to publish via uid
                if (question.getQ_uid().equals(id)){
                    question.setIsPublished("true");
                    new FirebaseCaller(new UrlManager().setQuestion(question))
                            .publishQuestion(question);
                    new FirebaseCaller(new UrlManager().setKeywords(question))
                            .publishKeywords(question);
                    
                    if(question.getQ_imagePath() != null){
                        //upload to Firebase Storage and gets the link
                    FileInputStream photo = new FileInputStream(
                            new File(question.getQ_imagePath()));
                    GoogleCloudCaller gc_call = new GoogleCloudCaller();
                    gc_call.saveImage(id, photo);
                    }                 
                }
            }
            
            FileWriter jsonFile = new FileWriter("ListOfQuestions.json");
            jsonFile.write(new ListOfQuestions().saveQuestions(listOfQuestions));
            jsonFile.flush();
            
            JOptionPane.showMessageDialog(null, "Question has published successfully");
            
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FirebaseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_exam_publishMouseClicked

    private void btn_review_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_review_refreshMouseClicked
        try {
            addStudentList(new FirebaseCaller(new UrlManager().setStudents()).getStudents());
        } catch (FirebaseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_review_refreshMouseClicked

    private void btn_review_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_review_searchMouseClicked
         try {
            searchStudent(new FirebaseCaller(new UrlManager()
                    .setStudent(tf_review_searchId.getText())).getStudent());
            
        } catch (FirebaseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_review_searchMouseClicked

    private void btn_exam_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exam_refreshMouseClicked
        try {
            refreshQuestionList();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_exam_refreshMouseClicked

    private void btn_exam_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exam_deleteMouseClicked
        int reply = JOptionPane.showConfirmDialog(null,
                "Are you sure to delete this question?", "WARNING",
                JOptionPane.YES_NO_OPTION);
        
        String id = tb_exam_list.getValueAt(tb_exam_list.getSelectedRow(), 0).toString();
        DefaultTableModel model = (DefaultTableModel) tb_exam_list.getModel();
        
        if (reply == JOptionPane.YES_OPTION) {
            int SelectedRowIndex = tb_exam_list.getSelectedRow();
            model.removeRow(SelectedRowIndex);
            
            try {
                new ListOfQuestions().deleteQuestion(id);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "Question deleted");
        }
    }//GEN-LAST:event_btn_exam_deleteMouseClicked

    private void btn_review_resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_review_resultMouseClicked
        int row = tb_review_list.getSelectedRow();
        String value = tb_review_list.getValueAt(row, 0).toString();
        Student selected_student = null;
        
        for (Student student : students){
            if (student.getStu_id().equals(value)){
                selected_student = student;
            }
        }
        
        try {
            ResultFrame rf = new ResultFrame(selected_student);
            rf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            rf.setVisible(true);
        } catch (FirebaseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_review_resultMouseClicked

    private void btn_main_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_main_logoutMouseClicked
        try {
            new SharedPrefManager().logout();
        } catch (BackingStoreException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_btn_main_logoutMouseClicked

    private void cb_categoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_categoryItemStateChanged
        try {
            category = (String )cb_category.getSelectedItem();
            refreshQuestionList();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cb_categoryItemStateChanged

    private void cb_subjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_subjectItemStateChanged
        try {
            subject = (String )cb_subject.getSelectedItem();
            refreshQuestionList();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cb_subjectItemStateChanged

    public static void main(String args[]) throws FirebaseException, UnsupportedEncodingException {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (FirebaseException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void addStudentList(ArrayList<Student> students) { //displays the table
        DefaultTableModel model = setRevieweeTable();

        for (Student student : students) {
            Vector<Object> data = new Vector<Object>();
            data.add(student.getStu_id());
            data.add(student.getStu_name());
            data.add(student.getStu_course());
            model.addRow(data);
        }
        
        this.students = students;
    }
    
    private void addExamList (ListOfQuestions questions ){
        DefaultTableModel model = setExamTable();
        
        for (Question question : questions.getQuestions()) {
            Vector<Object> data = new Vector<Object>();
            data.add(question.getQ_uid());
            data.add(question.getSubject());
            data.add(question.getQ_question());
            data.add(question.getDifficulty());
            data.add(question.getQ_rationale());
            data.add(question.getQ_answer());
            data.add(question.getIsPublished());
            model.addRow(data);        
        }
        
        tb_exam_list.setDefaultRenderer(Object.class, new SetCellRenderer());
    }
    
    private void searchStudent(Student student) {
        DefaultTableModel model = setRevieweeTable();

        Vector<Object> data = new Vector<Object>();
        data.add(student.getStu_id());
        data.add(student.getStu_name());
        data.add(student.getStu_course());
        model.addRow(data);       
    }
    
    private void searchExam(Question question) {
        DefaultTableModel model = setExamTable();

        Vector<Object> data = new Vector<Object>();
        data.add(question.getQ_uid());
        data.add(question.getSubject());
        data.add(question.getQ_question());
        data.add(question.getDifficulty());
        data.add(question.getQ_rationale());
        data.add(question.getQ_answer());
        model.addRow(data);       
        
    }
    
    private DefaultTableModel setRevieweeTable () { //formats table
        DefaultTableModel model = new DefaultTableModel(0, 0);
        String header[] = new String[]{"ID", "NAME", "COURSE"};
        model.setColumnIdentifiers(header);
        tb_review_list.setModel(model);
        return model;
    }
    
    private DefaultTableModel setExamTable () {
        DefaultTableModel model = new DefaultTableModel(0, 0);
        String header[] = new String[]{"ID", "SUBJECT", "QUESTION", "CATEGORY", 
            "RATIONALE", "ANSWER", "PUBLISHED?"};
        model.setColumnIdentifiers(header);
        tb_exam_list.setModel(model);
        return model;
    }
    
    private void switchPanel(JPanel panel) {
        resetButtonColors();

        lp_main_side.removeAll();
        lp_main_side.add(panel);
        lp_main_side.repaint();
        lp_main_side.revalidate();
    }
    
    private void resetButtonColors() {
        pn_main_review.setBackground(Color.decode("#009AA8"));
        pn_main_exam.setBackground(Color.decode("#009AA8"));
    }

    private void refreshQuestionList() throws IOException, 
            FileNotFoundException, ParseException {
        
        listOfQuestions = new ListOfQuestions().readQuestions(course, 
                category, subject);
        addExamList(listOfQuestions);
    }

    private void searchQuestion(String question_id) throws FileNotFoundException, 
            IOException, ParseException {
        Question question = new ListOfQuestions().searchQuestion(question_id);
        
        if (question == null){
            JOptionPane.showMessageDialog(null, "Question id not found");
        } else {
            searchExam(question);
        }
    }
    
    private static class SetCellRenderer implements TableCellRenderer {
        private DefaultTableCellRenderer renderer =  new DefaultTableCellRenderer();

        public SetCellRenderer() {
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, 
                Object value, boolean isSelected, boolean hasFocus, int row, 
                int column) {
            Component c = renderer.getTableCellRendererComponent(table, value, 
                    hasFocus, hasFocus, row, column);
            
            if(isSelected){
                    c.setBackground(Color.YELLOW);  
            } else {
                if (row%2 == 0){
                    c.setBackground(Color.WHITE);

                }
                else {
                    c.setBackground(Color.LIGHT_GRAY);
                }     
            }
       
            if(table.getColumnModel().getColumn(column).getIdentifier()
                    .equals("PUBLISHED?")){
                
                if(value.toString().equals("true")){
                    c.setBackground(Color.GREEN);
                }   
            }
            
            return c;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_exam_add;
    private javax.swing.JPanel btn_exam_delete;
    private javax.swing.JPanel btn_exam_edit;
    private javax.swing.JPanel btn_exam_publish;
    private javax.swing.JPanel btn_exam_refresh;
    private javax.swing.JPanel btn_main_logout;
    private javax.swing.JPanel btn_review_add;
    private javax.swing.JPanel btn_review_delete;
    private javax.swing.JPanel btn_review_edit;
    private javax.swing.JPanel btn_review_refresh;
    private javax.swing.JPanel btn_review_result;
    private javax.swing.JPanel btn_review_search;
    private javax.swing.JComboBox<String> cb_category;
    private javax.swing.JComboBox<String> cb_subject;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_main_admin;
    private javax.swing.JLabel lb_main_admin1;
    private javax.swing.JLabel lb_main_admin2;
    private javax.swing.JLabel lb_main_course;
    private javax.swing.JLabel lb_main_id;
    private javax.swing.JLayeredPane lp_main_side;
    private javax.swing.JPanel pn_lp_exam;
    private javax.swing.JPanel pn_lp_review;
    private javax.swing.JPanel pn_main_exam;
    private javax.swing.JPanel pn_main_review;
    private javax.swing.JTable tb_exam_list;
    private javax.swing.JTable tb_review_list;
    private javax.swing.JTextField tf_review_searchId;
    // End of variables declaration//GEN-END:variables

}
