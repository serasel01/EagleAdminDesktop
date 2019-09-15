package com.mycompany.eagle.Frames;


import com.mycompany.eagle.Utilities.FirebaseCaller;
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
        tf_login_id = new javax.swing.JTextField();
        btn_login_login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pf_login_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 131, 143));
        jPanel1.setAutoscrolls(true);

        tf_login_id.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tf_login_id.setForeground(new java.awt.Color(0, 131, 143));
        tf_login_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_login_id.setText("ID");
        tf_login_id.setToolTipText("");
        tf_login_id.setBorder(null);
        tf_login_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_login_idMouseClicked(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Roboto Bk", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        javax.swing.GroupLayout btn_login_loginLayout = new javax.swing.GroupLayout(btn_login_login);
        btn_login_login.setLayout(btn_login_loginLayout);
        btn_login_loginLayout.setHorizontalGroup(
            btn_login_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_login_loginLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(84, 84, 84))
        );
        btn_login_loginLayout.setVerticalGroup(
            btn_login_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_login_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eagle Reviewer");

        jLabel3.setFont(new java.awt.Font("Roboto Bk", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eaglereviewer icon.png"))); // NOI18N

        pf_login_password.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        pf_login_password.setForeground(new java.awt.Color(0, 131, 143));
        pf_login_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pf_login_password.setText("password");
        pf_login_password.setBorder(null);
        pf_login_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pf_login_passwordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_login_id)
                            .addComponent(btn_login_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pf_login_password))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tf_login_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pf_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_login_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
     private void authenticateUser(String id, String password) throws 
            FirebaseException, UnsupportedEncodingException, IOException, 
            FileNotFoundException, ParseException {
        
        UrlManager url = new UrlManager();
        
        if(new FirebaseCaller(url.setAdmin(id) + url.getPassword())
                .loginUser(password)){
            
            String name = new FirebaseCaller(url.setAdmin(id) + url.getName())
                    .getUserName(); //gets name from the link
            
            //save into shared preferences
            SharedPrefManager spm = new SharedPrefManager();
            spm.setId(id);
            spm.setName(name);
            
            this.dispose(); //closes login frame
            new MainFrame(id, name).setVisible(true); //opens main frame
            
        } else {
            JOptionPane.showMessageDialog(null, "Wrong id or password");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_login_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pf_login_password;
    private javax.swing.JTextField tf_login_id;
    // End of variables declaration//GEN-END:variables

   
}
