package com.mycompany.eagle.Frames;

import com.mycompany.eagle.Dialogs.QuestionDialog;
import com.mycompany.eagle.Dialogs.StudentDialog;
import com.mycompany.eagle.Entities.ListOfQuestions;
import com.mycompany.eagle.Entities.Question;
import com.mycompany.eagle.Entities.Result;
import com.mycompany.eagle.Entities.Student;
import com.mycompany.eagle.Utilities.FirebaseCaller;
import com.mycompany.eagle.Utilities.SharedPrefManager;
import com.mycompany.eagle.Utilities.UrlManager;
import java.awt.Color;
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
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import net.thegreshams.firebase4j.error.FirebaseException;
import org.json.simple.parser.ParseException;

public class MainFrame extends javax.swing.JFrame {
    
    private ArrayList<Student> students;
    private ListOfQuestions listOfQuestions;

    public MainFrame() throws FirebaseException, UnsupportedEncodingException {
        initComponents();
        this.students = new FirebaseCaller(
                new UrlManager().setStudents()).getStudents();
        addStudentList(students);
    }

    public MainFrame(String id, String name) throws FirebaseException, 
            UnsupportedEncodingException, IOException, FileNotFoundException, 
            ParseException {
        initComponents();
        lb_main_admin.setText("Administrator: " + name);
        lb_main_id.setText("ID: " + id);
        
        this.students = new FirebaseCaller(
                new UrlManager().setStudents()).getStudents();
        addStudentList(students);  
        
        this.listOfQuestions = new ListOfQuestions().readQuestions();
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
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_review_add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_review_edit = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_review_delete = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_review_result = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pn_lp_exam = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_exam_list = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        tf_exam_search = new javax.swing.JTextField();
        btn_exam_refresh = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_exam_search = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        btn_exam_add = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btn_exam_edit = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btn_exam_delete = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btn_exam_publish = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lb_main_admin = new javax.swing.JLabel();
        lb_main_id = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(66, 66, 66));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lp_main_side.setBackground(new java.awt.Color(51, 51, 51));
        lp_main_side.setLayout(new java.awt.CardLayout());

        pn_lp_review.setBackground(new java.awt.Color(66, 66, 66));
        pn_lp_review.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pn_lp_review.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 558, 327));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        tf_review_searchId.setBackground(new java.awt.Color(102, 102, 102));
        tf_review_searchId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tf_review_searchId.setForeground(new java.awt.Color(255, 255, 255));
        tf_review_searchId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_review_searchId.setText("ID");
        tf_review_searchId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        btn_review_refresh.setBackground(new java.awt.Color(102, 102, 102));
        btn_review_refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
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

        btn_review_search.setBackground(new java.awt.Color(102, 102, 102));
        btn_review_search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn_review_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_searchMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_review_searchId)
                .addGap(18, 18, 18)
                .addComponent(btn_review_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_review_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_review_searchId, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btn_review_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_review_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_lp_review.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 558, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LIST OF REVIEWEES");
        pn_lp_review.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 65, -1, -1));

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_review_add.setBackground(new java.awt.Color(102, 102, 102));
        btn_review_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_addMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD REVIEWEE");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout btn_review_addLayout = new javax.swing.GroupLayout(btn_review_add);
        btn_review_add.setLayout(btn_review_addLayout);
        btn_review_addLayout.setHorizontalGroup(
            btn_review_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btn_review_addLayout.setVerticalGroup(
            btn_review_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel8.add(btn_review_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        btn_review_edit.setBackground(new java.awt.Color(102, 102, 102));
        btn_review_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_editMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EDIT INFORMATION");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout btn_review_editLayout = new javax.swing.GroupLayout(btn_review_edit);
        btn_review_edit.setLayout(btn_review_editLayout);
        btn_review_editLayout.setHorizontalGroup(
            btn_review_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btn_review_editLayout.setVerticalGroup(
            btn_review_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.add(btn_review_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 40));

        btn_review_delete.setBackground(new java.awt.Color(102, 102, 102));
        btn_review_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_deleteMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DELETE REVIEWEE");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout btn_review_deleteLayout = new javax.swing.GroupLayout(btn_review_delete);
        btn_review_delete.setLayout(btn_review_deleteLayout);
        btn_review_deleteLayout.setHorizontalGroup(
            btn_review_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btn_review_deleteLayout.setVerticalGroup(
            btn_review_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel8.add(btn_review_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 40));

        btn_review_result.setBackground(new java.awt.Color(102, 102, 102));
        btn_review_result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_resultMouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("VIEW RESULTS");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout btn_review_resultLayout = new javax.swing.GroupLayout(btn_review_result);
        btn_review_result.setLayout(btn_review_resultLayout);
        btn_review_resultLayout.setHorizontalGroup(
            btn_review_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btn_review_resultLayout.setVerticalGroup(
            btn_review_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.add(btn_review_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 40));

        pn_lp_review.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 457, 558, 60));

        lp_main_side.add(pn_lp_review, "card2");

        pn_lp_exam.setBackground(new java.awt.Color(66, 66, 66));
        pn_lp_exam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pn_lp_exam.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, 558, 327));

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        tf_exam_search.setBackground(new java.awt.Color(102, 102, 102));
        tf_exam_search.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tf_exam_search.setForeground(new java.awt.Color(255, 255, 255));
        tf_exam_search.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_exam_search.setText("ID");
        tf_exam_search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        btn_exam_refresh.setBackground(new java.awt.Color(102, 102, 102));
        btn_exam_refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
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
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btn_exam_refreshLayout.setVerticalGroup(
            btn_exam_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_exam_search.setBackground(new java.awt.Color(102, 102, 102));
        btn_exam_search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn_exam_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exam_searchMouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("SEARCH");

        javax.swing.GroupLayout btn_exam_searchLayout = new javax.swing.GroupLayout(btn_exam_search);
        btn_exam_search.setLayout(btn_exam_searchLayout);
        btn_exam_searchLayout.setHorizontalGroup(
            btn_exam_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btn_exam_searchLayout.setVerticalGroup(
            btn_exam_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_exam_search)
                .addGap(18, 18, 18)
                .addComponent(btn_exam_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_exam_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_exam_search, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btn_exam_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_exam_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_lp_exam.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 558, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("LIST OF QUESTIONS");
        pn_lp_exam.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 65, -1, -1));

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_exam_add.setBackground(new java.awt.Color(102, 102, 102));
        btn_exam_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exam_addMouseClicked(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ADD QUESTION");
        jLabel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout btn_exam_addLayout = new javax.swing.GroupLayout(btn_exam_add);
        btn_exam_add.setLayout(btn_exam_addLayout);
        btn_exam_addLayout.setHorizontalGroup(
            btn_exam_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btn_exam_addLayout.setVerticalGroup(
            btn_exam_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel14.add(btn_exam_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        btn_exam_edit.setBackground(new java.awt.Color(102, 102, 102));
        btn_exam_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exam_editMouseClicked(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("EDIT QUESTION");
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout btn_exam_editLayout = new javax.swing.GroupLayout(btn_exam_edit);
        btn_exam_edit.setLayout(btn_exam_editLayout);
        btn_exam_editLayout.setHorizontalGroup(
            btn_exam_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );
        btn_exam_editLayout.setVerticalGroup(
            btn_exam_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel14.add(btn_exam_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 40));

        btn_exam_delete.setBackground(new java.awt.Color(102, 102, 102));
        btn_exam_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exam_deleteMouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(102, 102, 102));
        jLabel21.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("DELETE QUESTION");
        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout btn_exam_deleteLayout = new javax.swing.GroupLayout(btn_exam_delete);
        btn_exam_delete.setLayout(btn_exam_deleteLayout);
        btn_exam_deleteLayout.setHorizontalGroup(
            btn_exam_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        btn_exam_deleteLayout.setVerticalGroup(
            btn_exam_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel14.add(btn_exam_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 140, 40));

        btn_exam_publish.setBackground(new java.awt.Color(102, 102, 102));
        btn_exam_publish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exam_publishMouseClicked(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(102, 102, 102));
        jLabel29.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("PUBLISH");
        jLabel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout btn_exam_publishLayout = new javax.swing.GroupLayout(btn_exam_publish);
        btn_exam_publish.setLayout(btn_exam_publishLayout);
        btn_exam_publishLayout.setHorizontalGroup(
            btn_exam_publishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btn_exam_publishLayout.setVerticalGroup(
            btn_exam_publishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel14.add(btn_exam_publish, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 40));

        pn_lp_exam.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 457, 560, 60));

        lp_main_side.add(pn_lp_exam, "card3");

        jPanel3.add(lp_main_side, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 570, 520));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 0, 580, 530));

        jPanel2.setBackground(new java.awt.Color(0, 131, 143));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 191, 209));

        lb_main_admin.setBackground(new java.awt.Color(255, 255, 255));
        lb_main_admin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lb_main_admin.setForeground(new java.awt.Color(255, 255, 255));
        lb_main_admin.setText("Administrator: ");

        lb_main_id.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lb_main_id.setForeground(new java.awt.Color(255, 255, 255));
        lb_main_id.setText("ID Number:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_main_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_main_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_main_admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_main_id)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 216, 230, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

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
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        btn_main_logoutLayout.setVerticalGroup(
            btn_main_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_main_logoutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btn_main_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 230, 50));

        pn_main_review.setBackground(new java.awt.Color(0, 191, 209));
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

        jPanel2.add(pn_main_review, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 50));

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
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pn_main_examLayout.setVerticalGroup(
            pn_main_examLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_main_examLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(pn_main_exam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 230, 50));

        jLabel15.setFont(new java.awt.Font("Roboto Bk", 0, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Eagle Reviewer");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Serasel\\Documents\\NetBeansProjects\\EagleAdminDesktop\\Eagle\\src\\main\\java\\com\\mycompany\\eagle\\Resources\\eaglereviewer icon.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pn_main_reviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_main_reviewMouseClicked
        switchPanel(pn_lp_review);
        pn_main_review.setBackground(Color.decode("#00BFD1"));
    }//GEN-LAST:event_pn_main_reviewMouseClicked

    private void pn_main_examMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_main_examMouseClicked
        switchPanel(pn_lp_exam);
        pn_main_exam.setBackground(Color.decode("#00BFD1"));
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
                new StudentDialog(student).setVisible(true);
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
            } catch (FirebaseException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Student deleted");
        }
    }//GEN-LAST:event_btn_review_deleteMouseClicked

    private void btn_exam_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exam_addMouseClicked
        new QuestionDialog().setVisible(true);
    }//GEN-LAST:event_btn_exam_addMouseClicked

    private void btn_exam_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exam_editMouseClicked
        int row = tb_exam_list.getSelectedRow();    
        String id = tb_exam_list.getValueAt(row, 0).toString();
        try {
            new QuestionDialog(id).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_exam_editMouseClicked

    private void btn_exam_publishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exam_publishMouseClicked
        int row = tb_exam_list.getSelectedRow();
        String id = tb_exam_list.getValueAt(row, 0).toString();
        
        try {     
            for (Question question : listOfQuestions.getQuestions()){
                //cycles through the list of questions and finds the question to publish via uid
            if (question.getQ_uid().equals(id)){
                new FirebaseCaller(new UrlManager().setQuestion(question))
                        .publishQuestion(question);
                new FirebaseCaller(new UrlManager().setKeywords(question))
                        .publishKeywords(question);                       
            }
        }
            
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
            Student student = new FirebaseCaller(new UrlManager()
                    .setStudent(tf_review_searchId.getText())).getStudent();
            new StudentDialog(student).setVisible(true);
            
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

    private void btn_exam_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exam_searchMouseClicked
        try {
            searchQuestion(tf_exam_search.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_exam_searchMouseClicked

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
            model.addRow(data);
        }
    }
    
    private void searchStudent(Student student) {
        DefaultTableModel model = setRevieweeTable();

        Vector<Object> data = new Vector<Object>();
        data.add(student.getStu_id());
        data.add(student.getStu_name());
        data.add(student.getStu_course());
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
            "RATIONALE", "ANSWER"};
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
        
        listOfQuestions = new ListOfQuestions().readQuestions();
        addExamList(listOfQuestions);
    }

    private void searchQuestion(String question_id) throws FileNotFoundException, 
            IOException, ParseException {
        Question question = new ListOfQuestions().searchQuestion(question_id);
        
        if (question == null){
            JOptionPane.showMessageDialog(null, "Question id not found");
        } else {
            new QuestionDialog(question.getQ_uid()).setVisible(true);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_exam_add;
    private javax.swing.JPanel btn_exam_delete;
    private javax.swing.JPanel btn_exam_edit;
    private javax.swing.JPanel btn_exam_publish;
    private javax.swing.JPanel btn_exam_refresh;
    private javax.swing.JPanel btn_exam_search;
    private javax.swing.JPanel btn_main_logout;
    private javax.swing.JPanel btn_review_add;
    private javax.swing.JPanel btn_review_delete;
    private javax.swing.JPanel btn_review_edit;
    private javax.swing.JPanel btn_review_refresh;
    private javax.swing.JPanel btn_review_result;
    private javax.swing.JPanel btn_review_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
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
    private javax.swing.JLabel lb_main_id;
    private javax.swing.JLayeredPane lp_main_side;
    private javax.swing.JPanel pn_lp_exam;
    private javax.swing.JPanel pn_lp_review;
    private javax.swing.JPanel pn_main_exam;
    private javax.swing.JPanel pn_main_review;
    private javax.swing.JTable tb_exam_list;
    private javax.swing.JTable tb_review_list;
    private javax.swing.JTextField tf_exam_search;
    private javax.swing.JTextField tf_review_searchId;
    // End of variables declaration//GEN-END:variables

}
