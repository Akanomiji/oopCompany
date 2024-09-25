/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oopcompany;

import java.awt.Event;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author com4936
 */
public class Department extends javax.swing.JFrame {

    /**
     * Creates new form OPCompany
     */
    DatabaseConnection dbConnection = new DatabaseConnection();
    SetFont setFontMs = new SetFont();

    public Department() {
        setFontMs.setFont();
        dbConnection.connectDB();
        initComponents();
        bNew();
        getDepartmentData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bNew = new javax.swing.JButton();
        bShow = new javax.swing.JButton();
        departmentCode = new javax.swing.JTextField();
        departmentName = new javax.swing.JTextField();
        bInsert = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bClose.setText("Close");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("รหัส");
        jLabel1.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ชื่อ");

        bNew.setText("New");
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });

        bShow.setText("Show");
        bShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bShowActionPerformed(evt);
            }
        });

        departmentCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departmentCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                departmentCodeKeyPressed(evt);
            }
        });

        departmentName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bInsert.setText("Insert");
        bInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertActionPerformed(evt);
            }
        });

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        table1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name"
            }
        ));
        table1.setEnabled(false);
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setMinWidth(100);
            table1.getColumnModel().getColumn(0).setPreferredWidth(100);
            table1.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bNew)
                                .addGap(18, 18, 18)
                                .addComponent(bShow)
                                .addGap(18, 18, 18)
                                .addComponent(bInsert)
                                .addGap(18, 18, 18)
                                .addComponent(bUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(bDelete)
                                .addGap(42, 42, 42)
                                .addComponent(bClose))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(departmentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(25, 25, 25)
                                .addComponent(departmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(departmentCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(departmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bInsert)
                        .addComponent(bUpdate)
                        .addComponent(bDelete)
                        .addComponent(bClose))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bNew)
                        .addComponent(bShow)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bNew() {
        departmentCode.setText(null);
        departmentName.setText(null);
        departmentCode.requestFocus();
    }

    private void getDepartmentData() {
        //((DefaultTableModel) table1.getModel()).setRowCount(0);
        String sql = "select * from department";
        departmentName.setText(null);
        try {
            ResultSet rs = dbConnection.statement.executeQuery(sql);
            while (rs.next()) {
                Object[] rowData = {rs.getString(1), rs.getString(2)};
                ((DefaultTableModel) table1.getModel()).addRow(rowData);
            }
            rs.close();
        } catch (SQLException ex) {
        }
    }

    private int searchRowIndex(String code) {
        for (int i = 0; i < table1.getRowCount(); i++) {
            if (code.equals(table1.getValueAt(i, 0))) {
                return i;
            }
        }
        return -1;
    }

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        if (JOptionPane.showConfirmDialog(this, "ปิดหรือไม่ ?", "ยืนยัน", 0) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_bCloseActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed
        bNew();
    }//GEN-LAST:event_bNewActionPerformed

    private void bShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShowActionPerformed
        String ms = departmentCode.getText() + "\n" + departmentName.getText();
        JOptionPane.showMessageDialog(this, ms);
    }//GEN-LAST:event_bShowActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        if ("".equals(departmentCode.getText())) {
            JOptionPane.showMessageDialog(this, "Update ไม่สำเร็จ");
        } else {
            String sql = "update department set departmentName = '" + departmentName.getText() + "' where departmentCode = '" + departmentCode.getText() + "'";
            int row = searchRowIndex(departmentCode.getText());
            try {
                dbConnection.statement.executeUpdate(sql);
                ((DefaultTableModel) table1.getModel()).setValueAt(departmentName.getText(), row, 1);
                JOptionPane.showMessageDialog(this, "Update สำเร็จ");
            } catch (SQLException ex) {
                Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Update ไม่สำเร็จ");
            }
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        if (JOptionPane.showConfirmDialog(this, "ลบหรือไม่ ?", "ยืนยัน", 0) == 0) {
            if ("".equals(departmentCode.getText())) {
                JOptionPane.showMessageDialog(this, "Delete ไม่สำเร็จ");
            } else {
                String sql = "delete from department where departmentCode = '" + departmentCode.getText() + "'";
                int row = searchRowIndex(departmentCode.getText());
                try {
                    dbConnection.statement.executeUpdate(sql);
                    ((DefaultTableModel) table1.getModel()).removeRow(row);
                    JOptionPane.showMessageDialog(this, "Delete สำเร็จ");
                } catch (SQLException ex) {
                    Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Delete ไม่สำเร็จ");
                }
                bNew();
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertActionPerformed
        if ("".equals(departmentCode.getText())) {
            JOptionPane.showMessageDialog(this, "Insert ไม่สำเร็จ");
        } else {
            String sql = "insert into department(departmentCode,departmentName) values ('" + departmentCode.getText() + "','" + departmentName.getText() + "')";
            try {
                dbConnection.statement.executeUpdate(sql);
                Object[] rowData = {departmentCode.getText(), departmentName.getText()};
                ((DefaultTableModel) table1.getModel()).addRow(rowData);
                JOptionPane.showMessageDialog(this, "Insert สำเร็จ");
            } catch (SQLException ex) {
                Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Insert ไม่สำเร็จ");
            }
        }
    }//GEN-LAST:event_bInsertActionPerformed

    private void departmentCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_departmentCodeKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            String sql = "select departmentName from department where departmentCode = '" + departmentCode.getText() + "'";
            departmentName.setText(null);
            try {
                ResultSet rs = dbConnection.statement.executeQuery(sql);
                while (rs.next()) {
//                    departmentName.setText(rs.getString(1));
                    departmentName.setText(rs.getString("departmentName"));
                }
                rs.close();

            } catch (SQLException ex) {
                departmentName.setText(null);
            }
        }
    }//GEN-LAST:event_departmentCodeKeyPressed

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
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bInsert;
    private javax.swing.JButton bNew;
    private javax.swing.JButton bShow;
    private javax.swing.JButton bUpdate;
    private javax.swing.JTextField departmentCode;
    private javax.swing.JTextField departmentName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
