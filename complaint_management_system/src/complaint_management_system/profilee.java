/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package complaint_management_system;

import static complaint_management_system.db.mycon;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author collins
 */
public class profilee extends javax.swing.JPanel {
    ResultSet rs;
    PreparedStatement st;
    java.sql.Connection conn=db.mycon();
    JpanelLoader jPload = new JpanelLoader();


    /**
     * Creates new form FollowUp
     */
    public profilee() {
        initComponents();
        
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        infopage = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Edit = new javax.swing.JButton();
        Update_Profile = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        reg_no = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        Usre = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        search = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Profile");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(963, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        infopage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Name");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Reg/Work Number");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Username");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Email");

        Edit.setBackground(new java.awt.Color(0, 153, 0));
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complaint_management_system/icons/edit.png"))); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Update_Profile.setBackground(new java.awt.Color(0, 0, 153));
        Update_Profile.setForeground(new java.awt.Color(255, 255, 255));
        Update_Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complaint_management_system/icons/update.png"))); // NOI18N
        Update_Profile.setText("Update");
        Update_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ProfileActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 0, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complaint_management_system/icons/back.png"))); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText("Phone Number");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Password");

        NAME.setEditable(false);
        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });

        Usre.setEditable(false);
        Usre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsreActionPerformed(evt);
            }
        });

        mail.setEditable(false);
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });

        phone.setEditable(false);

        Pass.setEditable(false);
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complaint_management_system/icons/search.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infopageLayout = new javax.swing.GroupLayout(infopage);
        infopage.setLayout(infopageLayout);
        infopageLayout.setHorizontalGroup(
            infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopageLayout.createSequentialGroup()
                .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infopageLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)))
                    .addGroup(infopageLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel15)))
                .addGap(90, 90, 90)
                .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infopageLayout.createSequentialGroup()
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Update_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jButton7))
                    .addGroup(infopageLayout.createSequentialGroup()
                        .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(Pass)
                            .addComponent(reg_no)
                            .addComponent(NAME)
                            .addComponent(mail))
                        .addGap(70, 70, 70)
                        .addComponent(search))
                    .addComponent(Usre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        infopageLayout.setVerticalGroup(
            infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reg_no, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infopageLayout.createSequentialGroup()
                        .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(40, 40, 40)
                        .addComponent(Usre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16))
                .addGap(40, 40, 40)
                .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infopageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(infopage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(infopage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        reg_no.setEditable(true);
        mail.setEditable(true);
        phone.setEditable(true);
    }//GEN-LAST:event_EditActionPerformed

    private void Update_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ProfileActionPerformed
        // TODO add your handling code here:
        try {
            // Retrieve text values from UI components
            String value1 = reg_no.getText();  // New egWorkNumber
            String value2 = mail.getText();  // New email
            String value3 = phone.getText(); // New phone number
            String value4 = Usre.getText(); // Assuming RegWorkNumber is a UI component for registration work number

            // Construct the SQL query using a prepared statement with parameterized query
            String sql = "UPDATE user SET RegWorkNumber=?, email=?, PhoneNumber=? WHERE username=?";
            PreparedStatement statement = mycon().prepareStatement(sql);

            // Set parameter values
            statement.setString(1, value1);   // Set new username
            statement.setString(2, value2);   // Set new email
            statement.setString(3, value3);   // Set new phone number
            statement.setString(4, value4); // Set registration work number

            // Execute the update operation
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Profile Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update profile. Registration work number not found.");
            }
        }catch (Exception e) {
            // Log the exception and display an error message
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
        // Handle other exceptions
        finally {
            // Close resources (if applicable)
            // Close the database connection, statement, and result set
        }
    }//GEN-LAST:event_Update_ProfileActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEActionPerformed

    private void UsreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsreActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String sql="Select * from user where RegWorkNumber=?";
        try{
            PreparedStatement st = mycon().prepareStatement(sql);
            st.setString(1, reg_no.getText());
            ResultSet res = st.executeQuery();

            if(res.next()){
                String add1=res.getString("RegWorkNumber");
                reg_no.setText(add1);

                String add2=res.getString("Name");
                NAME.setText(add2);

                String add3=res.getString("username");
                Usre.setText(add3);

                String add4=res.getString("email");
                mail.setText(add4);
                String add5=res.getString("PhoneNumber");
                phone.setText(add5);
                String add6=res.getString("password");
                Pass.setText(add6);

              
            }else{
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, "Enter The Correct Registration or Work Number");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JTextField NAME;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JButton Update_Profile;
    private javax.swing.JTextField Usre;
    private javax.swing.JPanel infopage;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField reg_no;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
