/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems.admin.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 2ndyrGroupB
 */
public class ManageEmployee extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManageEmployee
     */
    public ManageEmployee() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        emp_idData.enable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emp_fName = new javax.swing.JTextField();
        emp_lName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emp_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emp_dpmt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emp_pos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        update_emp = new javax.swing.JButton();
        delete_emp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewAllDataTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchTableData = new javax.swing.JTable();
        searchTextField = new javax.swing.JTextField();
        emp_idData = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setAlignmentX(2.0F);
        jPanel1.setAlignmentY(2.0F);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Employee");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 7, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("First Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        emp_fName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emp_fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_fNameActionPerformed(evt);
            }
        });
        jPanel1.add(emp_fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 220, 230, 30));

        emp_lName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(emp_lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 290, 230, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Last Name :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Email :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        emp_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(emp_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 231, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Department :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        emp_dpmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(emp_dpmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 231, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Position :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        emp_pos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(emp_pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 231, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Operations :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 474, -1, -1));

        update_emp.setBackground(new java.awt.Color(0, 153, 0));
        update_emp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update_emp.setForeground(new java.awt.Color(240, 240, 240));
        update_emp.setText("Update");
        update_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_empActionPerformed(evt);
            }
        });
        jPanel1.add(update_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 499, -1, 34));

        delete_emp.setBackground(new java.awt.Color(255, 0, 0));
        delete_emp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        delete_emp.setForeground(new java.awt.Color(240, 240, 240));
        delete_emp.setText("Delete");
        delete_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_empActionPerformed(evt);
            }
        });
        jPanel1.add(delete_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 499, -1, 34));

        viewAllDataTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewAllDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID", "Email", "First Name", "Last Name", "Department", "Position"
            }
        ));
        jScrollPane1.setViewportView(viewAllDataTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 348, 679, 233));

        searchTableData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID", "Email", "First Name", "Last Name", "Department", "Position"
            }
        ));
        searchTableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(searchTableData);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 54, 679, 233));

        searchTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 10, 170, 33));

        emp_idData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emp_idData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_idDataActionPerformed(evt);
            }
        });
        jPanel1.add(emp_idData, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 82, 231, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Emp ID# :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 61, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel2.setText("View all Employee data");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 380, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("SEARCH");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void tableAllData() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sd-202", "root", "");
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM employee");
            ResultSet rs = pstm.executeQuery();
            DefaultTableModel model = (DefaultTableModel) viewAllDataTable.getModel();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void emp_fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_fNameActionPerformed

    private void emp_idDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_idDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_idDataActionPerformed

    private void searchTableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableDataMouseClicked
        // TODO add your handling code here:
        DefaultTableModel data = (DefaultTableModel) searchTableData.getModel();
        int selectIndex = searchTableData.getSelectedRow();
        emp_idData.setText(data.getValueAt(selectIndex, 0).toString());
        emp_email.setText(data.getValueAt(selectIndex, 1).toString());
        emp_fName.setText(data.getValueAt(selectIndex, 2).toString());
        emp_lName.setText(data.getValueAt(selectIndex, 3).toString());
        emp_dpmt.setText(data.getValueAt(selectIndex, 4).toString());
        emp_pos.setText(data.getValueAt(selectIndex, 5).toString());
    }//GEN-LAST:event_searchTableDataMouseClicked

    private void update_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_empActionPerformed
        // TODO add your handling code here:    
        String emp_id = emp_idData.getText();
        String emp_emailTf = emp_email.getText();
        String fName = emp_fName.getText();
        String lName = emp_lName.getText();
        String dpmt = emp_dpmt.getText();
        String pos = emp_pos.getText();

        Object[] options = {"Yes", "No"};
        int n = JOptionPane.showOptionDialog(null,
                "Would you like to update this data?",
                "Update",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        if (n == JOptionPane.YES_OPTION) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                // establish connection  
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sd-202", "root", "");
                Statement statement = con.createStatement();
                statement.executeUpdate("Update employee set email = '" + emp_emailTf + "',firstName ='" + fName + "', lastName='" + lName + "', department='" + dpmt + "', position='" + pos + "' WHERE emp_id='" + emp_id + "' ");
                JOptionPane.showMessageDialog(null, "Record has been updated...");
                statement.close();
                con.close();
                //Referesh(); //Calling Referesh() method  
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Data was not update successfully ");;
            }

        } else {
            this.setEnabled(true);
        }


    }//GEN-LAST:event_update_empActionPerformed

    private void delete_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_empActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Yes", "No"};
        int n = JOptionPane.showOptionDialog(null,
                "Would you like to delete this data?",
                "Warning",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        if (n == JOptionPane.YES_OPTION) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                // establish connection  
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sd-202", "root", "");
                Statement statement = con.createStatement();
                statement.executeUpdate("DELETE FROM employee WHERE emp_id =" + emp_idData.getText() + "");
                JOptionPane.showMessageDialog(null, "Record deleted...");
                statement.close();
                con.close();
                //Referesh(); //Calling Referesh() method  
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Data was not delete successfully ");
            }
        } else {
            this.setEnabled(true);
        }


    }//GEN-LAST:event_delete_empActionPerformed
    private void search() {
        String emp_nameTf = searchTextField.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sd-202", "root", "");
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM employee WHERE emp_id LIKE '%" + emp_nameTf + "%' OR email LIKE '%" + emp_nameTf + "%' OR firstName LIKE '%" + emp_nameTf + "%' OR lastName LIKE '%" + emp_nameTf + "%' OR department LIKE '%" + emp_nameTf + "%' OR position LIKE '%" + emp_nameTf + "%'");
            ResultSet rs = pstm.executeQuery();
            DefaultTableModel model = (DefaultTableModel) searchTableData.getModel();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)});
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Invalid input employee id..");
        }
    }
    
    private void searchTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyTyped
        DefaultTableModel dm = (DefaultTableModel) searchTableData.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();

        search();
    }//GEN-LAST:event_searchTextFieldKeyTyped

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        // TODO add your handling code here:
//        seachJuan();
    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        // TODO add your handling code here:
        if (searchTextField.getText().isEmpty()) {
            DefaultTableModel dm = (DefaultTableModel) searchTableData.getModel();
            dm.getDataVector().removeAllElements();
            dm.fireTableDataChanged();
        }
    }//GEN-LAST:event_searchTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_emp;
    private javax.swing.JTextField emp_dpmt;
    private javax.swing.JTextField emp_email;
    private javax.swing.JTextField emp_fName;
    private javax.swing.JTextField emp_idData;
    private javax.swing.JTextField emp_lName;
    private javax.swing.JTextField emp_pos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable searchTableData;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton update_emp;
    private javax.swing.JTable viewAllDataTable;
    // End of variables declaration//GEN-END:variables
}