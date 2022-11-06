package gymbookings7095;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aaronmontgomery
 */
public class BookingMenuForm extends javax.swing.JFrame {

    String username;//used to send the staff username to booking form

    /**
     * Creates new form BookingMenuForm
     */
    public BookingMenuForm() {
        initComponents();
    }

    public void getUsername(String username) { //method to get stff username from log in form
        this.username = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBMenuBook = new javax.swing.JLabel();
        lblBMenuDelete = new javax.swing.JLabel();
        lblBMenuChange = new javax.swing.JLabel();
        btnBMenuBook = new javax.swing.JButton();
        btnBMenuDelete = new javax.swing.JButton();
        btnBMenuChange = new javax.swing.JButton();
        lblMemberMenu = new javax.swing.JLabel();
        AddMember = new javax.swing.JButton();
        lblViewBooking = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        lblAdminMenu = new javax.swing.JLabel();
        btnAdminF = new javax.swing.JButton();
        togColour = new javax.swing.JToggleButton();
        lblTitleBMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setToolTipText("");

        lblBMenuBook.setText("MAKE A BOOKING---->");

        lblBMenuDelete.setText("DELETE A BOOKING---->");

        lblBMenuChange.setText("CHANGE BOOKING---->");

        btnBMenuBook.setText("BOOK");
        btnBMenuBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBMenuBookActionPerformed(evt);
            }
        });

        btnBMenuDelete.setText("DELETE");
        btnBMenuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBMenuDeleteActionPerformed(evt);
            }
        });

        btnBMenuChange.setText("CHANGE");
        btnBMenuChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBMenuChangeActionPerformed(evt);
            }
        });

        lblMemberMenu.setText("GO TO MEMBERS MENU--->");

        AddMember.setText("MEMBERS ");
        AddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberActionPerformed(evt);
            }
        });

        lblViewBooking.setText("VIEW BOOKING-------->");

        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblAdminMenu.setText("Admin menu--->");

        btnAdminF.setText("Admin");
        btnAdminF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminFActionPerformed(evt);
            }
        });

        togColour.setText("Change colour");
        togColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togColourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblBMenuDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBMenuChange, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblBMenuBook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblMemberMenu)
                            .addComponent(lblViewBooking))
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBMenuChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBMenuDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBMenuBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(togColour))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAdminMenu)
                        .addGap(45, 45, 45)
                        .addComponent(btnAdminF)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdminMenu)
                    .addComponent(btnAdminF))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBMenuBook)
                    .addComponent(btnBMenuBook))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBMenuDelete)
                            .addComponent(btnBMenuDelete)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(togColour)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBMenuChange)
                    .addComponent(btnBMenuChange))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViewBooking)
                    .addComponent(btnView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMemberMenu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddMember, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19))
        );

        lblTitleBMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitleBMenu.setText("BOOKING MENU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblTitleBMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitleBMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBMenuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBMenuDeleteActionPerformed
        DeleteBookingForm logB = new DeleteBookingForm(); //when button pressed will send you to the delete booking form
        logB.getUsername(username);

        logB.setSize(800, 600);

        logB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logB.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBMenuDeleteActionPerformed

    private void btnBMenuBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBMenuBookActionPerformed
        BookingForm logB = new BookingForm();
        logB.setUsername(username);

        logB.setSize(800, 600);

        logB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logB.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBMenuBookActionPerformed

    private void btnBMenuChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBMenuChangeActionPerformed
        ChangeBookingForm logC = new ChangeBookingForm();
        logC.getUsername(username);
        //logC.fillTable();
        logC.setSize(800, 600);

        logC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBMenuChangeActionPerformed

    private void AddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberActionPerformed
        MembersMenu logM = new MembersMenu(); // need to make main menu for members to look at the data and delet update 
        logM.getUsername(username);

        logM.setSize(800, 600);

        logM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddMemberActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        ViewBookingForm logv = new ViewBookingForm(); // need to make main menu for members to look at the data and delet update 
        logv.getUsername(username);

        logv.setSize(800, 600);

        logv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAdminFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminFActionPerformed
        CheckAdminForm logv = new CheckAdminForm(); // need to make main menu for members to look at the data and delet update 
        logv.getUsername(username);

        logv.setSize(800, 600);

        logv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logv.setVisible(true);
        this.setVisible(false);
//form that you choose your staff username and has a password system. 
//combo box where you choose your staff username and id and then enter password then use ID to check if admin.        
//Staff newStaff= new Staff(username);
        //to check if admin level is correct make method that can get staff id by username and then if that is username only
        //has one id then check staff level else bring up different form to choose correct id.
        /*
          Staff[] b = StaffDAL.getStaffIDbyU(newStaff);
        System.out.println("after method");
      System.out.println(b.length);
    if(b.length==1){
        System.out.println("username has one id");
        JOptionPane.showMessageDialog(this, "username has one id");
        //check admin level
        for(int i=0;i<b.length;i++){
            b[i].AdLev();
            System.out.println("");
        }
       AdminForm logv = new AdminForm(); // need to make main menu for members to look at the data and delet update 
            

            logv.setSize(800, 600);

            logv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            logv.setVisible(true);
    
    }else{
        
    }
          
          StaffIDForm logv = new StaffIDForm(); // need to make main menu for members to look at the data and delet update 
            

            logv.setSize(800, 600);

            logv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            logv.setVisible(true);
         */
    }//GEN-LAST:event_btnAdminFActionPerformed

    private void togColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togColourActionPerformed
        Color original = new Color(255, 255, 204);
        if (togColour.isSelected()) {
            //  jPanel1.setBackground(Color.white); cant see buttons
            jPanel1.setBackground(Color.yellow);
            add(jPanel1);
        } else {
            jPanel1.setBackground(original);
            add(jPanel1);
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
            java.util.logging.Logger.getLogger(BookingMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingMenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMember;
    private javax.swing.JButton btnAdminF;
    private javax.swing.JButton btnBMenuBook;
    private javax.swing.JButton btnBMenuChange;
    private javax.swing.JButton btnBMenuDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdminMenu;
    private javax.swing.JLabel lblBMenuBook;
    private javax.swing.JLabel lblBMenuChange;
    private javax.swing.JLabel lblBMenuDelete;
    private javax.swing.JLabel lblMemberMenu;
    private javax.swing.JLabel lblTitleBMenu;
    private javax.swing.JLabel lblViewBooking;
    private javax.swing.JToggleButton togColour;
    // End of variables declaration//GEN-END:variables

}
