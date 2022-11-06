/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymbookings7095;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aaronmontgomery
 */
public class ChangeStaffForm extends javax.swing.JFrame {

    /**
     * Creates new form ChangeStaffForm
     */
    String username;

    public ChangeStaffForm() {
        initComponents();
        fillStaff();
        LocalDate date = LocalDate.now();
        date = date.minusYears(16L);

        //default time zone
        ZoneId defaultZoneId = ZoneId.systemDefault();

        //creating the instance of LocalDate using the day, month, year info
        LocalDate localDate = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
        System.out.println(localDate);
        //local date + atStartOfDay() + default time zone + toInstant() = Date
        Date sixteenAgo = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

        jDate.setMaxSelectableDate(sixteenAgo);
    }

    public void getUsername(String username) { //method to get stff username from log in form
        this.username = username;
    }

    public boolean intInString(String user) {

        boolean check1 = true;
        char[] ch = user.toCharArray(); //converts Strings to characheter array
        for (int i = 0; i < ch.length; i++) {
            check1 = Character.isLetter(ch[i]); //checks if there is a number in array
        }
        return check1;
    }

    private void fillStaff() {//This fills the combo box with member IDs and usernames

        List<Staff> allStaff = StaffDAL.getAllStaff();

        for (int i = 0; i < allStaff.size(); i++) {
            cbxStaff.addItem(allStaff.get(i).getstaffcbx());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jPanelCB = new javax.swing.JPanel();
        btnContinue = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbxStaff = new javax.swing.JComboBox<>();
        btnFillTable = new javax.swing.JButton();
        btnClearTable = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtAdminL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        updateDB = new javax.swing.JButton();
        lblStaffID = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        togColour = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setText("Update a Staffs data");

        jPanelCB.setBackground(new java.awt.Color(153, 153, 255));

        btnContinue.setText("Continue");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        btnUpdate.setText("Change");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Staff Username", "Staff Password", "Staff Admin Level", "Staff DOB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnFillTable.setText("Fill table");
        btnFillTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFillTableActionPerformed(evt);
            }
        });

        btnClearTable.setText("Clear table");
        btnClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel1.setText("Change here");

        updateDB.setText("Update database");
        updateDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDBActionPerformed(evt);
            }
        });

        jDate.setDateFormatString("yyyy-MM-dd");
        jDate.setMinSelectableDate(new java.util.Date(-946767503000L));

        togColour.setText("Change colour");
        togColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togColourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCBLayout = new javax.swing.GroupLayout(jPanelCB);
        jPanelCB.setLayout(jPanelCBLayout);
        jPanelCBLayout.setHorizontalGroup(
            jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCBLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(updateDB)
                        .addComponent(btnContinue))
                    .addGroup(jPanelCBLayout.createSequentialGroup()
                        .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAdminL)
                                .addComponent(txtUsername)
                                .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCBLayout.createSequentialGroup()
                                    .addGap(116, 116, 116)
                                    .addComponent(lblStaffID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(42, 42, 42)
                        .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCBLayout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(btnClearTable))
                                .addGroup(jPanelCBLayout.createSequentialGroup()
                                    .addComponent(btnUpdate)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbxStaff, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnFillTable, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))
                            .addGroup(jPanelCBLayout.createSequentialGroup()
                                .addComponent(togColour)
                                .addGap(124, 124, 124))))
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCBLayout.setVerticalGroup(
            jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCBLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCBLayout.createSequentialGroup()
                        .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCBLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(togColour))
                                .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCBLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(cbxStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFillTable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnClearTable)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelCBLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelCBLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(btnUpdate))
                                            .addGroup(jPanelCBLayout.createSequentialGroup()
                                                .addComponent(lblStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAdminL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateDB))
                            .addGroup(jPanelCBLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnContinue)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelCBLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addContainerGap(809, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jPanelCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        AdminForm logB = new AdminForm();
        logB.getUsername(username);
        logB.setSize(800, 600);

        logB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logB.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinueActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        /*
        //date,time,mem,staff
        Date updatedDate = jdateBooking.getDate();
        DateFormat dFormat = new SimpleDateFormat("yyyy-mm-dd");
        String date = dFormat.format(updatedDate);

        String updatedTime=cbxtime.getSelectedItem().toString();

        String updateMem=txtMemUser.getText();
        String updateStaff=txtStaffUser.getText();

        Booking newBooking= new Booking(updatedTime,updateMem,updateStaff,date);

        BookingDAL.updateBooking(newBooking);

         */
        //This code updates the JTable with the changed pieces of data in the text fields.
        //get table model
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {
            //if single row is selected then update

            String staffID = lblStaffID.getText();
            String user = txtUsername.getText();
            if (user.isEmpty()) {
                JOptionPane.showMessageDialog(this, "One of the text fields are empty");
            } else {
                boolean intCheck = intInString(user);
                if (intCheck == false) {
                    JOptionPane.showMessageDialog(this, "Username can not have numeber in it");
                } else {

                    user = user.substring(0, 2).toUpperCase() + user.substring(2);

                    String pass = txtPassword.getText();
                    if (pass.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "One of the text fields are empty");
                    } else {

                        if ((pass.length() < 5) || (!Character.isUpperCase(pass.charAt(0)))) {
                            JOptionPane.showMessageDialog(this, "Password needs to be 5 characters and nees a capital letter at start ");
                        } else {

                            String admin = txtAdminL.getText();
                            if (admin.isEmpty()) {
                                JOptionPane.showMessageDialog(this, "One of the text fields are empty");
                            } else {

                                System.out.println(admin);
                                boolean ad = false;
                                if ((admin.equals("staff")) || (admin.equals("admin"))) {
                                    ad = true;
                                } else {
                                    ad = false;
                                }
                                if (ad == false) {
                                    JOptionPane.showMessageDialog(this, "Admin level needs to be 'staff'or'admin' ");
                                } else {

                                    Date chosenDate = jDate.getDate();
                                    if (chosenDate == null) {
                                        JOptionPane.showMessageDialog(this, "Need to choose a date");
                                    } else {
                                        DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
                                        //need to make sure 18
                                        String date = dFormat.format(chosenDate);
                                        if (date.isEmpty()) {
                                            JOptionPane.showMessageDialog(this, "One of the text fields are empty");
                                        } else {

                                            //set updated value on table row
                                            tblModel.setValueAt(staffID, jTable1.getSelectedRow(), 0);
                                            tblModel.setValueAt(user, jTable1.getSelectedRow(), 1);
                                            tblModel.setValueAt(pass, jTable1.getSelectedRow(), 2);
                                            tblModel.setValueAt(admin, jTable1.getSelectedRow(), 3);
                                            tblModel.setValueAt(date, jTable1.getSelectedRow(), 4);
                                            //update message display
                                            JOptionPane.showMessageDialog(this, "updated ");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {

            if (jTable1.getRowCount() == 0) {
                //if table empty
                JOptionPane.showMessageDialog(this, "table empty ");
            } else {
                //if row is not selected or multiple rows selected
                JOptionPane.showMessageDialog(this, "Please select a row for updating ");
            }
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            //This code loads the row clicked form the JTable into the textfields to be changed

            //set data to their textfield
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

            //set data to text field when row is selected
            String staffIDTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
            String userTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String passTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String adminTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
            Date dob = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblModel.getValueAt(jTable1.getSelectedRow(), 4));
            //System.out.println(dob+"this is dob");

            //set to textfield
            jDate.setDate(dob);
            lblStaffID.setText(staffIDTbl);
            txtUsername.setText(userTbl);
            txtPassword.setText(passTbl);
            txtAdminL.setText(adminTbl);
        } catch (ParseException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnFillTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillTableActionPerformed
        String chosenStaff = cbxStaff.getSelectedItem().toString();
        //get m from from of memuser and id before
        String[] split = chosenStaff.split(" ");
        String staffID = split[1];
        int sID = Integer.parseInt(split[1]);
        String staffUser = split[0];
        Staff m = new Staff(sID, staffUser, "", "", "");

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //initalising table
        for (int x = 0; x < jTable1.getRowCount(); x++) {
            model.removeRow(x);
        }
        ArrayList<Staff> b = StaffDAL.getStaffbyID(m); //array of all bookings by the members ID
        //System.out.println(b.length);
        if (b.size() == 0) {//check if member has bookings
            System.out.println("member has no bookings");
            JOptionPane.showMessageDialog(this, "Member has no bookings");//
        }
        for (int i = 0; i < b.size(); i++) { //adding the bookings into the table
            model.addRow(new Object[]{b.get(i).getStaffID(), b.get(i).getstaffUsername(), b.get(i).getstaffPassword(), b.get(i).getstaffAdminLevel(), b.get(i).getstaffDOB()});
        }

    }//GEN-LAST:event_btnFillTableActionPerformed

    private void btnClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //removes row when button pressed
        for (int x = 0; x < jTable1.getRowCount(); x++) {
            model.removeRow(x);
        }
    }//GEN-LAST:event_btnClearTableActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void updateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDBActionPerformed
        try {
            //get selected row and its properties and use insert method.
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

            //set data to text field when row is selected
            String bookingIDTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
            String timeTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String dateTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String staffTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
            Date dob = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblModel.getValueAt(jTable1.getSelectedRow(), 3));
            System.out.println(dob + "this is dob");
            jDate.setDate(dob);
            //set to textfield
            String sID = lblStaffID.getText();
            int staffID = Integer.parseInt(sID);
            String updUser = txtUsername.getText();
            String updPass = txtPassword.getText();
            String updAdmin = txtAdminL.getText();
            Date chosenDate = jDate.getDate();
            DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
            String upddate = dFormat.format(chosenDate);

            Staff updateS = new Staff(staffID, updUser, updPass, updAdmin, upddate);//an object with data from JTable
            //method in booking DAL to upadte table
            StaffDAL.updateStaff(updateS);
            JOptionPane.showMessageDialog(this, "Table updated");
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_updateDBActionPerformed

    private void togColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togColourActionPerformed
        Color original = new Color(153, 153, 255);
        if (togColour.isSelected()) {
            //  jPanel1.setBackground(Color.white); cant see buttons
            jPanelCB.setBackground(Color.yellow);
            add(jPanelCB);
        } else {
            jPanelCB.setBackground(original);
            add(jPanelCB);
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
            java.util.logging.Logger.getLogger(ChangeStaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeStaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeStaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeStaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeStaffForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearTable;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnFillTable;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxStaff;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JToggleButton togColour;
    private javax.swing.JTextField txtAdminL;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JButton updateDB;
    // End of variables declaration//GEN-END:variables
}
