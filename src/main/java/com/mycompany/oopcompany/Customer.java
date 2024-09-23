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
 * @author WONG-PC
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    DatabaseConnection dbConnection = new DatabaseConnection();
    SetFont setFontMs = new SetFont();

    public Customer() {
        setFontMs.setFont();
        dbConnection.connectDB();
        initComponents();
        getCustomerData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bShow = new javax.swing.JButton();
        customerCode = new javax.swing.JTextField();
        customerName = new javax.swing.JTextField();
        bClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bNew = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        bInsert = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bShow.setText("Show");
        bShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bShowActionPerformed(evt);
            }
        });

        customerCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerCodeKeyPressed(evt);
            }
        });

        customerName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ที่อยู่");

        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                "Code", "Name", "Address"
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
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
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
                        .addGap(31, 31, 31)
                        .addComponent(bClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(customerCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNew)
                    .addComponent(bShow)
                    .addComponent(bInsert)
                    .addComponent(bUpdate)
                    .addComponent(bDelete)
                    .addComponent(bClose))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bNew() {
        customerCode.setText(null);
        customerName.setText(null);
        address.setText(null);
        customerCode.requestFocus();
    }

    private void getCustomerData() {
        //((DefaultTableModel) table1.getModel()).setRowCount(0);
        String sql = "select * from customer";
        customerName.setText(null);
        try {
            ResultSet rs = dbConnection.statement.executeQuery(sql);
            while (rs.next()) {
                Object[] rowData = {rs.getString(1), rs.getString(2), rs.getString(3)};
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

    private void bShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShowActionPerformed
        String ms = customerCode.getText() + "\n" + customerName.getText() + "\n" + address.getText();
        JOptionPane.showMessageDialog(this, ms);
    }//GEN-LAST:event_bShowActionPerformed

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        if (JOptionPane.showConfirmDialog(this, "ปิดหรือไม่ ?", "ยืนยัน", 0) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_bCloseActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed
        bNew();
    }//GEN-LAST:event_bNewActionPerformed

    private void bInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertActionPerformed
        if ("".equals(customerCode.getText())) {
            JOptionPane.showMessageDialog(this, "Insert ไม่สำเร็จ");
        } else {
            String sql = "insert into customer(customerCode,customerName,address) values ('" + customerCode.getText() + "','" + customerName.getText() + "','" + address.getText() + "')";
            try {
                dbConnection.statement.executeUpdate(sql);
                Object[] rowData = {customerCode.getText(), customerName.getText(), address.getText()};
                ((DefaultTableModel) table1.getModel()).addRow(rowData);
                JOptionPane.showMessageDialog(this, "Insert สำเร็จ");
            } catch (SQLException ex) {
                Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Insert ไม่สำเร็จ");
            }
        }
    }//GEN-LAST:event_bInsertActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        if ("".equals(customerCode.getText())) {
            JOptionPane.showMessageDialog(this, "Update ไม่สำเร็จ");
        } else {
            String sql = "update customer set customerName = '" + customerName.getText() + "', address = '" + address.getText() + "' where customerCode = '" + customerCode.getText() + "'";
            int row = searchRowIndex(customerCode.getText());
            try {
                dbConnection.statement.executeUpdate(sql);
                ((DefaultTableModel) table1.getModel()).setValueAt(customerName.getText(), row, 1);
                ((DefaultTableModel) table1.getModel()).setValueAt(address.getText(), row, 2);
                JOptionPane.showMessageDialog(this, "Update สำเร็จ");
            } catch (SQLException ex) {
                Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Update ไม่สำเร็จ");
            }
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        if (JOptionPane.showConfirmDialog(this, "ลบหรือไม่ ?", "ยืนยัน", 0) == 0) {
            if ("".equals(customerCode.getText())) {
                JOptionPane.showMessageDialog(this, "Delete ไม่สำเร็จ");
            } else {
                String sql = "delete from customer where customerCode = '" + customerCode.getText() + "'";
                int row = searchRowIndex(customerCode.getText());
                try {
                    dbConnection.statement.executeUpdate(sql);
                    ((DefaultTableModel) table1.getModel()).removeRow(row);
                    JOptionPane.showMessageDialog(this, "Delete สำเร็จ");
                } catch (SQLException ex) {
                    Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Delete ไม่สำเร็จ");
                }
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void customerCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerCodeKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            String sql = "select customerName,	address from customer where customerCode = '" + customerCode.getText() + "'";
            customerName.setText(null);
            address.setText(null);
            try {
                ResultSet rs = dbConnection.statement.executeQuery(sql);
                while (rs.next()) {
                    customerName.setText(rs.getString("customerName"));
                    address.setText(rs.getString("address"));
                }
                rs.close();

            } catch (SQLException ex) {
                customerName.setText(null);
                address.setText(null);
            }
        }
    }//GEN-LAST:event_customerCodeKeyPressed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton bClose;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bInsert;
    private javax.swing.JButton bNew;
    private javax.swing.JButton bShow;
    private javax.swing.JButton bUpdate;
    private javax.swing.JTextField customerCode;
    private javax.swing.JTextField customerName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
