package com.mycompany.eagle.Frames;


import com.mycompany.eagle.Utilities.FirebaseCaller;
import com.mycompany.eagle.Utilities.GoogleCloudCaller;
import com.mycompany.eagle.Utilities.SharedPrefManager;
import com.mycompany.eagle.Utilities.UrlManager;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.thegreshams.firebase4j.error.FirebaseException;
import net.thegreshams.firebase4j.model.FirebaseResponse;
import net.thegreshams.firebase4j.service.Firebase;
import org.json.simple.parser.ParseException;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_login_login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_login_id = new javax.swing.JTextField();
        pf_login_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eagle Reviewer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 220, 250, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Bk", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eaglereviewer icon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 250, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_login_login.setBackground(new java.awt.Color(244, 81, 30));
        btn_login_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_login_loginMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_login_loginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_login_loginMouseReleased(evt);
            }
        });
        btn_login_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        btn_login_login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 210, -1));

        jPanel2.add(btn_login_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        tf_login_id.setBackground(new java.awt.Color(102, 102, 102));
        tf_login_id.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tf_login_id.setForeground(new java.awt.Color(255, 255, 255));
        tf_login_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_login_id.setText("ID");
        tf_login_id.setToolTipText("");
        tf_login_id.setBorder(null);
        tf_login_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_login_idMouseClicked(evt);
            }
        });
        jPanel2.add(tf_login_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 30));

        pf_login_password.setBackground(new java.awt.Color(102, 102, 102));
        pf_login_password.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        pf_login_password.setForeground(new java.awt.Color(255, 255, 255));
        pf_login_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pf_login_password.setText("password");
        pf_login_password.setBorder(null);
        pf_login_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pf_login_passwordMouseClicked(evt);
            }
        });
        jPanel2.add(pf_login_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Bk", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Bk", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 260, 250, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_login_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_login_loginMouseClicked
        try {
            authenticateUser(tf_login_id.getText(), pf_login_password.getText());
        } catch (FirebaseException | ParseException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_login_loginMouseClicked

    private void btn_login_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_login_loginMousePressed
        btn_login_login.setBackground(Color.decode("#BF360C"));
    }//GEN-LAST:event_btn_login_loginMousePressed

    private void btn_login_loginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_login_loginMouseReleased
        btn_login_login.setBackground(Color.decode("#F4511E"));
    }//GEN-LAST:event_btn_login_loginMouseReleased

    private void tf_login_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_login_idMouseClicked
        if (tf_login_id.getText().equals("ID")){
            tf_login_id.setText("");
        }
    }//GEN-LAST:event_tf_login_idMouseClicked

    private void pf_login_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_login_passwordMouseClicked
        if (pf_login_password.getText().equals("password")){
            pf_login_password.setText("");
        }
    }//GEN-LAST:event_pf_login_passwordMouseClicked

    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
    
     private void authenticateUser(String id, String password) 
             throws FirebaseException, UnsupportedEncodingException, IOException, 
            FileNotFoundException, ParseException {
        
        UrlManager url = new UrlManager();
        
        if(new FirebaseCaller(url.setAdmin(id) + url.getPassword())
                .loginUser(password)){
            
            String name = new FirebaseCaller(url.setAdmin(id) + url.getName())
                    .getUserName(); //gets name from the link
            
            String course = new FirebaseCaller(url.setAdmin(id) + url.getCourse())
                    .getUserCourse();
            
            //save into shared preferences
            SharedPrefManager spm = new SharedPrefManager();
            spm.setId(id);
            spm.setName(name);
            spm.setCourse(course);
            
            this.dispose(); //closes login frame
            new MainFrame(id, name, course).setVisible(true); //opens main frame
            
        } else {
            JOptionPane.showMessageDialog(null, "Wrong id or password");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_login_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pf_login_password;
    private javax.swing.JTextField tf_login_id;
    // End of variables declaration//GEN-END:variables

}
