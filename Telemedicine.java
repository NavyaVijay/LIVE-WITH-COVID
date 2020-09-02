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
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Telemedicine extends javax.swing.JFrame {
    
    public Telemedicine() {
        initComponents();
        lwc_pane.setBackground(Color.orange);
        setProfile();
        setOrders();
        ordertable.setRowSelectionAllowed(true);   
        ordertable.setColumnSelectionAllowed(false);
    }
    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lwc_pane = new javax.swing.JPanel();
        lwc_label = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        tm_pane = new javax.swing.JTabbedPane();
        vieworder_tpane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordertable = new javax.swing.JTable();
        ordertable_label = new javax.swing.JLabel();
        aboutus_tpane = new javax.swing.JPanel();
        orgname_label = new javax.swing.JLabel();
        orgcp_label = new javax.swing.JLabel();
        orgcn_label = new javax.swing.JLabel();
        orgaddress_label = new javax.swing.JLabel();
        orgname_txt = new javax.swing.JTextField();
        orgcn_txt = new javax.swing.JTextField();
        orgcp_txt = new javax.swing.JTextField();
        orgaddress_scrollpane = new javax.swing.JScrollPane();
        orgaddress_txt = new javax.swing.JTextArea();
        orgemail_label = new javax.swing.JLabel();
        orgemail_txt = new javax.swing.JTextField();
        orgid_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        orgid_label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        oldpass = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();
        confpass = new javax.swing.JPasswordField();
        savepass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lwc_label.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lwc_label.setText("LIVE WITH COVID");

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lwc_paneLayout = new javax.swing.GroupLayout(lwc_pane);
        lwc_pane.setLayout(lwc_paneLayout);
        lwc_paneLayout.setHorizontalGroup(
            lwc_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lwc_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lwc_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );
        lwc_paneLayout.setVerticalGroup(
            lwc_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lwc_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lwc_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lwc_label)
                    .addComponent(logout))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        ordertable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        ordertable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ordertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Location", "Phone", "Doctor", "Hospital", "Prescription", "OrderDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ordertable.setColumnSelectionAllowed(true);
        ordertable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ordertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ordertable);
        ordertable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (ordertable.getColumnModel().getColumnCount() > 0) {
            ordertable.getColumnModel().getColumn(7).setPreferredWidth(200);
        }

        ordertable_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ordertable_label.setText("ORDER TABLE");

        javax.swing.GroupLayout vieworder_tpaneLayout = new javax.swing.GroupLayout(vieworder_tpane);
        vieworder_tpane.setLayout(vieworder_tpaneLayout);
        vieworder_tpaneLayout.setHorizontalGroup(
            vieworder_tpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vieworder_tpaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vieworder_tpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vieworder_tpaneLayout.createSequentialGroup()
                        .addComponent(ordertable_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
                .addContainerGap())
        );
        vieworder_tpaneLayout.setVerticalGroup(
            vieworder_tpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vieworder_tpaneLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(ordertable_label)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tm_pane.addTab("View Orders", vieworder_tpane);

        aboutus_tpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orgname_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orgname_label.setText("Organisation Name");
        aboutus_tpane.add(orgname_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 43, -1, -1));

        orgcp_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orgcp_label.setText("Contact Person");
        aboutus_tpane.add(orgcp_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 81, 115, -1));

        orgcn_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orgcn_label.setText("Contact No");
        aboutus_tpane.add(orgcn_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 119, 115, -1));

        orgaddress_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orgaddress_label.setText("Address");
        aboutus_tpane.add(orgaddress_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 154, 115, -1));
        aboutus_tpane.add(orgname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 43, 193, -1));
        aboutus_tpane.add(orgcn_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 116, 193, -1));
        aboutus_tpane.add(orgcp_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 81, 193, -1));

        orgaddress_txt.setColumns(20);
        orgaddress_txt.setRows(5);
        orgaddress_scrollpane.setViewportView(orgaddress_txt);

        aboutus_tpane.add(orgaddress_scrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 193, 79));

        orgemail_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orgemail_label.setText("Email");
        aboutus_tpane.add(orgemail_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 254, 115, -1));
        aboutus_tpane.add(orgemail_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 254, 193, -1));
        aboutus_tpane.add(orgid_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 11, 193, -1));
        aboutus_tpane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 32, -1, -1));

        orgid_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orgid_label.setText("Organisation ID");
        aboutus_tpane.add(orgid_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        tm_pane.addTab("About Us", aboutus_tpane);

        jLabel1.setText("Enter Old Password");

        jLabel2.setText("Enter New Password");

        jLabel3.setText("Confirm New Password");

        savepass.setText("Save");
        savepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savepassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(savepass)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confpass, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(newpass)
                            .addComponent(oldpass))))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(oldpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(savepass)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        tm_pane.addTab("Change Password", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lwc_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tm_pane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lwc_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tm_pane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setProfile(){
        try{
            String name=tmlogin.tmuser.getText();
            String no=tmlogin.tmpass.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","742000");
            
            String sql=" select tid,org_name,cnt_person,cnt_no,taddress,tlocation,temail from telemedicine "
                    + "where org_name='"+name+"' and tpassword='"+no+"'";
            PreparedStatement pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            if(rs.next()){
                orgid_txt.setText(rs.getString("tid"));
                orgname_txt.setText(rs.getString("org_name"));
                orgcp_txt.setText(rs.getString("cnt_person"));
                orgcn_txt.setText(rs.getString("cnt_no"));
                orgaddress_txt.setText(rs.getString("taddress")+","+rs.getString("tlocation"));
                orgemail_txt.setText(rs.getString("temail"));
               
            }
                orgid_txt.setEditable(false);
                orgname_txt.setEditable(false);
                orgcp_txt.setEditable(false);
                orgcn_txt.setEditable(false);
                orgaddress_txt.setEditable(false);
                orgemail_txt.setEditable(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public static void setOrders(){
         try{
            String ogid=orgid_txt.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","742000");
            String sql="select oid as OrderID,fname as Name,address as Address,location as Location,contact as Contact,dfname as Doctor,hospital as Hospital,"
                    + "prscription as Prescription,orderdate as OrderDate,status as Status from tmedorder,hrc,doctor,report "
                    + "where report.rid=tmedorder.hrcid and report.cid=tmedorder.cid and hrc.id=tmedorder.hrcid and doctor.did=tmedorder.drid and tmoid='"+ogid+"' and status='Pending'";
           
            PreparedStatement pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            ordertable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new logas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    Orderdetails jtRowData1=new Orderdetails();
    private void ordertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordertableMouseClicked
   
     TableModel model=ordertable.getModel();
     int row=ordertable.getSelectedRow();
     String id=model.getValueAt(row,0).toString();
     String name=model.getValueAt(row,1).toString();
     String address=model.getValueAt(row,2).toString()+","+model.getValueAt(row,3).toString();
     String cont=model.getValueAt(row,4).toString();
     String doc=model.getValueAt(row,5).toString();
     String hosp=model.getValueAt(row,6).toString();
     String pres=model.getValueAt(row,7).toString();
     String date=model.getValueAt(row,8).toString();
     jtRowData1.setVisible(true);
     jtRowData1.pack();
     jtRowData1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     Orderdetails.orderdate_txt.setText(date);
     Orderdetails.orderid_txt.setText(id);
     Orderdetails.oname_txt.setText(name);
     Orderdetails.oaddress_txt.setText(address);
     Orderdetails.ophone_txt.setText(cont);
     Orderdetails.odrdname_txt.setText(doc);
     Orderdetails.odrhosp.setText(hosp);
     Orderdetails.opres_txt.setText(pres);
     Orderdetails.orderdate_txt.setEditable(false);
     Orderdetails.orderid_txt.setEditable(false);
     Orderdetails.oname_txt.setEditable(false);
     Orderdetails.oaddress_txt.setEditable(false);
     Orderdetails.ophone_txt.setEditable(false);
     Orderdetails.odrdname_txt.setEditable(false);
     Orderdetails.odrhosp.setEditable(false);
     Orderdetails.opres_txt.setEditable(false);
     this.dispose();
    }//GEN-LAST:event_ordertableMouseClicked

    private void savepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savepassActionPerformed
         try{   
   
            String ogid=orgid_txt.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","742000");
            String sql="select tpassword from telemedicine where tid='"+ogid+"'";
            PreparedStatement pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            if(rs.next()){
                String pass=newpass.getText();
                if((rs.getString("tpassword").equals(oldpass.getText())&&(newpass.getText().equals(confpass.getText())))){
                     String sql1="update telemedicine set tpassword='"+pass+"' where tid='"+ogid+"'";
                      PreparedStatement pst1=conn.prepareStatement(sql1);
                      pst1.execute();
                      JOptionPane.showMessageDialog(null,"Password changed");
                }
                else{
                 JOptionPane.showMessageDialog(null,"Password do not match");
            }
            }
            
        }   
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_savepassActionPerformed

   
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
            java.util.logging.Logger.getLogger(Telemedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telemedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telemedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telemedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telemedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutus_tpane;
    private javax.swing.JPasswordField confpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel lwc_label;
    private javax.swing.JPanel lwc_pane;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField oldpass;
    public static javax.swing.JTable ordertable;
    private javax.swing.JLabel ordertable_label;
    private javax.swing.JLabel orgaddress_label;
    private javax.swing.JScrollPane orgaddress_scrollpane;
    private javax.swing.JTextArea orgaddress_txt;
    private javax.swing.JLabel orgcn_label;
    private javax.swing.JTextField orgcn_txt;
    private javax.swing.JLabel orgcp_label;
    private javax.swing.JTextField orgcp_txt;
    private javax.swing.JLabel orgemail_label;
    private javax.swing.JTextField orgemail_txt;
    private javax.swing.JLabel orgid_label;
    public static javax.swing.JTextField orgid_txt;
    private javax.swing.JLabel orgname_label;
    private javax.swing.JTextField orgname_txt;
    private javax.swing.JButton savepass;
    private javax.swing.JTabbedPane tm_pane;
    private javax.swing.JPanel vieworder_tpane;
    // End of variables declaration//GEN-END:variables
}
