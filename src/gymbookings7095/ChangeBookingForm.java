/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymbookings7095;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class ChangeBookingForm extends javax.swing.JFrame {

    //static Member m;
    /**
     * Creates new form ChangeBookingForm
     */
    String username;

    public ChangeBookingForm() {
        initComponents();
        membersFill();
        Jdate.setMinSelectableDate(new Date());
    }

    public void getUsername(String username) { //method to get stff username from log in form
        this.username = username;
    }

    public boolean intInString(String fore, String sur) {

        boolean check1 = true;
        char[] ch = fore.toCharArray(); //converts Strings to characheter array
        for (int i = 0; i < ch.length; i++) {
            check1 = Character.isLetter(ch[i]); //checks if there is a number in array
        }
        return check1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCB = new javax.swing.JPanel();
        btnContinue = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbxMem = new javax.swing.JComboBox<>();
        btnFillTable = new javax.swing.JButton();
        btnClearTable = new javax.swing.JButton();
        txtTime = new javax.swing.JTextField();
        txtStaffUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        updateDB = new javax.swing.JButton();
        lblBookingID = new javax.swing.JLabel();
        Jdate = new com.toedter.calendar.JDateChooser();
        togColour = new javax.swing.JToggleButton();
        lblChange = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCB.setBackground(new java.awt.Color(204, 255, 255));

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
                "Booking ID", "Time", "Date", "Staff Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });

        jLabel1.setText("Change here");

        updateDB.setText("Update database");
        updateDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDBActionPerformed(evt);
            }
        });

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCBLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateDB)
                            .addComponent(btnContinue)))
                    .addGroup(jPanelCBLayout.createSequentialGroup()
                        .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStaffUsername)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtTime)
                            .addComponent(lblBookingID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCBLayout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxMem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFillTable, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                            .addComponent(togColour)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCBLayout.createSequentialGroup()
                        .addComponent(Jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearTable)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelCBLayout.setVerticalGroup(
            jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCBLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCBLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(cbxMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFillTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClearTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateDB)
                        .addGap(18, 18, 18)
                        .addComponent(btnContinue)
                        .addGap(31, 31, 31))
                    .addGroup(jPanelCBLayout.createSequentialGroup()
                        .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCBLayout.createSequentialGroup()
                                .addGroup(jPanelCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCBLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(lblBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCBLayout.createSequentialGroup()
                                        .addComponent(togColour)
                                        .addGap(59, 59, 59)
                                        .addComponent(btnUpdate)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtStaffUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(39, Short.MAX_VALUE))))
        );

        lblChange.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblChange.setText("CHANGE BOOKING");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblChange, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblChange)
                .addGap(18, 18, 18)
                .addComponent(jPanelCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void membersFill() {

        List<Member> allMembers = MemberDAL.getAllMember();

        for (int i = 0; i < allMembers.size(); i++) {
            cbxMem.addItem(allMembers.get(i).getShortString());
        }
    }

    /*public void fillTable(){
        String chosenMember = cbxMem.getSelectedItem().toString();
  //get m from from of memuser and id before 
  String[] split = chosenMember.split(" ");
        String memID = split[0];
        int mID = Integer.parseInt(split[0]);
        String memUser = split[1]; 
  Member m=new Member(mID,memUser,"",""); 
  
  DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    for(int x = 0; x < jTable1.getRowCount(); x++){
        model.removeRow(x);
    }
    Booking[] b = BookingDAL.getMemberBookings(m);
    System.out.println(b.length);
    for(int i = 0; i < b.length; i ++){
        model.addRow(new Object[]{b[i].getBookingID(), b[i].getBookingTime(), b[i].getBookingDate(), b[i].getStaffUsername()});
    }
  }
     */

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

            String bookingID = lblBookingID.getText();
            String time = txtTime.getText();
            if (time.isEmpty()) {
                JOptionPane.showMessageDialog(this, "One of the text fields are empty");
            } else {
                boolean t = true;
                if (("11:00".equals(time)) || ("12:00".equals(time)) || ("13:00".equals(time))
                        || ("14:00".equals(time)) || ("15:00".equals(time)) || ("16:00".equals(time)) || ("17:00".equals(time)) || ("18:00".equals(time)) || ("19:00".equals(time))) {
                    System.out.println("time correct");
                } else {
                    t = false;

                }
                if (t == false) {
                    JOptionPane.showMessageDialog(this, "Time is not valid has to be between 11:00-19:00 ");
                } else {
                    Date chosenDate = Jdate.getDate();
                    DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
                    if (chosenDate == null) {
                        JOptionPane.showMessageDialog(this, "Need to choose a date");
                    } else {
//need to make sure 18
                        String date = dFormat.format(chosenDate);
                        if (date.isEmpty()) {
                            JOptionPane.showMessageDialog(this, "One of the text fields are empty");
                        } else {
                            //validate date
                            String staff = txtStaffUsername.getText();
                            if (staff.isEmpty()) {
                                JOptionPane.showMessageDialog(this, "One of the text fields are empty");
                            } else {
                                boolean stafff = true;
                                ArrayList<Staff> s = new ArrayList<Staff>(); //This loops through the arrray list made in the getPasswordUsername method
                                s = StaffDAL.getPasswordUsername();
                                for (int i = 0; i < s.size(); i++) {
                                    //fic=xed with !!!!!!

                                    if (s.get(i).getstaffUsername().equals(staff)) {
                                        System.out.println(s.get(i).getstaffUsername() + staff);
                                        stafff = true;
                                        break;
                                    } else {
                                        stafff = false;
                                    }
                                }
                                System.out.println(stafff);

                                if (stafff == false) {
                                    JOptionPane.showMessageDialog(this, "staff not found in database ");
                                } else {
                                    //set updated value on table row
                                    tblModel.setValueAt(bookingID, jTable1.getSelectedRow(), 0);
                                    tblModel.setValueAt(time, jTable1.getSelectedRow(), 1);
                                    tblModel.setValueAt(date, jTable1.getSelectedRow(), 2);
                                    tblModel.setValueAt(staff, jTable1.getSelectedRow(), 3);
                                    //update message display
                                    JOptionPane.showMessageDialog(this, "updated lol ");
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

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        BookingMenuForm logB = new BookingMenuForm();
        logB.getUsername(username);

        logB.setSize(800, 600);

        logB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logB.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinueActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            //This code loads the row clicked form the JTable into the textfields to be changed

//set data to their textfield
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

//set data to text field when row is selected
            String bookingIDTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
            String timeTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String staffTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
            Date dob = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblModel.getValueAt(jTable1.getSelectedRow(), 2));
            System.out.println(dob + "this is dob");
            Jdate.setDate(dob);
//set to textfield
            lblBookingID.setText(bookingIDTbl);
            txtTime.setText(timeTbl);

            txtStaffUsername.setText(staffTbl);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnFillTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillTableActionPerformed
        String chosenMember = cbxMem.getSelectedItem().toString();
        //get m from from of memuser and id before 
        String[] split = chosenMember.split(" ");
        String memID = split[0];
        int mID = Integer.parseInt(split[0]);
        String memUser = split[1];
        Member m = new Member(mID, memUser, "", "");

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //initalising table
        for (int x = 0; x < jTable1.getRowCount(); x++) {
            model.removeRow(x);
        }
        Booking[] b = BookingDAL.getMemberBookings(m); //array of all bookings by the members ID
        //System.out.println(b.length);
        if (b.length == 0) {//check if member has bookings
            System.out.println("member has no bookings");
            JOptionPane.showMessageDialog(this, "Member has no bookings");//
        }
        for (int i = 0; i < b.length; i++) {//inserting bookings into table
            model.addRow(new Object[]{b[i].getBookingID(), b[i].getBookingTime(), b[i].getBookingDate(), b[i].getStaffUsername()});
        }
    }//GEN-LAST:event_btnFillTableActionPerformed

    private void btnClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //removes row when button pressed
        for (int x = 0; x < jTable1.getRowCount(); x++) {
            model.removeRow(x);
        }
    }//GEN-LAST:event_btnClearTableActionPerformed

    private void updateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDBActionPerformed
        try {
            //get selected row and its properties and use insert method.
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

            //set data to text field when row is selected
            String bookingIDTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
            String timeTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String staffTbl = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
            Date dob = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblModel.getValueAt(jTable1.getSelectedRow(), 2));
            System.out.println(dob + "this is dob");
            Jdate.setDate(dob);
            //set to textfield
            String bID = lblBookingID.getText();
            int bookingID = Integer.parseInt(bID);
            String updTime = txtTime.getText();
            Date chosenDate = Jdate.getDate();
            DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");

            String updDate = dFormat.format(chosenDate);

            String updStaff = txtStaffUsername.getText();
            Booking updateB = new Booking(bookingID, updTime, updDate, updStaff);//an object with data from JTable
            //method in booking DAL to upadte table
            BookingDAL.updateBooking(updateB);
            JOptionPane.showMessageDialog(this, "Table updated");
        } catch (ParseException ex) {
            Logger.getLogger(ChangeBookingForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateDBActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void togColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togColourActionPerformed
        Color original = new Color(204, 255, 255);
        if (togColour.isSelected()) {
            //  jPanel1.setBackground(Color.white); cant see buttons
            jPanelCB.setBackground(Color.yellow);
            add(jPanelCB);
        } else {
            jPanelCB.setBackground(original);
            add(jPanelCB);
        }
    }//GEN-LAST:event_togColourActionPerformed
    /*
    public void setMember(Member m){
        this.m = m;
    }
     */
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
            java.util.logging.Logger.getLogger(ChangeBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeBookingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Jdate;
    private javax.swing.JButton btnClearTable;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnFillTable;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxMem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBookingID;
    private javax.swing.JLabel lblChange;
    private javax.swing.JToggleButton togColour;
    private javax.swing.JTextField txtStaffUsername;
    private javax.swing.JTextField txtTime;
    private javax.swing.JButton updateDB;
    // End of variables declaration//GEN-END:variables
}