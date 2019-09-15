/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Dialogs;

import com.mycompany.eagle.Entities.Result;

public class ResultDialog extends javax.swing.JDialog {
    private Result result;

    public ResultDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public ResultDialog(){
        initComponents();
    }

    public ResultDialog(Result result) {
        this.result = result;
        initComponents();     
        initValues();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lb_result_topics = new javax.swing.JLabel();
        lb_result_subject = new javax.swing.JLabel();
        lb_result_difficulty = new javax.swing.JLabel();
        lb_result_id = new javax.swing.JLabel();
        lb_result_score = new javax.swing.JLabel();
        lb_result_percent = new javax.swing.JLabel();
        lb_result_date = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_result_topics.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_topics.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_topics.setText("Topics:");
        jPanel3.add(lb_result_topics, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lb_result_subject.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_subject.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_subject.setText("Subject:");
        jPanel3.add(lb_result_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        lb_result_difficulty.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_difficulty.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_difficulty.setText("Difficulty:");
        jPanel3.add(lb_result_difficulty, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lb_result_id.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_id.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_id.setText("ID:");
        jPanel3.add(lb_result_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lb_result_score.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_score.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_score.setText("Score:");
        jPanel3.add(lb_result_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lb_result_percent.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_percent.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_percent.setText("Percentage:");
        jPanel3.add(lb_result_percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        lb_result_date.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_result_date.setForeground(new java.awt.Color(255, 255, 255));
        lb_result_date.setText("Date:");
        jPanel3.add(lb_result_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 191, 209));

        jLabel15.setFont(new java.awt.Font("Roboto Bk", 0, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Exam Results");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 158, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResultDialog dialog = new ResultDialog(new javax.swing.JFrame(), true);
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
    
    private void initValues() {
        String topics = "";
        
        lb_result_id.setText("ID: " + result.getRes_tsMillis());
        lb_result_date.setText("Date: " + result.getRes_date());
        lb_result_difficulty.setText("Difficulty: " + result.getRes_difficulty());
        lb_result_subject.setText("Subject: " + result.getRes_subject());
        lb_result_score.setText("Score: " + result.getRes_corrects() + "/" + result.getRes_questions());
        lb_result_percent.setText("Percentage: " + result.getRes_percent() + "%");
        
        for (String topic : result.getSubtopics()){
            topics = topics + topic + ", ";
        }
        
        lb_result_topics.setText("Topics: " + topics.substring(0, topics.length()-2));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_result_date;
    private javax.swing.JLabel lb_result_difficulty;
    private javax.swing.JLabel lb_result_id;
    private javax.swing.JLabel lb_result_percent;
    private javax.swing.JLabel lb_result_score;
    private javax.swing.JLabel lb_result_subject;
    private javax.swing.JLabel lb_result_topics;
    // End of variables declaration//GEN-END:variables

}
