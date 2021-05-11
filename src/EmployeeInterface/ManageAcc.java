/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeInterface;
import loginInterface.SignIn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author 2ndyrGroupB
 */
public class ManageAcc extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManageAcc
     */
    public ManageAcc() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
//        manageAcc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        manageAccPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dpmt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        userEmail = new javax.swing.JTextField();
        btnManageAcc = new javax.swing.JButton();
        pwd = new javax.swing.JPasswordField();
        cpwd = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(790, 530));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        manageAccPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        manageAccPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Manage Account");
        manageAccPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("First Name :");
        manageAccPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 66, 30));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        manageAccPanel.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 169, 29));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Last Name : ");
        manageAccPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        lName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });
        manageAccPanel.add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 166, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Password :");
        manageAccPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Comfirm Password :");
        manageAccPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Department :");
        manageAccPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        manageAccPanel.add(dpmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 169, 28));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Position :");
        manageAccPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 50, 30));

        pos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posActionPerformed(evt);
            }
        });
        manageAccPanel.add(pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 166, 28));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Email :");
        manageAccPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        userEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userEmailActionPerformed(evt);
            }
        });
        manageAccPanel.add(userEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 169, 29));

        btnManageAcc.setBackground(new java.awt.Color(38, 153, 0));
        btnManageAcc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnManageAcc.setForeground(new java.awt.Color(240, 240, 240));
        btnManageAcc.setText("Save Changes");
        btnManageAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAccActionPerformed(evt);
            }
        });
        manageAccPanel.add(btnManageAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 110, 34));

        pwd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdActionPerformed(evt);
            }
        });
        manageAccPanel.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 170, 30));

        cpwd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        manageAccPanel.add(cpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(manageAccPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(manageAccPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameActionPerformed

    private void posActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posActionPerformed

    private void userEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userEmailActionPerformed

    private void btnManageAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageAccActionPerformed

    private void pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdActionPerformed
    public void manageAcc(){
        int empID=new SignIn().empID;
        System.out.println(empID+" ......");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sd-202", "root", "");
            Statement st =con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee where emp_id='"+empID+"'");
            while (rs.next()) {
                String s1 = rs.getString(2);
                String s2 = rs.getString(3);
                String s3 = rs.getString(4);
                String s4 = rs.getString(5);
                String s5 = rs.getString(6);
                String s6 = rs.getString(7);
               
                //Sets Records in TextFields.  
                userEmail.setText(s1);
                pwd.setText(s2);
                fname.setText(s3);
                lName.setText(s4);
                dpmt.setText(s5);
                pos.setText(s6);
                cpwd.setText(s6);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAcc;
    private javax.swing.JPasswordField cpwd;
    private javax.swing.JTextField dpmt;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lName;
    private javax.swing.JPanel manageAccPanel;
    private javax.swing.JTextField pos;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField userEmail;
    // End of variables declaration//GEN-END:variables
}
