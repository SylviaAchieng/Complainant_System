 
package complaint_management_system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Babygirl
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Register = new javax.swing.JPanel();
        user2 = new javax.swing.JLabel();
        user3 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        reg2 = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cRank = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Newuser = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        user1 = new javax.swing.JLabel();
        user4 = new javax.swing.JLabel();
        txtregwork = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        user5 = new javax.swing.JLabel();
        txtsanswer = new javax.swing.JTextField();
        user6 = new javax.swing.JLabel();
        user7 = new javax.swing.JLabel();
        squiz = new javax.swing.JComboBox<>();
        check = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Register.setBackground(new java.awt.Color(102, 102, 102));
        Register.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        user2.setBackground(new java.awt.Color(255, 255, 255));
        user2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        user2.setForeground(new java.awt.Color(255, 255, 255));
        user2.setText("Email");

        user3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        user3.setForeground(new java.awt.Color(255, 255, 255));
        user3.setText("Password");

        txtmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtmail.setForeground(new java.awt.Color(102, 102, 102));
        txtmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmailFocusLost(evt);
            }
        });
        txtmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmailActionPerformed(evt);
            }
        });

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });

        reg2.setBackground(new java.awt.Color(204, 0, 0));
        reg2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        reg2.setForeground(new java.awt.Color(255, 255, 255));
        reg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complaint_management_system/icons/cancel.png"))); // NOI18N
        reg2.setText("Cancel");
        reg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg2ActionPerformed(evt);
            }
        });

        reg.setBackground(new java.awt.Color(0, 0, 255));
        reg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        reg.setForeground(new java.awt.Color(255, 255, 255));
        reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complaint_management_system/icons/regis.png"))); // NOI18N
        reg.setText("Register");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("Username ");

        txtuser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtuser.setForeground(new java.awt.Color(102, 102, 102));
        txtuser.setText("Enter One Word Name");
        txtuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtuserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtuserFocusLost(evt);
            }
        });
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Type");

        cRank.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cRank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student ", "Staff", "Non-Staff" }));
        cRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRankActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Newuser.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Newuser.setForeground(new java.awt.Color(255, 255, 255));
        Newuser.setText("New User Registration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(Newuser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Newuser)
                .addGap(23, 23, 23))
        );

        txtname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(102, 102, 102));
        txtname.setText("Enter Your Full Name");
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        user1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        user1.setForeground(new java.awt.Color(255, 255, 255));
        user1.setText("Name");

        user4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        user4.setForeground(new java.awt.Color(255, 255, 255));
        user4.setText("Reg/Work number");

        txtregwork.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtregwork.setForeground(new java.awt.Color(102, 102, 102));
        txtregwork.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtregworkFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtregworkFocusLost(evt);
            }
        });
        txtregwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregworkActionPerformed(evt);
            }
        });

        txtphone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtphone.setForeground(new java.awt.Color(102, 102, 102));
        txtphone.setText("E.g. 07---");
        txtphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtphoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtphoneFocusLost(evt);
            }
        });
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });

        user5.setBackground(new java.awt.Color(255, 255, 255));
        user5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        user5.setForeground(new java.awt.Color(255, 255, 255));
        user5.setText("Phone Number");

        txtsanswer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtsanswer.setText("Give Answer Related To Chosen Question");
        txtsanswer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsanswerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsanswerFocusLost(evt);
            }
        });
        txtsanswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsanswerActionPerformed(evt);
            }
        });

        user6.setBackground(new java.awt.Color(255, 255, 255));
        user6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        user6.setForeground(new java.awt.Color(255, 255, 255));
        user6.setText("Security Question");

        user7.setBackground(new java.awt.Color(255, 255, 255));
        user7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        user7.setForeground(new java.awt.Color(255, 255, 255));
        user7.setText("Security Answer");

        squiz.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        squiz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a question", "What is your home town?", "What is your age?", "What is your high school name?", "How many are you in your family?" }));

        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("show password");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterLayout = new javax.swing.GroupLayout(Register);
        Register.setLayout(RegisterLayout);
        RegisterLayout.setHorizontalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLayout.createSequentialGroup()
                        .addGap(30, 89, Short.MAX_VALUE)
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLayout.createSequentialGroup()
                                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterLayout.createSequentialGroup()
                                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(reg)
                                    .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(user4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(user5)
                                        .addComponent(user3)
                                        .addComponent(user6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(user7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)))
                        .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtpass)
                                .addComponent(txtname)
                                .addComponent(txtregwork)
                                .addComponent(cRank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtuser)
                                .addComponent(txtmail)
                                .addComponent(txtphone)
                                .addComponent(reg2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtsanswer)
                                .addComponent(squiz, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(111, 111, 111))))
        );
        RegisterLayout.setVerticalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cRank, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user1))
                .addGap(27, 27, 27)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtregwork, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user4))
                .addGap(23, 23, 23)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user2)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user6)
                    .addComponent(squiz, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsanswer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user7))
                .addGap(29, 29, 29)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user5))
                .addGap(27, 27, 27)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check)
                .addGap(1, 1, 1)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome ");

        jLabel4.setFont(new java.awt.Font("Castellar", 2, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CREDENTIALS");

        jLabel5.setFont(new java.awt.Font("Castellar", 2, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TO REGISTER");

        jLabel6.setFont(new java.awt.Font("Castellar", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USING REQUIRED");

        jLabel7.setFont(new java.awt.Font("Castellar", 2, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FEEL FREE ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(213, 213, 213)
                .addComponent(jLabel5)
                .addGap(113, 113, 113)
                .addComponent(jLabel6)
                .addGap(69, 69, 69)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(167, 167, 167)
                    .addComponent(jLabel7)
                    .addContainerGap(502, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmailActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        // TODO add your handling code here:
        String Name = txtname.getText();
        String RegWorkNumber= txtregwork.getText();
        String username = txtuser.getText();
        String email = txtmail.getText();
        String secquiz = (String) squiz.getSelectedItem();
        String secanswer = txtsanswer.getText();
        String PhoneNumber = txtphone.getText();
        String pass = txtpass.getText();
        String rank = (String) cRank.getSelectedItem();
        if(Name.length()==0)
            JOptionPane.showMessageDialog(this, "Please type name");
        else if(RegWorkNumber.length()==0)
            JOptionPane.showMessageDialog(this, "Please type reg/work number");
        else if(username.length()==0)
            JOptionPane.showMessageDialog(this, "Please type username");
        else if(email.length()==0)
            JOptionPane.showMessageDialog(this, "Please type email");
        else if(secquiz.length()==0)
            JOptionPane.showMessageDialog(this, "Please select security question");
        else if(secanswer.length()==0)
            JOptionPane.showMessageDialog(this, "Please type he answer");
        else if(PhoneNumber.length()==0)
            JOptionPane.showMessageDialog(this, "Please type reg/work number");
        else if(pass.length()==0)
            JOptionPane.showMessageDialog(this, "Please type password");
        else if(rank.length()==0)
            JOptionPane.showMessageDialog(this, "Please choose rank");
        else {
    // Validate email
    if (email.length() == 0)
        JOptionPane.showMessageDialog(this, "Please type email");
    else if (!email.endsWith("@gmail.com")) {
        JOptionPane.showMessageDialog(this, "Enter correct format of email");
        txtmail.setText(""); // Clear the text field if the entered email is not a Gmail address
    } else {
        // Validate password complexity
        if (pass.length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long.");
            txtpass.getText();
        } else if (!pass.matches(".*[A-Z].*")) {
            JOptionPane.showMessageDialog(this, "Password must contain at least one uppercase letter.");
            txtpass.getText();
        } else if (!pass.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "Password must contain at least one digit.");
            txtpass.getText();
        } else if (!pass.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            JOptionPane.showMessageDialog(this, "Password must contain at least one special character.");
            txtpass.getText();
        } else{
            txtpass.getText();
                    
    
       try {
    Statement s = db.mycon().createStatement();

    // Check if email already exists
    ResultSet emailResult = s.executeQuery("SELECT * FROM users WHERE email = '" + email + "'");
    if (emailResult.next()) {
        JOptionPane.showMessageDialog(null, "The email already exists. Please sign in.");
        txtmail.setText("");
    } else {
        // Check if regwork number already exists
        ResultSet regworkResult = s.executeQuery("SELECT * FROM users WHERE RegWorkNumber='" + RegWorkNumber + "'");
        if (regworkResult.next()) {
            JOptionPane.showMessageDialog(null, "The regwork already exists. Please sign in.");
            txtregwork.setText("");
        } else {
            // Insert new user
            s.executeUpdate("INSERT INTO users(Name, RegWorkNumber, username, email,securityQuestion,securityAnswer,PhoneNumber, password, rank) VALUES ('"+Name+"','"+RegWorkNumber+"','"+username+"','"+email+"','"+secquiz+"','"+secanswer+"','"+PhoneNumber+"','"+pass+"','"+rank+"')");
             
            JOptionPane.showMessageDialog(null,"Registration Successfully");
             Login newLogin = new Login();
        newLogin.setVisible(true);            
        // Get the size of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Get the size of the frame
        Dimension frameSize = newLogin.getSize();
        // Calculate the coordinates to center the frame
        int x = (screenSize.width - frameSize.width) / 2;
        int y = (screenSize.height - frameSize.height) / 2;
        // Set the frame's location
        newLogin.setLocation(x, y);
        this.setVisible(false);
            
            
                
            // Optionally, you can automatically sign in the user after registration
            // This is where you would typically redirect the user to the login page
        }
        regworkResult.close(); // Close the ResultSet for regwork number
    }
    emailResult.close(); // Close the ResultSet for email
    s.close(); // Close the Statement
} catch(SQLException e){
    System.out.println(e);
}
        }}}
    }//GEN-LAST:event_regActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void reg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_reg2ActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void cRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cRankActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtregworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregworkActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtregworkActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtsanswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsanswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsanswerActionPerformed

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        // TODO add your handling code here:
        if(txtname.getText().equals("Enter Your Full Name")){
            txtname.setText("");
            txtname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        // TODO add your handling code here:
         if(txtname.getText().equals("")){
            txtname.setText("Enter Your Full Name");
            txtname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtnameFocusLost

    private void txtregworkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtregworkFocusGained
        // TODO add your handling code here:
       if(txtregwork.getText().equals("Enter Your Reg. Or Work Number")){
            txtregwork.setText("");
           txtregwork.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtregworkFocusGained

    private void txtregworkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtregworkFocusLost
        // TODO add your handling code here:
        if(txtregwork.getText().equals("")){
            txtregwork.setText("Enter Your Reg. Or Work Number");
           txtregwork.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtregworkFocusLost

    private void txtuserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuserFocusGained
        // TODO add your handling code here:
        if(txtuser.getText().equals("Enter One Word Name")){
            txtuser.setText("");
           txtuser.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtuserFocusGained

    private void txtuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuserFocusLost
        // TODO add your handling code here:
         if(txtuser.getText().equals("")){
            txtuser.setText("Enter One Word Name");
           txtuser.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtuserFocusLost

    private void txtmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmailFocusGained
        // TODO add your handling code here:
         if(txtmail.getText().equals("E.g.user@gmail.com")){
            txtmail.setText("");
           txtmail.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtmailFocusGained

    private void txtmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmailFocusLost
        // TODO add your handling code here:
        if(txtmail.getText().equals("")){
            txtmail.setText("E.g.user@gmail.com");
           txtmail.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtmailFocusLost

    private void txtsanswerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsanswerFocusGained
        // TODO add your handling code here:
        if(txtsanswer.getText().equals("Give Answer Related To Chosen Question")){
            txtsanswer.setText("");
          txtsanswer.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtsanswerFocusGained

    private void txtsanswerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsanswerFocusLost
        // TODO add your handling code here:
        if(txtsanswer.getText().equals("")){
            txtsanswer.setText("Give Answer Related To Chosen Question");
           txtsanswer.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtsanswerFocusLost

    private void txtphoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusGained
        // TODO add your handling code here:
        if(txtphone.getText().equals("E.g. 07---")){
            txtphone.setText("");
          txtphone.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtphoneFocusGained

    private void txtphoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusLost
        // TODO add your handling code here:
        if(txtphone.getText().equals("")){
            txtphone.setText("E.g. 07---");
           txtphone.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtphoneFocusLost

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if(check.isSelected())
        {
            txtpass.setEchoChar((char)0);
        }else
        {
            txtpass.setEchoChar('*');
        }
    }//GEN-LAST:event_checkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Newuser;
    private javax.swing.JPanel Register;
    private javax.swing.JComboBox<String> cRank;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reg;
    private javax.swing.JButton reg2;
    private javax.swing.JComboBox<String> squiz;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtregwork;
    private javax.swing.JTextField txtsanswer;
    private javax.swing.JTextField txtuser;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user2;
    private javax.swing.JLabel user3;
    private javax.swing.JLabel user4;
    private javax.swing.JLabel user5;
    private javax.swing.JLabel user6;
    private javax.swing.JLabel user7;
    // End of variables declaration//GEN-END:variables

    private void AddNewUser(String Name, String RegWorkNumber,String username, String email,String secquiz,String secanswer,String PhoneNumber, String pass, String rank) {

        Login newLogin = new Login();
        newLogin.setVisible(true);            
        // Get the size of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Get the size of the frame
        Dimension frameSize = newLogin.getSize();
        // Calculate the coordinates to center the frame
        int x = (screenSize.width - frameSize.width) / 2;
        int y = (screenSize.height - frameSize.height) / 2;
        // Set the frame's location
        newLogin.setLocation(x, y);
        this.setVisible(false);
    
    }
}
