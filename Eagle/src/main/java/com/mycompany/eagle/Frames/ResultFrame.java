package com.mycompany.eagle.Frames;

import com.mycompany.eagle.Dialogs.ResultDialog;
import com.mycompany.eagle.Entities.Result;
import com.mycompany.eagle.Entities.Student;
import com.mycompany.eagle.Utilities.FirebaseCaller;
import com.mycompany.eagle.Utilities.UrlManager;
import io.loli.datepicker.BasicDateFilter;
import io.loli.datepicker.DatePicker;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.thegreshams.firebase4j.error.FirebaseException;

public class ResultFrame extends javax.swing.JFrame {

    private Student student;
    private ArrayList<Result> results;

    public ResultFrame() {
        initComponents();
    }

    public ResultFrame(Student student) throws FirebaseException,
            UnsupportedEncodingException {
        initComponents();
        DatePicker dp = new DatePicker(tf_review_date, "MM/dd/yyyy", new BasicDateFilter());

        lb_result_name.setText("Name: " + student.getStu_name());
        lb_result_course.setText("Course: " + student.getStu_course());
        this.student = student;
        
        this.results = new FirebaseCaller(new UrlManager()
                .setStudentResults(student.getStu_id())).getResults(null, null);

        addResultList(results);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_lp_result = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_result_list = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        btn_result_view = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        btn_result_refresh = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        btn_review_search3 = new javax.swing.JPanel();
        lb_result_name = new javax.swing.JLabel();
        lb_result_course = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btn_review_search = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tf_review_subject = new javax.swing.JTextField();
        tf_review_date = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_lp_result.setBackground(new java.awt.Color(66, 66, 66));

        jLabel24.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("LIST OF EXAM RESULTS");

        tb_result_list.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tb_result_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Date Taken", "Subject", "Score", "Percentage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tb_result_list);

        jPanel20.setBackground(new java.awt.Color(102, 102, 102));

        btn_result_view.setBackground(new java.awt.Color(102, 102, 102));
        btn_result_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_result_viewMouseClicked(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(102, 102, 102));
        jLabel30.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("VIEW RESULT");
        jLabel30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout btn_result_viewLayout = new javax.swing.GroupLayout(btn_result_view);
        btn_result_view.setLayout(btn_result_viewLayout);
        btn_result_viewLayout.setHorizontalGroup(
            btn_result_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        btn_result_viewLayout.setVerticalGroup(
            btn_result_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        btn_result_refresh.setBackground(new java.awt.Color(102, 102, 102));
        btn_result_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_result_refreshMouseClicked(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(102, 102, 102));
        jLabel32.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("REFRESH");
        jLabel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout btn_result_refreshLayout = new javax.swing.GroupLayout(btn_result_refresh);
        btn_result_refresh.setLayout(btn_result_refreshLayout);
        btn_result_refreshLayout.setHorizontalGroup(
            btn_result_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_result_refreshLayout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_result_refreshLayout.setVerticalGroup(
            btn_result_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btn_result_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_result_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_result_view, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_result_refresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_review_search3.setBackground(new java.awt.Color(0, 191, 209));

        lb_result_name.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_name.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_name.setText("Student: ");

        lb_result_course.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_course.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_course.setText("Course:");

        javax.swing.GroupLayout btn_review_search3Layout = new javax.swing.GroupLayout(btn_review_search3);
        btn_review_search3.setLayout(btn_review_search3Layout);
        btn_review_search3Layout.setHorizontalGroup(
            btn_review_search3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_review_search3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_result_name)
                .addGap(208, 208, 208)
                .addComponent(lb_result_course)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_review_search3Layout.setVerticalGroup(
            btn_review_search3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_review_search3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_review_search3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_result_course)
                    .addComponent(lb_result_name))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(102, 102, 102));

        btn_review_search.setBackground(new java.awt.Color(102, 102, 102));
        btn_review_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_review_searchMouseClicked(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(102, 102, 102));
        jLabel26.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("SEARCH");
        jLabel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout btn_review_searchLayout = new javax.swing.GroupLayout(btn_review_search);
        btn_review_search.setLayout(btn_review_searchLayout);
        btn_review_searchLayout.setHorizontalGroup(
            btn_review_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        btn_review_searchLayout.setVerticalGroup(
            btn_review_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jLabel28.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Date Taken:");

        tf_review_subject.setBackground(new java.awt.Color(102, 102, 102));
        tf_review_subject.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tf_review_subject.setForeground(new java.awt.Color(255, 255, 255));
        tf_review_subject.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_review_subject.setText("Subject");
        tf_review_subject.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        tf_review_date.setBackground(new java.awt.Color(102, 102, 102));
        tf_review_date.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tf_review_date.setForeground(new java.awt.Color(255, 255, 255));
        tf_review_date.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_review_date.setText("Set Date");
        tf_review_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        tf_review_date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_review_dateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_review_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_review_date)
                .addGap(18, 18, 18)
                .addComponent(btn_review_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_review_subject)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_review_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_review_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pn_lp_resultLayout = new javax.swing.GroupLayout(pn_lp_result);
        pn_lp_result.setLayout(pn_lp_resultLayout);
        pn_lp_resultLayout.setHorizontalGroup(
            pn_lp_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_lp_resultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_lp_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_review_search3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_lp_resultLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_lp_resultLayout.setVerticalGroup(
            pn_lp_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_lp_resultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_review_search3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pn_lp_result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_lp_result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_review_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_review_searchMouseClicked
        String subject = tf_review_subject.getText();
        String date = tf_review_date.getText();

        if (subject.equals("") || subject.equals("Subject")) {
            subject = null;
        }

        if (date.equals("") || date.equals("Set Date")) {
            date = null;
        }

        if (subject == null && date == null) {
            JOptionPane.showMessageDialog(null, "Please enter a subject/date");
        } else {
            try {
                addResultList(new FirebaseCaller(new UrlManager()
                        .setStudentResults(student.getStu_id()))
                        .getResults(date, subject));

            } catch (FirebaseException ex) {
                Logger.getLogger(ResultFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(ResultFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btn_review_searchMouseClicked

    private void tf_review_dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_review_dateMouseClicked
       
    }//GEN-LAST:event_tf_review_dateMouseClicked

    private void btn_result_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_result_refreshMouseClicked
        try {
            addResultList(new FirebaseCaller(new UrlManager()
                    .setStudentResults(student.getStu_id())).getResults(null, null));
        } catch (FirebaseException ex) {
            Logger.getLogger(ResultFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ResultFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_result_refreshMouseClicked

    private void btn_result_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_result_viewMouseClicked
         int row = tb_result_list.getSelectedRow();
        String value = tb_result_list.getValueAt(row, 0).toString();
        Result selected_result = null;
        
        for (Result result : results){
            if (result.getRes_tsMillis().equals(value)){
                selected_result = result;
            }
        }
        
        new ResultDialog(selected_result).setVisible(true);
    }//GEN-LAST:event_btn_result_viewMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultFrame().setVisible(true);
            }
        });
    }

    private DefaultTableModel setResultTable() {
        DefaultTableModel model = new DefaultTableModel(0, 0);
        String header[] = new String[]{"ID", "DATE TAKEN", "SUBJECT", "SCORE",
            "PERCENTAGE"};
        model.setColumnIdentifiers(header);
        tb_result_list.setModel(model);
        return model;
    }

    private void addResultList(ArrayList<Result> results) {
        DefaultTableModel model = setResultTable();

        for (Result result : results) {
            Vector<Object> data = new Vector<Object>();
            data.add(result.getRes_tsMillis());
            data.add(result.getRes_date());
            data.add(result.getRes_subject());
            data.add(result.getRes_corrects() + "/" + result.getRes_questions());
            data.add(result.getRes_percent());
            model.addRow(data);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_result_refresh;
    private javax.swing.JPanel btn_result_view;
    private javax.swing.JPanel btn_review_search;
    private javax.swing.JPanel btn_review_search3;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_result_course;
    private javax.swing.JLabel lb_result_name;
    private javax.swing.JPanel pn_lp_result;
    private javax.swing.JTable tb_result_list;
    private javax.swing.JTextField tf_review_date;
    private javax.swing.JTextField tf_review_subject;
    // End of variables declaration//GEN-END:variables
}
