/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems.employee.ui;

import com.ems.database.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import com.ems.login.ui.Login;

/**
 *
 * @author 2ndyrGroupB
 */
public class TaskManager extends javax.swing.JInternalFrame {
     private int emp_ID=new Login().empID;
    /**
     * Creates new form TaskManager
     */
    public TaskManager() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        taskTable = new javax.swing.JTable();
        searchTxtField = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(790, 531));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Task Manager ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        taskTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        taskTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        taskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ID#", "Emp ID#", "Email", "Work Title", "Task Description", "Starting Date", "Due Date"
            }
        ));
        jScrollPane2.setViewportView(taskTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 730, 150));

        searchTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtFieldActionPerformed(evt);
            }
        });
        jPanel1.add(searchTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 770, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtFieldActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_searchTxtFieldActionPerformed
     public void taskManager(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sd-202", "root", "");
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM employee_task where emp_id='"+emp_ID+"'");
            ResultSet rs = pstm.executeQuery();
            DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
            while(rs.next()){
                model.addRow(new Object[]{rs.getInt(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JTable taskTable;
    // End of variables declaration//GEN-END:variables
}
