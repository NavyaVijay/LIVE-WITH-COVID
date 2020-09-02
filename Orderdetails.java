/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lwc;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Orderdetails extends javax.swing.JFrame {

    public Orderdetails() {
        initComponents();
        lwc_pane.setBackground(Color.orange);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        od_pane = new javax.swing.JPanel();
        oname_txt = new javax.swing.JTextField();
        oaddress_txt = new javax.swing.JTextField();
        ophone_txt = new javax.swing.JTextField();
        orderdetails_label = new javax.swing.JLabel();
        odrdname_txt = new javax.swing.JTextField();
        oname_label = new javax.swing.JLabel();
        oaddress_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        opres_txt = new javax.swing.JTextArea();
        ophone_label = new javax.swing.JLabel();
        odrname_label = new javax.swing.JLabel();
        opres_label = new javax.swing.JLabel();
        ostat_combo = new javax.swing.JComboBox();
        ostat_label = new javax.swing.JLabel();
        odrhosp_label = new javax.swing.JLabel();
        odrhosp = new javax.swing.JTextField();
        orderdate_txt = new javax.swing.JTextField();
        orderdate_label = new javax.swing.JLabel();
        orderid_label = new javax.swing.JLabel();
        orderid_txt = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        lwc_pane = new javax.swing.JPanel();
        lwc_label = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oname_txtActionPerformed(evt);
            }
        });

        oaddress_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oaddress_txtActionPerformed(evt);
            }
        });

        ophone_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ophone_txtActionPerformed(evt);
            }
        });

        orderdetails_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        orderdetails_label.setText("Order Details");

        oname_label.setText("Name");

        oaddress_label.setText("Address");

        opres_txt.setColumns(20);
        opres_txt.setRows(5);
        jScrollPane2.setViewportView(opres_txt);

        ophone_label.setText("Phone");

        odrname_label.setText("Doctor Name");

        opres_label.setText("Prescription");

        ostat_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pending", "Delivered" }));
        ostat_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ostat_comboActionPerformed(evt);
            }
        });

        ostat_label.setText("Status");

        odrhosp_label.setText("Hospital");

        odrhosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odrhospActionPerformed(evt);
            }
        });

        orderdate_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderdate_txtActionPerformed(evt);
            }
        });

        orderdate_label.setText("Order Date");

        orderid_label.setText("Order ID");

        orderid_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderid_txtActionPerformed(evt);
            }
        });

        Save.setText("Save Status");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout od_paneLayout = new javax.swing.GroupLayout(od_pane);
        od_pane.setLayout(od_paneLayout);
        od_paneLayout.setHorizontalGroup(
            od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(od_paneLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderdetails_label)
                    .addGroup(od_paneLayout.createSequentialGroup()
                        .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(oname_label)
                            .addComponent(odrname_label)
                            .addComponent(oaddress_label)
                            .addComponent(opres_label)
                            .addComponent(orderid_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(od_paneLayout.createSequentialGroup()
                                .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(od_paneLayout.createSequentialGroup()
                                        .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(odrdname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(oaddress_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                    .addComponent(oname_txt))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(odrhosp_label)
                                            .addComponent(ostat_label)))
                                    .addGroup(od_paneLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(ophone_label)))
                                .addGap(45, 45, 45)
                                .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(odrhosp, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ophone_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ostat_combo, javax.swing.GroupLayout.Alignment.LEADING, 0, 166, Short.MAX_VALUE)
                                    .addComponent(Save)))
                            .addGroup(od_paneLayout.createSequentialGroup()
                                .addComponent(orderid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderdate_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderdate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
        );
        od_paneLayout.setVerticalGroup(
            od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(od_paneLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(orderdetails_label)
                .addGap(23, 23, 23)
                .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderid_label)
                    .addComponent(orderid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderdate_label)
                    .addComponent(orderdate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oname_label)
                    .addComponent(oname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oaddress_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oaddress_label)
                    .addComponent(ophone_label)
                    .addComponent(ophone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(odrname_label)
                        .addComponent(odrdname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(odrhosp_label)
                        .addComponent(odrhosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addGroup(od_paneLayout.createSequentialGroup()
                        .addGroup(od_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opres_label)
                            .addComponent(ostat_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ostat_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Save)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        lwc_label.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lwc_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lwc_label.setText("LIVE WITH COVID");

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lwc_paneLayout = new javax.swing.GroupLayout(lwc_pane);
        lwc_pane.setLayout(lwc_paneLayout);
        lwc_paneLayout.setHorizontalGroup(
            lwc_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lwc_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lwc_label, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout)
                .addContainerGap())
        );
        lwc_paneLayout.setVerticalGroup(
            lwc_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lwc_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lwc_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lwc_label)
                    .addComponent(logout)
                    .addComponent(Back))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lwc_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(od_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lwc_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(od_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oname_txtActionPerformed

    private void oaddress_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oaddress_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oaddress_txtActionPerformed

    private void ostat_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ostat_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ostat_comboActionPerformed

    private void orderdate_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderdate_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderdate_txtActionPerformed

    private void orderid_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderid_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderid_txtActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new logas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void odrhospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odrhospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odrhospActionPerformed
  
    //When the save status button is clicked
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try{
            String id=orderid_txt.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","742000");
            String sql="update tmedorder set status=? where oid='"+id+"'";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1, ostat_combo.getSelectedItem().toString());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Status Saved");   
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,e);}
        Telemedicine.setOrders();
         
    }//GEN-LAST:event_SaveActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
         new Telemedicine().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void ophone_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ophone_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ophone_txtActionPerformed

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
            java.util.logging.Logger.getLogger(Orderdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orderdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orderdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orderdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orderdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Save;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JLabel lwc_label;
    private javax.swing.JPanel lwc_pane;
    private javax.swing.JLabel oaddress_label;
    public static javax.swing.JTextField oaddress_txt;
    private javax.swing.JPanel od_pane;
    public static javax.swing.JTextField odrdname_txt;
    public static javax.swing.JTextField odrhosp;
    private javax.swing.JLabel odrhosp_label;
    private javax.swing.JLabel odrname_label;
    private javax.swing.JLabel oname_label;
    public static javax.swing.JTextField oname_txt;
    private javax.swing.JLabel ophone_label;
    public static javax.swing.JTextField ophone_txt;
    private javax.swing.JLabel opres_label;
    public static javax.swing.JTextArea opres_txt;
    private javax.swing.JLabel orderdate_label;
    public static javax.swing.JTextField orderdate_txt;
    private javax.swing.JLabel orderdetails_label;
    private javax.swing.JLabel orderid_label;
    public static javax.swing.JTextField orderid_txt;
    public javax.swing.JComboBox ostat_combo;
    private javax.swing.JLabel ostat_label;
    // End of variables declaration//GEN-END:variables
}
