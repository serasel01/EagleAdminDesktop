package com.mycompany.eagle.Frames;

import com.mycompany.eagle.Dialogs.ResultDialog;
import com.mycompany.eagle.Entities.ListOfSubjects;
import com.mycompany.eagle.Entities.Result;
import com.mycompany.eagle.Entities.Student;
import com.mycompany.eagle.Utilities.FirebaseCaller;
import com.mycompany.eagle.Utilities.UrlManager;
import io.loli.datepicker.BasicDateFilter;
import io.loli.datepicker.DatePicker;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.thegreshams.firebase4j.error.FirebaseException;
import org.json.simple.parser.ParseException;

public class ResultFrame extends javax.swing.JFrame {

    private Student student;
    private ArrayList<Result> results;
    private String subject;

    public ResultFrame() {
        initComponents();
    }

    public ResultFrame(Student student) throws FirebaseException,
            UnsupportedEncodingException,
            IOException,
            FileNotFoundException,
            ParseException {
        initComponents();

        lb_result_name.setText("Name: " + student.getStu_name());
        lb_result_course.setText("Course: " + student.getStu_course());
        this.student = student;
        
        //shows default
        this.results = new FirebaseCaller(new UrlManager()
                .setStudentResults(student.getStu_id())).getResults(null);

        addResultList(results);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_lp_result = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_result_list = new javax.swing.JTable();
        btn_review_search3 = new javax.swing.JPanel();
        lb_result_name = new javax.swing.JLabel();
        lb_result_course = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lb_result_name1 = new javax.swing.JLabel();
        cb_review_subject = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        pn_lp_result.setBackground(new java.awt.Color(51, 51, 51));
        pn_lp_result.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("LIST OF EXAM RESULTS");
        pn_lp_result.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 85, 530, -1));

        tb_result_list.setBackground(new java.awt.Color(102, 102, 102));
        tb_result_list.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tb_result_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date Taken", "Subject", "Score", "Percentage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tb_result_list);

        pn_lp_result.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, 540, 299));

        btn_review_search3.setBackground(new java.awt.Color(51, 51, 51));
        btn_review_search3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_result_name.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_name.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_name.setText("Student: ");
        btn_review_search3.add(lb_result_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        lb_result_course.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_course.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_course.setText("Course:");
        btn_review_search3.add(lb_result_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, 30));

        pn_lp_result.add(btn_review_search3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 30));

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_result_name1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_name1.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_name1.setText("Subject:");
        jPanel16.add(lb_result_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        cb_review_subject.setBackground(new java.awt.Color(102, 102, 102));
        cb_review_subject.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cb_review_subject.setForeground(new java.awt.Color(3, 169, 244));
        cb_review_subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Subjects" }));
        cb_review_subject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_review_subjectItemStateChanged(evt);
            }
        });
        cb_review_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_review_subjectActionPerformed(evt);
            }
        });
        jPanel16.add(cb_review_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 210, 30));

        pn_lp_result.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 560, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_lp_result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_lp_result, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_review_subjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_review_subjectItemStateChanged
        subject = (String ) cb_review_subject.getSelectedItem();
    }//GEN-LAST:event_cb_review_subjectItemStateChanged

    private void cb_review_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_review_subjectActionPerformed
       subject = (String) cb_review_subject.getSelectedItem();
        
        if (subject.equals("All Subjects")){
            subject = null;
        }

        try {
            addResultList(new FirebaseCaller(new UrlManager()
                    .setStudentResults(student.getStu_id())).getResults(subject));

            } catch (FirebaseException ex) {
                Logger.getLogger(ResultFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(ResultFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ResultFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
            Logger.getLogger(ResultFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_cb_review_subjectActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultFrame().setVisible(true);
            }
        });
    }

    private DefaultTableModel setResultTable() {
        DefaultTableModel model = new DefaultTableModel(0, 0);
        String header[] = new String[]{"DATE TAKEN", "SUBJECT", "SCORE",
            "PERCENTAGE"};
        model.setColumnIdentifiers(header);
        tb_result_list.setModel(model);
        return model;
    }

    // has a parameter of reviewee's results
    private void addResultList(ArrayList<Result> results) throws IOException, 
            FileNotFoundException, ParseException {
        DefaultTableModel model = setResultTable();
        
        //get list of subjects based on user's course from JSON file
        ArrayList<String> subject_list = new ListOfSubjects()
                .readSubjects(student.getStu_course());
        
        //create a compiled list of list of results per subject
        HashMap<String, ArrayList<Result>> result_list = new HashMap<>();
        
        //creates a list inside hashmap per subject
        for (String subject : subject_list){
            ArrayList<Result> takes = new ArrayList<>();
            result_list.put(subject, takes);            
        }
        
        //iterates through list of results
        for (Result result : results) {
            
            //selects a specific subject's result list then adds the result to the list
            ArrayList<Result> acc_subj = result_list.get(result.getRes_subject());
            acc_subj.add(result);
            
            //if the list reaches 10 results
            if(acc_subj.size() == 10){
                int num_corrects = 0, num_questions = 0;
                double percentage = 0;
                String dates = acc_subj.get(0).getRes_date() + " - " + 
                        acc_subj.get(9).getRes_date();
                
                //calculates total corrects, questions and percentage
                for (Result itr : acc_subj){
                    num_corrects = num_corrects + 
                            Integer.parseInt(itr.getRes_corrects());
                    num_questions = num_questions + 
                            Integer.parseInt(itr.getRes_questions());
                    percentage = num_corrects / num_questions;
                }
                
                //displays as a row 
                Vector<Object> data = new Vector<Object>();
                data.add(dates);
                data.add(result.getRes_subject());
                data.add(String.valueOf(num_corrects) + "/" + 
                        String.valueOf(num_questions));
                data.add(String.valueOf(percentage * 100) + "%");
                model.addRow(data);
                
                //resets the list back
                acc_subj.clear();
            }            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_review_search3;
    private javax.swing.JComboBox<String> cb_review_subject;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_result_course;
    private javax.swing.JLabel lb_result_name;
    private javax.swing.JLabel lb_result_name1;
    private javax.swing.JPanel pn_lp_result;
    private javax.swing.JTable tb_result_list;
    // End of variables declaration//GEN-END:variables

}
