package gymbookings7095;
//public abstract date
//added validation for empty

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Candidate 7095
 */
public class LoginForm extends javax.swing.JFrame {

    String staffUsername;
    boolean found = false;
    boolean notFound = true;
//StaffLoggedIn current=new StaffLoggedIn(givenUsername) ;

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();

    }

    /*
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                             
        char[] givenPassword = pwdPassword.getPassword();//to make to string loop through and cincantinate
        String pass = "";
        for (int i = 0; i < givenPassword.length; i++) {
            pass = pass + givenPassword[i];
        }
       
       String staffUsername = txtUsername.getText();
        //System.out.println(givenUsername + "   " + pass);//was a test to see if the get methods actually got the pieces of data

        ArrayList<Staff> x = new ArrayList<Staff>(); //This loops through the arrray list made in the getPasswordUsername method
        x = StaffDAL.getPasswordUsername();//need to be able to get admin level
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).getstaffUsername().equals(staffUsername)) {
                if (x.get(i).getstaffPassword().equals(pass)) {
                    System.out.println("YES");//successful login
                    JOptionPane.showMessageDialog(this, "login successful");
                    //x.getstaffAdminLevel();
                    found = true; //passwords match
                } else {
                    found = false;//username and password doesnt match
                }
            }
        }
        if (found == true) {
//Opens booking menu
            BookingMenuForm logB = new BookingMenuForm();
            logB.getUsername(staffUsername);

            logB.setSize(800, 600);

            logB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            logB.setVisible(true);
            this.setVisible(false);//sets current form to false so only the new booking one apperas
            return;
        } else {//only checks the first staff member knhfcuiwahbeuchb
            for (int l = 0; l < x.size(); l++) {//loops through each username and password and checks why the login failed.
                if (!x.get(l).getstaffPassword().equals(pass) && !x.get(l).getstaffUsername().equals(staffUsername)) {
                    System.out.println("Password and Username not found");
                  JOptionPane.showMessageDialog(this, "Password and Username incorrect");
                    break;
                } else if (x.get(l).getstaffUsername().equals(staffUsername) && (!x.get(l).getstaffPassword().equals(pass))) {
                    System.out.println("Password not found");
                   JOptionPane.showMessageDialog(this, "Password incorrect");
                    break;
                } else if (!x.get(l).getstaffUsername().equals(staffUsername) && x.get(l).getstaffPassword().equals(pass)) {
                    System.out.println("username not found");
                   JOptionPane.showMessageDialog(this, "Username incorrect");
                    break;
                }
            }

        }
    }
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoginTitle = new javax.swing.JLabel();
        panMainLoginPanel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        btnClearForm = new javax.swing.JButton();
        btnNewStaff = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        togColour = new javax.swing.JToggleButton();

        lblLoginTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLoginTitle.setText("User Login");

        panMainLoginPanel.setBackground(new java.awt.Color(255, 204, 204));

        lblUsername.setText("USERNAME");

        lblPassword.setText("PASSWORD");

        btnClearForm.setText("Clear Form");
        btnClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFormActionPerformed(evt);
            }
        });

        btnNewStaff.setText("Register new staff member");
        btnNewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewStaffActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnLogin.setText("Log in");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        togColour.setText("Change colour");
        togColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togColourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panMainLoginPanelLayout = new javax.swing.GroupLayout(panMainLoginPanel);
        panMainLoginPanel.setLayout(panMainLoginPanelLayout);
        panMainLoginPanelLayout.setHorizontalGroup(
            panMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMainLoginPanelLayout.createSequentialGroup()
                        .addComponent(btnNewStaff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(btnClearForm)
                        .addContainerGap())
                    .addGroup(panMainLoginPanelLayout.createSequentialGroup()
                        .addGroup(panMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(togColour))))
            .addGroup(panMainLoginPanelLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panMainLoginPanelLayout.setVerticalGroup(
            panMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togColour))
                .addGap(10, 10, 10)
                .addGroup(panMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMainLoginPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnClearForm)
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLoginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNewStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panMainLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLoginTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoginTitle)
                .addGap(26, 26, 26)
                .addComponent(panMainLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**/

    private void btnClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFormActionPerformed
        txtUsername.setText("");
        pwdPassword.setText("");
    }//GEN-LAST:event_btnClearFormActionPerformed

    private void btnNewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewStaffActionPerformed

        UsernameForm logfo = new UsernameForm();

        logfo.setSize(800, 600);

        logfo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNewStaffActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (txtUsername.getText().isEmpty()) {//validatoin for empty
            JOptionPane.showMessageDialog(this, "Username or password is empty");
        } else if (pwdPassword.getPassword().length <= 0) {
            JOptionPane.showMessageDialog(this, "password empty");
        } else {
            char[] givenPassword = pwdPassword.getPassword();//to make to string loop through and cincantinate
            String pass = "";
            for (int i = 0; i < givenPassword.length; i++) {
                pass = pass + givenPassword[i];
            }

            String staffUsername = txtUsername.getText();
            //System.out.println(staffUsername + "   " + pass);//was a test to see if the get methods actually got the pieces of data

            ArrayList<Staff> x = new ArrayList<Staff>(); //This loops through the arrray list made in the getPasswordUsername method
            x = StaffDAL.getPasswordUsername();//need to be able to get admin level
            //   System.out.println("before if");
            if (x.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No users in staff table");
            } else {
                System.out.println("after if");
                for (int i = 0; i < x.size(); i++) {
                    if (x.get(i).getstaffUsername().equals(staffUsername)) {
                        if (x.get(i).getstaffPassword().equals(pass)) {
                            System.out.println("YES");//successful login
                            JOptionPane.showMessageDialog(this, "login successful");
                            //x.getstaffAdminLevel();
                            found = true; //passwords match
                            break;
                        } else {
                            found = false;//username and password doesnt match
                        }
                    }
                }
                if (found == true) {
//Opens booking menu
                    BookingMenuForm logB = new BookingMenuForm();
                    logB.getUsername(staffUsername);

                    logB.setSize(800, 600);

                    logB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    logB.setVisible(true);
                    this.setVisible(false);//sets current form to false so only the new booking one apperas
                    return;
                } else {//only checks the first staff member knhfcuiwahbeuchb
                    ArrayList<Staff> y = new ArrayList<Staff>(); //This loops through the arrray list made in the getPasswordUsername method
                    y = StaffDAL.getPasswordUsername(); //go through each for just pass and username and then when l = y.size go to password and username incorrect

                    for (int l = 0; l < y.size(); l++) {//loops through each username and password and checks why the login failed.
                        System.out.println(y.get(l));
                        if (y.get(l).getstaffUsername().equals(staffUsername) && (!y.get(l).getstaffPassword().equals(pass))) {
                            System.out.println("Password not found");
                            JOptionPane.showMessageDialog(this, "Password incorrect");
                            notFound = false;
                            break;
                        } else if (!y.get(l).getstaffUsername().equals(staffUsername) && y.get(l).getstaffPassword().equals(pass)) {
                            System.out.println("username not found");
                            JOptionPane.showMessageDialog(this, "Username incorrect");
                            notFound = false;
                            break;
                        }
                    }

                    for (int l = 0; l < y.size(); l++) {//loops through each username and password and checks why the login failed.
                        if (notFound == true) {
                            if (!y.get(l).getstaffPassword().equals(pass) && !y.get(l).getstaffUsername().equals(staffUsername)) {
                                System.out.println("Password and Username not found");
                                JOptionPane.showMessageDialog(this, "Password and Username incorrect");
                                break;
                            }
                        }

                    }

                }
            }
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void togColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togColourActionPerformed
        Color original = new Color(255, 204, 204);
        if (togColour.isSelected()) {
            //  jPanel1.setBackground(Color.white); cant see buttons
            panMainLoginPanel.setBackground(Color.yellow);
            add(panMainLoginPanel);
        } else {
            panMainLoginPanel.setBackground(original);
            add(panMainLoginPanel);
        }
    }//GEN-LAST:event_togColourActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(false);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearForm;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNewStaff;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panMainLoginPanel;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JToggleButton togColour;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
public void pullThePlug() {

        WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);

        setVisible(false);
        dispose();
    }

}

/*
for (int l = 0; l < y.size(); l++) {//loops through each username and password and checks why the login failed.
                System.out.println(y.get(l));
                 if (y.get(l).getstaffUsername().equals(staffUsername) && (!y.get(l).getstaffPassword().equals(pass))) {
                    System.out.println("Password not found");
                   JOptionPane.showMessageDialog(this, "Password incorrect");
                   notFound=false;
                   break;
                } else if (!y.get(l).getstaffUsername().equals(staffUsername) && y.get(l).getstaffPassword().equals(pass)) {
                    System.out.println("username not found");
                   JOptionPane.showMessageDialog(this, "Username incorrect");
                 notFound=false;
                   break;
                }
            }
                for (int l = 0; l < y.size(); l++) {//loops through each username and password and checks why the login failed.
               if(notFound==true){
                    if (!y.get(l).getstaffPassword().equals(pass) && !y.get(l).getstaffUsername().equals(staffUsername)) {
                    System.out.println("Password and Username not found");
                  JOptionPane.showMessageDialog(this, "Password and Username incorrect");
                    break;
                }
            }
                
                
            }



*/